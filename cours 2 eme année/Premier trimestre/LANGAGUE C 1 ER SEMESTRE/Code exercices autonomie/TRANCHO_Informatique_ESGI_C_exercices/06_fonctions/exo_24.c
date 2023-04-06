#include <stdio.h>
#include <stdlib.h>
unsigned long fibonacci_Alice(int n);
unsigned long fibonacci_Bob(int n);
unsigned long fibonacci_Charlie(int n);
void afficher_fibonacci(
        int borne, 
        const char * nom, 
        unsigned long (*fibonacci)(int)) {
    int i;
    printf("%s : ", nom);
    for(i = 0; i < borne; ++i) {
        if(i) { printf(", "); }
        printf("%lu", fibonacci(i));
    }
    printf("\n");
}
int main() {
    afficher_fibonacci(16, "Alice  ", fibonacci_Alice);
    afficher_fibonacci(16, "Bob    ", fibonacci_Bob);
    afficher_fibonacci(16, "Charlie", fibonacci_Charlie);
    exit(EXIT_SUCCESS);
}