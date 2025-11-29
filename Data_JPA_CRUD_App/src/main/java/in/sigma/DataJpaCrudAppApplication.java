package in.sigma;

import in.sigma.entity.Bank;
import in.sigma.entity.BankPk;
import in.sigma.entity.Student;
import in.sigma.repo.BankRepository;
import in.sigma.repo.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaCrudAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(DataJpaCrudAppApplication.class, args);
//
//		BankRepository bean = ctx.getBean(BankRepository.class);
//		BankPk bk = new BankPk();
//		bk.setPhone("8888888888");
//		bk.setAccountNumber("232323232323");
//		Bank bnk = new Bank();
//		bnk.setBankPrimaryKey(bk);
//		bnk.setEmail("d@gmail.com");
//		bnk.setCustomerName("Deb");
//		bean.save(bnk);
		StudentRepository been = ctx.getBean(StudentRepository.class);
		Student s1 = new Student();
		s1.setName("Ram");
		been.save(s1);

	}

}
