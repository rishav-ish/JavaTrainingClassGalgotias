#include<stdio.h>

int main(){
    int x,y;

    printf("\nEnter two number such that num1 < num2 \n");
    scanf("%d%d",&x,&y);

    if(x>y){
        printf("\nPlease re-run the programme and follow the instruction");
        return 0;
    }


    if(x%2!=0)
	++x;
    else
        x+=2;
    

    for(int i =x;i<y;i+=2)
		printf("%d\n",i);
  
}
     
