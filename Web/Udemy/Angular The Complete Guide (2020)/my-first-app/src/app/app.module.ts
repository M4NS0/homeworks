import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'; // to add forms at angular

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule      //  allow imports of forms to ngModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
