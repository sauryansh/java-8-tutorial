package functioninterface.consumerexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private List<String> activities;
}
