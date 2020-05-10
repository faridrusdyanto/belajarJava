package com.farid.test;

//import java.util.Arrays;

public class ArrayGanjilGenap {

	public static void main(String[] args) {
		// Ubahlah value berdasarkan index genap dan ganjil
		// Soal   = "yui","ami","yuma","alice","yuki","amai"
		// Output = "ami","yui","alice","yuma","amai","yuki" 
		
		String[] name = {
				"yui","ami","yuma","alice","yuki","amai","farid"
		};
		String[] tmp = new String[name.length];
		for (int i = 0; i < name.length; i++) {
			if ((i+1) == name.length) {
				if ((i+1) % 2 == 1) {
					tmp[i] = name[i];
					break;
				}
			}
			
			if (i % 2 == 0){
				tmp[i] = name[i+1];
			}else {
				
				tmp[i] = name[i-1];
				
			}
				
		}
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + " ");
		}
	}

}





















//String temp;
//String[] name = {
//		"yui","ami","yuma","alice","yuki","amai"
//};
//
//for (int i = 1; i < name.length; i+=2) {
//	temp = name[i-1];
//	name[i-1] = name[i];
//	name[i] = temp;
//}
//
//System.out.println(Arrays.toString(name));