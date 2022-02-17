package com.example.recipe;

public class Recipes {

    private String RecipeName;
    private String RecipeMethodTitle;
    private int Thumbnail;


    public Recipes(String name,String recipeMethodTitle,int thumbnail){

        RecipeName = name;
        RecipeMethodTitle = recipeMethodTitle;
        Thumbnail = thumbnail;

    }


    public  String getRecipeName(){

        return RecipeName;
    }

    public String getRecipeMethodTitle(){
        return RecipeMethodTitle;
    }


    public int getThumbnail(){
        return Thumbnail;
    }
}
