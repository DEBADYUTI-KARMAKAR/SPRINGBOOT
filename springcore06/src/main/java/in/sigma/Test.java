package in.sigma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        UserDao  dao = ctx.getBean(UserDao.class);
        dao.getData();
        ConfigurableApplicationContext cac = (ConfigurableApplicationContext) ctx;
        cac.close();
    }
}
