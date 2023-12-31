package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public float getSwimmingDepth(){
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;
    }
    public Penguin(){

    }
    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }

    public void swim(){
        System.out.println("This Penguin animal is swimming.");
    }

    public String toString(){
        return super.toString()+"swimmingDepth : "+swimmingDepth;
    }
}
