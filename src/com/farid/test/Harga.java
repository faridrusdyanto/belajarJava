package com.farid.test;

public class Harga {

	public static void main(String[] args) {
		float[] harga = {
			2500,3000,25000,150000,300000	
		};
		 float ppn = 0.1f;
		 float diskon = 0.02f;
		 
		 float[] tmp = new float[harga.length];
		 for (int i = 0; i < harga.length; i++) {
			float hrg = harga[i];
			if (hrg >= 100000f) {
				hrg = ((hrg*ppn)+hrg)-(hrg*diskon);
			}
			else {
				hrg = ((hrg*ppn)+hrg);
			}
			tmp[i] = hrg;
		}
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + " || ");
		}

	}

}