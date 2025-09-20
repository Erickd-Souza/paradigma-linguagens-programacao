# Atividades para Casa – Capítulo 8

## Atividade 1 – Reescrevendo código sem `goto`
Você recebeu o seguinte pseudocódigo, escrito de forma semelhante ao estilo das primeiras versões do Fortran, utilizando `goto`:

```text
i := 1
goto check

loop:
    print(i)
    i := i + 1

check:
    if (i <= 10) then
        goto loop
```

**Tarefas:**
1. Reescreva o código acima utilizando um laço de repetição pré-teste (`while`) em uma linguagem de sua escolha (C, Java, Python, etc.).

`Resposta`:

#include <stdio.h>
void main(){
	int i = 1;
	while(i<=10){
		printf("\n %d", i);
		i++;
	}
}

2. Reescreva novamente utilizando um laço de repetição controlado por contador (`for`).
`Resposta:`

#include <stdio.h>
void main(){
	int i = 1;
	for(i=1;i<=10;i++){
		printf("\n %d", i);
	}
}

3. Compare os três códigos (original com `goto`, versão com `while` e versão com `for`) e escreva um pequeno parágrafo discutindo qual forma é mais legível e por quê.
`Resposta`: No meu ponto de vista, a versão com for é mais legível. Pois temos um laço de repetição defenido sendo 10 ou seja sendo mais indicado para este cenário o laço while é mais indicado quando não sabemos a quantidade que o laço será repetido.
---

## Atividade 2 – Seleção múltipla em diferentes linguagens
Muitos programas oferecem menus interativos. Suponha que você precisa implementar um menu com as seguintes opções:

1. Calcular o quadrado de um número.
2. Calcular o fatorial de um número.
3. Sair do programa.

**Tarefas:**
1. Implemente esse menu em **C** utilizando `switch/case`.
#include <stdio.h>

int main(){
	int opcao;
	printf("\n\t\t MENU:");
	printf("\n 1 - Calcular o quadrado de um numero.");
	printf("\n 2 - Calcular o fatorial de um numero.");
	printf("\n 3 - Sair do Programa.");
	printf("\n Selecione uma Opcao:");
	scanf("%d", &opcao);
	
	switch(opcao){
		case 1 : 
		printf("\n Implementacao de quadrado de um numero");
		break;
		case 2 :
			printf("\n Implementacao de um fatorial.");
		break;
		case 3 :
		    printf("\n Saindo...");
		    return 0;
		default:
			printf("\n Opcao invalida!");
	}
}

2. Implemente o mesmo menu em **Python**, utilizando apenas `if/elif/else`.
def main():
    print("\n\t\t MENU:")
    print(" 1 - Calcular o quadrado de um numero.")
    print(" 2 - Calcular o fatorial de um numero.")
    print(" 3 - Sair do Programa.")
    
    opcao = int(input(" Selecione uma opcao: "))
    
    if opcao == 1:
        print(" \n Implementacao de quadrado de um numero")    
    
    elif opcao == 2:
        print("\n Implementacao de um fatorial") 
    
    elif opcao == 3:
        print("\n Saindo do programa...")
    
    else:
        print("\n Opcao invalida!")
        
if __name__ == "__main__":
    main()

3. Execute os dois programas e compare as soluções em relação à clareza e quantidade de código.
`Resposta`: A linguagem Python exige menos linhas de código, pois é menos verbosa em relação à linguagem C. Como C é de tipagem estática, sua sintaxe exige mais declarações, o que torna o código mais extenso.
---

4. Escreva um comentário final destacando em qual linguagem foi mais simples de implementar e justificar o motivo.
`Resposta`: Apesar de  a linguagem C ser mais verbosa, foi mais fácil de implementar, pois eu já possuía o conhecimento necessário para codificar. Já em python eu precisei buscar mais informações sobre a sintaxe, sendo sua linguagem dinamica flexibilizando a implementação sem precisar declarar todos os tipos de estruturas. 
---

## Atividade 3 – Explorando alternativas ao `goto`
Historicamente, o `goto` foi usado para resolver diferentes tipos de desvio. Hoje, a maioria das linguagens fornece alternativas como `break`, `continue` e `return`.

**Tarefas:**
1. Escreva um programa que percorra uma lista de números inteiros e:
   - Pare imediatamente a execução ao encontrar o número 0 (`break`).
   - Pule os números negativos sem processá-los (`continue`).
   - Retorne o dobro do primeiro número par encontrado (`return`).
#include<stdio.h>

int main(){
	int num[20]={1,13,11,19,54,22,-8,41,0,987,156,184,191,197,542,367,875,43,690,98},i;
	for(i = 0; i < 20; i++){
		if(num[i] == 0){
			break;
		}
		if(num[i] < 0){
			continue;
		}	
		printf("\n %d", num[i]);
		if(num[i] % 2 == 0){
			printf(" Dobro primeiro numero par: %d", num[i]*2);
			return num[i] * 2;	
		}	
	}

}

2. Comente sobre como seria a implementação desse mesmo programa utilizando apenas `goto` e rótulos, destacando as vantagens da abordagem moderna.
`Resposta`: Isso tornaria o código mais extenso, confuso e difícil de manter, pois o fluxo de execução ficaria disperso entre os vários saltos goto. Já a abordagem moderna, utilizando for, break, continue e return, permite expressar de forma clara e direta cada ação do programa, reduzindo a quantidade de código desnecessário e facilitando a leitura e manutenção. Deste forma, o programa se torna mais seguro e menos sujeito a erros.