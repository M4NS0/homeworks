import { Component, OnInit } from '@angular/core';

@Component({
  // First way:
  // selector: 'app-servers', // (oldest code)
  // it allows to add a specific selector

  // Second way:
  // Allows to add a bunch of selectors using a array, as bellow:
  // selector: '[app-servers]', // (old code)
  
  // *Angular will not recognize the first way, inside app.component.html anymore*
  // *because we change the selector for an attribute*
  
  // Third way:
  // can be selected by class:
  selector: '.app-servers',

  // templateUrl: './servers.component.html',
  template: `
  <app-server></app-server>
  <app-server></app-server>`, 
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
