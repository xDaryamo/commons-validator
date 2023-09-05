/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.commonsvalidatorwebapp;

import java.io.*;
import org.apache.commons.validator.routines.EmailValidator;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Get user input
        String email = request.getParameter("email");

        // Validate email using Apache Commons Validator
        EmailValidator validator = EmailValidator.getInstance();
        boolean isValidEmail = validator.isValid(email);

        // Prepare response
        String message = isValidEmail ? "Valid email address!" : "Invalid email address!";
        response.setContentType("text/html");
        response.getWriter().println("<html><body><h1>" + message + "</h1></body></html>");
    }
}