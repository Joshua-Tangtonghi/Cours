#include <stdio.h>
#include <stdlib.h>

int main() {
  int age; /* Déclare une variable */
  printf("Quel est votre age ? "); /* Affiche du texte */
  scanf("%d", &age); /* Lit une valeur et la met dans 'age' */
  printf("Vous avez donc %d ans !\n", age); /* Affiche la valeur de 'age' */
  exit(EXIT_SUCCESS);
}