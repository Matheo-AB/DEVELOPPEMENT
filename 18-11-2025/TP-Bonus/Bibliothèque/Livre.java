public class Livre
    {
        private String titre;
        private String auteur;
        private int annee;

        public Livre(String titre, String auteur, int annee)
            {
                this.titre = titre;
                this.auteur = auteur;
                this.annee = annee;
            }

        public String getTitre()
            {
                return titre;
            }

        public String getAuteur()
            {
                return auteur;
            }

        public int getAnnee()
            {
                return annee;
            }

        public void afficher()
            {
                System.out.println("Titre: " + this.titre);
                System.out.println("Auteur: " + this.auteur);
                System.out.println("Année: " + this.annee);
            }
    }