package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menú principal</title>\n");
      out.write("        ");

            String name = response.getHeader("name");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body background=\"Images/fondo.jpg\">\n");
      out.write("        <font size=6 color=lightgreen> Bienvenido(a), ");
      out.print(name);
      out.write(" </font>\n");
      out.write("        <i>\n");
      out.write("            <marquee <b><font color=\"lightgreen\" size=\"8\">Menú principal del Sistema </font></b>\n");
      out.write("            </marquee>\n");
      out.write("        </i>\n");
      out.write("        <table border=\"2\" align=\"center\" bgcolor=\"black\" bordercolor=\"white\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"5\" color=\"white\">\n");
      out.write("                    1--> <a href=\"./insert_customer.jsp\">Insertar cliente</a>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"5\" color=\"white\">\n");
      out.write("                    2--> <a href=\"CustomerRetrievalServlet\">Consultar clientes</a>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"5\" color=\"white\">\n");
      out.write("                    3--> <a href=\"./insert_administrator.jsp\">Insertar administrador</a>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"5\" color=\"white\">\n");
      out.write("                    4--> <a href=\"AdministratorRetrievalServlet\">Consultar administrador</a>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                        <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"5\" color=\"white\">\n");
      out.write("                    5--> <a href=\"./insert_clerk.jsp\">Insertar empleado</a>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                        <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"5\" color=\"white\">\n");
      out.write("                    6--> <a href=\"ClerkRetrievalServlet\">Consultar empleados</a>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                       <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"5\" color=\"white\">\n");
      out.write("                    7--> <a href=\"./insert_vehicle.jsp\">Insertar vehiculo</a>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                        <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"5\" color=\"white\">\n");
      out.write("                    8--> <a href=\"VehicleRetrievalServlet\">Consultar vehiculos</a>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
