import java.util.Scanner;

public class SammysSeashoreSupplies {

    public static void main(String[] args) {
        final int HOURLY_RATE = 40;
        final int ADDITIONAL_MINUTE_RATE = 1;
        final int MINUTES_IN_HOUR = 60;

        
        displayMotto();

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of minutes you rented the equipment: ");
        int totalMinutes = scanner.nextInt();

        
        int hours = totalMinutes / MINUTES_IN_HOUR;
        int additionalMinutes = totalMinutes % MINUTES_IN_HOUR;

        
        int totalPrice = (hours * HOURLY_RATE) + (additionalMinutes * ADDITIONAL_MINUTE_RATE);

        
        System.out.println("Hours: " + hours);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.println("Total price: $" + totalPrice);
    }

    
    public static void displayMotto() {
        System.out.println("**************************************************");
        System.out.println("* Sammy's makes it fun in the sun! *");
        System.out.println("**************************************************");
    }
}
