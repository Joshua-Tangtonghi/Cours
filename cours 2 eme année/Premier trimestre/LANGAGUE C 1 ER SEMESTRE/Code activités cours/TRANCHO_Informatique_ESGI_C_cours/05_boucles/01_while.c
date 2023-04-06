#include <stdio.h>
#include <stdlib.h>

int main() {
	int nombre = 0;
	printf("Entrez un nombre positif s'il-vous-plaît : ");
	scanf("%d", &nombre);
	while(nombre < 0) {
		printf("Je répète, entrez un nombre positif s'il-vous-plaît : ");
		scanf("%d", &nombre);
	}
	printf("Oh, un nombre positif : %d\n", nombre);
	exit(EXIT_SUCCESS);
}