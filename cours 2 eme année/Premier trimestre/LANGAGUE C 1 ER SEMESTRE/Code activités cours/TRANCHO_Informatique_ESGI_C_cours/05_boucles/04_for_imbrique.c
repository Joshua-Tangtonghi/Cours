#include <stdio.h>
#include <stdlib.h>

int main() {
	int ligne, colonne;
	for(ligne = 1; ligne <= 5; ++ligne) {
		for(colonne = 1; colonne <= ligne; ++colonne) {
		    printf("*");
		}
		printf("\n");
	}
	exit(EXIT_SUCCESS);
}