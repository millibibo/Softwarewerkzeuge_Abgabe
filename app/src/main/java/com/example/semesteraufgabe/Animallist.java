package com.example.semesteraufgabe;

import java.util.ArrayList;

/**
 * Programmierung 4
 * SS21
 * @author Philine Hörnemann (m28064)
 */

public class Animallist {

    //Attribut
    public ArrayList<Animal> liste = new ArrayList<>();

    //Konstruktor
    public Animallist() {
    }

    /**
     * Liste mit allen Tieren wird erstellt
     * @return Liste mit allen Tieren
     */
    public ArrayList getDummyDatas() {
        liste.add( new Animal(0, "Blackbird", "black", "Germany", 1, "")  );
        liste.add( new Animal(1, "Mouse", "grey", "Germany",1, "")  );
        liste.add( new Animal(2, "Ant", "black", "Germany",1, "")  );
        liste.add( new Animal(3, "Cat", "Mix", "Germany",2, "")  );
        liste.add( new Animal(4, "Fox", "brown", "Germany",2, "")  );
        liste.add( new Animal(5, "Dog", "brown & black", "Germany",2, "")  );
        liste.add( new Animal(6,"Hirsch", "brown", "Germany",3, "")  );
        liste.add( new Animal(7,"Deer", "brown", "Germany",3,"")  );
        liste.add( new Animal(8,"Boar", "brown", "Germany",3, "")  );

        liste.add( new Animal(10,"Pika", "brown", "USA",1, "")  );
        liste.add( new Animal(11,"Chipmunk", "brown", "USA",1, "")  );
        liste.add( new Animal(12,"Green Frog", "green", "USA",1, "")  );
        liste.add( new Animal(13,"Eagle", "black & white", "USA",2, "")  );
        liste.add( new Animal(14,"Antelope", "brown", "USA",2, "")  );
        liste.add( new Animal(15,"Beaver", "brown", "USA",2, "")  );
        liste.add( new Animal(16,"Cougar", "brown", "USA",3, "")  );
        liste.add( new Animal(17,"Bison", "brown", "USA",3, "")  );
        liste.add( new Animal(18,"Elephant Seal", "grey", "USA",3, "")  );

        liste.add( new Animal(20,"Hare", "brown", "Canada",1, "")  );
        liste.add( new Animal(21,"Mole", "brown", "Canada",1, "")  );
        liste.add( new Animal(22,"Rainbow Trout", "grey & pink", "Canada",1, "")  );
        liste.add( new Animal(23,"Pronghorn", "brown", "Canada",2, "")  );
        liste.add( new Animal(24,"Prairie Rattlesnake", "brown", "Canada",2, "")  );
        liste.add( new Animal(25,"Snowy Owl", "white", "Canada",2, "")  );
        liste.add( new Animal(26,"Moose", "brown", "Canada",3, "")  );
        liste.add( new Animal(27,"Bighorn Sheep", "white", "Canada",3, "")  );
        liste.add( new Animal(28,"Canadian Horse", "brown", "Canada",3, "")  );

        liste.add( new Animal(30,"Magpie", "black & white", "Australia",1, "")  );
        liste.add( new Animal(31,"Redback", "black", "Australia",1, "")  );
        liste.add( new Animal(32,"Bluebottle", "blue", "Australia",1, "")  );
        liste.add( new Animal(33,"Kangaroo", "brown", "Australia",2, "")  );
        liste.add( new Animal(34,"Koala", "grey", "Australia",2, "")  );
        liste.add( new Animal(35,"Wombat", "brown", "Australia",2, "")  );
        liste.add( new Animal(36,"Crocodile", "green-grey", "Australia",3, "")  );
        liste.add( new Animal(37,"Whale Shark", "black", "Australia",3, "")  );
        liste.add( new Animal(38,"Humpback Whale", "black", "Australia",3, "")  );

        return liste;
    }
}
