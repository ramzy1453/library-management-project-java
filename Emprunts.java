import java.util.Date;

class Emprunts{
    private String id_emprunts;
    private String id_adherant;
    private String id_media;
    private Date date_emprunts;

    public Emprunts(String id_emprunts, String id_adherant, String id_media) {
        this.id_emprunts = id_emprunts;
        this.id_media = id_media;
        this.id_adherant = id_adherant;
        this.date_emprunts = new Date();
    }
    public void consulterEmprunts(){
        Adherants member = Bibliotheque.AdherantsLists.get(this.id_adherant);
        Media media = Bibliotheque.MediasLists.get(this.id_media);
        System.out.println(
            "Emprunteur : " + member.getFullName()+"#"+member.getId_Adherants() + "\n"
            + media.getType() + " Empruntee : " + media.getNom()+"#"+media.getId_media() + "\n"
        );
    }
    public String getId_emprunts() {
        return this.id_emprunts;
    }

    public void setId_emprunts(String id_emprunts) {
        this.id_emprunts = id_emprunts;
    }

    public String getId_adherant() {
        return this.id_adherant;
    }

    public void setId_adherant(String id_adherant) {
        this.id_adherant = id_adherant;
    }

    public String getId_media() {
        return this.id_media;
    }

    public void setId_media(String id_media) {
        this.id_media = id_media;
    }

    public Date getDate_emprunts() {
        return this.date_emprunts;
    }

    public void setDate_emprunts(Date date_emprunts) {
        this.date_emprunts = date_emprunts;
    }
    
}

