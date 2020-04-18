/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 * @author madw
 */

public class DataType {
    
    Integer abc;
    
    public static void main(String[] args) {
        DataType dt = new DataType();
        dt.abc = 1000;
        
        DataType obj = dt;
        obj.abc = 8000;
        
        print(dt);
        System.out.println("In main: "+dt.abc);
    }
    
    public static void print(DataType dt){
        System.out.println("In print :"+dt.abc);
        dt.abc = 9000;
    }
    
}
