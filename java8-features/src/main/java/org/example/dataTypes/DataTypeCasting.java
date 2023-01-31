package org.example.dataTypes;

public class DataTypeCasting {
	private double convertToDouble() {
		int i = 3; // i is 3
		double d = (double) i; // d = 3.0
		System.out.println("double Primitive : " + d);
		
		double d1 = Double.parseDouble("34");
		System.out.println("double Primitive : " + d1);
		
		return d;
	}
	
	private Double convertToWrapperDouble() {
		Double d = Double.valueOf(3);  
		System.out.println("Double Wrapper : " + d);
		
		Double d1 = Double.parseDouble("34");
		System.out.println("Double Wrapper2 : " + d1);
		
		return d;
	}
	
	private int convertToInteger() {
		double i = 3.5;
		int d = (int) i;  
		System.out.println("Int Primitive : " + d);
		
		int d1 = Integer.parseInt("34");
		System.out.println("Int Primitive : " + d1);
		
		return d;
	}
	
	private Integer convertToWrapperInteger() {
		double i = 3.5; // i is 3
		Integer d = (int)i; // d = 3.0
		System.out.println("Double Wrapper : " + d);
		
		Integer d2 = Integer.parseInt("34");
		System.out.println(" : " + d2);
		
		return d;
	}
	
	public static void main(String[] args) {
		DataTypeCasting dataTypeCasting = new DataTypeCasting();
		dataTypeCasting.convertToDouble();
		dataTypeCasting.convertToWrapperDouble();
		dataTypeCasting.convertToInteger();
		dataTypeCasting.convertToWrapperInteger();
	}

}
