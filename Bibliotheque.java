//TP POO 
//ACAD B L2 GRP 3 : BINOME : KHEDIMI YACINE - KEMMOUN RAMZY


import java.util.HashMap;
import java.util.Scanner;

import org.w3c.dom.stylesheets.MediaList;



public class Bibliotheque{

    static HashMap<String, Adherants> AdherantsLists = new HashMap<String, Adherants>();
    static HashMap<String, Media> MediasLists = new HashMap<String, Media>();
    static HashMap<String, Emprunts> EmpruntsLists = new HashMap<String, Emprunts>();
    static void Menu(){
        System.out.println("1 - Ajouter adherant");
        System.out.println("2 - Ajouter Media");
        System.out.println("3 - Afficher la liste des adherants");
        System.out.println("4 - Afficher les adherants de la liste noire");
        System.out.println("5 - Afficher la liste des medias");
        System.out.println("6 - Modifier adherant");
        System.out.println("7 - Modifier media");
        System.out.println("8 - Suprimer adherant");
        System.out.println("9 - Suprimer media");
        System.out.println("10 - Infos sur le bibliothecaire");
        System.out.println("11 - Changer le bibliothecaire!");
        System.out.println("12 - Emprunter un media");
        System.out.println("13 - Restituer un emprunt");
        System.out.println("14 - Consulter un emprunt");
        System.out.println("15 - Consulter la liste des tous les emprunts");
        System.out.println("0 - Exit");
        System.out.println("Votre choix ?\t");
    }
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        Bibliothecaire MrLeBibliothecaire = new Bibliothecaire(
            "XNA01",
            "Eren",
            "Yeager"
        );
        // System.out.println(MrLeBibliothecaire.toString());
    
        // //les adherants
        // AdherantsLists.put(
        //     "15F5",
        //     new Adherants("15F5", "Moh", "Im")
        // );
        // AdherantsLists.put(
        //     "G251",
        //     new Adherants("G251", "Kemmoun", "Ramzy")
        // );
        // AdherantsLists.put(
        //     "329X",
        //     new Adherants("329X", "Moubid", "Anglo-Saxons")
        // );
        

        // //les medias
        // MediasLists.put(
        //     "001",
        //     new Livre("001", "Quran")
        // );
        // MediasLists.put(
        //     "002",
        //     new CD("002", "To colonize Whites.")
        // );
        // MediasLists.put(
        //     "003",
        //     new Memoire("003", "How to became pro in Hack Ennemies")
        // );

        
        // AdherantsLists.get("15F5").emprunterMedia("001");
        // AdherantsLists.get("G251").emprunterMedia("003");
        // MrLeBibliothecaire.afficheEmpruntsLists();

        // AdherantsLists.get("15F5").restituerMedia("001");

        // MrLeBibliothecaire.afficheEmpruntsLists();
        // System.out.println("Hh");
        boolean condition = true;
        while (condition) {
            Menu();
            int choix = stdin.nextInt();
            while(choix < 0 || choix > 50){
                System.out.println("Numero non valide, repetez!\t");
                choix = stdin.nextInt();
            }
            switch (choix) {
                case 1:
                    System.out.println("Entrer la matricule de l'adherant\t");
                    String matAdr = stdin.next();
                    System.out.println("Entrer le nom et prenom de l'adherant\t");
                    String nom = stdin.next();
                    String prenom = stdin.next();
                    AdherantsLists.put(
                        matAdr,
                        new Adherants(matAdr, nom, prenom)
                    );
                break;
                case 2:
                    System.out.println("Choisissez le type du Media.\n1-Livre\n2-Memoire\n3-CD");
                    int ch = stdin.nextInt();
                    while(ch < 1 ||ch > 3){
                        System.out.println("Num invalide repetez!\t");
                        ch = stdin.nextInt();
                    }
                    String type = ch==1 ? "Livre" : (ch==2 ? "Memoire" : "CD");
                    System.out.println("Entrer la matricule du "+type+"\t");
                    String matMedia = stdin.next();
                    System.out.println("Entrer le nom du "+type+"\t");
                    String nomMedia = stdin.next();
                    MediasLists.put(
                        matMedia,
                        ch==1 ? new Livre(matMedia, nomMedia) : 
                        (ch == 2 ? new Memoire(matMedia, nomMedia) : new CD(matMedia, nomMedia))
                    );
                break;
                case 3 : 
                    MrLeBibliothecaire.afficheAdherantsLists();
                break;
                case 4 : 
                    MrLeBibliothecaire.afficheBlackList();
                break;
                case 5 :
                    MrLeBibliothecaire.afficheMediasLists();
                break;
                case 6 :
                    System.out.println("Ecrivez la matricule de l'adherant que vous vouliez modifier.\t");
                    String m = stdin.next();
                    Adherants a = AdherantsLists.get(m);
                    if(a == null){
                        System.out.println("Matricule invalide!\n");
                    }
                    if(a != null){
                        a.sePresenter();
                        System.out.println("Entrez la nouvelle matricule.\t");
                        System.out.println("Entrer la matricule de l'adherant\t");
                        String ma = stdin.next();
                        System.out.println("Entrer le nom et prenom de l'adherant\t");
                        String n = stdin.next();
                        String p = stdin.next();
                        System.out.println(a.getId_Adherants());
                        MrLeBibliothecaire.modifierAdherants(a.getId_Adherants(), new Adherants(ma, n, p));
                    }
                break;
                case 7 : 
                    System.out.println("Ecrivez la matricule du media que vous vouliez modifier.\t");
                    String mm = stdin.next();
                    Media md = MediasLists.get(mm);
                    if(md == null){
                        System.out.println("Matricule invalide!\n");
                    }
                    if(md != null){
                        md.consultation();
                        System.out.println("Entrez la nouvelle matricule.\t");
                        String ma = stdin.next();
                        System.out.println("Entrer le nom du "+md.getType()+"\t");
                        String nn = stdin.next();
                        Media Nm = md.getType() == "CD" ? new CD(ma, nn) : (md.getType() == "Livre" ? new Livre(ma, nn) : new Memoire(ma, nn));
                        MrLeBibliothecaire.modifierMedia(ma, Nm);
                    }
                break;
                case 8 :
                    System.out.println("Ecrivez la matricule de l'adherant que vous vouliez suprimer.\t");
                    String MS = stdin.next();
                    Adherants AdrSup = AdherantsLists.get(MS);
                    if(AdrSup == null){
                        System.out.println("Inexistant.");
                        break;
                    }
                    AdrSup.sePresenter();
                    System.out.println("Etes vous sur de vouloir suprimer "+AdrSup.getFullName()+" ?\n1- Oui\n2- Non");
                    int cx = stdin.nextInt();
                    while(cx != 1 || cx != 2){
                        System.out.println("Num invalide repetez.\t");
                        cx = stdin.nextInt();
                    }
                    if(cx == 2)break;
                    if(cx == 1){
                        MrLeBibliothecaire.suprimerAdherants(MS);
                    }

                break;
                case 9 : 
                    System.out.println("Ecrivez la matricule de l'adherant que vous vouliez suprimer.\t");
                    String LS = stdin.next();
                    Media MedSup = MediasLists.get(LS);
                    if(MedSup == null){
                        System.out.println("Inexistant.");
                        break;
                    }
                    MedSup.consultation();
                    System.out.println("Etes vous sur de vouloir suprimer "+MedSup.getNom()+" ?\n1- Oui\n2- Non");
                    int mx = stdin.nextInt();
                    while(mx != 1 || mx != 2){
                        System.out.println("Num invalide repetez.\t");
                        mx = stdin.nextInt();
                    }
                    if(mx == 2)break;
                    if(mx == 1){
                        MrLeBibliothecaire.suprimerMedia(LS);
                    }
                break;
                case 10 :
                    MrLeBibliothecaire.sePresenter();
                break;
                case 11 : 
                    System.out.println("Entrez la nouvelle matricule du bibliothecaire");
                    String Mx = stdin.next();
                    System.out.println("Entrez le nom et prenom du nouveau bibliothecaire");
                    String Nx = stdin.next();
                    String Px = stdin.next();
                    MrLeBibliothecaire.modifierBibliothecaire(Mx, Nx, Px);
                break;
                case 12 : 
                    System.out.println("Entrez la matricule de l'adherant");
                    String adr = stdin.next();
                    Adherants MyAdr = AdherantsLists.get(adr);
                    if(MyAdr == null){
                        System.out.println("Matricule invalide.\n");
                    }
                    else{
                        System.out.println("Entrez la matricule du media.\t");
                        String med = stdin.next();
                        Media MyMed = MediasLists.get(med);
                        if(MyMed == null){
                            System.out.println("Media non existant.\n");
                        }
                        else{
                            MyAdr.emprunterMedia(med);
                            System.out.println("Emprunt effectue avec succes.\n");
                            System.out.println(MyAdr.getFullName() + "/" + MyMed.getNom()+"++");
                        }
                    }
                break;
                case 13 : 
                    System.out.println("Entrez la matricule de l'adherant");
                    String thisAdrMat = stdin.next();
                    Adherants thisAdr = AdherantsLists.get(thisAdrMat);
                    if(thisAdr == null){
                        System.out.println("Matricule invalide.\n");
                    }
                    else{
                        System.out.println("Entrez la matricule du media.\t");
                        String med = stdin.next();
                        Media MyMed = MediasLists.get(med);
                        if(MyMed == null){
                            System.out.println("Media non existant.\n");
                        }
                        else{
                            thisAdr.restituerMedia(med);
                            System.out.println("Restitution avec succes.\n");
                            System.out.println(thisAdr.getFullName() + "/" + MyMed.getNom()+"--");
                        }
                    }
                break;
                case 14 : 
                    System.out.println("Entrez la matricule de l'adherant que vous vouliez consulter ses emprunts.\t");
                    String ader = stdin.next();
                    Adherants adherant = AdherantsLists.get(ader);
                    if(adherant == null){
                        System.out.println("Non existant.\n");
                    }
                    else{
                        for(Emprunts e : EmpruntsLists.values()){
                            if(e.getId_adherant() == adherant.getId_Adherants()){
                                e.consulterEmprunts();
                            }
                        }
                        if(EmpruntsLists.size() == 0){
                            System.out.println("Liste des emprunts vide.\n");
                        }
                    }
                    
                break;
                case 15 :
                    for(Emprunts e : EmpruntsLists.values()){
                        e.consulterEmprunts();
                    }
                    if(EmpruntsLists.size() == 0){
                        System.out.println("Liste des emprunts vide.\n");
                    }
                break;
                case 0 : 
                    condition = false;
                break;
                default:
                    break;
            }
            System.out.println("\nAppuiez n'importe quel touche pour continuer...\n");
            stdin.next();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        
        
        stdin.close();
        
    }
}


