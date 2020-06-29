/*
 ============================================================================
 Name        : Alocação de memória em C
 Author      : Bianchi, Dilermando, Nakamiti, Freitas, Xastre
 Version     :
 Description : Aloca dois ponteiros de memória e verifica se houve sucesso
 ============================================================================
 */
#include <stdio.h>
#include <stdlib.h>


char *s; 											// * indica a criação de um ponteiro
int *r;

int main() {


	s = (char *) malloc(2000);						// Verifica se s é igual a Null. Se essa condição for atendida
	if (s == NULL) {								// significa que o ponteiro s não recebeu o valor do endereço
		printf("\nErro de Alocação de Memória!");	// de memória da posição inicial do espaço alocado. Portanto,
		exit(1);									// não foi feita a alocação
	}
	r = (int *) malloc (40*sizeof(int));			// Mesma coisa para o ponteiro r

	// r = (int *) calloc (40, sizeof(int));		// Outra forma de fazer alocação de 40 elementos do tipo int

	if (r == NULL){
		printf("Erro de Alocação de Memória!");
		exit(1);
	}


	//s = (char *) realloc(3000);					// Expande o espaço reservado inicialmente de 2000 para 3000 bytes

	free(r);										// Libera o espaço alocado na memória associado a r (160 Bytes)
	free(s);										// Libera o espaço alocado na memória associado a s (2000 Bytes)

}
