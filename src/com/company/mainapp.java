package com.company;

import java.util.Scanner;

public class mainapp {


    public static void main(String[] args) {


        // CLASS object of class Reservation
        Reservation res = new Reservation(5, 6);
        // local variables
        int Row;
        String Column;
        String seatChoice;
        Scanner sc = new Scanner(System.in);

        while (true) {
            while (true) {
                // accepting row number from the user
                System.out.print("Enter Row Number using Number 1 to 5 : ");
                Row = sc.nextInt();
                // checking for valid input or print message and accept value again
                if (!(Row >= 1 && Row <= 5)) {
                    System.out.print("Invalid Number, Please enter again.");
                } else break;
            }

            while (true) {
            // accepting column letter from the user
                System.out.print("Enter Column letter by using letters from A to F : ");
                Column = sc.nextLine();
                // checking for valid input or print message and accept value again
                if (!(Column.equals("A") || Column.equals("B")  || Column.equals("C")  || Column.equals("D")  || Column.equals("E")  || Column.equals("F") )) {
                    System.out.println("Invalid Input....Please enter again.");
                } else break;

            }


            //Call to method ReserveSeat
            res.Reserve_seat(Row, Column);
            //Print seat of reservation
            res.PrintMatrix();
            System.out.println();
            //check if continue
            System.out.print("Do you want to reserve more seats(Y/N) :");
            seatChoice = sc.nextLine();

            if (seatChoice.equals("Y") || seatChoice.equals("y"))
                continue;
            else
                break;

        }

        String message = "Thank You!";
        // nested loops for printing "Thank You"
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(message);
                }
                System.out.println();
            } else {
                for (int j = i; j <= 9; j++) {
                    System.out.print(message);
                }
                System.out.println();
            }
        }
    }

}




