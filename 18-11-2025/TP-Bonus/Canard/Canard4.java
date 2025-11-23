public class Canard4
    {
        private String couleur;
        private int taille;
        private Accessoire accessoire;

        public Canard4(String couleur, int taille, Accessoire accessoire)
            {
                this.couleur = couleur;
                this.taille = taille;
                this.accessoire = accessoire;
            }

        public void afficherDescription()
            {
                String description = "\nLe Canard " + this.couleur + " fait " + this.taille + " cm";
                if (this.accessoire != null)
                        {
                            description += " et porte un " + this.accessoire.toString() + " ?"; 
                        }
                else
                    {
                        description += " ne porte rien... (Aie aie aie)";
                    }
                System.out.println(description);
            }

        public static void main(String[] args)
            {
                System.out.println("\nExercice 4:");
                
                Accessoire chapeauRouge = new Accessoire("chapeau", "rouge");
                Accessoire noeudPapillon = new Accessoire("noeud papillon", "bleu");
                
                Canard4 canard1 = new Canard4("jaune", 12, chapeauRouge);
                Canard4 canard2 = new Canard4("noir", 8, noeudPapillon);
                Canard4 canard3 = new Canard4("bleu", 10, null);

                canard1.afficherDescription();
                canard2.afficherDescription();
                canard3.afficherDescription();
            }
}
//