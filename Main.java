import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int A=1;
        // On crée l'objet Animal (VS Code fera le lien tout seul)
        Animal monChat = new Animal(" ");
        // La boucle du jeu
        System.out.println("Bienvenue dans le Tamagotchi !");
        Thread.sleep(1000);
        System.out.println("Les regles sont simples, le tamagotchi a pour objectif de gerer un animal.");
        Thread.sleep(2000);
        System.out.println("Pour gerer l'animal il y a plusieurs façon de faire et plusieurs choses a gerer !");
        System.out.println("1er choses a faire il faut gerer sa faim le tamagotchie a faim il faut le nourir");
        Thread.sleep(3000);
        System.out.println("2nd choses a faire il faut gerer son ennuis il faut donc l'occuper");
        Thread.sleep(2000);
        System.out.println("3rd chose a faire c'est gerergerer son bonheur il faut qu'il soit heureux");
        Thread.sleep(2000);
        System.out.println("A savoir : Au debut vous commençez avec chaque stat a fond le bonheur la faim et l'energie est AU MAX");
        Thread.sleep(2000);
        System.out.println("Pour commencer donnez le nom de votre animal :");
        String nomSaisi = sc.nextLine(); 
        monChat.setNom(nomSaisi);
        System.out.println("Félicitations, votre animal s'appelle maintenant : " + monChat.getNom());
        Timer timer = new Timer();

timer.schedule(new TimerTask() {
    @Override
    public void run() {
        monChat.PerdreFaim();
        monChat.PerdreEnergie();
        monChat.PerdreBonheur();
    }
    }, 0, 10000); // toutes les 10 secondes
        do {
            if(!monChat.estVivant()){
                System.out.println("Votre animal est mort...");
                timer.cancel();
            break;
            }
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("Que voulez vous faire ?");
            // Menu
            System.out.println("Option:");
            System.out.println("1.Nourir");
            System.out.println("2.Jouer un peu");
            System.out.println("3.Jouer beaucoup");
            System.out.println("4.Laisser dormir");
            System.out.println("5.Gratouille");
            System.out.println("6.Données");
            System.out.println("0.Quitter");
            System.out.println("Le temps passe... Les stats diminuent !");
            System.out.println("----------------------------------------------------------------------------------------------------------");
            A = sc.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------");
            switch(A) {
                        case 0:
                            System.out.println("Etes vous sur de vouloir quitté ? La partie ne sera pas sauvegarder");
                            System.out.println("Quitter: 0");
                            System.out.println("Rester: 1");
                            A = sc.nextInt();
                            if(A==0){
                                timer.cancel();
                                System.out.println("Au revoir !");
                                System.exit(0);
                            }
                            if(A==1){
                                System.out.println("Bien continuons !");
                            }
                            break;
                            case 1:
                                monChat.GagnerFaim(); 
                            break;
                            case 2:
                                monChat.GagnerPeuBonheur();
                            break;
                            case 3:
                                monChat.GagnerBcpBonheur();
                            break;
                            case 4:
                                monChat.GagnerEnergie();
                            break;
                            case 5:
                                monChat.GagnerPeuBonheur();
                            break;
                            case 6:
                                monChat.Data();
                            break;
                    }
        } while (A!=0);
    }
}