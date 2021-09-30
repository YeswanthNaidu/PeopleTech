package com.peopletech.lab5;

public class AgeException extends Exception {
	
		int age;

		public AgeException(int age) {
			super();
			this.age = age;
		}

		@Override
		public String toString() {
			return "Please ENter the age above 15";
		}
		

}
