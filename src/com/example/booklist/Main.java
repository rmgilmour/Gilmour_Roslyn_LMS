/**
 * File Name: 	LibraryMS.java
 * Author:     	Roslyn Gilmour
 * Course:		CEN-3024C
 * Professor:	Mary Walauskis
 * Description:	This program will provide a Switch menu to obtain the
 *              user's menu choice.
 *              The first choice is to read a text file.  The readFile
 *              method will call the readFile method to read the file.
 *              This method will then convert the contents to objects
 *              and store the object values in an array for later use.
 *              The user can then select to either list the array
 *              contents via the listFile method, or remove a line item
 * 				from the array and return the list.
 * Date:		9/4/23
 */

package com.example.booklist;

import java.util.*;
import java.io.*;

/**
 * Main class contains main method
 */
public class Main {

    /**
     * main class to obtain the text file, display the switch menu,
     * and obtain the menu choice from the user.
     * @param args          No args String containing text.
     * @throws Exception    Exception to catch certain conditions.
     */
    public static void main(String[] args) throws Exception {

          FileEdit l = new FileEdit();
          FileEdit d = new FileEdit();

          File bookList = new File ("BookList.txt");

          ArrayList<BookList> books = FileEdit.readFile(bookList);

        char choice;

        do {
            choice = getChoice();

            switch(choice) {
                case 'R': //read file
                    FileEdit.readFile(bookList);
                    break;
                case 'D': //delete item from file
                    FileEdit.deleteItem(books);
                    System.out.println();
                    break;
                case 'L': // list all items
                    l.listFile();
                    System.out.println();
                    break;
                case 'Q': // quit menu
                    System.out.println("Thank you. Have a nice day.");
                    break;
                default: // input error catch
                    System.out.println("Invalid Selection.  Please try again");
                    break;
            } // end switch
        } while (choice != 'Q');
        // end do

    } // end main

    /**
     * Method to display the menu and obtain the user's menu choice.
     * @return      returns the user's text choice.
     */
    public static char getChoice(){
        char result;
        Scanner input = new Scanner(System.in);
        System.out.println("[R}ead the file");
        System.out.println("[D]elete item from the file");
        System.out.println("[L]ist all items in the file");
        System.out.println("[Q]uit program\n");
        System.out.println("Enter selection: ");
        result = input.nextLine().toUpperCase().charAt(0); // converts the character entered into a capital letter

        return result;
    } // end method getChoice

} // end Main
