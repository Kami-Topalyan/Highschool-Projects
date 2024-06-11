#include <stdio.h>
#include <cs50.h> //include the given cs50 library

int main(void)
{
    string name = get_string("What's your name? "); // Get the input and save it into name string
    printf("hello, %s\n", name); // print name

}