//TP POO 
//ACAD B L2 GRP 3 : BINOME : KHEDIMI YACINE - KEMMOUN RAMZY


import java.util.HashMap;
import java.util.Scanner;


public class Bibliotheque{

    static HashMap<String, Adherants> AdherantsLists = new HashMap<String, Adherants>();
    static HashMap<String, Media> MediasLists = new HashMap<String, Media>();
    static HashMap<String, Emprunts> EmpruntsLists = new HashMap<String, Emprunts>();
    static void Menu(){
        System.out.println("1 - Ajouter adherant");
        System.out.println("2 - Ajouter Media");
        System.out.println("3 - Afficher la liste des adherants");
        System.out.println("3 - Afficher les adherants de la liste noire");
        System.out.println("4 - Afficher la liste des medias");
        System.out.println("3 - Modifier adherant");
        System.out.println("4 - Modifier media");
        System.out.println("5 - Infos sur le bibliothecaire");
        System.out.println("5 - Changer le bibliothecaire!");
        System.out.println("5 - Exit");
    }
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        //le bibliotechaire
        // Bibliothecaire MrLeBibliothecaire = new Bibliothecaire(
        //     "XNA01",
        //     "Eren",
        //     "Yeager"
        // );
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
        Menu();
        
        stdin.close();
        
    }
}


