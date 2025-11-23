public class Manuel extends Livre
    {
        private String matiere;
        public Manuel(String titre, String auteur, int annee, String matiere)
            {
                super(titre, auteur, annee); 
                this.matiere = matiere;
            }

        @Override
        public void afficher()
            {
                System.out.println("Titre: " + this.getTitre());
                System.out.println("Auteur: " + this.getAuteur());
                System.out.println("Année: " + this.getAnnee()); 
                System.out.println("Matière: " + this.matiere);
            }
    }