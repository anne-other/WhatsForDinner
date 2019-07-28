package com.anneother.whatsfordinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
    }

    public void onGoHome (View homeView){
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
    }
}
