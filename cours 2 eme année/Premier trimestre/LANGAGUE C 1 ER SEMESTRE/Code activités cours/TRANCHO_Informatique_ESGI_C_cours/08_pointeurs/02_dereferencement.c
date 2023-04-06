#include <stdio.h>
#include <stdlib.h>

int main() {
	int variable = 42;
	int * adresse = &variable;
	printf("Maison :   variable : %d\n", variable);
	printf("Adresse : &variable : %p\n", &variable);
	printf("Adresse :   adresse : %p\n", adresse);
	printf("Maison :   *adresse : %d\n", *adresse);
	printf("Maison : *&variable : %d\n", *&variable);
	exit(EXIT_SUCCESS);
}