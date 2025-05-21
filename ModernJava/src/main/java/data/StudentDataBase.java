package data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
    public static List<Student> getAllStudents(){
        Student student1 = new Student("Adan", "Male", 2, 3.6, Arrays.asList("swimming", "bascketball", "volleyball"));
        Student student2 = new Student("Jenny", "Female", 2, 3.8, Arrays.asList("swimming", "gymnastics", "soccer"));
        Student student3 = new Student("Emily", "Female", 3, 3.0, Arrays.asList("swimming", "bascketball", "volleyball"));
        Student student4 = new Student("Dave", "Male", 3, 4.1, Arrays.asList("swimming", "bascketball", "volleyball"));
        Student student5 = new Student("Sophia", "Female", 4, 4.1, Arrays.asList("swimming", "bascketball", "volleyball"));
        Student student6 = new Student("James", "Male", 4, 4.5, Arrays.asList("swimming", "bascketball", "volleyball"));

        List<Student> students = Arrays.asList(student1, student2, student3, student4,student5, student6);

        return students;
    }
}
