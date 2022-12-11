/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightbooking;

/**
 *
 * @author ashwi
 */
public class Manager {
    Flight [] flightArr = new Flight [100];
    Ticket [] ticketArr = new Ticket [100];

public void createFlights(){

int count = 1;

flightArr[0]= new Flight(1036, "Toronto", "Halifax", "10/11/2018 1:10 ", 190, 1000.00);
flightArr[1]= new Flight(927, "Toronto", "Vancouver", "09/27/2018 3:30 ", 190, 3000.00);
flightArr[2]= new Flight(1029, "Toronto", "Whitehorse", "09/01/2018 7:40 ", 190, 5000.00);
flightArr[3]= new Flight(791, "Halifax", "Toronto", "09/18/2018 9:30 ", 190, 1000.00);
flightArr[4]= new Flight(612, "Halifax", "Vancouver", "09/31/2018 1:05 ", 190, 1500.00);
flightArr[5]= new Flight(946, "Halifax", "Whitehorse", "09/06/2018 6:00 ", 190, 3000.00);
flightArr[6]= new Flight(749, "Vancouver", "Toronto", "10/05/2018 6:25 ", 190, 3000.00);
flightArr[7]= new Flight(1011, "Vancouver", "Halifax", "10/13/2018 6:50 ", 0, 1000.00);
flightArr[8]= new Flight(956, "Vancouver", "Whitehorse", "10/30/2018 7:15 ", 190, 2000.00);
flightArr[9]= new Flight(932, "Whitehorse", "Toronto", "10/23/2018 4:45 ", 190, 5000.00);
flightArr[10]= new Flight(723, "Whitehorse", "Halifax", "10/16/2018 5:55 ", 190, 3000.00);
flightArr[11]= new Flight(828, "Whitehorse", "Vancouver", "10/28/2018 5:35 ", 190, 1500.00);

for(int i=0; i<100; i++){
    if (flightArr[i] != null){
            System.out. println(count + ". " + flightArr[i]);
            count++;
    }
}

} 
public void  displayAvailableFlights(String origin, String destination){
    for(int i=0; i<100; i++){
        if (flightArr[i] != null){
             if(flightArr[i].getOrigin().equals(origin) && flightArr[i].getDestination().equals(destination) && flightArr[i].getNumberOfSeatsLeft() > 0){
            System.out.println(flightArr[i]);
             }
        }
    }

}


public Flight getFlight(int flightNumber){
   //int k=0; 
    for(int i=0; i<12; i++){
        if (flightArr[i] != null){
            if(flightArr[i].getFlightNumber() == (flightNumber)){
                return flightArr[i];
                //k = i;
            }
        }
    }
    return null;
    //return flightArr[k]; 
}

public void bookSeat(int flightNumber, Passenger p){   
    boolean pass;
    int k=0;
    for(int i=0; i<100; i++){
         if (flightArr[i] != null){

             if(flightArr[i].getFlightNumber() == flightNumber){
                 k = i;      
                 pass = getFlight(flightNumber).bookASeat();
                if(pass == true){
                    ticketArr[k] = new Ticket(p, flightArr[k], p.applyDiscount(flightArr[k].getOriginalPrice()));
                    System.out.println("          Ticket ------ " + ticketArr[k]);
                }else{
                    System.out.println("          ERROR. We are unable to book requested flight.");
                }
                
             }
         }
    }
}


public static void main(String[] args) {
    
        System.out.println("Hello! Welcome to the Airport.");
        System.out.println("Salut! Bienvenue à l'aéroport.");
        System.out.println("");
        Manager a = new Manager();
        System.out.println("*****   The available flights are listed below: ( Testing CreateFlights()method )   *****");
        System.out.println("");
        a.createFlights();
         System.out.println("");
         System.out.println("*****   Displaying flight given origin to destination: ( Testing DisplayAvailableFlights()method )   *****");
         System.out.println("");
        a.displayAvailableFlights("Toronto", "Vancouver");
        System.out.println("");
        System.out.println("*****   Displaying flight given flight number: ( Testing GetFlight()method )   *****");
        System.out.println("");
        System.out.println(a.getFlight(791));
        System.out.println("");
        Passenger AshwinVimalanathan = new Member("Ashwin Vimalanathan", 20, 3);
        Passenger KavindaKarunaratne= new Member("Kavinda Karunaratne", 25, 7);
        Passenger BobbyTarantino = new NonMember("Bobby Tarantino", 15);
        Passenger JimmyIovine = new NonMember("Jimmy Iovine", 98);
        Passenger OliviaDas = new NonMember("Olivia Das", 19);
        System.out.println("*****   Booking tickets for the following passengers: (Testing five cases)   *****");
        System.out.println("");
        System.out.println("1st case: A member who has less than five years of membership");
        System.out.println("Ashwin Vimalanathan's Ticket information: ");
        a.bookSeat(1029, AshwinVimalanathan);
        System.out.println("");
        System.out.println("2nd case: A non-member who is above the age of 65");
        System.out.println("Jimmy Iovine's Ticket Information: ");
        a.bookSeat(828, JimmyIovine);
        System.out.println("");
        System.out.println("3rd case: A non-member who is unable to book flight ticket due to full capacity");
        System.out.println("Bobby Tarantino's Ticket Information: ");
        a.bookSeat(1011, BobbyTarantino);
        System.out.println("");
        System.out.println("4th case: A member who has more than five years of membership");
        System.out.println("Kavinda Karunaratne's Ticket Information: ");
        a.bookSeat(791, KavindaKarunaratne);
        System.out.println("");
        System.out.println("5th case: A non-member who is under the age of 65");
         System.out.println("Olivia Das' Ticket Information: ");
        a.bookSeat(612, OliviaDas);

       
}

}