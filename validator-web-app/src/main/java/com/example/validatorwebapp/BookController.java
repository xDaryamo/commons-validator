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
import org.apache.commons.validator.routines.CalendarValidator;
import org.apache.commons.validator.routines.CurrencyValidator;
import org.apache.commons.validator.routines.ISBNValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.text.SimpleDateFormat;
import java.util.Locale;

@Controller
public class BookController {

    private final ISBNValidator isbnValidator = new ISBNValidator();
    private final CalendarValidator calendarValidator = new CalendarValidator();
    private final CurrencyValidator currencyValidator = (CurrencyValidator) CurrencyValidator.getInstance();

    @GetMapping("/register-book")
    public String showBookRegistrationForm(Model model) {
        model.addAttribute("book", new Book());
        return "registerBook";
    }

    @PostMapping("/register-book")
    public String registerBook(@ModelAttribute("book") Book book, BindingResult result) {
        // Validate ISBN using Apache Commons Validator
        if (!isbnValidator.isValid(book.getIsbn())) {
            result.rejectValue("isbn", "error.isbn", "Invalid ISBN");
        }

        // Validate registrationDate using Apache Commons Validator
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String registrationDateStr = sdf.format(book.getRegistrationDate());
        if (!calendarValidator.isValid(registrationDateStr, "yyyy-MM-dd", Locale.getDefault())) {
            result.rejectValue("registrationDate", "error.registrationDate", "Invalid date format");
        }

        // Validate price using Apache Commons Validator
        if (!currencyValidator.isValid(book.getPrice().toString(), Locale.getDefault())) {
            result.rejectValue("price", "error.price", "Invalid price format");
        }

        if (result.hasErrors()) {
            return "registerBook";
        }

        // Perform book registration logic here

        return "redirect:/";
    }
}



