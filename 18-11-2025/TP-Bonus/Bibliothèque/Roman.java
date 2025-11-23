public class Roman extends Livre
    {
        private String genre;

        public Roman(String titre, String auteur, int annee, String genre)
            {
                super(titre, auteur, annee);
                this.genre = genre;
            }

        @Override
        public void afficher()
            {
                System.out.println("Titre: " + this.getTitre());
                System.out.println("Auteur: " + this.getAuteur());
                System.out.println("Année: " + this.getAnnee());
                System.out.println("Genre: " + this.genre);
            }
    }
//La méthode appelée est "afficher".