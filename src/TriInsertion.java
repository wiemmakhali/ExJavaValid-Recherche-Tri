
public class TriInsertion {
 // Méthode pour trier un tableau par insertion
        public static void triInsertion(int[] tableau) {
            for (int i = 1; i < tableau.length; i++) {
                int elementCourant = tableau[i];
                int j = i - 1;
                
                while (j >= 0 && tableau[j] > elementCourant) {
                    tableau[j + 1] = tableau[j];
                    j--;
                }
                
                tableau[j + 1] = elementCourant;
            }
        }
         // Méthode pour afficher les éléments d'un tableau
        public static void afficherTableau(int[] tableau) {
            for (int i = 0; i < tableau.length; i++) {
                System.out.print(tableau[i] + " ");
            }
            System.out.println();
        }
        //La méthode main crée un tableau initial, affiche le tableau avant le tri
        // appelle la méthode triInsertion pour trier le tableau
        // puis affiche le tableau après le tri.
        public static void main(String[] args) {
            int[] tableau = {12 , 11, 13, 5, 6};
            
            System.out.println("Tableau avant le tri :");
            afficherTableau(tableau);
            
            triInsertion(tableau);
            
            System.out.println("Tableau après le tri :");
            afficherTableau(tableau);
        }

    }
    /*
Dans cet exemple, le tableau [1, 3, 5, 7, 9, 11, 13] est trié par ordre croissant. 
On recherche la valeur cible 9 dans ce tableau
 La méthode rechercheBinaire retourne l'indice de la valeur cible dans le tableau, dans ce cas, 4. 
 Si la valeur cible n'est pas présente dans le tableau, la méthode retourne -1.

Le principe de la recherche binaire est de diviser le tableau en deux moitiés à chaque itération
, en comparant la valeur du milieu avec la valeur cible. Si la valeur du milieu est égale à la valeur cible,
 on retourne l'indice du milieu. Si la valeur du milieu est inférieure à la valeur cible, on réduit la recherche à la moitié supérieure du tableau.
  Si la valeur du milieu est supérieure à la valeur cible, 
on réduit la recherche à la moitié inférieure du tableau. On répète ce processus jusqu'à trouver la valeur cible  */