/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constructors;


/**
 * @author madw
*/

public class Person {
    
    String name;

    public Person() {
        
    }
    
    public Person(String name){
        this.name = name;
    }
    
    public static void main(String[] args) {
        Person l = new Person();
        Person lb = new Person("Libuseng");
        System.out.println("Wow!!");
    }
}
