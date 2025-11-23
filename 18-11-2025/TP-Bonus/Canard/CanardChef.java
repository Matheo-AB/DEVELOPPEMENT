public class CanardChef extends Canard5
    {
        private int nombreSubalternes;

        public CanardChef(String couleur, int taille, Accessoire accessoire, int nombreSubalternes)
            {
                super(couleur, taille, accessoire); 
                this.nombreSubalternes = nombreSubalternes;
            }

        @Override 
        public void afficherDescription()
            {
                String description = "\nLe Canard Chef " + this.couleur + " fait " + this.taille + "cm";
                if (this.accessoire != null)
                    {
                        description += " et porte une " + this.accessoire.toString() + "."; 
                    }
                else
                    {
                        description += " ne porte rien... (Aie aie aie)";
                    }
                
                System.out.println(description);
                System.out.println("Il dirige " + this.nombreSubalternes + " subalternes.");
            }

        public static void main(String[] args)
            {
                System.out.println("\nExercice 5:");
                Accessoire casquette = new Accessoire("casquette", "bleue");
                CanardChef chef = new CanardChef("marron", 18, casquette, 2);
                chef.afficherDescription();
            }
    }