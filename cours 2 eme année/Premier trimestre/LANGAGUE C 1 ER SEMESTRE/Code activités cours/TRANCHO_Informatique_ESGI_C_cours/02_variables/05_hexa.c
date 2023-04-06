#include <stdio.h>
#include <stdlib.h>

int main() {
	int reponse = 0x2a;
	printf("La reponse a la vie est %x !\n", reponse);
	printf("Ah, pour les humains ? C'est %d !\n", reponse);
	exit(EXIT_SUCCESS);
}