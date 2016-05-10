/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timedifference;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Michael Burrell
 * @since 9-May-2016
 */
public class TimeDifference {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int year = kbd.nextInt();
        int month = kbd.nextInt();
        int day = kbd.nextInt();
        int hour = kbd.nextInt();
        int minute = kbd.nextInt();
        int second = kbd.nextInt();
        GregorianCalendar then =
           new GregorianCalendar(year, month, day,
                   hour, minute, second);
        Date now = new Date();
        long difference = now.getTime() - then.getTimeInMillis();
        System.out.println(difference / 1000);
    }
}
