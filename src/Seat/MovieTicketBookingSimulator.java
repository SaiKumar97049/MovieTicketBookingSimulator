package Seat;

public class MovieTicketBookingSimulator {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("2023-09-10", "15:00", 10);

        FrontDesk frontDesk = new FrontDesk("admin", "password123");

        // Login to front desk

        boolean loggedIn = frontDesk.login("admin", "password123");

        if (loggedIn) {

            System.out.println("Logged in successfully!");

        } else {

            System.out.println("Invalid username or password.");

            return;

        }

        // Update password

        frontDesk.updatePassword("newPassword123");
        // View seating arrangement

        frontDesk.viewSeatingArrangement(theatre);

        // Book ticket

        frontDesk.bookTicket(theatre, 5);

        // View seating arrangement after booking

        frontDesk.viewSeatingArrangement(theatre);

    }

}
