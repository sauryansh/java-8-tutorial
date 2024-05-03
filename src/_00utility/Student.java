package _00utility;

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

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public void printListOfActivities(){
        System.out.println(activities);
    }
}