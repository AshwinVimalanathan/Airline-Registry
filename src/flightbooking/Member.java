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
public class Member extends Passenger {
    
    private String name;
    private int age;
    private int yearsOfMembership;
    
public Member(String name, int age, int yearsOfMembership){
    super(name,age);
    this.name = name;
    this.age = age;
    this. yearsOfMembership = yearsOfMembership;
}

@Override
public double applyDiscount(double p){
    if(yearsOfMembership > 5){
        return(p - (p*0.5));
    }
    if(yearsOfMembership> 1){
       return(p - (p*0.1));
}
    else{
        return p;
    }
}
}
