package SHISHIRASIR;

import java.util.Stack;

public class MainStack1 {
	public static void main(String[] args) {
		Stack<String> animal = new Stack<>();
		animal.push("Dog");
		animal.push("Hore");
		animal.push("Cat");
		animal.push("Lion");
		animal.push("Deer");
		System.out.println("Stack:" + animal);
		int position = animal.search("Deer");
		System.out.println("position of Deer:" + position);
	}
}
