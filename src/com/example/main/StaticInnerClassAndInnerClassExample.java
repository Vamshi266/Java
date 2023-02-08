package com.example.main;

class OuterClass {
	static class StaticInnerClass {
		public void printMessage() {
			System.out.println("you are in StaticInnerClass");
		}
	}

	class InnerClass {
		public void display() {
			System.out.println("you are in InnerClass");
		}
	}
}

public class StaticInnerClassAndInnerClassExample {

	public static void main(String[] args) {
		OuterClass.StaticInnerClass o1 = new OuterClass.StaticInnerClass();

		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass o2 = outerClass.new InnerClass();

		o1.printMessage();
		o2.display();
	}

}