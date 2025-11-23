public class Canard2
    {
        private String couleur;
        private int taille;

        public Canard2(String couleur, int taille)
            {
                this.couleur = couleur;
                this.taille = taille;
            }

        public String getCouleur()
            {
                return couleur;
            }

        public void setCouleur(String couleur)
            {
                this.couleur = couleur;
            }

        public int getTaille()
            {
                return taille;
            }

        public void setTaille(int taille)
            {
                this.taille = taille;
            }

        public static void main(String[] args)
            {
                System.out.println("\nExercice 2:");
                
                Canard2 canardA = new Canard2("Jaune", 10);
                Canard2 canardB = new Canard2("Vert", 18);

                System.out.println("\nCanard A: " + canardA.getCouleur() + " (" + canardA.getTaille() + " cm)");
                System.out.println("Canard B: " + canardB.getCouleur() + " (" + canardB.getTaille() + " cm)");
                
                canardA.setTaille(16);
                System.out.println("Canard A a grandi: " + canardA.getTaille() + " cm");
            }
    }
//L'utilisation d'attributs privés permet une meilleure encapsulation ainsi qu'une meilleure protection des données.