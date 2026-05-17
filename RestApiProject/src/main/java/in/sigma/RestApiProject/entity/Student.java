package in.sigma.RestApiProject.entity;


import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;


@Data
@XmlRootElement(name = "student")
public class Student {
    String id;
    String name;
    String department;
}
