package org.example.customAnnotation;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @PostMapping("/add")
    public String addDriver(@Validated(Ifcs.class) @RequestBody Driver driver) {
        return "Driver added";
    }
}
