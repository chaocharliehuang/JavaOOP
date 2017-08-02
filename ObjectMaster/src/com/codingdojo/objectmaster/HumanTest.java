package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human human1 = new Human();
		Human human2 = new Human();
		human1.attack(human2);
		System.out.println(human1.health);
		System.out.println(human2.health);
		
		System.out.println("--------------------");
		
		Wizard wizard1 = new Wizard();
		wizard1.heal(human2);
		System.out.println(human2.health);
		wizard1.fireball(human1);
		System.out.println(human1.health);
		
		System.out.println("--------------------");
		
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		samurai1.deathBlow(human1);
		System.out.println(human1.health);
		System.out.println(samurai1.health);
		samurai1.meditate();
		System.out.println(samurai1.health);
		System.out.println(Samurai.howMany());
		
		System.out.println("--------------------");
		
		Ninja ninja1 = new Ninja();
		ninja1.steal(human2);
		System.out.println(human2.health);
		System.out.println(ninja1.health);
		ninja1.runAway();
		System.out.println(ninja1.health);
	}

}
