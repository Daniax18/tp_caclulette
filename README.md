## **Objectif :**

Ce projet a pour objectif de concevoir une petite application de calculatrice scientifique simplifiée: résolution d’équations du second degré sous la forme :

**𝑎𝑥2+𝑏𝑥+𝑐=0**

où a, b, et c sont des entiers (Z).

L’application permet à l’utilisateur de saisir les valeurs de a, b, et c, puis d’obtenir les racines de l’équation selon les cas :

Δ > 0 → deux racines réelles distinctes \
Δ = 0 → une racine réelle double \
Δ < 0 → pas de racine réelle

## **Technologies utilisées**

Langage : Java 17 \
Interface graphique : JavaFX \
Tests unitaires : JUnit 5 \
Outils :
- IntelliJ IDEA / Maven
- Git & GitHub pour la collaboration
- GitHub Actions pour CI/CD

## Répartition des rôles:

Gaëlle :
- Développe la fonction de calcul du discriminant : Δ = b² - 4ac.
- Calcule les racines selon les cas (Δ > 0, Δ = 0, Δ < 0).
- Fournit les résultats à l’interface.

Dania:
- Développe l’interface utilisateur avec JavaFX.
- Récupère les valeurs de a, b, c saisies par l’utilisateur.
- Déclenche le calcul en appelant la logique métier.

## Consignes de revue de code:
- Chaque membre doit créer une branche spécifique pour ses modifications
- Les Pull Requests (PR) doivent être revues et validées par l’autre membre avant d’être fusionnées dans la branche principale.
- Avant toute fusion dans la branche principale, la branche doit passer avec succès les checks automatiques (build et test unitaire)
- Le code doit respecter les bonnes pratiques (nbommages, commentaires, code lisible)