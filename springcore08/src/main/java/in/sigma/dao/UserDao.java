package in.sigma.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Store data in db");
        System.out.println("get data from db...");
        System.out.println("Store data into redis");
    }
}
