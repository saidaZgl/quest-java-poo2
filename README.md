Challenge Quête WILD CODE SCHOOL - L'héritage JAVA - 

# Crée une classe abstraite Vehicle
1. Ajoute les attributs String brand et int kilometers
2. Crée un constructeur permettant d'initialiser brand et kilometers
3. Ajoute des getters et setters pour tous les attributs, en respectant les conventions
4. Crée une classe Car qui étend la classe Vehicle
5. Crée une classe Boat qui étend la classe Vehicle
6. Ajoute dans Vehicle la méthode abstraite public String doStuff()
7. Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff() : pour Car tu devras retourner "Je suis {brand} et je fais vroum vroum !" et pour Boat : "Je suis {brand} et je fais glou glou !"
8. Crée une classe Hangar qui possédera une méthode main()
9. Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar
10. Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()
11. Compile et teste Hangar : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
    
# Critéres de validation
Le dépôt GitHub contient bien les fichiers Vehicle.java, Car.java, Boat.java et Hangar.java
Les classes respectent les conventions de la POO : attributs privés, utilisation du mot-clef this, getters et setters nommés correctement.
Des références à des instances de la classe Car et Boat sont présentes dans la classe Hangar
La classe Hangar se compile sans erreur et affiche le résultat attendu dans le terminal
