package com.example.semesteraufgabe;

/**
 * Programmierung 4
 * SS21
 * @author Philine Hörnemann (m28064)
 */
import android.util.Log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Animal implements Serializable, Comparable<Animal>{

    //Attribute
    public int id = 0;
    public String name = "";
    public String colour = "";
    public String country = "";
    public int size = 0;
    public String info = "";

    /**
     * Kontruktor
     * @param id
     * @param name
     * @param colour
     * @param country
     * @param size
     * @param info
     */
    public Animal(int id, String name, String colour, String country, int size, String info) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.country = country;
        this.size = size;
        this.info = info;

        Log.i(MainActivity.TAG, "im Konstruktor Animal");
    }

    /**
     * Bilder für die Tiere
     * @return Bild
     */
    public int getIdForDrawable() {
        switch (id) {
            case 0: return R.drawable.blackbird;
            case 1: return R.drawable.mouse;
            case 2: return R.drawable.ant;
            case 3: return R.drawable.cat;
            case 4: return R.drawable.fox;
            case 5: return R.drawable.dog;
            case 6: return R.drawable.hirsch;
            case 7: return R.drawable.deer;
            case 8: return R.drawable.boar;

            case 10: return R.drawable.pika;
            case 11: return R.drawable.chipmunk;
            case 12: return R.drawable.greenfrog;
            case 13: return R.drawable.eagle;
            case 14: return R.drawable.antelope;
            case 15: return R.drawable.beaver;
            case 16: return R.drawable.cougar;
            case 17: return R.drawable.bison;
            case 18: return R.drawable.elephantseal;

            case 20: return R.drawable.hare;
            case 21: return R.drawable.mole;
            case 22: return R.drawable.rainbowtrout;
            case 23: return R.drawable.pronghorn;
            case 24: return R.drawable.prairierattlesnake;
            case 25: return R.drawable.snowyowl;
            case 26: return R.drawable.moose;
            case 27: return R.drawable.bighornsheep;
            case 28: return R.drawable.canadianhorse;

            case 30: return R.drawable.magpie;
            case 31: return R.drawable.redback;
            case 32: return R.drawable.bluebottle;
            case 33: return R.drawable.kangaroo;
            case 34: return R.drawable.koala;
            case 35: return R.drawable.wombat;
            case 36: return R.drawable.crocodile;
            case 37: return R.drawable.whaleshark;
            case 38: return R.drawable.humpbackwhale;

            default:
                return R.drawable.empty;
        }
    }  // getIdForDrawable

    /**
     * Vergleich von Ländern der Tiere
     * @param animal
     * @return
     */
    @Override
    public int compareTo(Animal animal) {
        // -1   this<student   0: this==student   +1 : this>student
        int sort = country.compareTo(animal.country);
        return sort;
    }
}
