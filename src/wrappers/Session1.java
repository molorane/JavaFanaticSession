/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author madw
 */

public class Session1 {
    
    public static void main(String[] args) {
        
        List<Shoki> list = new ArrayList<>();
        list.add(new Shoki("10"));
        list.add(new Shoki("23"));
        list.add(new Shoki("5"));
        list.add(new Shoki("8"));

        //Collections.sort(list);
        
        System.out.println(list);
        
    }
}
