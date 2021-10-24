import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TarefaRoutes } from './tarefas';

export const routes: Routes = [
  {
    path: '',  // se o path for vazio
    redirectTo: '/tarefas/listar', // redireciona para tarefas
    pathMatch: 'full' // passa a url completa
  },
  ...TarefaRoutes // permite concatenar arrays, mergea o tarefas route na rota principal
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
