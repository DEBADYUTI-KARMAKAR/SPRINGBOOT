package in.sigma.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
    public Chip(){
        System.out.println("Default Constructor for  Chip");
    }
    public String chipType(){
        return "64-Bit";
    }
}
