package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
	int[] array = readIntegers(3);
        System.out.println("The minimum element of the array is: " + findMin(array));

    }

    public static int[] readIntegers(int count){
        int[] arrayOfNumbers = new int[count];
        System.out.println("Enter " + count + " numbers: \r");
        for (int i = 0; i < arrayOfNumbers.length; i++){
            arrayOfNumbers[i] = scanner.nextInt();
        }
        return arrayOfNumbers;
    }

    public static int findMin(int[] array){
        int minValue = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
