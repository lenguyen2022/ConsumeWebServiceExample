package ca.sheridancollege.lenguyen.consumewebservice.database;

import ca.sheridancollege.lenguyen.consumewebservice.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
