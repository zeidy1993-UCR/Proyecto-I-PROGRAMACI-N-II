package Data;

import Domain.Clerk;
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
 * @author Zeii
 */
public class ClerkData {

    final String jsonFilePath = "C:\\Users\\Usuario\\Desktop\\Proyecto I PROGRAMACIÓN II\\ParkingSystemTomcat\\clerks.json";

    public void insertClerk(Clerk clerk) throws IOException, org.json.simple.parser.ParseException {
        JSONObject clerkObject = new JSONObject();
        clerkObject.put("identification", clerk.getIdentification());
        clerkObject.put("name", clerk.getName());
        clerkObject.put("email", clerk.getEmail());
        clerkObject.put("phone", clerk.getPhone());
        clerkObject.put("username", clerk.getUsername());
        clerkObject.put("password", clerk.getPassword());
        clerkObject.put("placeOfWork", clerk.getPlaceOfWork());
        //true allows multiple insertions in the file
        try (FileWriter file = new FileWriter(jsonFilePath, true)) {
            file.write(clerkObject.toJSONString() + "\r\n");

        }
    }

    public LinkedList<Clerk> getAllClerks() throws ParseException, org.json.simple.parser.ParseException {
        LinkedList<Clerk> clerks = new LinkedList<>();
        ArrayList<JSONObject> jsonArray = new ArrayList<>();
        JSONObject jsonObject;
        String line = null;
        try {
            FileReader fileReader = new FileReader(jsonFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                jsonObject = (JSONObject) new JSONParser().parse(line);
                jsonArray.add(jsonObject);
                Clerk clerk = new Clerk();
                String aux = (String) jsonObject.get("identification");
                clerk.setIdentification(aux);
                clerk.setName(jsonObject.get("name").toString());
                clerk.setEmail(jsonObject.get("email").toString());
                clerk.setPhone(jsonObject.get("phone").toString());
                clerk.setUsername(jsonObject.get("username").toString());
                clerk.setPassword(jsonObject.get("password").toString());
                String aux1=(String)jsonObject.get("placeOfWork");
                clerk.setPlaceOfWork(aux1);
                System.out.println(clerk.toString());
                clerks.add(clerk);
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
        return clerks;
    }

    public boolean clerkSearch(String username, String password) throws org.json.simple.parser.ParseException {
        boolean find = false;
        LinkedList<Clerk> clerks = new LinkedList<>();
        ArrayList<JSONObject> jsonArray = new ArrayList<>();
        JSONObject jsonObject = null;
        // This will reference one line at a time
        String line = null;
        Clerk clerk = new Clerk();
        try {
            FileReader fileReader = new FileReader(jsonFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                jsonObject = (JSONObject) new JSONParser().parse(line);
                jsonArray.add(jsonObject);
                clerk.setIdentification(jsonObject.get("identification").toString());
                clerk.setName(jsonObject.get("name").toString());
                clerk.setEmail(jsonObject.get("email").toString());
                clerk.setPhone(jsonObject.get("phone").toString());
                clerk.setUsername(jsonObject.get("username").toString());
                clerk.setPassword(jsonObject.get("password").toString());
                clerk.setPlaceOfWork(jsonObject.get("placeOfWork").toString());
                System.out.println(clerk.toString());
                clerks.add(clerk);

            }
            for (int i = 0; i < clerks.size(); i++) {
                if (username.equalsIgnoreCase(jsonObject.get("username").toString())
                        || password.equalsIgnoreCase(jsonObject.get("password").toString())) {
                    find = true;
                }
            }
            System.out.println(clerk.getUsername() + "" + clerk.getPassword());
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
    }//fin customerSearch

    public Clerk getClerkByUsernameAndPassword(String username, String password) throws ParseException, org.json.simple.parser.ParseException {
        Clerk clerk = new Clerk();
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
                if (jsonObject.get("username").toString().equals(username) && jsonObject.get("password").toString().equals(password)) {

                    clerk.setIdentification(jsonObject.get("identification").toString());
                    clerk.setName(jsonObject.get("name").toString());
                    clerk.setEmail(jsonObject.get("email").toString());
                    clerk.setPhone(jsonObject.get("phone").toString());
                    clerk.setUsername(jsonObject.get("username").toString());
                    clerk.setPassword(jsonObject.get("password").toString());
                    clerk.setPlaceOfWork(jsonObject.get("placeOfWork").toString());
                    System.out.println(clerk.toString());
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
        return clerk;
    }

    public void deleteClerk(String username) throws ParseException, org.json.simple.parser.ParseException {

        try {

            JSONObject clerkObject;

            File file = new File(jsonFilePath);

            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File("clerksTemp.json");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonFilePath));
            try (PrintWriter printWriter = new PrintWriter(new FileWriter(tempFile))) {
                String line = null;

                //Read from the original file and write to the new
                //unless content matches data to be removed.
                while ((line = bufferedReader.readLine()) != null) {

                    clerkObject = (JSONObject) new JSONParser().parse(line);

                    if (!clerkObject.get("username").toString().equals(username)) {

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

    public void modifyClerkFromFile(String username, Clerk clerk) throws ParseException, org.json.simple.parser.ParseException {

        try {

            JSONObject clerkObject;

            File file = new File(jsonFilePath);

            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File("clerksTemp.json");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonFilePath));
            PrintWriter printWriter = new PrintWriter(new FileWriter(tempFile));

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {

                clerkObject = (JSONObject) new JSONParser().parse(line);

                if (!clerkObject.get("username").toString().equals(username)) {

                    printWriter.println(line);
                    printWriter.flush();
                } else {
                    clerkObject.put("identification", clerk.getIdentification());
                    clerkObject.put("name", clerk.getName());
                    clerkObject.put("email", clerk.getEmail());
                    clerkObject.put("phone", clerk.getPhone());
                    clerkObject.put("username", clerk.getUsername());
                    clerkObject.put("password", clerk.getPassword());
                    clerkObject.put("placeOfWork", clerk.getPlaceOfWork());
                    printWriter.println(clerkObject.toJSONString());
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

    public Clerk getClerkByUsername(String username) throws ParseException, org.json.simple.parser.ParseException {

        Clerk clerk = new Clerk();
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

                if (jsonObject.get("username").toString().equals(username)) {
                    clerk.setIdentification(jsonObject.get("identification").toString());
                    clerk.setName(jsonObject.get("name").toString());
                    clerk.setEmail(jsonObject.get("email").toString());
                    clerk.setPhone(jsonObject.get("phone").toString());
                    clerk.setUsername(jsonObject.get("username").toString());
                    clerk.setPassword(jsonObject.get("password").toString());
                   String aux=(String)jsonObject.get("placeOfWork");
                    clerk.setPlaceOfWork(aux);
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
        return clerk;
    }

}
