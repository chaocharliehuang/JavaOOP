package com.codingdojo.zookeeperpart1;

public class Gorilla extends Mammal {
	public void throwThings() {
		System.out.println("Gorilla thew something");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("Gorilla ate bananas");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("Gorilla climbed a tree");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
}
