package tama;

public class Animal {
    private String nom;
    private AnimalType type;
    private int faim;
    private int fatigue;
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

    public void getNom(){
        return this.nom;
    }
    public void getType(){
        return this.type;
    }
    public void getSanity(){
        returnthis.sanity;
    }
    public void getFaim(){
        return this.faim;
    }
    public void getEnergie(){
        return this.energie;
    }
    public void getBonheur(){
        return this.bonheur;
    }
    public void getAge(){
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




}
