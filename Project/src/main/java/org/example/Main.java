package org.example;

public class Main {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.add(""));        // Output: 0
        System.out.println(calculator.add("1"));       // Output: 1
        System.out.println(calculator.add("1,2"));     // Output: 3
        System.out.println(calculator.add("1,2,3"));   // Output: 6
        System.out.println(calculator.add("1\n2,3"));  // Output: 6
        System.out.println(calculator.add("1,\n"));    // Output: 1 (ignores the invalid entry)
        }
    }
