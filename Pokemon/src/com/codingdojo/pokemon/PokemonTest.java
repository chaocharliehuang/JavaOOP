package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("Pikachu", "Electric", 100);
		Pokemon charmander = new Pokemon("Charmander", "Fire", 120);
		Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 120);
		
		Pokedex pokedex = new Pokedex();
		Pokemon squirtle = pokedex.createPokemon("Squirtle", "Water", 120);
		pokedex.pokemonInfo(charmander);
		pokedex.attackPokemon(charmander);
		pokedex.pokemonInfo(charmander);
	}

}
