package com.farid.test;

import java.util.Scanner;

public class Belajar {

	public static void main(String[] args) {
		// Bilangan Genap
		System.out.println("Bilangan Genap");
		System.out.print("Masukan nilai maksimal: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		Double inputan = null;
		inputan = Double.parseDouble(input);
		
		for(int i=0; i<=inputan; i++) {
			if(i % 2 == 0) {
			System.out.print(i + " ");
			}
		}
		
		// Bilangan Ganjil
		System.out.println("\n\nBilangan Ganjil");
		System.out.print("Masukan nilai maksimal: ");
		in = new Scanner(System.in);
		input = in.nextLine();
		
		inputan = null;
		inputan = Double.parseDouble(input);
		
		for(int i=0; i<=inputan; i++) {
			if(i % 2 == 1) {
			System.out.print(i + " ");

			}
		}
		System.out.print("\n\n");
		
		// Bilangan Prima
		System.out.println("\n\nBilangan Prima");
		System.out.print("Masukan nilai maksimal: ");
		in = new Scanner(System.in);
		input = in.nextLine();
		
		inputan = null;
		inputan = Double.parseDouble(input);
		
		int resultPrime[] = new int[Integer.parseInt(input)];
		int tmp = 0;

		for(int i=2; i<=inputan; i++) {
			boolean isPrima = true;
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					isPrima = false;
					break;
				}
			}
			if(isPrima == true) {
				/* System.out.print(i + " "); */
				resultPrime[tmp] = i;
				tmp++;
			}
		}
		
		for (int i = 0; i < resultPrime.length; i++) {
			System.out.print(resultPrime[i] + " ");
		}
		// Bilangan Fibonnaci
		System.out.println("\n\nBilangan Fibonnaci");
		System.out.print("Masukan suku ke- : ");
		in = new Scanner(System.in);
		input = in.nextLine();
		// inputan 5
		// 0, 1, 2, 3, 4
		Integer inputanInt = null;
		inputanInt = Integer.parseInt(input);
		
		long fib[] = new long[inputanInt];
        
        fib[0] = 0;
        fib[1] = 1;
        
        int j = 1;
        for(int i = 2; i < inputanInt; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println("fib[" + (i-1) + "] = " + fib[i-1]);
            System.out.println("fib[" + (i-2) + "] = " + fib[i-2]);
            System.out.println("fib[" + i + "] = " + fib[i]);
            System.out.println("------------------ lop ke: " + j);
            j++;
        }
        // loop 1 fib[2] = 1
        // loop 2 fib[3] = 2
        // loop 3 fib[4] = 
         
//        for (int i = 0; i < inputanInt; i++) {
//            System.out.print(fib[i] +  " ");
//        }
	}

}



