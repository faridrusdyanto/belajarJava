package com.farid.test;

import java.util.Scanner;

public class Evaluation {

	//	terdapat satu kasus, 
	//	apabila pasien corona jumlahnya kurang dari 5 maka di kategorikan "Waspada1"
	//	apabila jumlahnya antara 5 sampai 20 dikategorikan "Waspada2"
	//	apabila jumlahnya antara 21 sampai 60 dikategorikan "Waspada3"
	//	apabila jumlahnya antara 61 sampai 120 dikategorikan "Waspada4"
	//	lewat dari 120 di kategorikan harus "Lockdown"

	public static void main(String[] args) {


		System.out.print("Masukan jumlah pasien corona: ");
		Scanner in = new Scanner(System.in);
		//		int inputan = in.nextInt();
		String input = in.nextLine();
		
//		Integer inputan = null;
		Double inputan = null;
		try {
//			inputan = Integer.parseInt(input);
			inputan = Double.parseDouble(input);

			if (inputan < 5) {
				System.out.println("Waspada 1");
			} else if ( (inputan >= 5) && (inputan <= 20) ) {
				System.out.println("Waspada2");
			} else if ( (inputan > 20 ) && (inputan <= 60) ) {
				System.out.println("Waspada3");
			} else if ( (inputan > 60) && (inputan <= 120) ) {
				System.out.println("Waspada4");
			} else {
				System.out.println("Lock Down");
			}
		} catch (Exception e) {
			System.out.println("bukan integer");
		}
	}

}
