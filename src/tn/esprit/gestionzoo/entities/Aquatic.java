package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal{
     private String habitat ;

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public Aquatic(){

    }
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat = habitat;
    }

    // Compte rendu Instruction 31 prosit 6
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic other = (Aquatic) obj;

        return getName().equals(other.getName()) && getAge() == other.getAge() && habitat.equals(other.habitat);
    }
    
    public abstract void swim();
    @Override
    public String toString() {
        return super.toString() + "habitat : " +habitat;
    }
}
