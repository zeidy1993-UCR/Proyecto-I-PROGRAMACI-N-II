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
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "CustomerManagementServlet", urlPatterns = {"/CustomerManagementServlet.do"})
public class CustomerManagementServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    CustomerBusiness customerBusiness;

    @Override
    public void init() throws ServletException {

        customerBusiness = new CustomerBusiness();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CustomerManagementServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerManagementServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            try {
                String customerUsername = request.getParameter("customerUsername");
                customerBusiness.deleteCustomer(customerUsername);
                request.setAttribute("customers", customerBusiness.getAllCustomers());
            } catch (ParseException | org.json.simple.parser.ParseException ex) {
                Logger.getLogger(CustomerManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("show_all_customers.jsp");
            requestDispatcher.forward(request, response);

        } else if (action.equalsIgnoreCase("edit")) {
               try {
            String customerUsername = request.getParameter("customerUsername");
            Customer customer;
         
                customer = customerBusiness.getCustomerByUsername(customerUsername);

                request.setAttribute("customer", customer);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("modify_customer.jsp");
                requestDispatcher.forward(request, response);
            } catch (ParseException | org.json.simple.parser.ParseException ex) {
                Logger.getLogger(CustomerManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

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
        try {
            Customer customer;

            String identification = request.getParameter("identification");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            boolean disabilityPresented = Boolean.parseBoolean(request.getParameter("disabilityPresented"));

            customer = new Customer(identification, name, email, phone, username, password, disabilityPresented);

            customerBusiness.modifyCustomer(username, customer);
            request.setAttribute("customers", customerBusiness.getAllCustomers());
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("show_all_customers.jsp");
            requestDispatcher.forward(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(CustomerManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(CustomerManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
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
