package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> student = (student) -> System.out.println(student);
    static Consumer<Student> name = (student) -> System.out.print(student.getName());
    static Consumer<Student> activities = (student) -> System.out.println(student.getActivities());

    public static void printName() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student);
    }

    public static void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(name.andThen(activities));
    }


    public static void printNameAndActivitiesUsingCondition() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3) {
                name.andThen(activities).accept(student);
            }
        }));
    }


    public static void main(String[] args) {
        Consumer<String> c1 = (s -> System.out.println(s.toUpperCase()));
        c1.accept("java8");
        System.out.println("Print all students");
        printName();
        System.out.println("-------------");
        System.out.println("Print name and activities");
        printNameAndActivities();
        System.out.println("-----------");
        System.out.println("Print students when GradeLevel > 3");
        printNameAndActivitiesUsingCondition();

    }
}
