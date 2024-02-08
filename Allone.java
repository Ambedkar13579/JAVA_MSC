import java.util.Scanner;
public class Allone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. If construct - Print season
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month <= 5)
                System.out.println("Spring");
            else if (month >= 6 && month <= 8)
                System.out.println("Summer");
            else if (month >= 9 && month <= 11)
                System.out.println("Autumn");
            else
                System.out.println("Winter");
        } else {
            System.out.println("Invalid month number!");
        }

        // 2. Conditional operator - Check if number is even or odd
        System.out.print("Enter a number to check if it's even or odd : ");
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result);

        // 3. While loop - Print Fibonacci series
        System.out.print("Enter the number of terms for Fibonacci series : ");
        int n = scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci series:");
        int i = 1;
        while (i <= n) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
        System.out.println();

        // 4. For loop - Print odd numbers
        System.out.print("Enter the range to print odd numbers (start end) : ");
        int start = scanner.nextInt();
        System.out.print("Enter the range to print odd numbers (End end) : ");
        int end = scanner.nextInt();
        System.out.println("Odd numbers in the range " + start + " to " + end + ":");
        for (int j = start; j <= end; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}

