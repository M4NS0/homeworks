import { Component } from '@angular/core';

@Component({
  // assigning the string 'selector' as a value named 'app-root':
  selector: 'app-root',  
  
   // assigning the template:
  templateUrl: './app.component.html',

  // styleUrls: ['./app.component.css']  // (old line)
  // stylesheets reference, passing attributes from app.components.css through server.component.html
  // could add pointers to another stylesheets styleUrls: ['./app.component.css', './anotherStylesheetComponent']
  // or it allows to add styles right here, using an array of css lines
  // in this way, it will override the app.component.css document, giving it priority, as bellow:                                   
  styles: [`
    h3 {
      color: dodgerblue;
    }
  `]
})

export class AppComponent {
}
