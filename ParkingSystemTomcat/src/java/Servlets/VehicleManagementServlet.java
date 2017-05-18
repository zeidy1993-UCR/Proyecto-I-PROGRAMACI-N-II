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
 * @author Usuario
 */
@WebServlet(name = "VehicleManagementServlet", urlPatterns = {"/VehicleManagementServlet.do"})
public class VehicleManagementServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    VehicleBusiness vehicleBusiness;

    @Override
    public void init() throws ServletException {
        vehicleBusiness = new VehicleBusiness();

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VehicleManagementServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VehicleManagementServlet at " + request.getContextPath() + "</h1>");
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
                String vehiclePlate = request.getParameter("plate");
                vehicleBusiness.deleteVehicle(vehiclePlate);
                request.setAttribute("vehicles", vehicleBusiness.getAllVehicles());
            } catch (java.text.ParseException ex) {
                Logger.getLogger(VehicleManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (org.json.simple.parser.ParseException ex) {
                Logger.getLogger(VehicleManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("show_all_vehicles.jsp");
            requestDispatcher.forward(request, response);

        } else if (action.equalsIgnoreCase("edit")) {
            String vehiclePlate = request.getParameter("plate");
            Vehicle vehicle;
            try {
                vehicle = vehicleBusiness.getVehicleByPlate(vehiclePlate);

                request.setAttribute("plate", vehicle);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("modify_vehicle.jsp");
                requestDispatcher.forward(request, response);
            } catch (java.text.ParseException ex) {
                Logger.getLogger(VehicleManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (org.json.simple.parser.ParseException ex) {
                Logger.getLogger(VehicleManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Vehicle vehicle;
            VehicleType ObjVehicleType;
            String plate = request.getParameter("plate");
            String brand = request.getParameter("brand");
            String usernameCustomer = request.getParameter("username");
            String vehicleType = request.getParameter("vehicleType");
            CustomerBusiness customerBusiness = new CustomerBusiness();
            Customer customer = customerBusiness.getCustomerByUsername(usernameCustomer);

            ObjVehicleType = vehicleBusiness.getVehicleByCustomer(customer).getVehicleType();

            vehicle = new Vehicle(plate, brand, customer, ObjVehicleType);

            vehicleBusiness.modifyVehicle(plate, vehicle);
            request.setAttribute("vehicles", vehicleBusiness.getAllVehicles());
        } catch (ParseException ex) {
            Logger.getLogger(VehicleManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(VehicleManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
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
