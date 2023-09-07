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

package webapp;

import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.IBANValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IbanValidationController {

    @GetMapping("/iban-validation")
    public ModelAndView emailValidation() {
        return new ModelAndView("iban-validation");

    }


    @PostMapping("/iban-validation")
    public ModelAndView emailValidationSubmit(String iban) {
        String successMessage = null;
        String errorMessage = null;

        if (IBANValidator.getInstance().isValid(iban)) {
            successMessage = "IBAN valido!";

        } else {
            errorMessage = "IBAN non valido!";
        }

        ModelAndView modelAndView = new ModelAndView("iban-validation");
        modelAndView.addObject("successMessage", successMessage);
        modelAndView.addObject("errorMessage", errorMessage);

        return modelAndView;
    }
}
