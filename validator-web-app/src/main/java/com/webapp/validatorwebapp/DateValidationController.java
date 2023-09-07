/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.webapp.validatorwebapp;

import org.apache.commons.validator.routines.DateValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class DateValidationController {

    @GetMapping("/date-validation")
    public ModelAndView dateValidationForm() {
        return new ModelAndView("date-validation");
    }

    @PostMapping("/date-validation")
    public ModelAndView dateValidationSubmit(String date) {
        String successMessage = null;
        String errorMessage = null;

        // Esegui la validazione della data utilizzando la libreria esterna
        DateValidator dateValidator = DateValidator.getInstance();
        if (dateValidator.isValid(date, "dd/MM/yyyy", Locale.ITALIAN)) {
            // Data valida, esegui le operazioni necessarie
            successMessage = "Data valida!";
        } else {
            // Data non valida, mostra un messaggio di errore
            errorMessage = "Data non valida!";
        }

        ModelAndView modelAndView = new ModelAndView("date-validation");
        modelAndView.addObject("successMessage", successMessage);
        modelAndView.addObject("errorMessage", errorMessage);

        return modelAndView;
    }
}