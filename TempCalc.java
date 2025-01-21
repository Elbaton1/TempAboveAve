import java.util.Scanner;

public class TempCalc {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner inputScanner = new Scanner(System.in);

        // Define the number of days (temperatures) to input as 5
        int totalDays = 5;

        // Create an array to store 5 temperatures
        double[] dailyTemps = new double[totalDays];

        // Variable to keep the sum of all temperatures
        double totalTemperature = 0;

        // Prompt the user to enter 5 temperature values
        System.out.println("Please enter " + totalDays + " temperatures:");

        // Loop to get each day's temperature and update the total temperature
        for (int i = 0; i < totalDays; i++) {
            System.out.print("Temperature for day " + (i + 1) + ": ");
            dailyTemps[i] = inputScanner.nextDouble();  // Store the temperature in the array
            totalTemperature += dailyTemps[i];          // Add the temperature to the total
        }

        // Calculate the average temperature
        double averageTemp = totalTemperature / totalDays;
        System.out.println("Average temperature: " + averageTemp);

        // Count the number of days with temperatures above the average
        int aboveAvgDays = 0;
        for (int i = 0; i < totalDays; i++) {
            if (dailyTemps[i] > averageTemp) {
                aboveAvgDays++;
            }
        }

        // Output how many days were above average
        System.out.println("Number of days above average temperature: " + aboveAvgDays);

        // Close the scanner to free resources
        inputScanner.close();
    }
}
