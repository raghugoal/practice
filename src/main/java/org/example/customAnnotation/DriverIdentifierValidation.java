package org.example.customAnnotation;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DriverIdentifierValidator.class)
public @interface DriverIdentifierValidation {
    String message() default "Value must start with 'h-' or 'e-'";
    Class<?>[] groups() default {};
    Class<? extends  javax.validation.Payload>[] payload() default {};
}
