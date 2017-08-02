package com.codingdojo.pokemon;

public interface PokemonManager {
	public Pokemon createPokemon(String name, String type, int health);
	public void attackPokemon(Pokemon pokemon);
	public void pokemonInfo(Pokemon pokemon);
}
