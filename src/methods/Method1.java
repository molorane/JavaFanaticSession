/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import static java.lang.System.out;

/**
 *
 * @author madw
 */

public class Method1 {
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        changeName(nums);
        
        for(int n:nums)
            out.print(n+" ");
        out.println();
    }
    
    public static void changeName(int nums[]){
        nums[0] = 100;
    }
}
