public class Avion extends Vehicule implements Voler{
    private int hauteur;
    private int vitesse;
    public Avion(double price, double weight){
        super(price, weight);
    }

    @Override
    public void Bruit() {
        System.out.println("Mes réacteurs font beaucoup de bruit");
    }

    @Override
    public void monter() {
        this.hauteur += Voler.hauteur;
    }

    @Override
    public void descendre() {
        this.hauteur -= Voler.hauteur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
}
