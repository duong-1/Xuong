package com.example.staffmanager.error;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidValidator implements ConstraintValidator<EmailValid, String> {

    private static final String EMAIL_SUFFIX_FE = "@fe.edu.vn";
    private static final String EMAIL_SUFFIX_FPT = "@fpt.edu.vn";
    private static final String VIETNAMESE_CHARACTERS = "ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÛÜÝàáâãèéêìíòóôõùúûüýỳỴỶỸ";

    @Override
    public void initialize(EmailValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        if (value.contains(" ")) {
            return false;
        }

        for (char c : VIETNAMESE_CHARACTERS.toCharArray()) {
            if (value.indexOf(c) >= 0) {
                return false;
            }
        }

        return value.endsWith(EMAIL_SUFFIX_FE) || value.endsWith(EMAIL_SUFFIX_FPT);
    }
}
