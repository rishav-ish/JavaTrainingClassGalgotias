#include<stdio.h>
#define MAX 98


int main(){
    
    int a[MAX] = {0};
    int temp;

    printf("\nEnter the numbers \n");

    for(int i =0;i<MAX-1 ;++i){
           scanf("%d",&temp);

           --temp;

            ++a[temp];
     }

     printf("\nFollowing are the missing numbers ");

     for(int i = 1;i < MAX-1 ;++i){
             if(a[i]==0)
                   printf("%d\n",i+1);
      }

}

//
