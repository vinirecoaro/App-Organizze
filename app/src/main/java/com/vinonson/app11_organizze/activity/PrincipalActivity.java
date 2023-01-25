package com.vinonson.app11_organizze.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.vinonson.app11_organizze.databinding.ActivityPrincipalBinding;

public class PrincipalActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityPrincipalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void adicionarReceita(View view){

    }

    public void adicionarDespesa(View view){

    }

}