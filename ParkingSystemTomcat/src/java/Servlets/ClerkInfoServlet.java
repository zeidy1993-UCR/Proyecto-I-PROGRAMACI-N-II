/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Business.ClerkBusiness;
import Domain.Clerk;
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
@WebServlet(name = "ClerkInfoServlet", urlPatterns = {"/ClerkInfoServlet"})
public class ClerkInfoServlet extends HttpServlet {

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
String placeOfWork= request.getParameter("placeOfWork");
        //here the insertion of Customer takes place
        Clerk clerk= new Clerk(identification, name, email, phone, username, password, placeOfWork);
        ClerkBusiness clerkBusiness= new ClerkBusiness();

        try {
            clerkBusiness.insertClerk(clerk);
        } catch (ParseException ex) {
            Logger.getLogger(ClerkInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        RequestDispatcher dispacher = request.getRequestDispatcher("show_info_clerk.jsp");
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
        Clerk clerk= new Clerk();
        ClerkBusiness clerkBusiness= new ClerkBusiness();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
clerk= clerkBusiness.getClerkByUsernameAndPassword(username, password);
            
            System.out.println("name: " + clerk.getName());
            //verifica que se encontró el cliente y por ende, tiene un nombre
            if (!clerk.getName().equals("") && clerk.getUsername().equals(username)) {
                RequestDispatcher dispacher = request.getRequestDispatcher("main_menu_clerk.jsp");
                response.setHeader("name", clerk.getName());
                dispacher.forward(request, response);
            } else {
                RequestDispatcher dispacher = request.getRequestDispatcher("insert_clerk.jsp");
                dispacher.forward(request, response);
            }

        } catch (java.text.ParseException | ParseException ex) {
            Logger.getLogger(ClerkInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
