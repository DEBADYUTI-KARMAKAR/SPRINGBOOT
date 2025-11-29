package in.sigma.springdatajpa_first.repository;

import in.sigma.springdatajpa_first.entity.Student;
import in.sigma.springdatajpa_first.entity.StudentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface StudentRepository extends JpaRepository<Student, StudentPK> {
}
