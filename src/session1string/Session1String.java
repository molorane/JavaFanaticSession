/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session1string;

import java.util.StringTokenizer;

/**
 * @author madw
 */

public class Session1String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        solution6();
    }

    public static void solution1() {

        // String is a group of characters 
        // String is an array of characters
        String url1 = "moc.koobecaf";
        String url2 = "az.oc.ikosh";

        for (int i = url1.length() - 1; i >= 0; i--) {
            System.out.print(url1.charAt(i));
        }

        System.out.println("");
    }

    public static void solution2() {

        // String is a group of characters 
        // String is an array of characters
        String url1 = "moc.koobecaf";
        String url2 = "az.oc.ikosh";

        int i = url1.length() - 1;

        while (i >= 0) {
            System.out.print(url1.charAt(i));
            i--;
        }

        System.out.println("");
    }

    public static void solution3() {

        // String is a group of characters 
        // String is an array of characters
        String url1 = "moc.koobecaf";
        String url2 = "az.oc.ikosh";

        StringBuffer sb = new StringBuffer(url1);
        System.out.println(sb.reverse());

    }

    public static void solution4() {

        // String is a group of characters 
        // String is an array of characters
        String url1 = "moc.koobecaf";
        String url2 = "az.oc.ikosh";

        StringBuffer sb = new StringBuffer(url1);
        String replaced = sb.reverse()
                .toString()
                .replace('o', 'a');

        System.out.println(replaced);

    }

    public static void solution5() {

        String str = "1,2,3,4,5,6,7,8,9,10";

        String arr[] = str.split(",");

        for (String a : arr) {
            System.out.println(a);
        }

    }

    public static void solution6() {

        String str = "Java,JavaScript";
        
        StringTokenizer st = new StringTokenizer(str,"Java");
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }

}
