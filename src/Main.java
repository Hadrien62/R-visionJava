public class Main {
    public static void main(String[] args) {
        Vehicule avion = new Avion(200000000.890,2500);
        avion.Bruit();
        ((Avion)avion).monter();
        System.out.println("Je vole à : " + ((Avion) avion).getHauteur() + " mètres");
    }
}