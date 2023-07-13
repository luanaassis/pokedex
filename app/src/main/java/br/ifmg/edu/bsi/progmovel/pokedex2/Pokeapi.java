package br.ifmg.edu.bsi.progmovel.pokedex2;

import br.ifmg.edu.bsi.progmovel.pokedex2.Evolution.PokemonEvolution;
import br.ifmg.edu.bsi.progmovel.pokedex2.Pokemon.Pokemon;
import br.ifmg.edu.bsi.progmovel.pokedex2.Specie.PokemonSpecies;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Pokeapi {

    @GET("pokemon/{nome}")
    Call<Pokemon> buscaNome(@Path("nome") String nomePokemon);
    @GET("pokemon-species/{id}")
    Call<PokemonSpecies> buscaEspecie(@Path("id") int id_especie);
    @GET("evolution-chain/{id}")
    Call<PokemonEvolution> buscaEvolucao(@Path("id") int id_evolucao);
}
