/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import com.google.gson.Gson;
import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.*;

public class AppTest {
    
    @Test public void testBookToString() {
        BufferedReader successfulRead = FileReadAndWrite.fileToReaderObject();
        Gson gson = new Gson();
        Book[] books = gson.fromJson(successfulRead, Book[].class);
        String expectedTest = "Quote: “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.” - Author: Marilyn Monroe";
        System.out.println(books[0].toString());
        assertEquals("Our expected text should equal the book.toString method", expectedTest, books[0].toString());
    }

    @Test public void testRandomize() {
        BufferedReader successfulRead = FileReadAndWrite.fileToReaderObject();
        Gson gson = new Gson();
        Book[] books = gson.fromJson(successfulRead, Book[].class);
        String test1 = Randomizer.generateQuoteAndAuthor(books);
        String test2 = Randomizer.generateQuoteAndAuthor(books);
        assertFalse("The two strings returned by the randomizer should be unique.", test1.equals(test2));
    }

    @Test public void testRandomizeHarder() {
        BufferedReader successfulRead = FileReadAndWrite.fileToReaderObject();
        Gson gson = new Gson();
        Book[] books = gson.fromJson(successfulRead, Book[].class);
        String test1 = Randomizer.generateQuoteAndAuthor(books);
        String test2 = Randomizer.generateQuoteAndAuthor(books);
        String test3 = Randomizer.generateQuoteAndAuthor(books);
        String test4 = Randomizer.generateQuoteAndAuthor(books);
        String test5 = Randomizer.generateQuoteAndAuthor(books);

        assertFalse("The two strings returned by the randomizer should be unique.", test1.equals(test2));
        assertFalse("The two strings returned by the randomizer should be unique.", test1.equals(test3));
        assertFalse("The two strings returned by the randomizer should be unique.", test1.equals(test4));
        assertFalse("The two strings returned by the randomizer should be unique.", test1.equals(test5));

    }

}
