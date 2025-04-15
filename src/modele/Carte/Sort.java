public class Sort extends Carte{
    
    public Sort(String nom, int coutMana, double rarete, TypeHero classe, TypeCarte type) {
        super(nom, coutMana, rarete, classe, TypeCarte.SORT);
        
    }

    @Override
    public void executerAction(Cible cible) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executerAction'");
    }

    @Override
    public void destruction(Carte carte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'destruction'");
    }

}
