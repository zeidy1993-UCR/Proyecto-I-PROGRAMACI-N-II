/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Business.CustomerBusiness;
import Domain.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Esteban
 */
@WebServlet(name = "CustomerInfoServlet", urlPatterns = {"/CustomerInfoServlet"})
public class CustomerInfoServlet extends HttpServlet {

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
        String identification = request.getParameter("identification");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean disabilityPresented = Boolean.parseBoolean(request.getParameter("disabilityPresented"));
        Customer customer = new Customer(identification, name, email, phone, username, password, disabilityPresented);
        CustomerBusiness customerBusiness = new CustomerBusiness();
        try {
            customerBusiness.insertCustomer(customer);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        RequestDispatcher dispacher = request.getRequestDispatcher("show_info_customer.jsp");
        dispacher.forward(request, response);

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
            if (!customer.getName().equals("")) {
                RequestDispatcher dispacher = request.getRequestDispatcher("main_menu.jsp");
                response.setHeader("name", customer.getName());
                dispacher.forward(request, response);
            }
        } catch (java.text.ParseException ex) {
            Logger.getLogger(CustomerInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
