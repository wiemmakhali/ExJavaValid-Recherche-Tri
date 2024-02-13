public class RechercheBinaire {

    
        public static int rechercheBinaire(int[] tableau, int valeurCible) {
            int debut = 0;
            int fin = tableau.length - 1;
    
            while (debut <= fin) {
                int milieu = (debut + fin) / 2;
    
                if (tableau[milieu] == valeurCible) {
                    return milieu;
                } else if (tableau[milieu] < valeurCible) {
                    debut = milieu + 1;
                } else {
                    fin = milieu - 1;
                }
            }
    
            return -1;
        }
        public static void main(String[] args) {
            int[] tableau = {1, 3, 5, 7, 9, 11, 13};
            int valeurCible = 3;
            int indice = rechercheBinaire(tableau, valeurCible);
            System.out.println("Indice de la valeur cible : " + indice);
        }
    }

