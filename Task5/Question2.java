package GUVI_CLASSTASKS.Task5;

import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("abc","","bc","efg","abcd","","jkl");

        // to check whether the strings in list is empty or not and print list having nonempty strings
        List<String> newList=stringList.stream().filter(string -> !string.isEmpty()).toList();

        System.out.println("List having non-empty strings: "+newList);

    }
}
