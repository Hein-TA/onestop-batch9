package com.jdc.balance.api;

import com.jdc.balance.exception.ApiValidationException;
import com.jdc.balance.api.input.RefreshForm;
import com.jdc.balance.api.input.SignInForm;
import com.jdc.balance.api.input.SignUpForm;
import com.jdc.balance.api.output.SecurityInfo;
import com.jdc.balance.model.service.AccountSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security")
public class SecurityApi {

    @Autowired
    private AccountSecurityService service;

    @PostMapping("signin")
    SecurityInfo signIn(@Validated @RequestBody SignInForm form, BindingResult bindingResult) {
        return service.signIn(form);
    }

    @PostMapping("signup")
    SecurityInfo signUp(@Validated @RequestBody SignUpForm form, BindingResult bindingResult) {
        return service.signUp(form);
    }

    @PostMapping("refresh")
    SecurityInfo refresh(@Validated @RequestBody RefreshForm form, BindingResult bindingResult) {
        return service.refresh(form);
    }
}
