import java.util.Scanner;

public class CodingChallenges_01 {
    public static void main(String[] args) {
       
        // 🌱 1. Coding Challenge: Print numbers from 1 to 10.

        System.out.println("Counting from 1 to 10: ");

        for (int index = 1; index <= 10; index += 1) {
            System.out.println(index);
        }

        // ==================================================================

        // 🌱 2. Coding Challenge: Print the odd numbers less than 100.

        System.out.println("Showing odd numbers less than 100: ");

        for (int index = 1; index < 100; index += 2) {
            System.out.println(index);
        }

        // ==================================================================

        // 🌱 3. Coding Challenge: Print the multiplication table with 7.

        System.out.println("Numbers multiplied by 7: ");

        for (int index = 0; index <= 70; index += 7) {
            System.out.println(index);
        }

        // ==================================================================

        // 🌱 4. Coding Challenge: Print a dynamic multiplication table with numbers from 1 to 10.

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please, enter a number from 1 to 10: ");
        int num = userInput.nextInt();

        for (int index = 1; index <= 10; index += 1) {
            System.out.println(num + "x" + index + " = " + (num * index));
        }

        userInput.close();

        // ==================================================================

        // 🌱 5. Coding Challenge: Calculate the sum of numbers from 1 to 10.

        int sum = 0;

        for (int index = 1; index <= 10; index += 1) {
            sum += index;
        }
        System.out.println("The sum of numbers from 1 to 10 is: " + sum + ".");

        // ==================================================================

        // 🌱 6. Coding Challenge: Calculate 10!

        int factor = 1;

        for (int index = 1; index <= 10; index += 1) {
            factor *= index;
        }
        System.out.println("The result of 10! is: " + factor + ".");

        // ==================================================================

        // 🌱 7. Calculate the sum of even numbers greater than 10 and less than 30.

        int bigSum = 0;

        for (int index = 12; index < 30; index += 2) {
            bigSum += index;
        }
        System.out.println("the sum of even numbers greater than 10 and less than 30 is: " + bigSum);

        // ==================================================================
     }
}

