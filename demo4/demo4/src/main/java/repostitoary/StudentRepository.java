package repostitoary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleCurdwithhibarnate.demo4.Entitites.Student;

public interface StudentRepository  extends JpaRepository<Student,Integer>{

}
