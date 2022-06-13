package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Get the value entered in the form.
        String textValue = request.getParameter("text-input");

        // Print the value so you can see it in the server logs.
        // System.out.println("You submitted: " + textValue);

        // Write the value to the response so the user can see it.
        // response.getWriter().println("You submitted: " + textValue);
        // show the alert to the response so the user can see it, redirect to the page
        String name = request.getParameter("name-input");
        String message = request.getParameter("text-input");
        String email = request.getParameter("email-input");

        // Show in server logs.
        System.out.println("New User submit");
        System.out.println("user submitted: " + textValue);
        System.out.println("user name: " + name);
        System.out.println("user email: " + email);
        System.out.println("User Submition Ends");

        // show the alert then the user knows she/he has submmited the form successfully
        response.getWriter()
                .println("<script> alert('Submission Success!'); window.location.href='/contact.html' </script>");
    }
}