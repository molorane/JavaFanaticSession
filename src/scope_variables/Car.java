/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope_variables;

/**
 *
 * @author madw
 */
public class Car {
    
    private String model;
    private String name;
    
    static int yearOfRelease;
    
    public Car(String model, String name){
        this.model = model;
        this.name = name;
    }
    
    
}
