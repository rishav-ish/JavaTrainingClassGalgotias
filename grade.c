#include<stdio.h>

int main(){
    
    short marks;

    scanf("%d",&marks);

    if(marks>=90 && marks<=100)
	  printf("Grade A");
    else if(marks>=80 && marks<=89)
          printf("Grade B");
    else if(marks>=70 && marks<=79)
	  printf("Grade C");
    else if(marks>=60 && marks <= 69)
	  printf("Grade D");
    else if(marks>=50 && marks <= 59)
	  printf("Grade C");
    else if(marks<50)
	  printf("Grade D");

}
