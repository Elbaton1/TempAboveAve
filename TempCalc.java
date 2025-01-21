import java.util.Scanner;

public class TempCalc {
    public static void main(String[] args) {
        // Scanner to read input
        Scanner inputScanner = new Scanner(System.in);

        // num of days/temps to input
        int totalDays = 5;

        // array to store 5 temps
        double[] dailyTemps = new double[totalDays];

        // Var for sum of all temps
        double totalTemperature = 0;

        
        System.out.println("Please enter " + totalDays + " temperatures:");

        // Loop to get each day's temp and update total temp
        for (int i = 0; i < totalDays; i++) {
            System.out.print("Temperature for day " + (i + 1) + ": ");
            dailyTemps[i] = inputScanner.nextDouble();  // Store temp in array
            totalTemperature += dailyTemps[i];          // Add temp to the total
        }

        // Calculate ave temp
        double averageTemp = totalTemperature / totalDays;
        System.out.println("Average temperature: " + averageTemp);

        // num of days with temps above the ave
        int aboveAvgDays = 0;
        for (int i = 0; i < totalDays; i++) {
            if (dailyTemps[i] > averageTemp) {
                aboveAvgDays++;
            }
        }

        // Output 
        System.out.println("Number of days above average temperature: " + aboveAvgDays);

        // Close scanner 
        inputScanner.close();
    }
}
