/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 * @author madw
 */

public class CreatingObject implements Cloneable{
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public void print(String str){
        System.out.println("STR: "+str);
    }
    
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        CreatingObject d = new CreatingObject();
        d.print("Create using new");
        
        CreatingObject co = (CreatingObject) d.clone();
        co.print("Create using clone");
        
        Class ref = Class.forName("datatypes.CreatingObject");
        CreatingObject cb = (CreatingObject) ref.newInstance();
        cb.print("Create using reflection.");
    }
}
