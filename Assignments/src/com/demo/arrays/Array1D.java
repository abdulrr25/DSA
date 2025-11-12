package com.demo.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class Array1D {
    private int[] arr;
    private String[] arr1;
    private int count;

    // Default constructor
    public Array1D() {
        arr = new int[10];
        count = 0;
        arr1 = new String[20];
    }

    // Constructor with existing array
    public Array1D(int[] arr) {
        this.arr = arr;
        count = 0;
        arr1 = new String[20];
    }

    // Constructor with size
    public Array1D(int size) {
        arr = new int[size];
        count = 0;
        arr1 = new String[20];
    }

    // Accept integer array input
    public void acceptArray() {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element at index " + i + ": ");
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid input. Enter an integer: ");
                    sc.next();
                }
                arr[i] = sc.nextInt();
            }
        }
    }

    // Sum of digits for each element
    public int[] sumOfDigits() {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i], sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            result[i] = sum;
        }
        return result;
    }

    // Prime check
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Factorials of prime numbers
    public int[] factorialOfPrimes() {
        int[] factorials = new int[arr.length];
        Arrays.fill(factorials, -1);

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                factorials[i] = factorial(arr[i]);
            }
        }
        return factorials;
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Maximum prime number in array
    public int maxPrime() {
        int max = -1; 
        for (int num : arr) {
            if (isPrime(num) && num > max) {
                max = num;
            }
        }
        return max;
    }

    // Reverse a number
    public int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    // Copy array with condition
    public int[] copyArrayWithCondition() {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) && arr[i] < 5) {
                newArr[i] = reverseNumber(arr[i]);
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    // Insert string based on second character
    public void insertString(String str) {
        if (count >= arr1.length) {
            System.out.println("Array is full, cannot insert more strings.");
            return;
        }

        if (str.length() < 2) {
            arr1[count++] = str;
            return;
        }

        char secondChar = str.charAt(1);
        int insertPos = count;

        for (int i = 0; i < count; i++) {
            if (arr1[i].length() >= 2 && arr1[i].charAt(1) == secondChar) {
                insertPos = i + 1;
            }
        }

        for (int i = count; i > insertPos; i--) {
            arr1[i] = arr1[i - 1];
        }

        arr1[insertPos] = str;
        count++;
    }

    // Display integer array
    public void displayArray() {
        System.out.println(Arrays.toString(arr));
    }

    // Display string array
    public void displayStrings() {
        System.out.println(Arrays.toString(Arrays.copyOf(arr1, count)));
    }

    // Override toString for better debugging
    @Override
    public String toString() {
        return "Array1D{" +
               "arr=" + Arrays.toString(arr) +
               ", arr1=" + Arrays.toString(Arrays.copyOf(arr1, count)) +
               '}';
    }
}
