package com.tns.session;

class TryCatchFinallyException {

	public static void main(String[] args) {

		int[] arr = new int[4]; // 0,1,2,3
		try {
			System.out.println(arr[4]);

			System.out.println("inside try block");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception caught in catch block");
			System.out.println(ex); // Here object will give name of the exception and description of the exception
		} finally {
			System.out.println("finally block executed");
		}
		System.out.println("outside block"); // Outside Blocks
	}
}