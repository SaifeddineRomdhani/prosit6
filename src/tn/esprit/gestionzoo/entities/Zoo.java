package tn.esprit.gestionzoo.entities;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    private int numAquaticAnimals=0 ;

    public Aquatic[] getAquaticAnimals(){
        return aquaticAnimals;
    }
    public void setAquaticAnimals(Aquatic[] aquaticAnimals){
        this.aquaticAnimals =aquaticAnimals;
    }

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals = new Aquatic[10]; 
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (numAquaticAnimals < 10) {
            aquaticAnimals[numAquaticAnimals] = aquatic;
            numAquaticAnimals++;
            System.out.println(aquatic.getName() + " a été ajouté aux animaux aquatiques du zoo.");
        } else {
            System.out.println("Le zoo est plein pour les animaux aquatiques.");
        }
    }

    // Compte rendu Instruction 29 prosit 6
    public float maxPenguinSwimmingDepth() {

        float maxDepth = -1.0f; //Initialiser à une valeur négative

        for (int i = 0; i < numAquaticAnimals; i++) {
            Aquatic aquatic = aquaticAnimals[i];
            if (aquatic instanceof Penguin) {
                float depth = ((Penguin) aquatic).getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }

        return maxDepth;
    }
    // Compte rendu Instruction 30 prosit 6
    public void displayNumberOfAquaticsByType() {
        int numberOfDolphins = 0;
        int numberOfPenguins = 0;

        for (int i = 0; i < numAquaticAnimals; i++) {
            Aquatic animal = aquaticAnimals[i];
            if (animal instanceof Dolphin) {
                numberOfDolphins++;
            } else if (animal instanceof Penguin) {
                numberOfPenguins++;
            }
        }

        System.out.println("Nombre de dauphins dans le zoo : " + numberOfDolphins);
        System.out.println("Nombre de pingouins dans le zoo : " + numberOfPenguins);
    }




    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}
