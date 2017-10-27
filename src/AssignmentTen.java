/*
 * @author Ahmad Wahedi
 * CSC 201-004N
 * Assignment 10
 * Problem 10.6
 * (Displaying the prime numbers) Write a program that displays all the prime
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class
 * to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them
 * in reverse order.
 */
public class AssignmentTen {

    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();      // Creates StackOfIntegers

        for (int i = 2; i < 120; i++) {         // Find and push prime numbers less than 120 to stack
            if (isPrime(i))
                stack.push(i);
        }
        // Displays prime numbers less than 120 in decreasing order
        System.out.println("All the prime numbers less than 120 in decreasing order:");

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    // Returns "true" if n is a prime number
    public static boolean isPrime(int n) {
        for (int d = 2; d <= n / 2; d++) {
            if (n % d == 0)
                return false;
        }
        return true;
    }
}
