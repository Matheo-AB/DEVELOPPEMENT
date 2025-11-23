public class Canard5
    {
        public String couleur;
        public int taille;
        public Accessoire accessoire;

        public Canard5(String couleur, int taille, Accessoire accessoire)
            {
                this.couleur = couleur;
                this.taille = taille;
                this.accessoire = accessoire;
            }
        
        public String getCouleur()
            {
                return couleur;
            }
        
        public int getTaille() 
            {
                return taille;
            }

        public static void main(String[] args)
            {
                System.out.println("\nExercice 5:");
                Accessoire casquette = new Accessoire("casquette", "bleue");
                CanardChef chef = new CanardChef("marron", 18, casquette, 2);
                chef.afficherDescription();
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
    }
//La méthode qui sera appelée est "Description".