package day3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class diff_check_uncheck {
	    public static void main(String[] args) {
	        // Example of a checked exception
	        try {
	            readFile("Downloads/DiplomaCertificate - Ankita Mitra.pdf"); // This file does not exist
	        } catch (FileNotFoundException e) {
	            System.out.println("Checked Exception: " + e.getMessage());
	        } catch (IOException e) {
	            System.out.println("Another Checked Exception: " + e.getMessage());
	        }

	        // Example of an unchecked exception
	        try {
	            divide(10, 0); // Division by zero
	        } catch (ArithmeticException e) {
	            System.out.println("Unchecked Exception: " + e.getMessage());
	        }
	    }

	    // Method that throws a checked exception (FileNotFoundException)
	    public static void readFile(String fileName) throws FileNotFoundException, IOException {
	        FileInputStream file = new FileInputStream(fileName); // May throw FileNotFoundException
	        int data = file.read(); // May throw IOException
	        file.close();
	    }

	    // Method that throws an unchecked exception (ArithmeticException)
	    public static int divide(int a, int b) {
	        return a / b; // May throw ArithmeticException if b is 0
	    }
}

