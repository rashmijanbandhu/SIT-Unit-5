// Java program to demonstrate working of URL

// Importing required classes
import java.net.MalformedURLException;
import java.net.URL;

// Main class
// URL class
public class URLDemo {

	// Main driver method
	public static void main(String[] args)
		throws MalformedURLException
	{

		// Creating a URL with string representation

		URL url = new URL(
			"https://www.google.com/search?q=url+with+query+parameters&rlz=1C1CHBF_enIN1041IN1041&oq=url+with+query&aqs=chrome.0.0i512j69i57j0i512l3j0i390i650l4.8676j0j7&sourceid=chrome&ie=UTF-8#imgrc=aKgOoJqdulRHwM");


		
		System.out.println("Different components of the URL3-");

		// Retrieving the protocol for the URL
		System.out.println("Protocol:- "+ url.getProtocol());

		// Retrieving the hostname of the url
		System.out.println("Hostname:- " + url.getHost());

		// Retrieving the default port
		System.out.println("Default port:- "+ url.getDefaultPort());

		// Retrieving the query part of URL
		System.out.println("Query:- " + url.getQuery());

		// Retrieving the path of URL
		System.out.println("Path:- " + url.getPath());

		// Retrieving the file name
		System.out.println("File:- " + url.getFile());

		// Retrieving the reference
		System.out.println("Reference:- " + url.getRef());
	}
}
