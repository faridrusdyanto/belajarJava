package com.farid.oop;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		TestModel tm = new TestModel();
		//Motor mtr = tm.speed(5);
		//System.out.println(tm);
		//System.out.println(tm.speed(5).getMesin());
		//System.out.println(mtr.getMesin());
		
//		Map<String, Object> mapMotor = tm.speed(6);
//		Motor mtr = (Motor) mapMotor.get("mtr");
//		System.out.println(mtr.getRoda());
//		System.out.println(mapMotor.get("speed"));
		
		TmpMotor tmp = tm.speed(7);
		System.out.println(tmp.getMotor().getMesin());
		System.out.println(tmp.getSpeed());

	}

}
