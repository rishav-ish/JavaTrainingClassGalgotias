#include<stdio.h>

int findSum(int,int);
int findSum2(int[],int);

int main(){
    
    int a[]= {2,4,5,6,7,8,9};
    int n=7;
    int lowerBound=2;
    int upperBound=9;

    int totalSum = findSum(lowerBound,upperBound);
    int arraySum = findSum2(a,n);

    printf("\n%d is missing",totalSum-arraySum);
    
}


int findSum(int a,int b){

     int sum = 0;
    
     for(int i = a;i<=b;++i)
               sum += i;

      return sum;
}

int findSum2(int a[],int n){
    int sum = 0;

     for(int i =0;i<n;++i)
               sum += a[i];

      return sum;
}
