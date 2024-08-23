package com.example.staffmanager.error;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailGVValidator implements ConstraintValidator<EmailGV, String> {

    private static final String EMAIL_SUFFIX = "@fe.edu.vn";

    @Override
    public void initialize(EmailGV constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return true;
        }
        return value.endsWith(EMAIL_SUFFIX);
    }
}