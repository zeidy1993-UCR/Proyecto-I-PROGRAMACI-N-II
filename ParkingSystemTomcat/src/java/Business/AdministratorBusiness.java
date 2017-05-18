/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.AdministratorData;
import Data.CustomerData;
import Domain.Administrator;
import Domain.Customer;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;

/**
 *
 * @author Equipo
 */
public class AdministratorBusiness {

    AdministratorData administratorData;

    public AdministratorBusiness() {
        administratorData = new AdministratorData();
    }

    public void insertAdministrator(Administrator administrator) throws IOException, org.json.simple.parser.ParseException {
        //regla de negocio de no permitir datos en blanco. Todos son requeridos.
        if (!administrator.getIdentification().equals("") && !administrator.getName().equals("") && !administrator.getEmail().equals("")
                && !administrator.getUsername().equals("") && !administrator.getPassword().equals("")) {
            administratorData.insertAdministrator(administrator);
        }
    }

    public LinkedList<Administrator> getAllAdministrators() throws ParseException, org.json.simple.parser.ParseException {
        return administratorData.getAllAdministrators();
    }

    public Administrator getAdministratorByUsernameAndPassword(String username, String password) throws ParseException, org.json.simple.parser.ParseException {
        Administrator administrator = new Administrator();
        if (!username.equals("") && !password.equals("")) {
            administrator = administratorData.getAdministratorByUsernameAndPassword(username, password);
        }
        return administrator;
    }

    public void modifyAdministrator(String administratorName, Administrator administrator) throws IOException, ParseException, org.json.simple.parser.ParseException {

        administratorData.modifyAdministratorFromFile(administratorName, administrator);

    }

    public void deleteAdministrator(String administratorUsername) throws IOException, ParseException, org.json.simple.parser.ParseException {

        administratorData.deleteAdministrator(administratorUsername);

    }

    public Administrator getAdministratorByUsername(String username) throws ParseException, org.json.simple.parser.ParseException {

        Administrator administrator = new Administrator();
        administrator = administratorData.getAdministratorByUsername(username);
        return administrator;
    }

    public Administrator getAdministratorByName(String username) throws ParseException, org.json.simple.parser.ParseException {

        Administrator administrator = new Administrator();
        administrator = administratorData.getAdministratorByUsername(username);
        return administrator;
    }

}
