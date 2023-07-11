package br.ifmg.edu.bsi.progmovel.pokedex2;

import java.io.IOException;

public class PokemonRepo {
    private Pokeapi api;

    public PokemonRepo(Pokeapi api) {
        this.api = api;
    }

    public Pokemon buscaNome(String nomePokemon) throws IOException {
        return api.buscaNome(nomePokemon).execute().body();
    }
}
