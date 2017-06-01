package org.apache.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Saludos extends HttpServlet{ 
      public void service(HttpServletRequest request,HttpServletResponse response)
              throws IOException{ 
		  // Lógica de Ejecución
                 response.setContentType("text/html");
                PrintWriter out = response.getWriter();
		  out.println("<HTML>");
		  out.println("<BODY>");
		  out.println("Pagina Basica");
		  out.println("</BODY>");
		  out.println("</HTML>");
		  }

}