package in.sigma.springsecuritydemo.repository;

import in.sigma.springsecuritydemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public Customer findByEmail(String email);
}
