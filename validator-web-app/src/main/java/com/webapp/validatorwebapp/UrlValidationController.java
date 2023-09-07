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

import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UrlValidationController {

    @GetMapping("/url-validation")
    public ModelAndView urlValidationForm() {
        return new ModelAndView("url-validation");
    }

    @PostMapping("/url-validation")
    public ModelAndView urlValidationSubmit(String url) {
        String successMessage = null;
        String errorMessage = null;

        // Esegui la validazione dell'URL utilizzando la libreria esterna
        UrlValidator urlValidator = new UrlValidator();
        if (urlValidator.isValid(url)) {
            // URL valido, esegui le operazioni necessarie
            successMessage = "URL valido!";
        } else {
            // URL non valido, mostra un messaggio di errore
            errorMessage = "URL non valido!";
        }

        ModelAndView modelAndView = new ModelAndView("url-validation");
        modelAndView.addObject("successMessage", successMessage);
        modelAndView.addObject("errorMessage", errorMessage);

        return modelAndView;
    }
}