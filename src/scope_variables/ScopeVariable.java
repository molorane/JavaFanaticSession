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
public class ScopeVariable {
    
    private Integer name;

    public ScopeVariable(Integer variable) {
        this.name = variable;
    }
    
    public static void main(String[] args) {
        ScopeVariable sv = new ScopeVariable(9000);
        System.out.println(sv.name);
        
        Car c = new Car("CHEVROLET", "AMG");
        System.out.println(c.toString());
    }
}
