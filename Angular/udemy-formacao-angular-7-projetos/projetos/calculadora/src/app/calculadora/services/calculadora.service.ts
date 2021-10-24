/**
 * Serviço responsável por executar as operações da calculadora
 *
 * @author Bruno C. Manso <mrbrunomanso@gmail.com>
 * @since 1.0.0
 */

import { Injectable } from '@angular/core';

/* provê serviços sem necessidade de instanciação */
@Injectable({ providedIn: 'root' })
export class CalculadoraService {
  /*
    Define as constantes utilizadas para identificar as operações de cálculo 
    Como convenção, constantes sempre são declaradas em letras maiúsculas
  */

  static readonly SOMA: string = '+';
  static readonly SUBTRACAO: string = '-';
  static readonly DIVISAO: string = '/';
  static readonly MULTIPLICACAO: string = '*';

  constructor() {}

  /**
   * Método que calcula uma operação matemática usando dois números.
   * Suporta as operações soma, subtração, divisão e multiplicação.
   *
   * @param num1 number
   * @param num2 number
   * @param operacao string Operação a ser executada
   * @return number Resultado da operação
   */

  calcular(num1: number, num2: number, operacao: string): number {
    // : number tipo de retorno
    let resultado: number; // armazena o resultado da operação // let -  variável local ao contrário do var que é publico

    switch (operacao) {
      case CalculadoraService.SOMA: // .SOMA permitida pela declaração de static
        resultado = num1 + num2;
        break;

      case CalculadoraService.SUBTRACAO:
        resultado = num1 - num2;
        break;

      case CalculadoraService.DIVISAO:
        resultado = num1 / num2;
        break;

      case CalculadoraService.MULTIPLICACAO:
        resultado = num1 * num2;
        break;

      default:
        resultado = 0;
    }

    return resultado;
  }
}
