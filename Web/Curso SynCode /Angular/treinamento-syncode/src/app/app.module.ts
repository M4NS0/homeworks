import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { DataAtualComponent } from '../app/data-atual/data-atual.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AlarmeComponent } from './alarme/alarme.component';

@NgModule({
  declarations: [
    AppComponent,
    DataAtualComponent,
    NavbarComponent,
    AlarmeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
