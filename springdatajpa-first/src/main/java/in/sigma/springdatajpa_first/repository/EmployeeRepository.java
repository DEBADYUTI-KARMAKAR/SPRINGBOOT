package in.sigma.springdatajpa_first.repository;

import in.sigma.springdatajpa_first.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
