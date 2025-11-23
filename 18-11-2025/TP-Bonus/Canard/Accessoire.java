public class Accessoire
    {
        private String nom;
        private String couleur;

        public Accessoire(String nom, String couleur)
            {
                this.nom = nom;
                this.couleur = couleur;
            }
        
        public String toString()
            {
                return this.nom + " " + this.couleur;
            }
    }