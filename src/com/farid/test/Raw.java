package com.farid.test;

public class Raw {

	public static void main(String[] args) {
		// Raw = 7,5,3,8,13,26
		// Jumlahkan ke hanya yg lebih besar
		
		int[] raw = {
			7,5,3,8,13,26	
		};
		int[] tmp = new int[raw.length]; 
		for (int i = 0; i < raw.length; i++) {
			int var1 = raw[i];
			int sum = var1;
			
			for (int j = 0; j < raw.length; j++) {
				int var2 = raw[j];
				if (var1 < var2) {
					sum += var2;
					
				}
			}
			
			tmp[i] = sum;
		}
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + " ");
		}
		
		
		
	}

}

