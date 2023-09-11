package Seat;

import java.util.ArrayList;

import java.util.List;

public class Seat {

		    private int seatNumber;

		    private boolean isAvailable;



		    public Seat(int seatNumber) {

		        this.seatNumber = seatNumber;

		        this.isAvailable = true;

		    }



		    public int getSeatNumber() {

		        return seatNumber;

		    }



		    public boolean isAvailable() {

		        return isAvailable;

		    }



		    public void bookSeat() {

		        this.isAvailable = false;

		    }

		}



		class Theatre {

		    public String showDate;

		    public String showTime;

		    private List<Seat> seats;



		    public Theatre(String showDate, String showTime, int numberOfSeats) {

		        this.showDate = showDate;

		        this.showTime = showTime;

		        this.seats = new ArrayList<>();



		        for (int i = 1; i <= numberOfSeats; i++) {

		            seats.add(new Seat(i));

		        }

		    }



		    public List<Seat> getAvailableSeats() {

		        List<Seat> availableSeats = new ArrayList<>();



		        for (Seat seat : seats) {

		            if (seat.isAvailable()) {

		                availableSeats.add(seat);

		            }

		        }



		        return availableSeats;

		    }



		    public boolean bookTicket(int seatNumber) {

		        for (Seat seat : seats) {

		            if (seat.getSeatNumber() == seatNumber && seat.isAvailable()) {

		                seat.bookSeat();

		                return true;

		            }

		        }



		        return false;

		    }

		}



		class FrontDesk {

		    private String username;

		    private String password;



		    public FrontDesk(String username, String password) {

		        this.username = username;

		        this.password = password;

		    }



		    public boolean login(String enteredUsername, String enteredPassword) {

		        return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);

		    }



		    public void updatePassword(String newPassword) {

		        this.password = newPassword;

		        System.out.println("Password updated successfully.");

		    }



		    public void viewSeatingArrangement(Theatre theatre) {

		        List<Seat> availableSeats = theatre.getAvailableSeats();

		        System.out.println("Available Seats:");

		        for (Seat seat : availableSeats) {

		            System.out.print(seat.getSeatNumber() + " ");

		        }

		        System.out.println();

		    }



		    public void bookTicket(Theatre theatre, int seatNumber) {

		        boolean success = theatre.bookTicket(seatNumber);

		        if (success) {

		            System.out.println("Ticket booked successfully!");

		        } else {

		            System.out.println("Invalid seat number or seat already booked.");

		        }

		    }
		}