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
package com.example.validatorwebapp;
import org.apache.commons.validator.routines.InetAddressValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UrlValidationController {

    @GetMapping("/validate-url")
    public String showValidationTypeSelectionForm() {
        return "urlform";
    }

    @PostMapping("/validate-url")
    public String validateInput(
            @RequestParam("validationType") String validationType,
            @RequestParam("input") String input,
            Model model) {
        boolean isValid = false;

        switch (validationType) {
            case "url":
                UrlValidator urlValidator = new UrlValidator();
                isValid = urlValidator.isValid(input);
                break;
            case "ipv4", "ipv6":
                InetAddressValidator ipvValidator = InetAddressValidator.getInstance();
                isValid = ipvValidator.isValid(input);
                break;
        }

        if (isValid) {
            model.addAttribute("message", "Valid " + validationType.toUpperCase() + ": " + input);
        } else {
            model.addAttribute("message", "Invalid " + validationType.toUpperCase() + ": " + input);
        }

        return "redirect:/";
    }
}

