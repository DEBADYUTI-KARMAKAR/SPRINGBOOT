package in.sigma.springsecurityexample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/log")
    public String logData(){
        return "Log Data";
    }
    @GetMapping("/userName")
    public String getUserName(){
        return "Priyobrata";
    }
}
