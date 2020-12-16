import { Component } from '@angular/core';

// steps:
// Create a Component (courses.components.ts)
// Register it in a module
// Add an element in an HTML markup

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'app1';
}
