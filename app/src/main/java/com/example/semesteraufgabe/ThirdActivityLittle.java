package com.example.semesteraufgabe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.semesteraufgabe.ui.main.BigFragment;
import com.example.semesteraufgabe.ui.main.LittleFragment;
import com.example.semesteraufgabe.ui.main.MiddleFragment;

import java.util.List;

public class ThirdActivityLittle extends AppCompatActivity {

    private ImageView image = null;
    private TextView name = null;
    private TextView colour = null;
    private TextView country = null;
    private TextView info = null;

    /**
     * Activity_ThirdLittle wird erstellt
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_little);

        image = findViewById(R.id.image);
        name = findViewById(R.id.tvName);
        colour = findViewById(R.id.tvColour);
        country = findViewById(R.id.tvCountry);
        info = findViewById(R.id.tvInfo);

        String animalLittleName = LittleFragment.getAnimalLittle(); //ausgewähltes Tier aus LittleFragment

        Animallist animalList = new Animallist();
        List<Animal> animalListWhole = animalList.getDummyDatas();

        //Daten für das ausgewählte Tier
        for (Animal a : animalListWhole) {
            if (animalLittleName == a.name) {
                System.out.println(a.name);
                name.setText(a.name);
                image.setImageResource(a.getIdForDrawable());
                colour.setText(a.colour);
                country.setText(a.country);
                info.setText(a.info);
            }
        }

    }
}