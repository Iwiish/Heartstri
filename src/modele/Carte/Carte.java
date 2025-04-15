public abstract class Carte {
    public String nom;
    public int coutMana;
    // la rarete est un chiffre compris entre ]0;1[ qui permet de déterminer le % de chance de tirer aléatoirement la carte
    public double rarete;
    public TypeHero classe;
    public TypeCarte type;

    public Carte(String nom, int coutMana, double rarete, TypeHero classe, TypeCarte type) {
        this.nom = nom;
        this.coutMana = coutMana;
        this.rarete = rarete;
        this.classe = classe;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public int getCoutMana() {
        return coutMana;
    }

    public double getRarete() {
        return rarete;
    }

    public TypeHero getClasse() {
        return classe;
    }

    public TypeCarte getType() {
        return type;
    }

    //utiliser la carte
    public abstract void executerAction(Cible cible);

    //détruire carte
    public abstract void destruction(Carte carte);

}


