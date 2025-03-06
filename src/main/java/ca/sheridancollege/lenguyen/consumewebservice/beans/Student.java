package ca.sheridancollege.lenguyen.consumewebservice.beans;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity(name="STUDENT")
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @NonNull
    @Column(name="NAME")
    private String name;
    @Column(name="GRADE")
    private Integer grade;
    @Column(name="LETTER_GRADE")
    private String letterGrade;
    @Column(name="ATTENDED")
    private Boolean attended;
    @Column(name="PARTICIPATED")
    private Boolean participated;

    public Student(String name, Integer grade, Boolean attended, Boolean participated) {
        this.name = name;
        this.grade = grade;
        this.letterGrade = assignLetter(grade);
        this.attended = attended;
        this.participated = participated;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
        this.letterGrade = assignLetter(grade);
    }

    private String assignLetter(Integer grade){
        if(grade >= 90)
            return "A+";
        else if(grade >= 85) return "A";
        else if(grade >= 80) return "A-";
        else if(grade >= 75) return "B+";
        else if(grade >= 70) return "B";
        else if(grade >= 65) return "C+";
        else if(grade >= 60) return "C";
        else if(grade >= 55) return "D+";
        else if(grade >= 50) return "D";
        else return "F";
    }
}
