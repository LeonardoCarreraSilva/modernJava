package data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name, gender;
    private int gradeLevel;
    private double gba;

    public Student(String name, String gender, int gradeLevel, double gba, List<String> activities) {
        this.name = name;
        this.gender = gender;
        this.gradeLevel = gradeLevel;
        this.gba = gba;
        this.activities = activities;
    }

    List<String> activities = new ArrayList<>();

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGba() {
        return gba;
    }

    public void setGba(double gba) {
        this.gba = gba;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nome='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gba=" + gba +
                ", activities=" + activities +
                '}';
    }
}
