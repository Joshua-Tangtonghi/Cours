#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TAILLE_DEMO 100
#define TAILLE_PERF 100000

/* afficher_tableau affiche la liste de ses éléments au format [e1, e2, ..., eN] */
void afficher_tableau(int * values, int taille);
/* copie_tableau recopie les éléments de source dans destination */
void copier_tableau(int * destination, int * source, int taille);
/* aleatoire remplit un tableau par des valeurs aléatoires */
void aleatoire(int * valeurs, int taille);
/* swap échange les valeurs référencées par deux adresses */
void swap(int * a, int * b);
/* trier_algo est une implémentation du tri par tas */
void trier_algo(int * valeurs, int taille);
/* trier_eleve est votre méthode pour trier un tableau */
void trier_eleve(int * valeurs, int taille);
/* verif_trier renvoie 1 si la tableau est trié et 0 sinon */
int verif_trier(int * valeurs, int taille);

int main() {
  srand(time(NULL));
  int valeurs[TAILLE_PERF];
  int methode_eleve[TAILLE_PERF];
  int methode_algo[TAILLE_PERF];
  clock_t start, stop;
  
  aleatoire(valeurs, TAILLE_DEMO);
  copier_tableau(methode_eleve, valeurs, TAILLE_DEMO);
  copier_tableau(methode_algo, valeurs, TAILLE_DEMO);
  printf("non trié : ");
  afficher_tableau(valeurs, TAILLE_DEMO);
  trier_algo(methode_algo, TAILLE_DEMO);
  printf("methode_algo : ");
  afficher_tableau(methode_algo, TAILLE_DEMO);
  trier_eleve(methode_eleve, TAILLE_DEMO);
  printf("methode_eleve : ");
  afficher_tableau(methode_eleve, TAILLE_DEMO);
  
  aleatoire(valeurs, TAILLE_PERF);
  copier_tableau(methode_eleve, valeurs, TAILLE_PERF);
  copier_tableau(methode_algo, valeurs, TAILLE_PERF);
  printf("tableau de taille %d :\n", TAILLE_PERF);
  start = clock();
  trier_algo(methode_algo, TAILLE_PERF);
  stop = clock();
  double temps_algo = (stop - start);
  printf("methode_algo %s\n", verif_trier(methode_algo, TAILLE_PERF) ? "est trié" : "n'est pas trié");
  printf("Temps écoulé : %g s\n", temps_algo / 1000000.);
  start = clock();
  trier_eleve(methode_eleve, TAILLE_PERF);
  stop = clock();
  double temps_eleve = (stop - start);
  printf("methode_eleve %s\n", verif_trier(methode_eleve, TAILLE_PERF) ? "est trié" : "n'est pas trié");
  printf("Temps écoulé : %g s\n", temps_eleve / 1000000.);
  printf("Soit une différence de l'ordre d'un facteur %g\n", temps_eleve / temps_algo);
  exit(EXIT_SUCCESS);
}