public class Canard7
    {
        private String couleur;
        private int taille;

        public Canard7(String couleur)
            {
                this.couleur = couleur;
            }

        public void cancaner()
            {
                System.out.println("Coin coin !");
            }

        public String getCouleur()
            {
                return couleur;
            }
    }
//Le nombre de canard est limité à un nombre défini lors de la création de celui-ci.