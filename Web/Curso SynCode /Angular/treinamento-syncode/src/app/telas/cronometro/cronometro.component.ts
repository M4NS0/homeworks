import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cronometro',
  templateUrl: './cronometro.component.html',
  styleUrls: ['./cronometro.component.scss']
})
export class CronometroComponent  {

  horaStr = '';
  horas: number = 0;
  minutoStr = '';
  minutos: number = 0;
  segundoStr = '';
  segundos: number = 0;
  milissegundoStr = '';
  milissegundos: number = 0;

  constructor() { 

    setInterval(() => {
      this.milissegundos += 1;
      this.milissegundoStr = this.formataNum(this.milissegundos) ;
      if (this.milissegundos >= 999) {
        this.milissegundos = 0;
      }
    },1);
    setInterval(() => {
      this.segundos += 1;
      this.segundoStr = this.segundos.toString() ;
      if (this.segundos > 60) {
        this.segundos = 0;
      }
    },1000);

    setInterval(() => {
      this.minutos += 1;
      this.minutoStr = this.minutos.toString() ;
      if (this.minutos > 60) {
        this.minutos = 0;
      }
    },60000);
    setInterval(() => {
      this.horas += 1;
      this.horaStr = this.horas.toString() ;
      if (this.horas>24) {
        this.horas = 0;
      }
    },3600000);
  }

  formataNum(n: number) {
    let numStr = n.toString();


    if (numStr.length === 1) {
      return ('00' + numStr);
    }
    if (numStr.length === 2) {
      return '0' + numStr;
    }
    else { return numStr}
  }
};


// tela de cronometro similar a hora mas vai mostrar os milissegundos