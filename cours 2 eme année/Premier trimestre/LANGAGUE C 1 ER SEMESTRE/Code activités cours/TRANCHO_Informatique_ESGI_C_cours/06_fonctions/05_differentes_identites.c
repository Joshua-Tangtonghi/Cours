#include <stdio.h>
#include <stdlib.h>

void test(int variable) {
  variable = 10;
  printf("%p : %d\n", &variable, variable);
}

int main() {
  int variable = 42;
  printf("%p : %d\n", &variable, variable);
  test(variable);
  printf("%p : %d\n", &variable, variable);
  exit(EXIT_SUCCESS);
}