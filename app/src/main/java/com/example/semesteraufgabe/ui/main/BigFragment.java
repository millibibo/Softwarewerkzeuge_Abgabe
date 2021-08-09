package com.example.semesteraufgabe.ui.main;

/**
 * Programmierung 4
 * SS21
 * @author Philine Hörnemann (m28064)
 */

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.semesteraufgabe.Animal;
import com.example.semesteraufgabe.Animallist;
import com.example.semesteraufgabe.MainActivity;
import com.example.semesteraufgabe.R;
import com.example.semesteraufgabe.ThirdActivity;

import java.util.ArrayList;
import java.util.List;

public class BigFragment extends Fragment {

    //Attribute
    private TextView countryBig = null;
    private static Spinner spinnerBig = null;

    public BigFragment() {
        // Required empty public constructor
    }

    /**
     * Verbindung zur TabbedActivity
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * BigFragment wird erstellt
     * @param savedInstanceState
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_big, container, false);

        countryBig = view.findViewById(R.id.tvCountryBig);
        String country = MainActivity.getCountry();//ausgewähltes Land aus der MainActivity
        countryBig.setText(country);

        spinnerBig = view.findViewById(R.id.spBig);
        List<String> animalListBig = new ArrayList<String>();
        Animallist animalList =  new Animallist();
        List<Animal> animalListWhole = animalList.getDummyDatas();
        for (Animal a : animalListWhole) {
            if(country.compareTo(a.country)==0 && a.size==3) {
                animalListBig.add(a.name);
            }
        }

        //Spinner (Dropdown-Menu) mit entsprechenden Tiernamen
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, animalListBig);
        spinnerBig.setAdapter(dataAdapter);

        return view;
    }

    /**
     * onClick Methode vom Button des BigFragments
     * @param view
     */
    public void bn_GoToThirdBig(View view) {
        System.out.println("Tabbed");
        Intent intent = new Intent(this.getActivity(), ThirdActivity.class);
        int sendenr=1;
        startActivityForResult(intent, sendenr); //es fehlt die Rückgabe
    }

    /**
     * gibt das ausgewählte Tier als String zurück
     * @return ausgewähltes Tier als String
     */
    public static String getAnimalBig() {
        String sName = (String) spinnerBig.getSelectedItem();
        return sName;
    }


}