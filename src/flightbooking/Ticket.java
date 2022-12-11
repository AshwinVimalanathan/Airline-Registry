/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flightbooking;

/**
 *
 * @author a2vimala
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int Num = 1;
    
public Ticket(Passenger passenger, Flight flight, double price){
    this.passenger = passenger;
    this.flight = flight;
    this.price = price;
}

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNum() {
        return Num;
    }

    public static void setNum(int Num) {
        Ticket.Num = Num;
    }



@Override
public String toString(){
    return(/*getPassenger() +*/ "Passenger: " + passenger.getName() + ", Flight: " + flight.getFlightNumber() + ", Origin: " + flight.getOrigin() + " to Destination: " + flight.getDestination() + ", Departure Time: " + flight.getDepartureTime() + "p.m., Original Price: $" + flight.getOriginalPrice() + ", Ticket Price: $" + getPrice());
}
}
