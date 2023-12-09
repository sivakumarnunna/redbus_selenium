package com.practice.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LearnLamda {
/**
 * 
 * Lambda expressions were introduced in Java 8 as a way to provide
 *  concise syntax for writing anonymous functions (i.e., functions
 *   without a name) and to facilitate the use of functional 
 *   programming concepts. Lambda expressions are particularly useful
 *    when working with functional interfaces, which are interfaces 
 *    that declare only one abstract method. The lambda expression 
 *    syntax is designed to make it more convenient to express 
 *    instances of single-method interfaces.	
 */
	
	public static void main(String[] args) {
		Animal dog = ()->{
			System.out.println("biscuts");
			};	
		  dog.eat();		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.forEach(name -> System.out.println("Hello, "+name));
		List<Person> people = Arrays.asList(
			    new Person("Alice", 28),
			    new Person("Bob", 22),
			    new Person("Charlie", 35)
			);
		people.sort((person1,person2)->person1.getAge() - person2.getAge());
		people.forEach(person -> System.out.println(person.getAge()));
	}

}
