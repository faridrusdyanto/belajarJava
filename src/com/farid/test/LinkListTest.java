package com.farid.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkListTest {
	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
//		listString.add("corola");
//		listString.add("Jazz");
//		for (int i = 0; i < listString.size(); i++) {
//			System.out.println(listString.get(i));
//		}
//		listString.remove(0);
//		for (int i = 0; i < listString.size(); i++) {
//			System.out.println("\n"+listString.get(i));
//		}
//		
		Scanner inputan = new Scanner(System.in);
		String in = inputan.nextLine();
		
		String[] inputs = in.split(",");
		for (int i = 0; i < inputs.length; i++) {
			listString.add(inputs[i]);
			
		}
		System.out.println("jml listString : " + listString.size());
		for (int i = 0; i < listString.size(); i++) {
			System.out.print("|" + listString.get(i));
		}
	}

}
