package Programming;

import java.util.List;

public class FunctionalProgrammingStructured01 {

    public static void main (String [] args){
        // Sturctured Approach
        List<Integer> numbers = List.of(10,12,13,15,18,19,20,21,22,25);
        printAllNumbersInListStructured(numbers);
        System.out.println("-----------------------------------------------------------");
        printEvenNumbersFromList(numbers);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {

        // How to loop the numbers

        for (int number: numbers){
            System.out.println(number);
        }
    }

    private static void printEvenNumbersFromList(List<Integer> numbers){
        for (int number : numbers){
            if (number %2 == 0){
                System.out.println(number);
            }
        }
    }


}
