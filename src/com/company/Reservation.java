package com.company;

public class Reservation {

    //Declare Variables
    private int Row;
    private int Column;
    private char[][] matrixSeat;


    // contructor
    public Reservation(int Row, int Column) {
        //Set row and column
        this.Row = Row;
        this.Column = Column;
        // creating the matrix of size row, column
        matrixSeat = new char[Row][Column];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                // set 'E' as every element
                matrixSeat[i][j] = 'E';
            }

        }

    }

    //Method Reserve
    public void Reserve_seat(int Row, String Col) {
       //local variable
        //SET SEAT
        int Column = 0;
          if (Col.equals("A")) Column = 0;
        else if (Col.equals("B"))  Column = 1;
        else if (Col.equals("C")) Column = 2;
        else if (Col.equals("D")) Column = 3;
        else if (Col.equals("E")) Column = 4;
        else if (Col.equals("F")) Column = 5;
        // assigning character 'X' to the row,column
        matrixSeat[Row - 1][Column] ='X';
    }

    //Method to Print seat reservation
    public void PrintMatrix() {
        // first line
        System.out.println("  A B C D E F");

        //loop for seats
        for (int i = 0; i < Row; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < Column; j++) {
                System.out.print(" " + matrixSeat[i][j]);
            }
            System.out.println();
        }



    }


    //Method to calc bill
    public String Calc_bill() {

        int qty = 0;
        double value;

        for (int i = 0; i < Row; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < Column; j++) {

                if (matrixSeat[i][j] == 'X')  {
                    qty+=1;
                }


            }
            System.out.println();
        }

      //  value * 10.0;

        System.out.println("You have purchased 1 matinee seat/s");
        System.out.println("You have purchased 1 regular seat/s");
        System.out.println("Your total bill is " + String.format("%.2f", (Calc_bill())));

        return  "";

    }


}



