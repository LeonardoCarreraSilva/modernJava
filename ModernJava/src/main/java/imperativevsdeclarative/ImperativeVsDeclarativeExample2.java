package imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,5,6,7,8,8,8,8,9,10,10);
        /**
         * Impertive
         */
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer integer : integerList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }

        System.out.println("Imperative : " + uniqueList);


        /**
         * Declarative
         */

        List<Integer> uniqueList1 = integerList.stream().distinct().toList();
        System.out.println("Declarative : " + uniqueList1   );
    }
}
