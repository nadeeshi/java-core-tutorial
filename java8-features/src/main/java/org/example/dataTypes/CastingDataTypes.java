package org.example.dataTypes;

public class CastingDataTypes {

	private void printMsg(String input) {
		System.out.println("String " + input);
	}
	
	private void printInteger(Integer input) {
		System.out.println("Integer " + input);
	}
	
	private void printInt(int input) {
		System.out.println("Int " + input);
	}
	
	private void printWrapperDouble(Double input) {
		System.out.println("Double " + input);
	}
	
	private void printPrimitiveDouble(double input) {
		System.out.println("double " + input);
	}
	
	public static void main(String[] args) {
		CastingDataTypes test = new CastingDataTypes();
		test.printMsg("Nadee");
		test.printInteger(35);
		//test.printInteger(34.5); // for Integer wrapper class we can't pass double value
		
		test.printInt(35);
		//test.printInt(35.6); //this not support automatically double -> int
		
		test.printWrapperDouble(34.5);
		test.printWrapperDouble(0.0);
		//test.printWrapperDouble(0); // for Double wrapper class we can't pass int value
		//test.printWrapperDouble(34); // for Double wrapper class we can't pass int value
		
		test.printPrimitiveDouble(0);
		test.printPrimitiveDouble(35);
		test.printPrimitiveDouble(34.5);

	}

}
