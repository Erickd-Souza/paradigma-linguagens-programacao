#include <stdio.h>

struct Livro {
    char titulo[50];
    char autor[50];
    int anoPublicacao;
};

int main(){

int array[5] = {1, 2, 3, 4, 5};

for(int i = 0; i < 5; i++){
    printf("%d\n", array[i]);
}

struct  Livro livro1 = {"Dom Casmurro", "Machado de Assis", 1899};
printf("Título: %s\n", livro1.titulo);

}