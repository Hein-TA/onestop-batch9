package com.jdc.balance.api;

import com.jdc.balance.api.input.ChangePasswordForm;
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
@RequestMapping("password")
public class ChangePasswordApi {

    @Autowired
    private AccountSecurityService service;

    @PostMapping
    SecurityInfo changePassword(@Validated @RequestBody ChangePasswordForm form, BindingResult bindingResult) {
        return service.changePassword(form);
    }

}
