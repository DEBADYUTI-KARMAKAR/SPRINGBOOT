package in.sigma.FirstRestApi;

import in.sigma.FirstRestApi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRequestController {
    @GetMapping("/")
    public Student getCustomer(){
        Student s1 = new Student();
        s1.setId(1);
        s1.setDepartment("CSE");
        s1.setName("Ram");
        return s1;
    }
}
