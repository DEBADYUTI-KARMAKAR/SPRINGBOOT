package in.sigma.RestApiProject;

import in.sigma.RestApiProject.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class RestApiController {

    HashMap<String,Student> hm = new HashMap<>();

    @PostMapping(value="/addData", consumes = {"application/json"})
    public ResponseEntity<Student> addStudentData(@RequestBody Student data){
        hm.put(data.getId(),data);
        System.out.println(data.getId());
        System.out.println(hm);
        return new ResponseEntity<Student>(data,HttpStatus.CREATED);
    }
    @GetMapping(value = "/list", produces = {"application/xml"})
//    public HashMap<String, Student> getAllList(){
//        return hm;
//    }
    public Student getAllList(){
        Student s1 = new Student();
        s1.setId("1");
        s1.setName("Ram");
        s1.setDepartment("ECE");

        return s1;
    }

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable("id") String id){
        System.out.println(hm.get(id));
        return hm.get(id);
    }

    @GetMapping("/get/param")
    public Student getListById(@RequestParam("id") String id){
        System.out.println(hm.get(id));
        return hm.get(id);
    }



//    {
//        message: "Data Save Successfully.",
//        status: 201,
//        data:{
//        "department": "ECE",
//                "id": "2",
//                "name": "Roghu"
//    }
//    }

//    @GetMapping("/")
//    public Student demoApiTest(){
//        // logic
//        Student s1 = new Student();
//        s1.setId(1);
//        s1.setName("Ram");
//        s1.setDepartment("CSE");
//        return s1;
//    }
//    @GetMapping("/second")
//    public String demoApiTestTwo(){
//        return "Hello this is my second api in spring boot application";
//    }
//
//    @PostMapping("/addStudent")
//    public ResponseEntity<Student> saveStudent(@RequestBody Student data){
//        System.out.println(data);
//        return new ResponseEntity<Student>(data, HttpStatus.CREATED);
//    }
}
