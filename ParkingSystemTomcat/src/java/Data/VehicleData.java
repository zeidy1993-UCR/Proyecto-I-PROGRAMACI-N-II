package Data;

import Business.CustomerBusiness;
import Domain.Customer;
import Domain.Vehicle;
import Domain.VehicleType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Esteban
 */
public class VehicleData {

    final String jsonFilePath;

    public VehicleData() {
        this.jsonFilePath
                = "C:\\Users\\Usuario\\Documents\\Progra2\\ProyectoProgra1\\Proyecto I PROGRAMACIÓN II\\ParkingSystem\\vehicles.json";
    }

    public void insertVehicles(Vehicle vehicle) throws IOException, org.json.simple.parser.ParseException, ParseException {
        Customer customer = new Customer();
        CustomerBusiness customerBusiness = new CustomerBusiness();
        JSONObject vehicleObject = new JSONObject();
        vehicleObject.put("Placa", vehicle.getPlate());
        vehicleObject.put("Marca", vehicle.getBrand());
        //String identification, String name, String email, 
        //String phone, String username, String password, boolean disabilityPresented
        String customers = customerBusiness.getCustomerByUsername(vehicle.getCustomer().getUsername()).getIdentification() 
                +customerBusiness.getCustomerByUsername(vehicle.getCustomer().getUsername()).getName() 
                +customerBusiness.getCustomerByUsername(vehicle.getCustomer().getUsername()).getEmail() 
                +customerBusiness.getCustomerByUsername(vehicle.getCustomer().getUsername()).getPhone()
                + customerBusiness.getCustomerByUsername(vehicle.getCustomer().getUsername()).getUsername() 
                + customerBusiness.getCustomerByUsername(vehicle.getCustomer().getUsername()).isDisabilityPresented();
        vehicleObject.put("Cliente",customers );
        vehicleObject.put("Tipo de Vehiculo", vehicle.getVehicleType());
        //true allows multiple insertions in the file
        try (FileWriter file = new FileWriter(jsonFilePath, true)) {
            file.write(vehicleObject.toJSONString() + "\r\n");

        }
    }// fin insertVehicles

    public LinkedList<Vehicle> getAllVehicles() throws ParseException, org.json.simple.parser.ParseException {
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        ArrayList<JSONObject> jsonArray = new ArrayList<>();
        JSONObject jsonObject;
        // This will reference one line at a time
        String line;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(jsonFilePath);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                jsonObject = (JSONObject) new JSONParser().parse(line);
                jsonArray.add(jsonObject);
                Vehicle vehicle = new Vehicle();
                vehicle.setPlate(jsonObject.get("plate").toString());
                vehicle.setBrand(jsonObject.get("marca").toString());
                CustomerBusiness customerBusiness = new CustomerBusiness();
                vehicle.setCustomer((Customer) jsonObject.get("customer"));
                vehicle.setVehicleType((VehicleType) jsonObject.get("vehicleType"));

                System.out.println(vehicle.toString());
                vehicles.add(vehicle);
            }
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + jsonFilePath + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + jsonFilePath + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        return vehicles;
    }

    public boolean vehicleSearch(String plate) throws org.json.simple.parser.ParseException {
        boolean find = false;
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        ArrayList<JSONObject> jsonArray = new ArrayList<>();
        JSONObject jsonObject = null;
        // This will reference one line at a time
        String line = null;
        Vehicle vehicle = new Vehicle();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(jsonFilePath);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                jsonObject = (JSONObject) new JSONParser().parse(line);
                jsonArray.add(jsonObject);
                //String plate,String brand,Customer customer, VehicleType vehicleType
                vehicle.setPlate(jsonObject.get("plate").toString());
                vehicle.setBrand(jsonObject.get("marca").toString());
                vehicle.setCustomer((Customer) jsonObject.get("customer"));
                vehicle.setVehicleType((VehicleType) jsonObject.get("vehicleType"));

                System.out.println(vehicle.toString());
                vehicles.add(vehicle);

            }
            for (int i = 0; i < vehicles.size(); i++) {
                if (plate.equalsIgnoreCase(jsonObject.get("plate").toString())) {
                    find = true;
                }
            }
            System.out.println(vehicle.getPlate());
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + jsonFilePath + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + jsonFilePath + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        return find;
    }//fin vehicleSearch

    public Vehicle getVehicleByCustomer(Customer customer) throws ParseException, org.json.simple.parser.ParseException {
        Vehicle vehicle = new Vehicle();
        JSONObject jsonObject;
        // This will reference one line at a time
        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(jsonFilePath);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                jsonObject = (JSONObject) new JSONParser().parse(line);
                if (jsonObject.get("customer").equals(customer)) {
                    vehicle.setPlate(jsonObject.get("plate").toString());
                    vehicle.setBrand(jsonObject.get("marca").toString());
                    vehicle.setCustomer((Customer) jsonObject.get("cutomer"));
                    vehicle.setVehicleType((VehicleType) jsonObject.get("vehicleType"));
                    System.out.println(vehicle.toString());
                }
            }
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + jsonFilePath + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + jsonFilePath + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        return vehicle;
    }//fin getVehicleByCustomer

    public void deleteVehicle(String plate) throws ParseException, org.json.simple.parser.ParseException {

        try {

            JSONObject vehicleObject;

            File file = new File(jsonFilePath);

            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File("vehiclesTemp.json");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonFilePath));
            try (PrintWriter printWriter = new PrintWriter(new FileWriter(tempFile))) {
                String line = null;

                //Read from the original file and write to the new
                //unless content matches data to be removed.
                while ((line = bufferedReader.readLine()) != null) {

                    vehicleObject = (JSONObject) new JSONParser().parse(line);

                    if (!vehicleObject.get("plate").equals(plate)) {

                        printWriter.println(line);
                        printWriter.flush();
                    }
                }

                bufferedReader.close();
            }

            //Delete the original file
            if (!file.delete()) {

                System.out.println("No se pudo eliminar el archivo");
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(file)) {

            }

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }//fin deleteVehicle

    public void modifyVehicle(String plate, Vehicle vehicle) throws ParseException, org.json.simple.parser.ParseException {

        try {

            JSONObject vehicleObject;

            File file = new File(jsonFilePath);

            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File("vehiclesTemp.json");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonFilePath));
            PrintWriter printWriter = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            //Read from the original file and write to the new
            //unless content matches data to be removed.
            while ((line = bufferedReader.readLine()) != null) {

                vehicleObject = (JSONObject) new JSONParser().parse(line);

                if (!vehicleObject.get("plate").equals(plate)) {

                    printWriter.println(line);
                    printWriter.flush();
                    //String plate,String brand,Customer customer, VehicleType vehicleType
                } else {
                    vehicleObject.put("plate", vehicle.getPlate());
                    vehicleObject.put("brand", vehicle.getBrand());
                    vehicleObject.put("customer", vehicle.getCustomer());
                    vehicleObject.put("vehicleType", vehicle.getVehicleType());

                    printWriter.println(vehicleObject.toJSONString());
                }
            }

            bufferedReader.close();
            printWriter.close();

            //Delete the original file
            if (!file.delete()) {
                //no se pudo eliminar el archivo
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(file)) {

                //no se pudo renombrar el archivo
            }

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }//fin modifyVehicle

    public Vehicle getVehicleByPlate(String plate) throws ParseException, org.json.simple.parser.ParseException {
        Vehicle vehicle = new Vehicle();
        JSONObject jsonObject;
        // This will reference one line at a time
        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(jsonFilePath);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                jsonObject = (JSONObject) new JSONParser().parse(line);
                if (jsonObject.get("plate").equals(plate)) {
                    vehicle.setPlate(jsonObject.get("plate").toString());
                    vehicle.setBrand(jsonObject.get("marca").toString());
                    vehicle.setCustomer((Customer) jsonObject.get("customer"));
                    vehicle.setVehicleType((VehicleType) jsonObject.get("vehicleType"));
                    System.out.println(vehicle.toString());
                }
            }
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + jsonFilePath + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + jsonFilePath + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        return vehicle;
    }//fin getVehicleByCustomer
}
