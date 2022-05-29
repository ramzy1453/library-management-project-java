import java.util.Date;

class Adherants implements Personne {

    private String id_Adherants;
    private String nom;
    private String prenom;
    private boolean isInBlackList;

    public Adherants(String id_Adherants, String nom, String prenom) {
        this.id_Adherants = id_Adherants;
        this.nom = nom;
        this.prenom = prenom;
        this.isInBlackList = false;
    }
    public void sePresenter(){
        System.out.println(
            "ID : " + this.id_Adherants + "\n"
            + "fullname : " + this.getFullName() + "\n"
            + "isInBlackList : " + this.isInBlackList + "\n" 
        );
    }
    public boolean getIsInBlackList(){
        return this.isInBlackList;
    }
    public void setIsInBlackList(boolean isInBlackList){
        this.isInBlackList = isInBlackList;
    }

    public String getId_Adherants() {
        return this.id_Adherants;
    }

    public void setId_Adherants(String id_Adherants) {
        this.id_Adherants = id_Adherants;
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
    //methods
    public void consulterMedia(String id_media){
        Media media = Bibliotheque.MediasLists.get(id_media);
        if(media != null){
            media.consultation();
        }
        else System.out.println("Media non existant.\n");
    }
    public void emprunterMedia(String id_media_To_emprunt){

        Media media = Bibliotheque.MediasLists.get(id_media_To_emprunt);{}
        if(media == null){
            System.out.println("Il n'existe pas, tu ne peux pas emprunter.\n");
        }
        else{
            if(!media.getEstDisponible()){
                System.out.println("Ce " + media.getType() + " n'est plus disponible.\n");
            }
            else{
                Bibliotheque.EmpruntsLists.put(
                    this.id_Adherants+"#"+media.getId_media(),
                    new Emprunts(
                        Integer.toString(Bibliotheque.EmpruntsLists.size() + 1),
                        this.id_Adherants,
                        media.getId_media()
                    )
                );
            }
        }
    }
    public void restituerMedia(String id_media_To_restituer){
        String key = this.id_Adherants+"#"+id_media_To_restituer;
        Emprunts EmpruntsToRestituer = Bibliotheque.EmpruntsLists.get(key);
        if(EmpruntsToRestituer == null){
            System.out.println("Cette emprunts n'a pas ete fait par le passe.\n");
        }
        else{
            double dureeEmprunt = new Date().getTime() - EmpruntsToRestituer.getDate_emprunts().getTime();
            Bibliotheque.EmpruntsLists.remove(key);
            if(dureeEmprunt < 10 * 24 * 3600 * 1000){
                System.out.println("Restitutions faite avec succes.\n");
            }
            else{
                System.out.println("Vous avez fait un retard !\n");
                this.isInBlackList = true;
            }
            
        }
    }
}