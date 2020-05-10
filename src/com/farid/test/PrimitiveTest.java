package com.farid.test;

public class PrimitiveTest {
	public static void main(String[] args) {
		String televisi = "televisi";
		int ukuran = 14;
		double dimensi = 7.5;
		boolean isTelevisi = false;
		long jamTayang = 100;
		double selisih = ukuran - dimensi;
		
		
	
		System.out.println(televisi + " " + ukuran + " " + selisih);
		
		Integer size = 7;
		Double dimension = 15d;
		Boolean isTv = Boolean.FALSE;
		Long duration = 70000l;
		
		String namaString = size.toString();
		
		Long longNama = dimension.longValue();
		Double namaDouble = duration.doubleValue();
		System.out.println(namaDouble);
		System.out.println(longNama);
		
		
	}

}
