package com.company;

public class Library {

    String addr;

    Book bk;

    int i = 0;


    public Library(String address) {

        addr = address;

    }

    public void addBook(String abook) {

        bk = new Book(abook);

    }


    public String openhours() {

        String c = "Libraries are open daily from 9am to 5pm.";

        return c;

    }


    public String printAddr() {

        return addr;

    }


    public String availbook() {


        return bk.getTitle();

    }


    public static void main(String[] args) {


        // Creating two libraries

        Library firstLibrary = new Library("10 Main St.");

        Library secondLibrary = new Library("228 Liberty St.");

        //Library l1=new Library("chennai");

        //l1.(Book addBook=new Book("hello"));

        //l1.addBook("oops");


        firstLibrary.addBook("The Da Vinci Code");

        firstLibrary.addBook("Le Petit Prince");

        firstLibrary.addBook("A Tale of Two Cities");

        firstLibrary.addBook("The Lord of the Rings");


        System.out.println("First Library");

        System.out.println(firstLibrary.printAddr());

        System.out.println(firstLibrary.openhours());


        System.out.println("second Library");

        System.out.println(secondLibrary.printAddr());

        System.out.println(secondLibrary.openhours());


        System.out.println(firstLibrary.availbook());


    }

}