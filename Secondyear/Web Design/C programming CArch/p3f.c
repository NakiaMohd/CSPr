#include <stdio.h>
#include <fcntl.h>
main()
{
int n, fd;
char file[30];
char buffer[10];

printf("What's your file name?\n");
scanf("%s",file);

fd = open("%s", O_RDWR);	
/*n = read(fd, buffer, 10);*/

do {
n=read(fd, buffer, 10); /*Read 10 chars from file*/
write(1, buffer, n); /*Write chars to text terminal*/
} while (n==10); /* keep reading until n < 10 */

printf("In this file is: \n", n);
write(1, buffer, n);
printf("\n");


close(fd);
}
