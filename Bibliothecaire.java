
class Bibliothecaire implements Personne{

    private String id_bibliothecaire;
    private String nom;
    private String prenom;

    public Bibliothecaire(String id_bibliothecaire, String nom, String prenom) {
        this.id_bibliothecaire = id_bibliothecaire;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void modifierAdherants(String id_adherants, Adherants newAdherants){
        Adherants adherant = Bibliotheque.AdherantsLists.get(id_adherants);
        if(adherant == null){
            System.out.println("Adherant non existant");
        }
        else{
            adherant = newAdherants;
            System.out.println("Modification avec succes.");
        }
    }

    public void suprimerAdherants(String id_adherants, Adherants newAdherants){
        Adherants adherant = Bibliotheque.AdherantsLists.get(id_adherants);
        if(adherant == null){
            System.out.println("Adherant non existant");
        }
        else{
            Bibliotheque.AdherantsLists.remove(id_adherants, adherant);
            System.out.println("Supression avec succes.");
        }
    }
    public void modifierMedia(String id_media, Media newMedia){
        Media media = Bibliotheque.MediasLists.get(id_media);
        if(media == null){
            System.out.println("Adherant non existant");
        }
        else{
            media = newMedia;
            System.out.println("Modification avec succes.");
        }
    }
    public void suprimerMedia(String id_media, Media newMedia){
        Media media = Bibliotheque.MediasLists.get(id_media);
        if(media == null){
            System.out.println("Adherant non existant");
        }
        else{
            Bibliotheque.MediasLists.remove(id_media, media);
            System.out.println("Supression avec succes.");
        }
    }

    public void afficheAdherantsLists(){
        for(Adherants member : Bibliotheque.AdherantsLists.values()){
            member.presenterClient();
        }
    }
    public void afficheBlackList(){
        System.out.println("Black list : \n");
        for(Adherants member : Bibliotheque.AdherantsLists.values()){
            if(member.getIsInBlackList()){
                member.presenterClient();
            }
        }
    }
    public void afficheMediasLists(){
        for(Media media : Bibliotheque.MediasLists.values()){
            media.consultation();
        }
    }
    public void afficheEmpruntsLists(){
        for(Emprunts emprunt : Bibliotheque.EmpruntsLists.values()){
            emprunt.consulterEmprunts();
        }
    }
    public String getId_bibliothecaire() {
        return this.id_bibliothecaire;
    }

    public void setId_bibliothecaire(String id_bibliothecaire) {
        this.id_bibliothecaire = id_bibliothecaire;
    }

    public String getFullName() {
        return this.nom + " " + this.prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}