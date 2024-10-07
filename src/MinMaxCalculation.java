//Written fo
public class MinMaxCalculation {

    // Method to find both the minimum and maximum values in a single pass
    public static int[] findMinAndMax(int[] numbers) {
        // If the array is empty, return null or throw an exception
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        // Initialize min and max to the first element
        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array once, updating min and max as necessary
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if the current number is smaller
            }
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if the current number is larger
            }
        }

        // Return an array containing both min and max
        return new int[]{min, max};
    }

    // Main method to test the min and max calculations
    public static void main(String[] args) {
        // Define an array of integers to test the method
        int[] numbers = {2, 4, 1, 9, 6};

        // Call the method and get the min and max values
        int[] result = findMinAndMax(numbers);

        // Print the minimum and maximum values
        System.out.println("Minimum Number in Set: " + result[0]);
        System.out.println("Maximum Number in Set: " + result[1]);
    }
}