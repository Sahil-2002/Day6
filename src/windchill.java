import java.util.Scanner;

public class windchill {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for temperature input
            System.out.print("Enter the temperature in Fahrenheit (-50 to 50): ");
            double t = scanner.nextDouble();

            // Prompt the user for wind speed input
            System.out.print("Enter the wind speed in miles per hour (3 to 120): ");
            double v = scanner.nextDouble();

            // Check if temperature and wind speed are within valid range
            if (Math.abs(t) > 50 || v > 120 || v < 3) {
                System.out.println("Invalid input: Temperature must be between -50 and 50 Fahrenheit, "
                        + "and wind speed must be between 3 and 120 miles per hour.");
                return;
            }

            // Calculate wind chill
            double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

            // Display the wind chill
            System.out.println("Wind chill: " + windChill);

            // Close the scanner
            scanner.close();
        }
    }


