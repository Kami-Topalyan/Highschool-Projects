#include <cs50.h>
#include<stdio.h>
#include <stdlib.h>

int main(void)
{
    while (true) {
    string name = get_string("Enter Number ");
    int x = atoi(name);
    if (x >= 1 && x <= 8) {
    for(int a = 1; a <= x; a = a + 1 ) {
        for(int b = x - a; b > 0; b--) {
            printf(" ");
        }
        for(int c = 0; c < a; c++) {
            printf("#");
        }
      printf("\n");
    }
    break;
    }
    else {
        printf("Enter a value between 1 and 8: ");
    }
   }
   }