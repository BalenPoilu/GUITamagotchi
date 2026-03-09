package tama.food;

public enum GummieType{
    // NOM("nom", faim, sanity, bonheur, energie, age)
    GBLEU("bleu", new Bonus(1, 1, 0, 0, 0)),
    GROUGE("rouge", new Bonus(0, 0, 1, 1, 0)),
    GDORE("doré", new Bonus(1, 1, 1, 1, 1));

    private final String type;
    private final Bonus bonus;

    GummieType(String type, Bonus bonus){
        this.type = type;
        this.bonus = bonus;
    }

    public Bonus getBonus(){return this.bonus;}
    public String getType(){return this.type;}

    //fin de gum
    // classe interne bonus
    public static class Bonus{

        private final int faim;
        private final int sanity;
        private final int bonheur;
        private final int energie;
        private final int age;

        Bonus(int faim, int sanity, int bonheur, int energie, int age){
            this.faim = faim;
            this.sanity = sanity;
            this.bonheur = bonheur;
            this.energie = energie;
            this.age = age;
        }
        public int faim(){return this.faim;}
        public int sanity(){return this.sanity;}
        public int bonheur(){return this.energie;}
        public int age(){return this.age;}
    }
}
