#include <stdio.h>
#include <stdlib.h>

int main() {
	int variable = 42;
	printf("Valeur de variable : %d\n", variable);
	printf("Adresse de variable : %p\n", &variable);
	exit(EXIT_SUCCESS);
}