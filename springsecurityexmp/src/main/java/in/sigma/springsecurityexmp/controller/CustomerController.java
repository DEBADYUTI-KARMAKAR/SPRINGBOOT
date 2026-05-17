package in.sigma.springsecurityexmp.controller;


import in.sigma.springsecurityexmp.config.JwtService;
import in.sigma.springsecurityexmp.entity.Customer;
import in.sigma.springsecurityexmp.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestBody Customer c){
        System.out.println("hiii");
        boolean reponse = customerService.saveCustomer(c);
        if (reponse){
            return  new ResponseEntity<>("Success", HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>("Failed",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login (@RequestBody Customer c){
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(c.getEmail(),c.getPassword());
        Authentication authentication = authenticationManager.authenticate(token);

        boolean response = authentication.isAuthenticated();

        if (response){
            String jwt = jwtService.generateToken(c.getEmail());

            return new ResponseEntity<String>(jwt,HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("Failed",HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(HttpServletRequest request){
        String authHeader = request.getHeader("Authorization");
        if(authHeader == null || !authHeader.startsWith("Bearer ")){
            return new ResponseEntity<>("Token missing",HttpStatus.UNAUTHORIZED);
        }
        String token = authHeader.substring(7);

        try {
            String email = jwtService.extractEmail(token);
            UserDetails userDetails = customerService.loadUserByUsername(email);
            if(jwtService.isTokenValid(token,userDetails)){
                return new ResponseEntity<>("Welcome "+ email+"!" ,HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Token expired or invalid" ,HttpStatus.UNAUTHORIZED);
            }

        } catch (Exception e) {
            return new ResponseEntity<>("Invalid token",HttpStatus.UNAUTHORIZED);
        }

    }
}
