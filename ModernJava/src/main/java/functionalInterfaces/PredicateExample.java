package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = (i) -> i%2==0;
    static Predicate<Integer> p1 = (i) -> i%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate and result is " + p.and(p1).test(10));
        System.out.println("Predicate and result is " + p.and(p1).test(9));
    }
    public static void predicateOr(){
        System.out.println("Predicate or result is " + p.or(p1).test(10));
        System.out.println("Predicate or result is " + p.or(p1).test(8));
    }
    public static void predicateNegative(){
        System.out.println("Predicate negative result is " + p.or(p1).negate().test(8));
    }


    public static void main(String[] args) {

        System.out.println(p.test(3));
        predicateAnd();
        predicateOr();
        predicateNegative();
    }
}
