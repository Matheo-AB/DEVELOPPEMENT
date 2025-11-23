private class ClientManager
    {
        private List<Client> clients = new ArrayList<>();
        
        public void afficherComptes()
            {
                for (Compte compte : comptes)
                    {
                        System.out.println(compte);
                    }
            }
    }

private class CompteManager
    {
        private List<Compte> comptes = new ArrayList<>();
        
        public void ajouterClient(Client client)
            {
                clients.add(client);
            }

        public void creerCompte(Client client, double soldeInitial)
            {
                Compte compte = new Compte(client, soldeInitial);
                comptes.add(compte);
            }
    }

public class Banque
    {
        
    }