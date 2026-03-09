package tama;

import tama.pet.Frog;
import tama.food.GummieType;

public class Main {
    public static void main(String[] args) {
        Frog maGrenouille = new Frog("Kermit");

        System.out.println("--- État initial ---");
        System.out.println(maGrenouille);

        GummieType bonbon = GummieType.GROUGE;
        System.out.println("\nOn donne un " + bonbon.getType() + " à " + maGrenouille.getNom());


        maGrenouille.setFaim(maGrenouille.getFaim() + bonbon.getBonus().faim());
        maGrenouille.setSanity(maGrenouille.getSanity() + bonbon.getBonus().sanity());

        System.out.println("\n--- État après le Gummy ---");
        System.out.println(maGrenouille);

        maGrenouille.mangerMouche();
    }
}
