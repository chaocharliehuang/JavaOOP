package com.codingdojo.zookeeperpart2;

public class Mammal {
	protected int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
