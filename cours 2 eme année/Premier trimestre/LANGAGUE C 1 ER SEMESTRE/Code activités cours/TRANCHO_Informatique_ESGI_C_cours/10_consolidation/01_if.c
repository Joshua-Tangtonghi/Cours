#include <stdio.h>
#include <stdlib.h>

int main() {
	int first, second;
	scanf("%d %d", &first, &second);
	if(first > second) {
	  printf("%d est plus grand.\n", first);
	} else if(first < second) {
	  printf("%d est plus grand.\n", second);
	} else {
	  printf("les deux sont égaux.\n");
	}
	exit(EXIT_SUCCESS);
}