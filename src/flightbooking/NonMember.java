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
public class NonMember extends Passenger{
    
    private String name;
    private int age;
    
public NonMember(String name, int age){
    super(name,age);
    this.name = name;
    this.age = age;
}

@Override
public double applyDiscount(double p){
    if(age > 65){
        return(p - (p*0.1));
    }
    else{
        return p;
    }
}
}
