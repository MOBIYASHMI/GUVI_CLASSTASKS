package GUVI_CLASSTASKS.Task5;

import java.util.stream.Stream;

// convert list of Strings to uppercase
public class Question1 {
    public static void main(String[] args) {
        Stream<String> names=Stream.of("aBc","d","ef");

        System.out.println("String names changed to upper case :");
        names.map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

    }
}
