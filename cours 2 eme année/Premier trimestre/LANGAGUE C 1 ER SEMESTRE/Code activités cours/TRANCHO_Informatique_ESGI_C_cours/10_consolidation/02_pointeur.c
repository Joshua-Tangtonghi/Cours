#include <stdio.h>
#include <stdlib.h>

int main() {
	int variable = 42;
	int * pointeur = &variable;
	*pointeur = 1337;
	printf("%d\n", variable); /* affiche 1337 */
	exit(EXIT_SUCCESS);
}