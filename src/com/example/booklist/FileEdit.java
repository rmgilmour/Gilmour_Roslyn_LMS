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

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * No return class that contains the methods to process the
 * user's menu choices.
 *          readFile
 *          listFile
 *          deleteItem
 */
public class FileEdit {

    static ArrayList<BookList> booksArray = new ArrayList<>();

    /**
     * ArrayList method to obtain the text file, scan the contents,
     * convert the string content to objects, and store the objects
     * in the array booksArray.
     * @param bookList                  Text file containing the list
     *                                  of string content.
     * @return                          Returns the array containing the
     *                                  list of items as objects.
     * @throws FileNotFoundException    Exception to catch the condition
     *                                  where the file is not found.
     */
    public static ArrayList<BookList> readFile(File bookList) throws FileNotFoundException {

        Scanner s = new Scanner(bookList);

        while (s.hasNextLine()) {
            String line = s.nextLine();

            String[] items = line.split(",");

            // put into BookList object
            int itemID = Integer.parseInt(items[0]);
            String title = items[1];
            String author = items[2];

            BookList newList = new BookList(itemID, title, author);
            newList.setItemID(itemID);
            newList.setTitle(title);
            newList.setAuthor(author);
            booksArray.add(newList);

        } // end while

        System.out.println("File Read.");
        System.out.println();

        return booksArray;
    } // end readFile

    /**
     * void method to list the contents of the array.
     */
    public void listFile(){

        for(int i = 0; i < booksArray.size(); i++)
            System.out.print(booksArray.get(i));

    } // end listFile

    /**
     * void method to request the array, obtain from the user
     * which item they would like to delete.  The method then
     * deletes the item, updates the array, and prints the array.
     * @param booksArray            ArrayList parameter to obtain
     *                              the contents of the array.
     */
   public static void deleteItem(ArrayList<BookList> booksArray){

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter line item to remove: ");
        num = input.nextInt() - 1;

        System.out.println("Removing: " + booksArray.get(num));
        booksArray.remove(num);
        System.out.println("New List: \n" + booksArray);
        System.out.println("Line removed.");

   } // end deleteItem

} // end FileEdit
