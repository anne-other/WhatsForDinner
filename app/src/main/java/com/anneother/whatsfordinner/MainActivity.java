package com.anneother.whatsfordinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGoToIngredients(View ingredientView) {
        Intent ingredientIntent = new Intent(this, IngredientsActivity.class);
        startActivity(ingredientIntent);
    }

    public void onGoToRecipes(View recipeView) {

    }
}
