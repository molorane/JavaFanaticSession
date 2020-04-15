/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 *
 * @author madw
 */
public class Data {
    
    public static void main(String[] args) {
        int a = 10;
        
        System.out.println("a before:"+a);
        changeA(a);
        System.out.println("a after:"+a);
    }
    
    public static void changeA(int a){
        a = 200;
    }
    
    public void print(String str){
        System.out.println("STR: "+str);
    }
}
