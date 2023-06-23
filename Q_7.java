
// Muhammad Naveed

// (Car-Pool Savings Calculator) Research several car-pooling websites. Create an application that
// calculates your daily driving cost, so that you can estimate how much money could be
// saved by carpooling, which also has other advantages such as reducing carbon emissions and
// reducing traffic congestion. The application should input the following information and display
// the user’s cost per day of driving to work:
//  a) Total miles driven per day.
//  b) Cost per gallon of gasoline.
//  c) Average miles per gallon.
//  d) Parking fees per day.
//  e) Tolls per day.

import java.util.Scanner;

public class Q_7
{
//    public static void main (String [] args) {
//
//        // Scanner class object
//        Scanner sc = new Scanner (System.in);
//
//        int totalMiles;
//        int gasolineCost;
//        int milesPerGallon;
//        int parkingFees;
//        int tolls;
//        int dailyDrivingCost;
//
//        System.out.print ("Enter Total Miles Driven Per Day: ");
//        totalMiles = sc.nextInt();
//
//        System.out.print ("Enter Cost Per Gallon Of Gasoline: ");
//        gasolineCost = sc.nextInt();
//
//        System.out.print ("Enter Average Miles Per Gallon: ");
//        milesPerGallon = sc.nextInt();
//
//        System.out.print ("Enter Parking Fees Per Day: ");
//        parkingFees = sc.nextInt();
//
//        System.out.print ("Enter Tolls Per Day: ");
//        tolls = sc.nextInt();
//
//        // closing scanner.
//        sc.close();
//
//        // calculating daily Driving cost.
//        dailyDrivingCost = (totalMiles / milesPerGallon) * gasolineCost + parkingFees + tolls;
//
//        System.out.printf ("\nYour Daily Driving Cost Is: %d\n", dailyDrivingCost);
//    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles per day : ");
        int total_Miles = sc.nextInt();

        System.out.print ("Enter Cost Per Gallon Of Gasoline: ");
        int gasolineCost = sc.nextInt();

        System.out.print ("Enter Average Miles Per Gallon: ");
        int milesPerGallon = sc.nextInt();

        System.out.print ("Enter Parking Fees Per Day: ");
        int parkingFees = sc.nextInt();

        System.out.print ("Enter Tolls Per Day: ");
        int tolls = sc.nextInt();

        sc.close();

        int dailyDrivingCoast = (total_Miles / milesPerGallon) * gasolineCost + parkingFees + tolls;

        System.out.print("Dail Driving Coast => " + dailyDrivingCoast);
    }
}
