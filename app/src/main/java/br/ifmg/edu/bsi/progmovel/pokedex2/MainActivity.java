package br.ifmg.edu.bsi.progmovel.pokedex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PokedexApplication app = (PokedexApplication) getApplication();
        app.executor.execute(() -> {
            try {
                Pokemon p = app.getPokemonRepo().buscaNome("charmander");
                Log.d("POKEDEX", p.name);
                Log.d("POKEDEX", ""+p.height);
                Log.d("POKEDEX", ""+p.weight);
                Log.d("POKEDEX", p.sprites.other.official_artwork.front_default);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }
}