package Data;

import Business.CustomerBusiness;
import Business.VehicleBusiness;
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
                = "C:\\Users\\Usuario\\Desktop\\Proyecto I PROGRAMACIÓN II\\ParkingSystemTomcat\\vehicles.json";
    }

    public void insertVehicles(Vehicle vehicle) throws IOException, org.json.simple.parser.ParseException, ParseException {
        Customer customer = new Customer();
        CustomerBusiness customerBusiness = new CustomerBusiness();
        VehicleType vehicleType = new VehicleType();
        VehicleBusiness vehicleBusiness = new VehicleBusiness();

        JSONObject vehicleObject = new JSONObject();
        vehicleObject.put("plate", vehicle.getPlate());
        vehicleObject.put("brand", vehicle.getBrand());

        Customer tempCustomer = vehicle.getCustomer()[0];
        String firstCustomer = "Identificacion: " + tempCustomer.getIdentification() + " "
                + "Nombre: " + tempCustomer.getName() + " - "
                + "Email: " + tempCustomer.getEmail() + " - "
                + "Numero: " + tempCustomer.getPhone() + " - "
                + "Username: " + tempCustomer.getUsername() + " - "
                + "Presenta Discapacidad: " + tempCustomer.isDisabilityPresented();
        vehicleObject.put("firstCustomer", firstCustomer);

        Customer tempSecondCustomer = vehicle.getCustomer()[1];
        String secondCustomer = "Identificacion: " + tempSecondCustomer.getIdentification() + " "
                + "Nombre: " + tempSecondCustomer.getName() + " - "
                + "Email: " + tempSecondCustomer.getEmail() + " - "
                + "Numero: " + tempSecondCustomer.getPhone() + " - "
                + "Username: " + tempSecondCustomer.getUsername() + " - "
                + "Presenta Discapacidad: " + tempSecondCustomer.isDisabilityPresented();

        vehicleObject.put("secondCustomer", secondCustomer);

        String typeVehicles = "Id: " + vehicle.getVehicleType().getId() + " - "
                + "Descripcion: " + vehicle.getVehicleType().getDescription() + " - "
                + "Precio: " + vehicle.getVehicleType().getFee();

        vehicleObject.put("vehicleType", typeVehicles);
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
                String auxPlate = (String) jsonObject.get("plate");
                vehicle.setPlate(auxPlate);
                String auxBrand = (String) jsonObject.get("brand");
                vehicle.setBrand(auxBrand);
                Customer[] customer = new Customer[2];
                customer[0] = (Customer) jsonObject.get("firstCustomer");
                customer[1] = (Customer) jsonObject.get("secondCustomer");
                vehicle.setCustomer(customer);
                
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
                Customer[] customers = new Customer[2];
                customers[0] = (Customer) jsonObject.get("firstCustomer");
                customers[1] = (Customer) jsonObject.get("secondCustomer");
                vehicle.setCustomer(customers);
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
                    Customer[] customers = new Customer[2];
                    customers[0] = (Customer) jsonObject.get("firstCustomer");
                    customers[1] = (Customer) jsonObject.get("secondCustomer");
                    vehicle.setCustomer(customers);
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
                    vehicleObject.put("customer", vehicle.getCustomer().toString());
                    vehicleObject.put("vehicleType", vehicle.getVehicleType().toString());

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
                    Customer[] customers = new Customer[2];
                    customers[0] = (Customer) jsonObject.get("firstCustomer");
                    customers[1] = (Customer) jsonObject.get("secondCustomer");
                    vehicle.setCustomer(customers);
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

    public float fee(String id) {
        float fee = 0;
        if (id.equalsIgnoreCase("motocicleta")) {
            fee = 500;
        } else if (id.equalsIgnoreCase("automovil")) {
            fee = 1000;
        } else if (id.equalsIgnoreCase("microbus")) {
            fee = 1500;
        }

        return fee;
    }

}
