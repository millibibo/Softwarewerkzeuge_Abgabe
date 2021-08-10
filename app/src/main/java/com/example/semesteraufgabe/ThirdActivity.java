package com.example.semesteraufgabe;

/**
 * Programmierung 4
 * SS21
 * @author Philine Hörnemann (m28064)
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.semesteraufgabe.ui.main.BigFragment;
import com.example.semesteraufgabe.ui.main.LittleFragment;
import com.example.semesteraufgabe.ui.main.MiddleFragment;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {


    //Attribute
    private ImageView image = null;
    private TextView name = null;
    private TextView colour = null;
    private TextView country = null;
    private TextView info = null;

    /**
     * Activity_Third (Big) wird erstellt
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        image = findViewById(R.id.image);
        name = findViewById(R.id.tvName);
        colour = findViewById(R.id.tvColour);
        country = findViewById(R.id.tvCountry);
        info = findViewById(R.id.tvInfo);

        String animalBigName = BigFragment.getAnimalBig(); //ausgewähltes Tier aus BigFragment

        Animallist animalList = new Animallist();
        List<Animal> animalListWhole = animalList.getDummyDatas();

        //Daten für das ausgewählte Tier
        for (Animal a : animalListWhole) {
            if (animalBigName == a.name) {
                name.setText(a.name);
                image.setImageResource(a.getIdForDrawable());
                colour.setText(a.colour);
                country.setText(a.country);
                info.setText(a.info);
            }
        }

    }

}

