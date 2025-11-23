public class Canard6
    {
        public String couleur;
        public int taille;
        public Accessoire accessoire;

        private static int compteur = 0;

        public Canard6(String couleur, int taille, Accessoire accessoire)
            {
                this.couleur = couleur;
                this.taille = taille;
                this.accessoire = accessoire;
                Canard6.compteur++;
            }
        
        public Canard6(String couleur, int taille)
            {
                this.couleur = couleur;
                this.taille = taille;
                this.accessoire = null;
                Canard6.compteur++;
            }

        public static int getCompteur()
            {
                return compteur;
            }

        public static void main(String[] args)
            {
                System.out.println("\nExercice 6:");
                Canard6 c1 = new Canard6("Gris", 10);
                Canard6 c2 = new Canard6("Noir", 15);
                Canard6 c3 = new Canard6("Orange", 7);
                System.out.println("\nNombre total de canards créés : " + Canard6.getCompteur());
            }

        public String getCouleur()
            {
                return couleur;
            }
        
        public int getTaille() 
            {
                return taille;
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
//Un attribut d'instance est l'inverse d'un attribut statique. Il permet de stocker une valeur propre à chaque instance de la classe.