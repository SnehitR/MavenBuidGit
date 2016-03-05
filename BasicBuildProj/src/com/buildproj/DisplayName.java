package com.buildproj;
import java.io.* ;

public class DisplayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InputStreamReader istream = new InputStreamReader(System.in) ;
         BufferedReader bufRead = new BufferedReader(istream) ;
         
         System.out.println("Welcome To My First Java Program");
    try {
         System.out.println("Please Enter In Your First Name: ");
         String firstName = bufRead.readLine();
         System.out.println("Thank You!" + firstName.toString());
    }
    catch (IOException err) {
         System.out.println("Error reading line");
	}
	}
}
