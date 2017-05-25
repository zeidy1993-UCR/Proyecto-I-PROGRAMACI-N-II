/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Business.CustomerBusiness;
import Business.VehicleBusiness;
import Domain.Customer;
import Domain.Vehicle;
import Domain.VehicleType;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Esteban
 */
@WebServlet(name = "VehicleInfoServlet", urlPatterns = {"/VehicleInfoServlet"})
public class VehicleInfoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        VehicleBusiness vehicleBusiness = new VehicleBusiness();
            CustomerBusiness customerBusiness = new CustomerBusiness();
            
        try {

            String plate = request.getParameter("plate");
            String brand = request.getParameter("brand");
            String usernameCustomer = request.getParameter("username");
            String usernameCustomer2 = request.getParameter("username2");
            String id = request.getParameter("id");
            float fee = vehicleBusiness.fee(id);
            String description = request.getParameter("description");
            
            Customer customers [] = new Customer[2];
            customers[0]= customerBusiness.getCustomerByUsername(usernameCustomer);
            customers[1]= customerBusiness.getCustomerByUsername(usernameCustomer2);
            
            

            //here the insertion of Customer takes place
            Vehicle vehicle = new Vehicle(plate, brand,customers ,new VehicleType(id, description, fee));
            vehicleBusiness.insertVehicle(vehicle);

            RequestDispatcher dispacher = request.getRequestDispatcher("show_info_vehicle.jsp");
            dispacher.forward(request, response);

        } catch (java.text.ParseException | ParseException ex) {
            Logger.getLogger(VehicleInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Customer customer = new Customer();
        CustomerBusiness customerBusiness = new CustomerBusiness();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
      
        try {

            customer = customerBusiness.getCustomerByUsernameAndPassword(username, password);
            System.out.println("name: " + customer.getName());
            //verifica que se encontró el cliente y por ende, tiene un nombre
                       if (!customer.getName().equals("")&&customer.getUsername().equals(username)) {
                RequestDispatcher dispacher = request.getRequestDispatcher("main_menu.jsp");
                response.setHeader("name", customer.getName());
                dispacher.forward(request, response);
            }else  {
                           RequestDispatcher dispacher = request.getRequestDispatcher("insert_customer.jsp");
                dispacher.forward(request, response);
                       }
          
            
        } catch (java.text.ParseException | ParseException ex) {
            Logger.getLogger(VehicleInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
