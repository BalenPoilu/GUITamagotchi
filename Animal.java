public class Animal { 
    private String nom;
    private int faim;
    private int energie;
    private int bonheur;

    public void PerdreFaim() {
        this.faim--;
    }

    public void GagnerFaim() {
        if(this.faim<10){
            this.faim++;    
            System.out.println(getNom()+"A bien mangé !");
        }
        if(this.faim>=10){
            System.out.println(getNom()+"N'a plus faim du tout !");
        }
    }

    public int getFaim() {
        return this.faim;
    }

    public void GagnerEnergie() {
        if(this.energie<10){
            this.energie++;    
            System.out.println(getNom()+"A bien mangé(e) !");
        }
        if(this.energie>=10){
            System.out.println(getNom()+"est deja reposé(e)");
        }
        this.energie++;
    }

    public void PerdreEnergie() {
        this.energie--;
    }

    public int getEnergie(){
        return this.energie;
    }

    public int getBonheur(){
        return this.bonheur;
    }
    public void PerdreBonheur() {
        this.bonheur--;
    }

    public void GagnerPeuBonheur() {
        this.bonheur++;
        this.bonheur++;
        this.energie--;
    }

    public void Data() throws InterruptedException{
        System.out.println(getNom()+""+"Est a"+" "+getEnergie()+"/10 D'energie");
        System.out.println(getNom()+""+"Est a"+" "+getFaim()+"/10 De faim");
        System.out.println(getNom()+""+"Est a"+" "+getBonheur()+"/10 De Bonheur");
        Thread.sleep(3000);

    }

    public void GagnerBcpBonheur() {
        if(this.bonheur<10){
        for (int i = 0; i < 2; i++) {
            this.energie--;
            for (int j = 0; j < 2; j++) {
                this.bonheur++;
            }
        }
        }
        if(this.energie>=10){
            System.out.println(getNom()+"est deja tres heureux !");
        }
    }

    // Permet d'avoir le nom
    public String getNom(){
        return this.nom;
    }

    // set le nom de l'animal
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    public boolean estVivant() {
        return faim > 0 && energie > 0 && bonheur > 0;
    }

    // On commence stats a fond
    public Animal(String nomDonne) {
        this.nom = nomDonne;
        this.faim = 10;    // On commence "rassasié"
        this.energie = 10; // En pleine forme
        this.bonheur = 10; // Très joyeux
        
    }
}