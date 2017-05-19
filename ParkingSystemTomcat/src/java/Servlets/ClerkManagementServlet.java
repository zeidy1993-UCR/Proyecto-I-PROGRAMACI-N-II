package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.AdministratorBusiness;
import Business.ClerkBusiness;
import Business.CustomerBusiness;
import Domain.Administrator;
import Domain.Clerk;
import Domain.Customer;
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
 * @author Zeii
 */
@WebServlet(name = "ClerkManagementServlet", urlPatterns = {"/ClerkManagementServlet.do"})
public class ClerkManagementServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ClerkBusiness clerkBusiness;

    @Override
    public void init()
            throws ServletException {

        clerkBusiness = new ClerkBusiness();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClerkManagementServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClerkManagementServlet at " + request.getContextPath() + "</h1>");
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
                String clerkUsername = request.getParameter("administratorUsername");
                clerkBusiness.deleteClerk(clerkUsername);
                request.setAttribute("clerks", clerkBusiness.getAllClerks());
            } catch (java.text.ParseException | org.json.simple.parser.ParseException ex) {
                Logger.getLogger(CustomerManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("show_all_clerks.jsp");
            requestDispatcher.forward(request, response);

        } else if (action.equalsIgnoreCase("edit")) {
            String clerkUsername = request.getParameter("clerkUsername");
            Clerk clerk;
            try {
                clerk = clerkBusiness.getClerkByUsername(clerkUsername);

                request.setAttribute("clerk", clerk);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("modify_clerk.jsp");
                requestDispatcher.forward(request, response);
            } catch (java.text.ParseException | org.json.simple.parser.ParseException ex) {
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
            Clerk clerk;
            String identification = request.getParameter("identification");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String placeOfWork = request.getParameter("placeOfWork");

            clerk = new Clerk(identification, name, email, phone, username, password, placeOfWork);
            clerkBusiness.modifyClerk(username, clerk);
            request.setAttribute("clerks", clerkBusiness.getAllClerks());
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("show_all_clerks.jsp");
            requestDispatcher.forward(request, response);

        } catch (ParseException | java.text.ParseException ex) {
            Logger.getLogger(AdministratorManagementServlet.class.getName()).log(Level.SEVERE, null, ex);
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
