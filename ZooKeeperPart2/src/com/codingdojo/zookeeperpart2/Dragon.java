package com.codingdojo.zookeeperpart2;

public class Dragon extends Mammal {
	public Dragon() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("vrooooom");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("*crunch*");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("BURRRRNNN");
		this.energyLevel -= 100;
	}
}
