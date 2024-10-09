package com.jdc.balance.exception;

import org.springframework.validation.BindingResult;

public class ApiValidationException extends ApiBaseException {
    private static final long serialVersionUID = 1L;

    public ApiValidationException(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            for (var error : bindingResult.getFieldErrors()) {
                getErrors().add(error.getDefaultMessage());
            }
        }
    }
}
