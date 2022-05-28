abstract class Media implements ObjectDeBibliotheque{
    //Atributes
    private String id_media;
    private String nom;
    private String type;
    private boolean estDisponible;

    //Constructor
    public Media(String id_media, String nom, String type) {
        this.id_media = id_media;
        this.nom = nom;
        this.type = type;
        this.estDisponible = true;
    }
    public void consultation(){
        System.out.println(
            "Type : " + this.type + "\n"
            + "Id " + this.type + " : " + this.id_media + "\n"
            + "Name : " + this.nom + "\n" 
        );
    }
    //Getters and Setters
    public String getId_media() {
        return this.id_media;
    }

    public void setId_media(String id_media) {
        this.id_media = id_media;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getEstDisponible() {
        return this.estDisponible;
    }

    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }
}


class Livre extends Media{
    public Livre(String id_media, String nom){
        super(id_media, nom, "Livre");
    }
}
class CD extends Media{
    public CD(String id_media, String nom){
        super(id_media, nom, "CD");
    }
}

class Memoire extends Media{
    public Memoire(String id_media, String nom){
        super(id_media, nom, "Memoire");
    }
}
