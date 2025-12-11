package ru.myitschool.mte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ru.myitschool.mte.databinding.ActivityMainBinding;
import ru.myitschool.mte.databinding.ContentMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.content.btnGo.setOnClickListener(v -> {
                    String email = binding.content.etEmail.getText().toString();
                    Intent j;
                    j = new Intent(MainActivity.this, InfoActivity.class);
                    j.putExtra(getString(R.string.email), email);
                    startActivity(j);
                }
        );


    }
}
