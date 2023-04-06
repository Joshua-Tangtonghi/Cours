#include <stdio.h>
#include <stdlib.h>

int main() {
	char caractere;
	printf("Entrez un caractere : ");
	scanf("%c", &caractere);
	printf("Voici votre caractere : '%c'\n", caractere);
	exit(EXIT_SUCCESS);
}