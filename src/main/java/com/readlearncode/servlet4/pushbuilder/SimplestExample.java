package com.readlearncode.servlet4.pushbuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet("/simplestexample")
public class SimplestExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.newPushBuilder()
                .path("images/coffee-cup.jpg")
                .push();

        try (PrintWriter printWriter = response.getWriter()) {
            printWriter.write("<html><img src='images/coffee-cup.jpg'></html>");
        }
    }
}