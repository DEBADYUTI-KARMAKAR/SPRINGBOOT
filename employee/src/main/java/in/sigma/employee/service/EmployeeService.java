package in.sigma.employee.service;

import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    public ResponseEntity<?> addEmployeeData();
    public ResponseEntity<?> updateEmployeeData();
}
