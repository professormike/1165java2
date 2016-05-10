/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squareanumber;

import java.util.Scanner;

/**
 *
 * @author Michael Burrell
 * @since 9-May-2016
 */
public class SquareANumber {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int number = kbd.nextInt();
        System.out.println(number * number);
    }
}
