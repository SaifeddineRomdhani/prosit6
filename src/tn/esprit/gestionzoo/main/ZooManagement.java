package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        //Aquatic aquatic = new Aquatic();
        //Terrestrial terrestrial = new Terrestrial();
        //Dolphin dolphin = new Dolphin();
        //Penguin penguin = new Penguin();

        //
        //Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        //Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        //Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        //System.out.println(aquatic.toString());
        System.out.println(terrestrial.toString());
        //System.out.println(dolphin.toString());
        //System.out.println(penguin.toString());
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        //aquatic.swim();
        //dolphin.swim();
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Dolphin dolphin1 = new Dolphin("Delphinidae2", "Flipper", 10, true, "Ocean", 18.5f);
        Dolphin dolphin2 = new Dolphin("Delphinidae3", "Flipper", 9, true, "Ocean", 15.5f);
        Dolphin dolphin3 = new Dolphin("Delphinidae4", "Flipper", 8, true, "Ocean", 14.6f);
        Dolphin dolphin4 = new Dolphin("Delphinidae5", "Flipper", 7, true, "Ocean", 19.5f);
        Dolphin dolphin5 = new Dolphin("Delphinidae6", "Flipper", 6, true, "Ocean", 12.5f);
        Penguin penguin = new Penguin("Spheniscidae1", "Skipper", 3, true, "Ocean", 25.3f);
        Penguin penguin1 = new Penguin("Spheniscidae2", "Skipper", 4, true, "Ocean", 26.3f);
        Penguin penguin2 = new Penguin("Spheniscidae3", "Skipper", 8, true, "Ocean", 27.3f);
        Penguin penguin3 = new Penguin("Spheniscidae4", "Skipper", 6, true, "Ocean", 28.3f);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(dolphin3);
        myZoo.addAquaticAnimal(dolphin4);
        myZoo.addAquaticAnimal(dolphin5);
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(penguin3);
        
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        for (Aquatic a: myZoo.getAquaticAnimals()) {
            if (a!= null)
                a.swim();
        }

        // l'affichage de Instruction 29 prosit 6
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale de nage des pingouins dans le zoo est : " + maxDepth + " mètres.");

        // l'affichage de Instruction 30 prosit 6
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        myZoo.displayNumberOfAquaticsByType();

        // l'affichage de Instruction 31 prosit 6
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        Dolphin dolphinNB1 = new Dolphin("Delphinidae", "Animal1", 5, true, "Ocean", 14.5f);
        Dolphin dolphinNB2 = new Dolphin("Family2", "Animal2", 5, true, "River", 14.5f);
        Dolphin dolphinNB3 = new Dolphin("Family3", "Animal1", 5, true, "Ocean", 14.5f);

        System.out.println("Comparaison entre animal1 et animal2 : " + dolphinNB1.equals(dolphinNB2));
        System.out.println("Comparaison entre animal1 et animal3 : " + dolphinNB1.equals(dolphinNB3));


    }

}
