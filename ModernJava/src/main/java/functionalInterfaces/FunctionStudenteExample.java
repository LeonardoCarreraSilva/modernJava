package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudenteExample {
    static Function<List<Student>, Map<String, Double>> function = (students -> {
        Map<String, Double> studentGrandmap = new HashMap<>();

        students.forEach((student -> {
            if(PredicateStudentExample.p1.test(student)){
                studentGrandmap.put(student.getName(), student.getGba());
            }
        }));
        return studentGrandmap;
    });

    public static void main(String[] args) {
        System.out.println(function.apply(StudentDataBase.getAllStudents()));
    }
}
