#include <stdio.h>
#include <stdlib.h>

void test() {
  variableDeMain = 10;
}

int main() {
  int variableDeMain = 42;
  printf("%d\n", variableDeMain);
  test();
  printf("%d\n", variableDeMain);
  exit(EXIT_SUCCESS);
}