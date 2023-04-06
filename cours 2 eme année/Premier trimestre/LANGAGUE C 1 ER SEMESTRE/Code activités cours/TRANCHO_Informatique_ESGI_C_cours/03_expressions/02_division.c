#include <stdio.h>
#include <stdlib.h>

int main() {
	float resultat = 1 / 2;
	printf("1 / 2 = %g\n", resultat);
	printf("1. / 2 = %g\n", 1. / 2);
	printf("1 / 2. = %g\n", 1 / 2.);
	printf("1. / 2. = %g\n", 1. / 2.);
	exit(EXIT_SUCCESS);
}