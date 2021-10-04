package com.te.thirdofoct;

public class TestClass {
	
	public static void main(String[] args) {

		PrimeNumber ref = new PrimeNumber();
		ref.pgr();
		
		SimpleIntrest obj = new SimpleIntrest();
		obj.simple();
		
		Square sq = new Square();
		sq.squareArea(2.5);
		sq.squarePerimeter(2.5);
		

		Rectangle rec = new Rectangle();
		rec.rectangleArea(3.5, 5.0);
		rec.rectanglePerimeter(4.5, 5.0);
		
		Gcd ref1 = new Gcd();
		ref1.gcd1();
		
		System.out.println(Recursion.factorial(5));
		
		StringDesign ref2 = new StringDesign();
		ref2.test();
		
		TryWithMultipleCatch ref3 = new TryWithMultipleCatch();
		ref3.test();
	}
 	}

