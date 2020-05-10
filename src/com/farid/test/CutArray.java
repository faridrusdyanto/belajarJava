package com.farid.test;

import java.util.ArrayList;

public class CutArray {

	public static void main(String[] args) {
		String[] vokal = {
			"a","e","i","o","u","x"	
		};
		String[] data = {
			"Tim","Txm","Tum","Tom","Tem", "Tam"
		};
		
//  	mengambil setelah karakter ke 9(club) dan menggabungkannya dengan 'United' + club primier English
//		String man = club.substring(9) + " United";
//		System.out.println(man + " club premier English");
		Integer[] tmp = new Integer[data.length];
		
		for (int i = 0; i < data.length; i++) {
			String dt = data[i];
			String cut = dt.substring(1,2);
			
			for (int j = 0; j < vokal.length; j++) {
				if (vokal[j].equalsIgnoreCase(cut)) {
					tmp[i] = j;
					break;
				}
			}
		}

		ArrayList<String> listStr = new ArrayList<String>();
		Integer indicator = null;
		for (int i = 0; i < tmp.length; i++) {
			for (int j = i+1; j < tmp.length; j++) {
				if (tmp[i] > tmp[j]) {
					indicator = tmp[i];
					tmp[i] = tmp[j];
					tmp[j] = indicator;
				}
			}
		}
		
		for (int i = 0; i < tmp.length - 1; i++) {
			String val = "T" + vokal[tmp[i]] + "m";
			listStr.add(val);
			System.out.println(val);
		}
		String val = "T" + vokal[tmp[tmp.length - 1]] + "m";
		listStr.add(val);
		System.out.println(val);
	}

}
