/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Customer;
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
import org.json.simple.JsonObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Equipo
 */
public class CustomerData {

    final String jsonFilePath;

    public CustomerData() {
        this.jsonFilePath = "C:\\Users\\Usuario\\Desktop\\Proyecto I PROGRAMACIÓN II\\ParkingSystemTomcat\\customers.json";
    }

    public void insertCustomer(Customer customer) throws IOException, org.json.simple.parser.ParseException {
        JSONObject customerObject = new JSONObject();
        customerObject.put("identification", customer.getIdentification());
        customerObject.put("name", customer.getName());
        customerObject.put("email", customer.getEmail());
        customerObject.put("phone", customer.getPhone());
        customerObject.put("username", customer.getUsername());
        customerObject.put("password", customer.getPassword());
        //String disabilityPresented = String.valueOf(customer.isDisabilityPresented());
        customerObject.put("disabilityPresented", customer.isDisabilityPresented());
        //true allows multiple insertions idisabiltyPresentedn the file
        try (FileWriter file = new FileWriter(jsonFilePath, true)) {
            file.write(customerObject.toJSONString() + "\r\n");

        }
    }

    public LinkedList<Customer> getAllCustomers() throws ParseException, org.json.simple.parser.ParseException {
        LinkedList<Customer> customers = new LinkedList<>();
        ArrayList<JSONObject> jsonArray = new ArrayList<>();
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
                jsonArray.add(jsonObject);
                Customer customer = new Customer();
                String aux1 = (String) jsonObject.get("identification");
                customer.setIdentification(aux1);
                customer.setName(jsonObject.get("name").toString());
                customer.setEmail(jsonObject.get("email").toString());
                customer.setPhone(jsonObject.get("phone").toString());
                customer.setUsername(jsonObject.get("username").toString());
                customer.setPassword(jsonObject.get("password").toString());
                customer.setDisabilityPresented(Boolean.parseBoolean(jsonObject.get("disabilityPresented").toString()));
                System.out.println("customersssssssssssssssssssssssssssssssssssssssss "+customer.toString());
                customers.add(customer);
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
        return customers;
    }
    
    public Customer getCustomerByUsernameAndPassword(String username, String password) throws ParseException, org.json.simple.parser.ParseException {
        Customer customer = new Customer();
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
                if (jsonObject.get("username").toString().equals(username)
                        && jsonObject.get("password").toString().equals(password)) {
                    customer.setIdentification(jsonObject.get("identification").toString());
                    customer.setName(jsonObject.get("name").toString());
                    customer.setEmail(jsonObject.get("email").toString());
                    customer.setPhone(jsonObject.get("phone").toString());
                    customer.setUsername(jsonObject.get("username").toString());
                    customer.setPassword(jsonObject.get("password").toString());
                   customer.setDisabilityPresented(Boolean.parseBoolean(jsonObject.get("disabilityPresented").toString()));
                    System.out.println(customer.toString());
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
        return customer;
    }

    public void deleteCustomer(String username) throws ParseException, org.json.simple.parser.ParseException {

        try {

            JSONObject customerObject;

            File file = new File(jsonFilePath);

            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File("customersTemp.json");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonFilePath));
            try (PrintWriter printWriter = new PrintWriter(new FileWriter(tempFile))) {
                String line = null;

                //Read from the original file and write to the new
                //unless content matches data to be removed.
                while ((line = bufferedReader.readLine()) != null) {

                    customerObject = (JSONObject) new JSONParser().parse(line);

                    if (!customerObject.get("username").toString().equals(username)) {

                        printWriter.println(line);
                        printWriter.flush();
                    }
                }

                bufferedReader.close();
            }

            //Delete the original file
            if (!file.delete()) {

                //no se pudo eliminar el archivo
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(file)) {

            }

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public void modifyCustomerFromFile(String username, Customer customer) throws ParseException, org.json.simple.parser.ParseException {

        try {

            JSONObject customerObject;

            File file = new File(jsonFilePath);

            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File("customersTemp.json");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonFilePath));
            PrintWriter printWriter = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            //Read from the original file and write to the new
            //unless content matches data to be removed.
            while ((line = bufferedReader.readLine()) != null) {

                customerObject = (JSONObject) new JSONParser().parse(line);

                if (!customerObject.get("username").toString().equals(username)) {

                    printWriter.println(line);
                    printWriter.flush();
                } else {

                    customerObject.put("identification", customer.getIdentification());
                    customerObject.put("name", customer.getName());
                    customerObject.put("email", customer.getEmail());
                    customerObject.put("phone", customer.getPhone());
                    customerObject.put("username", customer.getUsername());
                    customerObject.put("password", customer.getPassword());
                    customerObject.put("disabilityPresented", customer.isDisabilityPresented());

                    printWriter.println(customerObject.toJSONString());
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
    }

    public Customer getCustomerByUsername(String username) throws ParseException, org.json.simple.parser.ParseException {

        Customer customer = new Customer();
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

                if (jsonObject.get("username").equals(username)) {
                    String aux1 = (String) jsonObject.get("identification");
                    customer.setIdentification(aux1);
                    customer.setName(jsonObject.get("name").toString());
                    customer.setEmail(jsonObject.get("email").toString());
                    customer.setPhone(jsonObject.get("phone").toString());
                    customer.setUsername(jsonObject.get("username").toString());
                    customer.setPassword(jsonObject.get("password").toString());
                    customer.setDisabilityPresented(Boolean.parseBoolean(jsonObject.get("disabilityPresented").toString()));
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
        return customer;
    }
}
