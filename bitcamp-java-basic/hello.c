#include <stdio.h>
#include <stdio.h>

int main()
{
    int* p = malloc (4);
    *p = 200;
	printf("i = %d\n", *p);
	return 0;
}