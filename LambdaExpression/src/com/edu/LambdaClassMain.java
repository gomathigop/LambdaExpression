package com.edu;

import java.util.ArrayList;

@FunctionalInterface
interface Drawable{   //Functional interface a interface which has single abstract method
	void draw(); //Lambda expression can be applied to a functional interface
	//with no return type and no arg
}

@FunctionalInterface
interface Sayable{
	void say(String s); //function with  arg with no return type
}

@FunctionalInterface
interface SayableReturn{
	String sayHello();  //function with no arg and with return type
}

@FunctionalInterface
interface Addition{
	int add(int a, int b); //function with arg and with return type
}

public class LambdaClassMain {
	
	public static void main(String[] args) {
		Drawable dob=()->{
			System.out.println("draw method body");
		};
		dob.draw();			
	Sayable sob=(s)->{    //(String s)
		System.out.println("Hello "+s);
	};
	sob.say("Kavi");
	
	SayableReturn sr=()->{
	    return "Hi";
	};	
	System.out.println(sr.sayHello());
	
	Addition aob=(i,j)->(i+j);
	System.out.println(aob.add(2,7));
	
	//Collection API
	
	ArrayList<Integer>l=new ArrayList<Integer>();
	l.add(8);
	l.add(76);
	l.add(99);
	l.add(25);
	
	l.forEach((n)->System.out.println(n));//Iterating list elements using Lambda
  }
}
