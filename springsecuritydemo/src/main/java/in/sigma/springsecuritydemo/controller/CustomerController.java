package in.sigma.springsecuritydemo.controller;


import in.sigma.springsecuritydemo.entity.Customer;
import in.sigma.springsecuritydemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Customer customer){
        UsernamePasswordAuthenticationToken token =
                new UsernamePasswordAuthenticationToken(customer.getEmail(),customer.getPwd());
       Authentication authentication = authenticationManager.authenticate(token);
       boolean status = authentication.isAuthenticated();
       if (status){
           return new ResponseEntity<String>("Welcome",HttpStatus.OK);
       }else {
           return new ResponseEntity<String>("Failed",HttpStatus.BAD_REQUEST);
       }


    }

    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestBody Customer customer){
        boolean status = customerService.saveCustomer(customer);
        if(status){
            return new ResponseEntity<>("Success",HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
