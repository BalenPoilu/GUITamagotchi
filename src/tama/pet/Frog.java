package tama.pet;

public class Frog extends Animal{

    public Frog(String nom){
        super(AnimalType.FROG, nom);
    }

    public void mangerMouche(){
        if(this.getFaim() < 8){
            this.setFaim(this.getFaim() + 2);
            this.setBonheur(this.getBonheur() + this.rand(1,3));
            System.out.println(this.getNom() +"manger mouche"+this.getFaim() +' '+getBonheur());
        } else System.out.println(this.getNom() +"rate mouche"+this.getFaim() +' '+getBonheur());

    }

    public boolean aPeur(String raison, int n){
        int d = this.rand(1, 10);
        if(d < n){
            System.out.println(this.getNom() +" tremble de peur !!!");
            this.setSanity(this.getSanity() - this.rand(1, 20));
            return true;
        } else {
            System.out.println(this.getNom() +" ne tremblera jamais devant "+raison+'!');
            return false;
        }
    }

}
