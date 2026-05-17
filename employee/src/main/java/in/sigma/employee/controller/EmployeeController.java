package in.sigma.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class EmployeeController {

    @PostMapping("/addData")
    public ResponseEntity<?> addEmployeeData(){

    }
}
