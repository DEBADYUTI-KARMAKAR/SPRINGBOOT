package in.sigma;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao  {
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("after init...");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroyyy..");
//    }

    @PostConstruct
    public void init() throws Exception{
        System.out.println("inittttt ....");
    }
    public void getData(){
        System.out.println("Getting dataaa ....");
    }
    @PreDestroy
    public void destroy() throws Exception{
        System.out.println("Destroyyyyy....");
    }
}
