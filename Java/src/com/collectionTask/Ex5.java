package com.collectionTask;

import java.util.ArrayList;
import java.util.Collection;

public class Ex5 {

	public static void main(String[] args) {

        Collection<String> libraryBooks = new ArrayList<>();
        Collection<String> issuedBooks = new ArrayList<>();

        libraryBooks.add("Java");
        libraryBooks.add("Python");
        libraryBooks.add("C++");
        libraryBooks.add("DBMS");
        libraryBooks.add("OS");
        libraryBooks.add("Networks");
        libraryBooks.add("AI");
        libraryBooks.add("ML");

        issuedBooks.add("Java");
        issuedBooks.add("DBMS");
        issuedBooks.add("AI");

        System.out.println("Issued books are from library? " +
        libraryBooks.containsAll(issuedBooks));
	}
}
