package Programming;

import java.util.List;

public class FunctionalProgrammingFunction01 {

    public static void main (String [] args){
        // Sturctured Approach

        List<Integer> numbers = List.of(10, 21, 12, 31, 40, 51, 60, 71);
        printAllNumbersInListStructured(numbers);
        System.out.println("--------------------------------------------");
        printEvenNumberFromist(numbers);

    }

    private static boolean isEven(int number){
        return number%2 == 0;
    }


    // Method for Printing Any Number
   /* private static void print(int number){
        System.out.println(number);
    }*/

    private static void printAllNumbersInListStructured(List<Integer> numbers) {

        // we will require a stream and then method Reference
/*
        // How to loop the numbers

        for (int number: numbers){
            System.out.println(number);
        }*/

        numbers.stream()
                .forEach(System.out::println);
    }

    private static void printEvenNumberFromist(List<Integer> numbers){
        numbers.stream()
                .filter(FunctionalProgrammingFunction01::isEven) // Filtering the number only even
                .forEach(System.out::println);  // Method Reference
    }


}
