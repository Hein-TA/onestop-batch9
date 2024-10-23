package com.jdc.balance.model.service;

import com.jdc.balance.api.input.ChangePasswordForm;
import com.jdc.balance.api.input.RefreshForm;
import com.jdc.balance.api.input.SignInForm;
import com.jdc.balance.api.input.SignUpForm;
import com.jdc.balance.api.output.SecurityInfo;
import org.springframework.stereotype.Service;

@Service
public class AccountSecurityService {
    public SecurityInfo changePassword(ChangePasswordForm form) {
        return null;
    }

    public SecurityInfo signIn(SignInForm form) {
        return null;
    }

    public SecurityInfo signUp(SignUpForm form) {
        return null;
    }

    public SecurityInfo refresh(RefreshForm form) {
        return null;
    }
}
