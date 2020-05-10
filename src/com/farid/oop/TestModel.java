package com.farid.oop;

import java.util.HashMap;
import java.util.Map;

public class TestModel {
	public TmpMotor speed(Integer distance) {
		Motor motor = new Motor();
		motor.setMesin(1000l);
		motor.setKarbu(100);
		motor.setRoda(2);
		motor.setTangki(4);
		
		Long speedMotor = motor.getMesin()*motor.getTangki()/motor.getRoda()/distance;
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("speed", speedMotor);
//		map.put("mtr", motor);
		
		TmpMotor tmMotor = new TmpMotor();
		tmMotor.setMotor(motor);
		tmMotor.setSpeed(speedMotor);
		
//		return map;
		return tmMotor;
	}
	
	
}
