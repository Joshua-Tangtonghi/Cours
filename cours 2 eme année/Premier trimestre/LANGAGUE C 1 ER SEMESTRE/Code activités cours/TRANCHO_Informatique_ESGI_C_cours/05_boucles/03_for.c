#include <stdio.h>
#include <stdlib.h>

int main() {
	int compteur;
	for(compteur = 0; compteur < 5; ++compteur) {
		printf("Le compteur vaut %d\n", compteur);
	}
	printf("Et voilà !\n");
	exit(EXIT_SUCCESS);
}