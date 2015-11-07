package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Set a private list of names
        String[] List = new String[50];

        System.out.println("Hello! Here is a list with the actions that you can do! ");
        Agenda m = new Agenda();

        //create an object to show printMenu method
        m.printMenu();

        System.out.println("Select an option:");
        Scanner intrare=new Scanner(System.in);


        do {

            //Option takes the entered value
            int option= intrare.nextInt();

            switch (option){
                case 1: m.listWholeList();
                    break;

                case 2: m.searchNameAndDisplay();
                    break;

                case 3: m.createItem();
                    break;

                case 4: m.updateName();
                    break;

                case 5: m.deleteName();
                    break;

                case 6: m.exitList();
                    break;
            }


        }
        while (true);





}

}
