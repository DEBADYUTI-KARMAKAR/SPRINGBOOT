package in.sigma;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
//@DependsOn("userDao")
@DependsOn(value = {"userDao"})
public class UserService {
    public UserService(){
        System.out.println("Getting data from redis.");
    }
}
