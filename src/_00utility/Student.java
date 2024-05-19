package _00utility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@ToString
public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private List<String> activities;
    private int notebooks;
    private Optional<Bike> bike = Optional.empty();
    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int notebooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.notebooks = notebooks;
    }

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public void printListOfActivities(){
        System.out.println(activities);
    }
}
