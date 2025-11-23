public class Canard3
    {
        private String couleur;
        private int taille;

        public Canard3(String couleur, int taille)
            {
                this.couleur = couleur;
                this.taille = taille;
            }

        public void cancaner()
            {
                System.out.println("Coin coin !");
            }

        public void grandir()
            {
                this.taille = this.taille + 1;
            }

        public int getTaille()
            {
                return taille;
            }

        public String getCouleur()
            {
                return couleur;
            }

        public static void main(String[] args)
            {
                System.out.println("\nExercice 3:");
            
                Canard3 canard1 = new Canard3("Rouge", 10);
                Canard3 canard2 = new Canard3("Blanc", 5);

                System.out.println("\nTaille initiale canard1 : " + canard1.getTaille() + "cm");
                System.out.println("Taille initiale canard2 : " + canard2.getTaille() + "cm");
                
                canard1.grandir();
                canard2.grandir();
                canard2.grandir();
                
                System.out.println("Taille finale canard1 : " + canard1.getTaille() + "cm");
                System.out.println("Taille finale canard2 : " + canard2.getTaille() + "cm");
                
                System.out.print("Le canard " + canard1.getCouleur() + " dit : ");
                canard1.cancaner();
            }
    }
//Si un élément était statique, exemple "taille", les canards auraient tous la même taille car la valeur ne pourrait pas bouger.