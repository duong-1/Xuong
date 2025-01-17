package com.example.staffmanager.error;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EmailGVValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailGV {

    String message() default "Không chứa khoảng trắng và kết thúc bằng @fe.edu.vn";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}