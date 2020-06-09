/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author madw
 */
public class ShokiArray {

    public static void main(String[] args) {

        int[] in2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;

        System.out.println("All numbers");
        while (i < in2.length) {
            System.out.print(in2[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("All odd numbers");
        i = 0;
        while (i < in2.length) {
            if (in2[i] % 2 == 1) {
                System.out.print(in2[i] + " ");
            }
            i++;
        }
        System.out.println();
        
        System.out.println("All even numbers");
        i = 0;
        while (i < in2.length) {
            if (in2[i] % 2 == 0) {
                System.out.print(in2[i] + " ");
            }
            i++;
        }
        System.out.println();
        
        
         System.out.println("All square numbers");
        i = 0;
        while (i < in2.length) {
            if (in2[i] % 2 == 0) {
                System.out.print(in2[i] + " ");
            }
            i++;
        }
        System.out.println();
    }
}
