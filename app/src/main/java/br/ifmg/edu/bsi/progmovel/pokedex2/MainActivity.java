package br.ifmg.edu.bsi.progmovel.pokedex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import br.ifmg.edu.bsi.progmovel.pokedex2.Evolution.Evolution;
import br.ifmg.edu.bsi.progmovel.pokedex2.Evolution.PokemonEvolution;
import br.ifmg.edu.bsi.progmovel.pokedex2.Pokemon.Pokemon;
import br.ifmg.edu.bsi.progmovel.pokedex2.Specie.PokemonSpecies;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PokedexApplication app = (PokedexApplication) getApplication();
        app.executor.execute(() -> {
            try {
                Pokemon pokemon = app.getPokemonRepo().buscaNome("charmander");
                String[] urlPokemon = pokemon.species.url.split("/");
                int idEspecie = Integer.parseInt(urlPokemon[urlPokemon.length - 1]);
                Log.d("Especie", String.valueOf(idEspecie));
                PokemonSpecies especiePokemon = app.getPokemonRepo().buscaEspecie(idEspecie);
                String[] urlEspecie = especiePokemon.evolutionChain.url.split("/");
                int idEvolucao = Integer.parseInt(urlEspecie[urlEspecie.length - 1]);
                Log.d("Evolucao", String.valueOf(idEvolucao));
                PokemonEvolution evolucaoPokemon = app.getPokemonRepo().buscaEvolucao(idEvolucao);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}