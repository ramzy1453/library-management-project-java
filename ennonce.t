Enoncé
On voudrait dans ce projet implémenter un système de gestion d une bibliothèque.
La bibliothèque comporte des médias de plusieurs types (livre, mémoire, cd) avec pour chacun,
un quota bien défini. La bibliothèque est gérée par un bibliothécaire qui s occupe d enregistrer,
de modifier ou de supprimer les médias et les adhérents.

Un adhérent peut consulter, emprunter ou restituer un média. L emprunt d un média par un
adhérent n est possible que si le média en question est disponible. Dans ce cas, il doit être
enregistré avec une date.
Le bibliothécaire peut aussi afficher la liste noire qui comporte tous les adhérents ayant dépassé
le délai d emprunt de 10 jours.
Travail demandé

1. Proposer une modélisation pour cette réalité. Il faudra définir toutes les entités et leurs
nature (classes, classes abstraites, interfaces) ainsi que tous les attributs et méthodes
nécessaires. La modélisation doit éviter les redondances d'attributs et de méthodes dans
les sous-classes.
2. Implémentez les classes permettant de gérer la bibliothèque.

Emprunts(
    id_emprunts,
    id_adherant,
    id_media,
    date_emprunts
)

Adherant(
    id_adherant
    nom,
    prenom,
    isInBlackList,
)


Bibliothecaire(
    id_bibliothecaire,
    nom,
    prenom,
)

Media(
    id_media,
    nom,
    estDisponible,
    type
)
heritage(livre , memoire , cd )

- listes des medias
- listes des adherants 
- un seul bibliotecaire