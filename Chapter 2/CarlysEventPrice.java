import java.util.Scanner;

public class CarlysCatering {
    public static void main(String[] args) {
        final int PRICE_PER_PERSON = 35;
        final int LARGE_EVENT_THRESHOLD = 50;

        
        displayMotto();

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = scanner.nextInt();

        
        int totalPrice = numberOfGuests * PRICE_PER_PERSON;

        
        boolean isLargeEvent = numberOfGuests >= LARGE_EVENT_THRESHOLD;

        
        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + isLargeEvent);
    }

    
    public static void displayMotto() {
        System.out.println("**************************************************");
        System.out.println("* Carly's makes the food that makes it a party! *");
        System.out.println("**************************************************");
    }
}
