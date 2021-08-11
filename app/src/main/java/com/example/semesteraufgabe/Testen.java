package com.example.semesteraufgabe;

import com.example.semesteraufgabe.ui.main.LittleFragment;

import java.util.ArrayList;
import java.util.List;

public class Testen {

    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_little, R.string.tab_middle, R.string.tab_big
    };

    public static int count() {
        return  TAB_TITLES.length;
    }

    public static List<String> country() {
        ArrayList list = new ArrayList();
        list.add("Germany");
        list.add("USA");
        list.add("Canada");
        list.add("Australia");
        return list ;
    }

    public enum Land {

        GERMANY(1), USA(2), CANADA(3), AUSTRALIA(4);
        private int number;

        private Land(int num) {
            number = num;
        }
        public int getLand() {
            return number;
        }
    }

    String name = "";
    String colour = "";
    String country = "";

    public String animal (String animalLi) {

        String animalLittleName = animalLi;

        Animallist animalList = new Animallist();
        List<Animal> animalListWhole = animalList.getDummyDatas();

        //Daten für das ausgewählte Tier
        for (Animal a : animalListWhole) {
            if (animalLittleName == a.name) {
                System.out.println(a.name);
                name = a.name;
                colour = a.colour;
                country = a.country;
            }
        }
        return (name + ", " + colour + ", " + country);
    }
}
