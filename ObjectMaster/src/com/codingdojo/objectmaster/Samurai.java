package com.codingdojo.objectmaster;

public class Samurai extends Human {
	private static int numOfSamurai = 0;
	
	public Samurai() {
		this.health = 200;
		numOfSamurai++;
	}
	
	public void deathBlow(Human human) {
		human.health = 0;
		this.health /= 2;
	}
	
	public void meditate() {
		this.health += this.health/2;
	}
	
	public static int howMany() {
		return numOfSamurai;
	}
}
