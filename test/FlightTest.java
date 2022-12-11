/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import flightbooking.Flight;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a2vimala
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testConstructor(){
        
        Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
        String expectedResult = "31, Home to Ryerson, 10/11/2018 9:30 p.m., 102, 5771.0";
        String actualResult = f1.getFlightNumber() + ", " + f1.getOrigin() + " to " + f1.getDestination() + ", " + f1.getDepartureTime() + ", " + f1.getNumberOfSeatsLeft() + ", " + f1.getOriginalPrice();
       assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testInvalidConstructor(){
        boolean exCaught = false;
        try{
            Flight f1 = new Flight(31, "Home", "Home", "10/11/2018 9:30 p.m.", 102, 5771);
        }
        catch(IllegalArgumentException ex){
            exCaught = true;
        }
        assertTrue(exCaught);
    }
    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       int expectedResult = 31;
       int actualResult = f1.getFlightNumber();
       assertEquals(expectedResult, actualResult);
       
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);// you can do 12 as flightNumber and it still works ---- but not 12 @ set flightNumber()
       int expectedResult = 31;
       f1.setFlightNumber(31);
       int actualResult = f1.getFlightNumber();
       assertEquals(expectedResult,actualResult);

    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       String expectedResult = "Home";
       String actualResult = f1.getOrigin();
       assertEquals(expectedResult, actualResult);   
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       String expectedResult = "Home";
       f1.setOrigin("Home");
       String actualResult = f1.getOrigin();
       assertEquals(expectedResult,actualResult);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       String expectedResult = "Ryerson";
       String actualResult = f1.getDestination();
       assertEquals(expectedResult, actualResult); 
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
       Flight f1 = new Flight(31, "Toronto", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       String expectedResult = "Toronto";
       f1.setDestination("Toronto");
       String actualResult = f1.getDestination();
       assertEquals(expectedResult, actualResult); 
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       String expectedResult = "10/11/2018 9:30 p.m.";
       String actualResult = f1.getDepartureTime();
       assertEquals(expectedResult, actualResult);        
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
       Flight f1 = new Flight(31, "Toronto", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       String expectedResult = "10/11/2018 9:30 p.m.";
       f1.setDepartureTime("10/11/2018 9:30 p.m.");
       String actualResult = f1.getDepartureTime();
       assertEquals(expectedResult, actualResult);       
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       int expectedResult = 102;
       int actualResult = f1.getCapacity();
       assertEquals(expectedResult, actualResult);        
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       int expectedResult = 102;
       f1.setCapacity(102);
       int actualResult = f1.getCapacity();
       assertEquals(expectedResult, actualResult);         
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       int expectedResult = 102;
       int actualResult = f1.getNumberOfSeatsLeft();
       assertEquals(expectedResult, actualResult);        
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       int expectedResult = 102;
       f1.setNumberOfSeatsLeft(102);
       int actualResult = f1.getNumberOfSeatsLeft();
       assertEquals(expectedResult, actualResult);        
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       double expectedResult = 5771;
       double actualResult = f1.getOriginalPrice();
       assertEquals(expectedResult, actualResult, 0);         
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 102, 5771);
       double expectedResult = 5771;
       f1.setOriginalPrice(5771);
       double actualResult = f1.getOriginalPrice();
       assertEquals(expectedResult, actualResult, 0);         
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 p.m.", 0, 5771);
       boolean expectedResult;
       if(f1.getNumberOfSeatsLeft()>0 && f1.getCapacity()>0){
       expectedResult = true;
       }else{
       expectedResult = false;    
       }
       boolean actualResult = f1.bookASeat();
       assertEquals(expectedResult, actualResult);        
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
       Flight f1 = new Flight(31, "Home", "Ryerson", "10/11/2018 9:30 ", 0, 5771);
       String expectedResult = "Flight: 31, Origin: Home to Destination: Ryerson, Departure Time: 10/11/2018 9:30 p.m., Original Price: $5771.0";
       String actualResult = f1.toString();
       assertEquals(expectedResult, actualResult);          
    }
}
