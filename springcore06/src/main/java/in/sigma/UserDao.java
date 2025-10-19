package in.sigma;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    @PostConstruct
    public void init() throws Exception{
        System.out.println("Started DB connection.....");
    }
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("init....");
//    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroyyyy.....");
//    }

    public void getData(){
        System.out.println("getting data from db....");
    }
    @PreDestroy
    public void destroy() throws Exception{
        System.out.println("Closing db connection");
    }
}
