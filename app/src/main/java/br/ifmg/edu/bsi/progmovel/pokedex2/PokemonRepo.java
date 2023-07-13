package br.ifmg.edu.bsi.progmovel.pokedex2;

import java.io.IOException;

import br.ifmg.edu.bsi.progmovel.pokedex2.Evolution.PokemonEvolution;
import br.ifmg.edu.bsi.progmovel.pokedex2.Pokemon.Pokemon;
import br.ifmg.edu.bsi.progmovel.pokedex2.Specie.PokemonSpecies;

public class PokemonRepo {
    private Pokeapi api;

    public PokemonRepo(Pokeapi api) {
        this.api = api;
    }

    public Pokemon buscaNome(String nomePokemon) throws IOException {
        return api.buscaNome(nomePokemon).execute().body();
    }
    public PokemonSpecies buscaEspecie(int id_especie) throws IOException {
        return api.buscaEspecie(id_especie).execute().body();
    }

    public PokemonEvolution buscaEvolucao(int id_evolucao) throws IOException {
        return api.buscaEvolucao(id_evolucao).execute().body();
    }
}
