package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" Default");


    public static void main(String[] args) {

        System.out.println("Result is : " + function.apply("java8"));
        System.out.println("Result is : " + addSomeString.apply("java8"));

    }
}
