package org.example.customAnnotation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString
public class Driver {
    @NotNull(message = "Driver Identifier cannot be null")
    @DriverIdentifierValidation(groups={Ifcs.class},payload=SeverityLevel.High.class)
    private String driverIdentifier;
    private String driverName;
    private String driverLicense;
}
