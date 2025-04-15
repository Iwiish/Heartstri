public class Arme extends Carte {
    public int attaque;
    public int vie;
//  public ActionSpeciale actionSpeciale;

    public Arme(String nom, int coutMana, double rarete, TypeHero classe, TypeCarte type) {
        super(nom, coutMana, rarete, classe, TypeCarte.ARME);
    }

    @Override
    public void executerAction(Cible cible) {
        System.out.println("Action de l'arme");
    }

    @Override
    public void destruction(Carte carte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'destruction'");
    }
}
