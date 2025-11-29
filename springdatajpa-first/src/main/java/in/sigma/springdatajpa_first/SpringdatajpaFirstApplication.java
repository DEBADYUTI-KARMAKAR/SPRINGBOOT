package in.sigma.springdatajpa_first;

import in.sigma.springdatajpa_first.entity.Book;
import in.sigma.springdatajpa_first.entity.Employee;
import in.sigma.springdatajpa_first.entity.Student;
import in.sigma.springdatajpa_first.entity.StudentPK;
import in.sigma.springdatajpa_first.repository.BookRepositoty;
import in.sigma.springdatajpa_first.repository.EmployeeRepository;
import in.sigma.springdatajpa_first.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringdatajpaFirstApplication {

	public static void main(String[] args) {

//		ConfigurableApplicationContext ctx = SpringApplication.run(SpringdatajpaFirstApplication.class, args);
//		BookRepositoty bookRepo = ctx.getBean((BookRepositoty.class));
//		Book b = new Book();
////		b.setBookId(106);
////		b.setBookName("Python Book");
////		b.setBookPrice(700.00);
////		bookRepo.save(b);
//		System.out.println("Record inserted.....");
//		List<Book> book = bookRepo.findByBookPriceGreaterThan(250.00);
//		List<Book> bookLs = bookRepo.findByBookPriceLessThan(300.00);
//		List<Book> bookNm = bookRepo.findByBookName("Python Book");
//		List<Book> bookAll = bookRepo.getAllBooks();
//		List<Book> fromBookkk = bookRepo.getBooks();
//
//		System.out.println(book);
//		System.out.println(bookLs);
//		System.out.println(bookNm);
//		System.out.println(bookAll);
//		System.out.println(fromBookkk);




		ConfigurableApplicationContext ctx = SpringApplication.run(SpringdatajpaFirstApplication.class, args);
//		EmployeeRepository repository = ctx.getBean(EmployeeRepository.class);
//		Employee e1 = new Employee(1,"Ram",60000.00,"Male","Sales");
//		Employee e2 = new Employee(2,"Sham",20000.00,"Male","HR");
//		Employee e3 = new Employee(3,"Jodhu",10000.00,"Male","OFFICE BOY");
//		Employee e4 = new Employee(4,"Modhu",50000.00,"Male","DEV");
//		Employee e5 = new Employee(5,"Vikash",40000.00,"Male","DEV");
//		Employee e6 = new Employee(6,"Priyabrata",70000.00,"Male","JAVA Dev");
//		Employee e7 = new Employee(7,"Parthib",100000.00,"Male","Sr Dev");
//
//		repository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7));

//		Employee emp = new Employee();
////		emp.setEmpId(1);
//		emp.setEmpNAme("Modhu");
//		emp.setDepartment("Admin");
//		emp.setEmpGender("Male");
//		emp.setEmpSalary(10000.00);
//		repository.save(emp);
//		System.out.println("Record Save");

//		Sort sort = Sort.by("empSalary").descending();

//		List<Employee> emp = repository.findAll(sort);
//		int pageNumber = 1;
//		PageRequest page = PageRequest.of(pageNumber-1,3,sort);
//		Page<Employee> findAllEmp = repository.findAll(page);
//		List<Employee> emp = findAllEmp.getContent();
//


//		System.out.println(emp);

//		emp.forEach(System.out::println);



//		Employee emp = new Employee();
//		emp.setDepartment("DEV");
//		emp.setEmpGender("Female");
//		Example<Employee> eemp = Example.of(emp);
//		List<Employee> allEmp = repository.findAll(eemp);
//		allEmp.forEach(System.out::println);

		StudentRepository repository = ctx.getBean(StudentRepository.class);

		StudentPK spk = new StudentPK();
		spk.setRoll("1");
		spk.setPhoneNumber("8989933222");
		Student std = new Student();
		std.setName("Priyobrata");
		std.setStanderd("ECE");
		std.setStudentPK(spk);

		repository.save(std);





	}

}
