import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int availableSeats = 5;

        while (true) {
            System.out.println("\nAvailable seats: " + availableSeats);
            System.out.print("Enter number of tickets to book (0 to exit): ");
            int tickets = sc.nextInt();

            if (tickets == 0) {
                System.out.println("Booking exited.");
                break;
            } else if (tickets <= availableSeats) {
                availableSeats -= tickets;
                System.out.println("Successfully booked " + tickets + " ticket(s).");
            } else {
                System.out.println("Not enough seats.");
            }

            if (availableSeats == 0) {
                System.out.println("Housefull!");
                break;
            }
        }

        sc.close();
    }
}
