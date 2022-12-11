/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flightbooking;

/**
 *
 * @author a2vimala
 */
public abstract class Passenger {// abstract means you cant create objects from this class
     
     private String name;
     private int age;
     
public Passenger(String name, int age){
    
    this.name = name;
    this.age = age;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

public abstract double applyDiscount(double p);
}
