/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappers;

import java.util.Comparator;

/**
 *
 * @author madw
 */
public class Shoki implements Comparator<Shoki>{
    
    int i;
    
    public Shoki(int i){
        this.i = i;
    }
    
    public Shoki(String i){
        this.i = Integer.parseInt(i);
    }

    @Override
    public boolean equals(Object obj) {
        
        Shoki s = (Shoki) obj;
        return (this.i == s.i);
    }

    @Override
    public int compare(Shoki o, Shoki o1) {
        
        if(o.i > o1.i)
            return 1;
        else if(o.i < o1.i)
            return -1;
        else
            return 0;
    }
    
    @Override
    public String toString(){
        return this.i+"";
    }
    
}
