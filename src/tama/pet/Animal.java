package tama.pet;

import java.util.concurrent.ThreadLocalRandom;

public class Animal {
    private String nom;
    private AnimalType type;
    private int faim;
    private int sanity;
    private int energie;
    private int bonheur;
    private int age;

    // On commence stats a fond
    public Animal(AnimalType type, String nom) {
        this.nom = nom;
        this.type = type;
        this.sanity = 100;
        this.faim = 10;
        this.energie = 10;
        this.bonheur = 10;
        this.age = 0;

    }

    public String getNom(){
        return this.nom;
    }
    public AnimalType getType(){
        return this.type;
    }
    public int getSanity(){
        return this.sanity;
    }
    public int getFaim(){
        return this.faim;
    }
    public int getEnergie(){
        return this.energie;
    }
    public int getBonheur(){
        return this.bonheur;
    }
    public int getAge(){
        return this.age;
    }
    public void setNom(String newName){
        this.nom = newName;
    }
    public void setSanity(int newValue){
        this.sanity = newValue;
    }
    public void setFaim(int newValue){
        this.faim = newValue;
    }
    public void setEnergie(int newValue){
        this.energie = newValue;
    }
    public void setBonheur(int newValue){
        this.bonheur = newValue;
    }
    public void setAge(int newValue){
        this.age = newValue;
    }

    public String toString(){
        return this.getType() +""+ this.getNom() +""+this.getSanity()+""+this.getFaim()+""+this.getEnergie()+""+this.getBonheur()+" "+this.getAge();
    }
    public int rand(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}

