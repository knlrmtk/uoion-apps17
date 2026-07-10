package com.uoion;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String hostname = InetAddress.getLocalHost().getHostName();

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>UOION Demo</title>");
        out.println("<style>");
        out.println("body{font-family:Arial;background:#f5f5f5;text-align:center;}");
        out.println(".box{margin:80px auto;width:600px;background:white;padding:40px;border-radius:10px;box-shadow:0 0 10px gray;}");
        out.println("h1{color:#0066cc;}");
        out.println("h2{color:green;}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='box'>");
        out.println("<h1>Welcome to UOION</h1>");
        out.println("<h2>Application deployed successfully on Tomcat 9</h2>");
        out.println("<h3>Running on EC2 Instance</h3>");
        out.println("<h1>" + hostname + "</h1>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
