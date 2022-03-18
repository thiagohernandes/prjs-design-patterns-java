package com.design.patterns.tbehavioral.p8strategyNICE;

public class Subtraction  implements Strategy{

	@Override
	public float calculation(float a, float b) {
		return a-b;
	}

}
