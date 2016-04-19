#include <stdio.h>
#include <stdlib.h>

int main() {
  int* p = (int*)malloc(sizeof(int) * 3);
  p[0] = 10;
  *(p + 1) = 20;
  p[2] = 40;

  printf("%d, %d, %d\n", p[0], p[1], *(p + 2));
  return 0;
}
