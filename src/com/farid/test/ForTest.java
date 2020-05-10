package com.farid.test;

public class ForTest {

	public static void main(String[] args) {
		String[] cars = {
				"Alpard","Xpander","X5","Jazz","Corola"
		};
		
		for (int i = 0; i<cars.length; i++) {
			if (i > 0 && i < 4 ) {
			System.out.print(cars[i] + " ");
			}
			
		}
			
	}

}
