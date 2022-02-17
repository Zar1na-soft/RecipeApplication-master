package com.example.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    private TextView mRecipeName;
    private TextView mRecipeMethodTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipeName = (TextView)findViewById(R.id.text_recipe);
        mRecipeMethodTitle = (TextView)findViewById(R.id.method);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("RecipeName");
        String MethodTitle = intent.getExtras().getString("RecipeMethodTitle");


        mRecipeName.setText(Title);
        mRecipeMethodTitle.setText(MethodTitle);

    }
}
