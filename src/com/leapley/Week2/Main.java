package com.leapley.Week2;

/*
Hudson Leapley 1/22/2019
Suppose the high temperature (in degrees Fahrenheit) for each of next week's days are 45, 29, 10, 22, 41, 28, and 33
and the probability of precipitation for each of the next five days is 95%, 60%, 25%, 5%, 0%, 75%, and 90%. Write a
program using a loop that displays the day of the week if that day's high temperature is less than or equal to 32 and
the probability of precipitation is greater than 50% (meaning it's likely to snow).
*/

public class Main {

    public static void main(String[] args) {

        String[] daysWeek={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; //Days of week
        int temp[]={45,29,10,22,41,28,33};//Temperatures
        int precipitation[]={95,60,25,5,0,75,90};//Precipitation

        for (int i = 0;i<6;i++){//Runs through all 7 days
            if ((temp[i] <= 32)&&(precipitation[i]>50)){//Check if its likely to snow
                System.out.println("It is likely to snow on " + daysWeek[i]);//Print out the snowy days.
            }
        }
    }
}