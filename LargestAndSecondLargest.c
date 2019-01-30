#include<stdio.h>
#include<stdlib.h>

void bubbleSort(int *,int);

int main(){

    int *a;
    int n;
    int flag = 0;
    int secondLargest;

    printf("\nEnter your list size\n");
    scanf("%d",&n);

    a = (int*) malloc(sizeof(int)*n);

    printf("\nEnter your list element\n");

    for(int i = 0;i<n;++i)
		scanf("%d",&a[i]);

   
     bubbleSort(a,n);

     for(int i=n-2;i>=0;--i)
            if(a[i]<a[n-1]){
		 secondLargest = a[i];
                 flag = 1;
                 break;
            }
     

     if(flag==1)
            printf("\nLargest = %d, Second Largest = %d",a[n-1],secondLargest);
     else
            printf("\nBoth largest and second largest number is %d",a[n-1]);


     return 0;


}


void bubbleSort(int *a,int n){

     int i,j;
     int temp;


     for(i=0;i<n;++i)
	for(j=0;j<n-i-1;++j){
              if(a[j]>a[j+1]){
                     temp = a[j];
                     a[j] = a[j+1];
                     a[j+1] = temp;
              }
     }
}
           
