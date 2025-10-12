package in.sigma.test;

import in.sigma.beans.AppConfig;
import in.sigma.beans.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class A {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportService service = context.getBean(ReportService.class);
        service.generateReport();

    }
}
