public class Serviteur extends Carte implements Cible {

    public Serviteur(String nom, int coutMana, double rarete, TypeHero classe, TypeCarte type) {
        super(nom, coutMana, rarete, classe, TypeCarte.SERVITEUR);
        
    }

    @Override
    public void recevoirDegats(int quantite) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recevoirDegats'");
    }

    @Override
    public void soigner(int quantite) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'soigner'");
    }

    @Override
    public boolean estVivant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estVivant'");
    }

    @Override
    public void destruction(Carte carte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'destruction'");
    }

    @Override
    public void executerAction(Cible cible) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executerAction'");
    }
    
}
