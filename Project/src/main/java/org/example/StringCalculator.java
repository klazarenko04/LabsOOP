package org.example;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String[] nums = numbers.split(",");
        int sum = 0;

        for (int i = 0; i < Math.min(nums.length, 2); i++) {
            sum += parseNumber(nums[i]);
        }

        return sum;
    }

    private int parseNumber(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            // If the number is not a valid integer, just ignore it
            return 0;
        }
    }
}
