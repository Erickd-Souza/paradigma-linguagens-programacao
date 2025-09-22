#include <stdio.h>

contador(){
    int a = 0;
    a++;
    printf("\n Variavel automatica: %d", a);
    static int b = 0;
    b++;
    printf("\n Variavel estatica: %d\n", b);
}

int main(){
    int i;
    for(i = 0; i < 3; i++){
        contador();
    }
       
}
