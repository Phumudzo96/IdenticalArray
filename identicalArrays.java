import java.lang.annotation.ElementType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class identicalArrays {
    public static void main(String[] args) {
        
        int[] array1;                                         // creating the variable with a array
        array1 = new int[4];
        int[] array2;
        array2 = new int[4];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 4 interger values:");               // ask the user to enter the test scores
        System.out.println("Enter 1st interger:");
        int values1_1 = scanner.nextInt();
        array1[0] = values1_1;

        System.out.println("Enter 2nd interger:");
        int values1_2 = scanner.nextInt();
        array1[1] = values1_2;

        System.out.println("Enter 3rd interger:");
        int values1_3 = scanner.nextInt();
        array1[2] = values1_3;

        System.out.println("Enter 4th interger:");
        int values1_4 = scanner.nextInt();
        array1[3] = values1_4;
        

        System.out.println("Please enter 4 interger values again:");               // ask the user to enter the test scores
        System.out.println("Enter 1st interger:");
        int values2_1 = scanner.nextInt();
        array2[0] = values2_1;

        System.out.println("Enter 2nd interger:");
        int values2_2 = scanner.nextInt();
        array2[1] = values2_2;

        System.out.println("Enter 3rd interger:");
        int values2_3 = scanner.nextInt();
        array2[2] = values2_3;

        System.out.println("Enter 4th interger:");
        int values2_4 = scanner.nextInt();
        array2[3] = values2_4;

        String firstInput = (Arrays.toString(array1));                 
        String secondInput = (Arrays.toString(array2));                
        
        System.out.println(firstInput);                                // print out the first array
        System.out.println(secondInput);                               // print out the second array


        if(firstInput == secondInput)                                  // finding out if the arrays are identical
            System.out.println("The two arrays are identical");
        else
            System.out.println("The two arrays are not identical");
    }

}
