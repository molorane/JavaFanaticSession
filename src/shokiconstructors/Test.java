/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shokiconstructors;

/**
 *
 * @author madw
 */
public class Test {
    
    private final String subject;
    
    {
        subject = "FINAL";
    }

    public Test(String subject) {
        //this.subject = subject;
    }
    
    public static void main(String[] args) {
        
        Test test = new Test("JAVA OCA");
        System.out.println(test.subject);
    }
    
    public static void test(String name){
        
    }
    
}
