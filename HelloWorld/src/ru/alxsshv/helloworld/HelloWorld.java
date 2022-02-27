package ru.alxsshv.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		int i = 7;
		int j = 6;
		float answer;
		boolean isMoreThenOne;
		answer = (float) i / (float) j;
		String message1 = "Hello";
		String message2 = " world";
		if (answer > 1) {
			isMoreThenOne = true;
		} else {
			isMoreThenOne = false;
		}
		System.out.println(isMoreThenOne);
		System.out.println(message1 + message2);
		System.out.println(answer);
	}
	
}
