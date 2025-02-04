package com.in31years.spring_boot_demo_project.game.copy;

public class SuperContra {
	
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Bow down..");
		
	}
	public void right() {
		System.out.println("Move forward..");
	}
	public void left() {
		System.out.println("Move backwards..");
	}
	@Override
	public String toString() {
		return "SuperContra [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
