/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.CustomerData;
import Domain.Customer;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;

/**
 *
 * @author Equipo
 */
public class CustomerBusiness {

    CustomerData customerData;

    public CustomerBusiness() {
        customerData = new CustomerData();
    }

    public void insertCustomer(Customer customer) throws IOException, org.json.simple.parser.ParseException {
        //regla de negocio de no permitir datos en blanco. Todos son requeridos.
        if (!customer.getIdentification().equals("")&&!customer.getName().equals("") && !customer.getEmail().equals("")
                && !customer.getPhone().equals("") && !customer.getUsername().equals("") && !customer.getPassword().equals("")) {
            customerData.insertCustomer(customer);
        }
    }

    public LinkedList<Customer> getAllCustomers() throws ParseException, org.json.simple.parser.ParseException {
        return customerData.getAllCustomers();
    }

    public Customer getCustomerByUsernameAndPassword(String username, String password) throws ParseException, org.json.simple.parser.ParseException {
        Customer customer = new Customer();
        //regla de negocio de no permitir datos en blanco. Todos son requeridos.
        if (!username.equals("") && !password.equals("")) {
            customer = customerData.getCustomerByUsernameAndPassword(username, password);
        }
        return customer;
    }

    public void modifyCustomer(String customerName, Customer customer) throws IOException, ParseException, org.json.simple.parser.ParseException {

        customerData.modifyCustomerFromFile(customerName, customer);

    }

    public void deleteCustomer(String customerUsername) throws IOException, ParseException, org.json.simple.parser.ParseException {

        customerData.deleteCustomer(customerUsername);

    }

 public Customer getCustomerByUsername(String username) throws ParseException, org.json.simple.parser.ParseException {

        Customer customer = new Customer();
        customer = customerData.getCustomerByUsername(username);
        return customer;
    }

    public Customer getCustomerByName(String username) throws ParseException, org.json.simple.parser.ParseException {

        Customer customer = new Customer();
        customer = customerData.getCustomerByUsername(username);
        return customer;
    }
    
    public boolean customerSearch(String username, String password) throws org.json.simple.parser.ParseException {
        return customerData.customerSearch(username, password);
    }

}
