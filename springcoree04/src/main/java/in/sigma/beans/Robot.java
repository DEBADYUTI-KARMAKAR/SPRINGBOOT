package in.sigma.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    @Autowired
    private  Chip chip;
    public Robot(){
        System.out.println("Default Constructor for Robot");
    }
    public  void doWork(){
        String type = chip.chipType();
        if(type.equals("64-Bit")){
            System.out.println("Fast performance");
        }
    }
}
