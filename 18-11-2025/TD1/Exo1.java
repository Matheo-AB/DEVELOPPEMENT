public class UserProfile
    {
        public String getUserInfo(String userId)
            {
                Database db = new Database();
                String userName = db.getUserName(userId);
                String userEmail = db.getUserEmail(userId);
                String userAddress = db.getUserAddress(userId);
                return "Name: " + userName + "\nEmail: " + userEmail + "\nAddress: " + userAddress;
            }
        public String getAdminInfo(String adminId)
            {
                Database db = new Database();
                String adminName = db.getUserName(adminId);
                String adminEmail = db.getUserEmail(adminId);
                String adminAddress = db.getUserAddress(adminId);
                return "Admin Name: " + adminName + "\nAdmin Email: " + adminEmail + "\nAdmin Address: " + adminAddress;
            }
        }

/* Les mauvaises odeurs sont les suivantes : 

    - Copié-Collé (DRY)*
    - Duplication de BDD
    - Méthodes trop longue


    Correction : 

    Class UserProfile
        {
            public String getUserInfo(String userId)
            {
                Database db = new Database();
                String userName = db.getUserName(userId);
                String userEmail = db.getUserEmail(userId);
                String userAddress = db.getUserAddress(userId);
                return "Name: " + userName + "\nEmail: " + userEmail + "\nAddress: " + userAddress;
            }
        }
 */
 */