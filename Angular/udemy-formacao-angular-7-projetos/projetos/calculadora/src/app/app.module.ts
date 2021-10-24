import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CalculadoraModule } from './calculadora'; // acesso permitido pelo index.ts

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    CalculadoraModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
