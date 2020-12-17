import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-atual',
  templateUrl: './data-atual.component.html',
  styleUrls: ['./data-atual.component.scss']
})
export class DataAtualComponent  {
  data: Date = new Date();

  horaFormatada: string = '';
  minutosFormatados: string = '';
  dataFormatada: string = '';
  mensagem: string = '';
  doisPontos: string = '';
  
  constructor() {
    this.dataFormatada = this.data.getDate().toString() + '/' 
                      + (this.data.getMonth() + 1).toString() + '/' 
                      + this.data.getFullYear().toString();
    setInterval(() => {
      this.data = new Date();
      this.horaFormatada = this.getFormatado(this.data.getHours().toString())                    
      this.minutosFormatados = this.getFormatado(this.getFormatado(this.data.getMinutes().toString()))
      
      if ((this.data.getHours() >= 5) && (this.data.getHours() < 12)) {
        this.mensagem = "Bom Dia!";
      } 
      if ((this.data.getHours() < 5) && (this.data.getHours() > 0)) {
        this.mensagem = "Boa Noite!";
      } 
      if ((this.data.getHours() >= 12) && (this.data.getHours() < 18)) {
        this.mensagem = "Boa Tarde!";
      } 
      if ((this.data.getHours() >= 18)) {
        this.mensagem = "Boa Noite!";
      } 
      this.doisPontos = ":" ;
    }, 1000);

    setInterval(() => {
      this.doisPontos = "" ;
      
    },500);
  }
  
  getFormatado(numStr: string) {
    if (numStr.length === 1)
      return '0' + numStr;
    else
      return numStr;
  }

}