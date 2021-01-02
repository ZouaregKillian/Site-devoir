# **MÉTHODES ET PROPRIÉTÉS**
​
    Cet exercice a pour objectif de vous familiariser avec certaines méthodes des prototypes les plus courants et de vous familiariser avec certaines ressources disponibles sur internet.
    
​
    Pour chaque demande ci-dessous, afficher le résultat dans la console du navigateur.
---
***LES NOMBRES***
​
Ressource : https://www.w3schools.com/js/js_number_methods.asp
​
​
​
    A partir du float suivant : let float = 11.5;
​
1. Transformer ce float en string
2. Puis transformer la string obtenue en float
3. Puis transformer ce float en int
---
***LES STRINGS***
​
Ressource : https://www.w3schools.com/js/js_string_methods.asp
​
​
    A partir de la string suivante :
    let string = "         Je m'appelle Jean Dupuis Dupuis, et j'ai 29 ans       ";
​
​
1.Supprimer les espaces au début et à la fin de la string
​
​
    A partir de la string suivante :
    let string = "Je m'appelle Jean Dupuis Dupuis, et j'ai 29 ans";
​
​
2. Récupérer la longueur de la string
3. récupérer la position du premier "Dupuis"
4. récupérer la position du second "Dupuis"
5. Récupérer le premier "Dupuis"
6. Récupérer le J de "Jean" avec une méthode de caractère
7. Concaténer la string "depuis 10 ans déjà" à la string courante
8. Vérifier si la string courante se termine par "il fait beau"
9. Vérifier si la string inclue "Dupuis Dupuis"
10. Trouver l'index du chiffre "29"
11. Répéter la string courante 3 fois
12. Remplacer le premier "Dupuis" par "Dupont"
13. Vérifier si la string commence par "Je m'appelle"
14. Mettre tous les caractères de la string en majuscules
15. Mettre tous le caractères de la string en minuscules
16. tranformer la string en un tableau qui contient pour chaque index, une seule lettre de la string
17. tranformer la string en un tableau qui contient pour chaque index, un seul mot de la string
18. tranformer la string en un tableau qui contient pour chaque index, chaque morceau de la string qui est séparé du reste par une virgule
19. A partir du tableau obtenu comme résultat de l'exercie 17, joindre chaque mot contenu dans le tableau pour former une string
​
​
---
​
​
***LES TABLES***
​
Ressource : https://www.w3schools.com/js/js_array_methods.asp
​
    A partir du tableau suivant :
    let array = [
        "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"
    ];
​
1. Supprimer le dernier mot du tableau, loguer le tableau et la valeur supprimée
2. Supprimer le premier mot du tableau, loguer le tableau et la valeur supprimée
3. Ajouter à la fin de ce tableau la string "C'est fini" et loguer le tableau
4. Ajouter au début de ce tableau la string "Ca commence"
5. Remplacer dans le tableau la string "Avril" par la string "Pas Avril"
6. Remplacer le mois de mai et de juin par "Banane" et "Fraise"
7. Diviser le tableau en 3 tableaux avec 4 mois différents chacun
8. Concaténer les le contenu des 3 tableaux obtenus lors de l'exercice précédent dans un nouveau tableau
9. Inverser l'ordre de chaque élément du tableau
10. Vérifier si le tableau inclus la valeur "Mai"
11. Trier le tableau par ordre alphabétique
12. Remplacer chaque mois dans le tableau par la phrase :
Le mois de <Nom du mois> est le <numéro du mois> <ordinal> mois de l'année
Le premier mois doit avoir l'ordinal "er" et les autres mois l'ordinal "ème"
​
Depuis le tableau suivant :
let numbersArray = [1, 2, 3, 4, 5]
1. Réduire un tableau de nombre à la somme de la valeur de l'index 0 et de la valeur de l'index suivant, pour tous les index
---
​
​
***L'OBJET MATH***
​
Ressource : https://www.w3schools.com/js/js_math.asp
​
1. Calculer le cosinus du nombre 50
2. Calculer la racine de 4
3. Arrondir le nombre 11.3654635 à son entier inférieur
4. Arrondir le nombre 11.3654635 à son entier supérieur
5. Afficher un décimal au hasard entre 0 et 1.
5. Afficher un décimal au hasard entre 1 et 6.
6. Afficher un entier au hasard entre 1 et 6.
​
​
​
---
​
​
***L'OBJET DATE***
​
https: https://www.w3schools.com/js/js_dates.asp
​
1. Créer une date à la date d'aujourd'hui
​
2. Pour une intervale  d'une seconde
afficher l'année en cours,
le jour en cours,
l'heure en cours,
les minutes en cours,
et les secondes en cours,
sous le format suivant :
<année> <jour> <heure> <minute> <seconde> 
​
3. Faire la même chose que précédemment, mais l'intervalle doit commencer à s'exécuter 3 secondes après le chargement de la page we
​
***LES TABLEAUX D'OBJETS***
​
Ressources :
* https://www.w3schools.com/js/js_objects.asp
* https://www.w3schools.com/js/js_loop_for.asp
​
​
        A partir du tableau d'objets suivant:
        
        const movies = [
            {
                title : "la communauté de l'anneau",
                director : "Peter Jackson",
                characters : [
                    "Aragorn",
                    "Legolas",
                    "Boromir",
                    "Gimli",
                    "Frodon",
                    "Sam",
                    "Pippin",
                    "Merry"
                ]
            },
            {
                title : "les 2 tours",
                director : "Peter Jackson",
                characters : [
                    "Galadielle",
                    "Eowyn",
                    "Arwen" 
                ]
            },
            {
                title : "le retour du roi",
                director : "Peter Jackson",
                characters : [
                    "Grimma",
                    "Theoden",
                    "Faramir",
                    "Saroumane"
                ]
            },
        ];
​
 1. Afficher le titre du premier objet dans le tableau
 2. Afficher le directeur du deuxième objet dans le tableau
 3. Afficher le tableau des personnages du troisième objet dans le tableau
 4. Afficher le tableau des personnages du premier objet dans le tableau de films
 5. Parcourir, de manière automatisée, le tableau des personnages
 du premier objet dans le tableau de films,
 et en afficher chaque personnage dans la console.
 6. Parcourir le tableau de films de manière automatisée,
 et afficher le tableau des personnages de chaque film.
 7. Parcourir chaque  film et chaque tableau de personnages de manière automatisée,
 et afficher une seule fois le titre, une seule fois le directeur,
 puis afficher chaque personnage de chaque film 
​
***LES MANIPULATIONS DU DOM***