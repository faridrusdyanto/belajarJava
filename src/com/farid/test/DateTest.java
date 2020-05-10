package com.farid.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
		Date currentDate = new Date();
//		System.out.println(currentDate);
		// s = detik
		// m = menit
		// H = jam (24)
		// h = jam (12)
		// d = tanggal
		// M = bulan
		// y = tahun
		// i = milisecond
		// E = nama hari
		SimpleDateFormat simpleDate = new SimpleDateFormat("H:m:s");
		String formattedDate = simpleDate.format(currentDate);
		System.out.println(formattedDate);
		
		System.out.print("Masukan format Jam(H:m:s) : ");
		Scanner inputan = new Scanner(System.in);
		String in = inputan.nextLine();
		
		try {
			Date parsedDate = simpleDate.parse(in);
			System.out.println(parsedDate + " ==> tanggalnya(pertama rilis program 1970)");
			System.out.println("Menghitung detik sejak Januari 1970 ==>" + currentDate.getTime()); // Menghitung detik sejak Januari 1970
		}catch (Exception e) {
			System.out.println("ini bukan format Jam");
		}
	}

}
