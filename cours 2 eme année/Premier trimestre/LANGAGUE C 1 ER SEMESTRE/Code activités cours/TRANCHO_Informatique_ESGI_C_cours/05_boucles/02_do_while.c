#include <stdio.h>
#include <stdlib.h>

int main() {
	int nombre = 0;
	do {
		printf("Entrez un nombre positif s'il-vous-plaît : ");
		scanf("%d", &nombre);
	} while(nombre < 0);
	printf("Oh, un nombre positif : %d\n", nombre);
	exit(EXIT_SUCCESS);
}