package org.example.customAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.Payload;
import java.util.Arrays;
import java.util.List;
public class DriverIdentifierValidator implements ConstraintValidator<DriverIdentifierValidation, String> {

    private List<Class<? extends Payload>> payloads;
    public void initialize(DriverIdentifierValidation constraint) {
        payloads = Arrays.asList(constraint.payload());
    }
    @Override
    public boolean isValid(String value, javax.validation.ConstraintValidatorContext context) {
        boolean isValid = value != null && (value.startsWith("h-") || value.startsWith("e-"));

        if(!isValid && payloads.contains(SeverityLevel.High.class)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("High Severity: Should be start with 'h-' or 'e-'").addConstraintViolation();
        }

        return isValid;
    }
}
