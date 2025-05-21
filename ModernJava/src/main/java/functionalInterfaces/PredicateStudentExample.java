package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGba() > 3.9;

    public static void filterStudentByGradeLavel(){
        System.out.println("filterStudentByGradeLavel");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGBA(){
        System.out.println("filterStudentByGBA");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGradeLevelAndGba(){
        System.out.println("filterStudentByGradeLevelAndGba");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) ->{
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLavel();
        filterStudentByGBA();
        filterStudentByGradeLevelAndGba();

    }

}
