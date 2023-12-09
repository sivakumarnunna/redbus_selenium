package com.practice.exceptionHandling;

public class ExceptionHandling {
	
	
		
		static void validate (int age) throws InvalidAgeException{    
		       if(age < 18){  
		  
		        throw new InvalidAgeException("age is not valid to vote");    
		    }  
		       else {   
		        System.out.println("welcome to vote");   
		        }   
		     }  
		
		public static void main(String[] args) {
			try {
				validate(12);
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi prendssss");
		}
		
}
