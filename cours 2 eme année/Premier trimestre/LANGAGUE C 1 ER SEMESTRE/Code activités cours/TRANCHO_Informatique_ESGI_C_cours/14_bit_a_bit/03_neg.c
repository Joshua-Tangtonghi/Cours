#include <stdio.h>
#include <stdlib.h>

int main() {
	int i = 42;
	printf("%d + %d = %d\n", i, ~i + 1, i + ~i + 1);
	exit(EXIT_SUCCESS);
}