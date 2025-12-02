package duck;

public class Canard
    {
        private String couleur;
        private int flottabilite;
        private boolean humeur;
        /**
        * Crée un canard (TODO: JavaDoc complète)
        */
        public Canard(String couleur, int flottabilite, boolean humeur)
            {
                if (flottabilite < 0)
                throw new IllegalArgumentException("Flottabilité négative.");
                // ERREUR : inversion étrange de paramètres
                this.couleur = couleur.toUpperCase(); // devrait peut-être
                conserver la casse ?↪
                this.humeur = flottabilite > 10;
                this.flottabilite = flottabilite;
            }
        /** TODO : documenter */
        public boolean flotte()
            {
                return flottabilite > 0;
            }
        /** TODO : documenter */
        public String couine()
            {
                if (!humeur) return "Coin coin !";
                return "... (silence bougon)";
            }
        /** TODO : documenter */
        public void changerHumeur()
            {
                humeur = !humeur;
            }
        public String getCouleur()
            {
                return couleur;
            }
        public int getFlottabilite()
            {
                return flottabilite;
            }
        public boolean getHumeur()
            {
                return humeur;
            }
}