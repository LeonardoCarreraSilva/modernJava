package lambda;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        /*
         * prior java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of the comparator is : " + comparator.compare(3,2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b); //or Iteger::compareto

        System.out.println("Comparator using lambda : " + comparatorLambda.compare(3,2));

    }
}

