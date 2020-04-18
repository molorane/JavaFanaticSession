/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope_variables;

import java.util.Scanner;

/**
 *
 * @author madw
 */
public class Scanner1 {

    public static void main(String[] args) {
        calculateAge();
    }

    public static void calculateAge() {
        Scanner sc = new Scanner(System.in);
        boolean calculate = true;

        while (calculate) {
            System.out.print("Whats your birth date:");
            String dateOfBirth = sc.nextLine();
            int dob = Integer.parseInt(dateOfBirth);

            System.out.print("Your age is: ");
            System.out.println(2020 - dob);
            System.out.print("Want to continue:");
            String answer = sc.nextLine();

            if (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("Y")) {
                calculate = false;
            }
        }
    }
}
