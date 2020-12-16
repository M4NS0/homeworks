import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DataAtualComponent } from './data-atual/data-atual.component';


const routes: Routes = [
  {path: 'data-hora-atual', component: DataAtualComponent },
  {path: '', redirectTo:'data-hora-atual' , pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
