/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session1string;

/**
 *
 * @author madw
 */
public class Person{
    
    private String name;
    private String dob;
    
    public Person(String name,String dob){
        this.name = name;
        this.dob = dob;
    }
    
    public static void main(String[] args) {
        
        //Object obj;
        
        Object sts = new Person("Shoki","2000-13-34");
        System.out.println(sts.toString());
    }

    @Override
    public String toString() {
        return "["+this.name+","+this.dob+"]";
    }
   
}
