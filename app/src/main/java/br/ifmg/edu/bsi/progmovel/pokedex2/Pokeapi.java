package br.ifmg.edu.bsi.progmovel.pokedex2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Pokeapi {

    @GET("pokemon/{nome}")
    Call<Pokemon> buscaNome(@Path("nome") String nomePokemon);
    @GET("pokemon/{id}")
    Call<PokemonSpecies> buscaNome(@Path("nome") String nomePokemon);

}
