package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Tips to quickly calmdown","1)Take deep breaths\n" +"\n"+
                "Start with this strategy, called the 4-7-8 breath, developed by Dr. Andrew Weil Exhale completely through your mouth, making a whoosh sound.\n" +
                "\n" +
                "• Close your mouth and inhale quietly through your nose to a mental count of four.\n" +
                "\n" +
                "• Hold your breath for a count of seven.\n" +
                "\n" +
                "• Exhale completely through your mouth, making a whoosh sound to a count of eight.\n" +
                "\n" +
                "• This is one breath. Now inhale again and repeat the cycle three more times for a total of four breaths.\n" +"\n"+
                "2)Count backward\n"+"\n"+"Start counting backward from 100 by 3s",
                R.color.first));
        recipes1.add(new Recipes("How To Feel Better After A Panic Attack","• Be Really Nice To Yourself.\n"+"\n" +
                "Above everything else, be really nice to yourself after a panic attack. Those things are mighty draining, and scary, and uncomfortable, so the least you can do is treat yourself well afterward. Take a bath, curl up with some snacks, watch your favorite movie — anything that will make you feel comfy and relaxed.\n" +
                "\n" +
                "• Have a snack\n" +
                "\n"+"A panic attack is a profoundly draining experience, so it's especially important not to neglect those basic needs such as, you know, eating. You might be craving something with sugar — and you should feel free to go for it — but we'd suggest opting for something more satisfying and nutrient-rich to help regain your energy. Try one of these snacks that are guaranteed not to mess with your ability to fall asleep.",R.color.second));
        recipes1.add(new Recipes("Panick Attack Prevention: Tips To Prevent An Attack","• Nutrition\n" +
                "\n"+"Day-to-day life can bring stresses large and small. Taking them in stride begins with taking care of yourself.\n" +
                "\n" +
                "• Eat right. Try for a balanced diet. Stay away from foods that don’t agree with you, because the reactions can cause anxiety.\n" +
                "\n" +
                "• Avoid smoking and caffeine. They can ratchet up anxiety.\n" +
                "\n" +
                "• Don’t drink alcohol or use illegal drugs. They may seem to calm you down. But they can throw off your emotional balance, interfere with your sleep, and conflict with medications.\n" +
                "\n" +
                "• Your Mind-Set",R.color.third));
        recipes1.add(new Recipes("Help people around you","JDJC",R.color.fourth));
        recipes1.add(new Recipes("About projectv","JDJC",R.color.fifth));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
