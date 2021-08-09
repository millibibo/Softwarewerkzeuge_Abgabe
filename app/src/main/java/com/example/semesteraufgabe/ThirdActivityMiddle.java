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

import com.example.semesteraufgabe.ui.main.LittleFragment;
import com.example.semesteraufgabe.ui.main.MiddleFragment;

import java.util.List;

public class ThirdActivityMiddle extends AppCompatActivity {

    //Attribute
    private ImageView image = null;
    private TextView name = null;
    private TextView colour = null;
    private TextView country = null;
    private TextView info = null;

    /**
     * Activity_ThirdMiddle wird erstellt
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_middle);

        image = findViewById(R.id.image);
        name = findViewById(R.id.tvName);
        colour = findViewById(R.id.tvColour);
        country = findViewById(R.id.tvCountry);
        info = findViewById(R.id.tvInfo);

        String animalMiddleName = MiddleFragment.getAnimalMiddle(); //ausgewähltes Tier aus MiddleFragment

        Animallist animalList = new Animallist();
        List<Animal> animalListWhole = animalList.getDummyDatas();

        //Daten für das ausgewählte Tier
        for (Animal a : animalListWhole) {
            if (animalMiddleName == a.name) {
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