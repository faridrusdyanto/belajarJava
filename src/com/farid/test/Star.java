package com.farid.test;

public class Star {
	public static void main(String args[]) {
		
		/*
		 Band = green_day, Muse, Maroon_5, Saosin
		 Ubahlah Menjadi Seperti ini:
		 Band = Saosin, Green day, Muse, Maroon 5
		 */
		
		String[] Band = {
				"Green_day","Muse","Maroon_5","Saosin"
		};
		String[] tmp = new String[Band.length];
		for (int i = 0; i<Band.length; i++) {
			if(i == (Band.length - 1)) {
				tmp[0] = Band[Band.length-1];
			} else {
				tmp[i+1] = Band[i];
			}
		}
		
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + " || ");
		}
		
		
		System.out.println("\n\n====Angka Dapan jumlah ke angka terakhir===\n");
		int[] angka = {
				2,5,3,7,4,8
		};
		Integer[] jumlah = new Integer[angka.length];
		for (int i = 0; i < angka.length; i++) {
			jumlah[i] = angka[i] + angka[angka.length-1];
			
		}
		for (int i = 0; i < jumlah.length; i++) {
			System.out.print(jumlah[i] + " ");
		}
		
		
		System.out.println("\n\n====Jumlah Semua Baris===\n");
		Integer[] jumlahke2 = new Integer[angka.length];
		for (int i = 0; i < angka.length; i++) {
			int currentValue = angka[i];
			int sum = 0;
			System.out.println("---");
			for (int j = i+1; j < angka.length ; j++) {
				System.out.println(sum + "+" + angka[j]);
				sum += angka[j];
			}
			jumlahke2[i] = sum + currentValue;
		}
		for (int i = 0; i < jumlahke2.length; i++) {
			System.out.print(jumlahke2[i] + " ");
		}
	}
}