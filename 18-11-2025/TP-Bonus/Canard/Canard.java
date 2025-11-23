public class Canard
    {
        String couleur;
        int taille;

        public static void main(String[] args)
            {
                Canard canard1 = new Canard();

                canard1.couleur = "Jaune";
                canard1.taille = 10;

                System.out.println("Exercice 1:");
                System.out.println("\nLe canard est " + canard1.couleur + " et de taille " + canard1.taille);
            }
    }
//Si un attribut est oublié lors de l'initialisation, il sera automatiquement attribué à la valeur 0.