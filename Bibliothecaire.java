
class Bibliothecaire implements Personne{

    private String id_bibliothecaire;
    private String nom;
    private String prenom;

    public Bibliothecaire(String id_bibliothecaire, String nom, String prenom) {
        this.id_bibliothecaire = id_bibliothecaire;
        this.nom = nom;
        this.prenom = prenom;
    }
    public void sePresenter(){
        System.out.println(
            "ID : " + this.id_bibliothecaire + "\n"
            + "fullname : " + this.getFullName() + "\n"
        );

    }

    public void modifierAdherants(String id_adherants, Adherants newAdherants){
        Adherants adherant = Bibliotheque.AdherantsLists.get(id_adherants);
        if(adherant == null){
            System.out.println("Adherant non existant");
        }
        else{
            Bibliotheque.AdherantsLists.replace(adherant.getId_Adherants(), adherant, newAdherants);
            System.out.println("Modification avec succes.");
        }
    }

    public void suprimerAdherants(String id_adherants){
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
            Bibliotheque.MediasLists.replace(media.getId_media(), media, newMedia);
            System.out.println("Modification avec succes.");
        }
    }
    public void suprimerMedia(String id_media){
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
            member.sePresenter();
        }
        if(Bibliotheque.AdherantsLists.size() == 0){
            System.out.println("Liste vide.\n");
        }
    }
    public void modifierBibliothecaire(String newName, String newPrenom , String newMat){
        this.id_bibliothecaire = newMat;
        this.nom = newName;
        this.prenom = newPrenom;
        System.out.println("Modification avec succes.");
    }    
    public void afficheBlackList(){
        System.out.println("Black list : \n");
        boolean bool = false;
        for(Adherants member : Bibliotheque.AdherantsLists.values()){
            if(member.getIsInBlackList()){
                member.sePresenter();
                bool = true;
            }
        }
        if(!bool){
            System.out.println("Black list vide.\n");
        }
    }
    public void afficheMediasLists(){
        for(Media media : Bibliotheque.MediasLists.values()){
            media.consultation();
        }
        if(Bibliotheque.MediasLists.size() == 0){
            System.out.println("Liste vide.\n");
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