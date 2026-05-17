package in.sigma.springsecurityexmp.service;


import in.sigma.springsecurityexmp.entity.Customer;
import in.sigma.springsecurityexmp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomerService implements UserDetailsService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer c = customerRepository.findByEmail(email);
        return new User(c.getEmail(),c.getPassword(), Collections.emptyList());
//        return null;
    }

    public boolean saveCustomer(Customer c){
        String encodedPassword = passwordEncoder.encode(c.getPassword());
        c.setPassword(encodedPassword);
        Customer saveCustomer = customerRepository.save(c);
        return saveCustomer.getCid() != null;
    }
}
