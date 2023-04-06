#include <stdio.h>
#include <stdlib.h>

int main() {
	int entier = 42;
	int * adresse;

	adresse = &entier;

	printf("%p\n", adresse);
	exit(EXIT_SUCCESS);
}