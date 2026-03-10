package tama;

import tama.pet.Frog;
import tama.food.GummieType;
import tama.win.Window;

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

        Window win = new Window("test");



        Runnable task = new Runnable() {
            public void run() {
                while(true){
                    System.out.println(win.getSize());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e){
                        return;
                    }
                }
            }
        };
        Thread thread = new Thread(task);
            thread.start();
    }
}

