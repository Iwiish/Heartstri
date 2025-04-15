public interface Cible {
    void recevoirDegats(int quantite);
    void soigner(int quantite);
    boolean estVivant();
}