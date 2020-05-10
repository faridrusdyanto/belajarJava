package com.farid.test;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		String tumbuhan = "tumbuhan";
		int jumlahBiji = 1;
		boolean isMonokotil = true;
		int maxTinggiTumbuhan = 24;
		
		Scanner in = new Scanner(System.in);
		String inputan = in.nextLine();
		Integer inputanInt = Integer.parseInt(inputan);
		if (jumlahBiji == inputanInt ) {
			System.out.println("Tumbuhan Monokotil");
		} else if ((jumlahBiji + 1) == inputanInt) {
			System.out.println("Tumbuhan Dikotil");
		} else {
			System.out.println("Tumbuhan tidak terdeteksi");
		}
	}

}
