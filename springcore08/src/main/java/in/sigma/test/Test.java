package in.sigma.test;

import in.sigma.AppConfig;
import in.sigma.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao user = ctx.getBean(UserDao.class);

    }
}
