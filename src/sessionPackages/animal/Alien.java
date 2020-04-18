/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionPackages.animal;

/**
 *
 * @author madw
 */
public interface Alien {
    
    int years = 100;
    
    default void love(){
        System.out.println("Default implementation Love");
    }
}
