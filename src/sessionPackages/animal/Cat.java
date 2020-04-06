/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionPackages.animal;


/**
 * @author madw
 */

public class Cat extends Animal{
    
    public static void main(String[] args) {
        new Cat().print();
    }
    
    public void print(){
       System.out.println(name); 
    }
}
