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

/**
 * No return class to encapsulate the data into getters and setters.
 */
public class BookList {

    private int itemID;
    private String title;
    private String author;

    /**
     * Method to hold the itemID as an int, title as a String,
     * and author as a String.
     * @param itemID        Parameter to hold the line number.
     * @param title         Parameter to hold the book titles.
     * @param author        Parameter to hold the author names.
     */
    public BookList(int itemID, String title, String author) {
        super();
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    /**
     * Method to get the itemID.
     * @return      Returns the itemID.
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Method to set the itemID content.
     * @param itemID    Parameter to hold the content of
     *                  the itemID and create an instance
     *                  of itemID.
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;

    }

    /**
     * Method to get the title content.
     * @return          Returns the title content.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to set the title content.
     * @param title     Parameter to hold the content of
     *                  the title and create an instance
     *                  of title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method to get the author content.
     * @return          Returns the content of author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Method to set the author content.
     * @param author        Parameter to hold the content of
     *                      the author and create an instance
     *                      of author.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Method to print the encapsulated data.
     * @return              Returns a string for each line item
     *                      in the Array.
     */
    public String toString() {
        return ("ID: " + this.itemID + "  Title: " + this.title + "  Author: " + this.author + "\n");
    }

}
