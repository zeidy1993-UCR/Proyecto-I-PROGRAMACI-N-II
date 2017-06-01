/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.ClerkData;
import Domain.Clerk;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;

/**
 *
 * @author Zeii
 */
public class ClerkBusiness {
    
 ClerkData clerkData;

    public ClerkBusiness() {
        clerkData = new ClerkData();
    }

    public void insertClerk(Clerk clerk) throws IOException, org.json.simple.parser.ParseException {
        //regla de negocio de no permitir datos en blanco. Todos son requeridos.
        if (!clerk.getIdentification().equals("") &&!clerk.getName().equals("") && !clerk.getEmail().equals("")
                && !clerk.getUsername().equals("") && !clerk.getPassword().equals("")) {
            clerkData.insertClerk(clerk);
        }
    }

    public LinkedList<Clerk> getAllClerks() throws ParseException, org.json.simple.parser.ParseException {
        return clerkData.getAllClerks();
    }

    public Clerk getClerkByUsernameAndPassword(String username, String password) throws ParseException, org.json.simple.parser.ParseException {
        Clerk clerk = new Clerk();
        //regla de negocio de no permitir datos en blanco. Todos son requeridos.
        if (!username.equals("") && !password.equals("")) {
            clerk = clerkData.getClerkByUsernameAndPassword(username, password);
        }
        return clerk;
    }

    public void modifyClerk(String clerkName, Clerk clerk) throws IOException, ParseException, org.json.simple.parser.ParseException {

        clerkData.modifyClerkFromFile(clerkName, clerk);

    }

    public void deleteClerk(String clerkUsername) throws IOException, ParseException, org.json.simple.parser.ParseException {

        clerkData.deleteClerk(clerkUsername);

    }

 public Clerk getClerkByUsername(String username) throws ParseException, org.json.simple.parser.ParseException {

        Clerk clerk = new Clerk();
        clerk = clerkData.getClerkByUsername(username);
        return clerk;
    }

    
    public Clerk getClerkByName(String username) throws ParseException, org.json.simple.parser.ParseException {

        Clerk clerk = new Clerk();
        clerk = clerkData.getClerkByUsername(username);
        return clerk;
    }
    
    public boolean clerkSearch(String username, String password) throws org.json.simple.parser.ParseException {
        return clerkData.clerkSearch(username, password);
    }

}
