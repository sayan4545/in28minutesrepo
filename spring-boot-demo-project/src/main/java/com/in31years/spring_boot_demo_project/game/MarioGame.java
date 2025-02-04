package com.in31years.spring_boot_demo_project.game;

import com.in31years.spring_boot_demo_project.game.copy.GamingConsole;

public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("Jump in MarioGame");
	}
	public void down() {
		System.out.println("Bow down in mariogame");
	}
	public void right() {
		System.out.println("Run reight");
	}
	public void left() {
		System.out.println("Run left..");
	}

	@Override
	public String toString() {
		return "MarioGame [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
