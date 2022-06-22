package main;

import java.util.Arrays;
import java.util.Scanner;

public class EsAnagrama {
	 static boolean esAnagrama(String palabra1, String palabra2) {
		 
	        if (palabra1.toLowerCase() == palabra2.toLowerCase()){
	        	System.out.println("misma palabra");
	            return false;
	        } else if (palabra1.length() != palabra2.length()) {	        	
	        	return false;
	        } else {
	        	char[] a = palabra1.toLowerCase().toCharArray();
		        char[] b = palabra2.toLowerCase().toCharArray();
		        boolean esAnagrama = true;
		        Arrays.sort(a);
		        Arrays.sort(b);
		        esAnagrama = Arrays.equals(a, b);	        
		        
		        return esAnagrama;
	        }     
	        
	    }
	    
	    
		 public static void main(String[] args) {
			    
		        Scanner scan = new Scanner(System.in);
		        String a = scan.next();
		        String b = scan.next();
		        scan.close();
		        boolean ret = esAnagrama(a, b);
		        System.out.println( (ret) ? "Es Anagrama" : "No es Anagrama" );
		    }

}
