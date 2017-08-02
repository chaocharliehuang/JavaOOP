package com.codingdojo.pokemon;

public class Pokedex extends PokemonAbstract {
	
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println("Pokemon name: " + pokemon.getName());
		System.out.println("Pokemon type: " + pokemon.getType());
		System.out.println("Pokemon health: " + pokemon.getHealth());
	}
}
