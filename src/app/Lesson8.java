package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        Random rand = new Random();
        Scanner type = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(myArray));

        for (int i = 1; i < myArray.length; i++) {
            int currentValue = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] > currentValue) {
                myArray[j + 1] = myArray[j];
                j--;
            }
            myArray[j + 1] = currentValue;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Please enter the number in range from 1 to 100: ");
        int num = type.nextInt();

        int position = Arrays.binarySearch(myArray, num);
        if (position > 0){
            System.out.println("Position of your number is " + position);
        } else {
            System.out.println("Number isn't in array");
        }
    }
}