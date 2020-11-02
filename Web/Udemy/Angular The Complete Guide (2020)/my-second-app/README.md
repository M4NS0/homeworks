# MySecondApp

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 10.2.0.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.

## How Angular Works?

 All documents that have component in their names, inside app folders  are related to the app-roo> component

  inside app.component.ts: 
    selector: 'app-root'
    assigns the string 'selector' as a value named 'app-root'
  
  inside app.component.html:
    contains the template of the component 
  
  When this page is inspected, in the final of the document, injection of  imports, bundles, styles can be seen
  
  inside main.ts
    in 11th line bootstraps starts inside the angular application by passing 
    the AppModule to app.module.ts though this method platformBrowserDynamic().bootstrapModule(AppModule)
  
  inside the app.module.ts: 
    now we can see a bootstrap array inside it: bootstrap: [AppComponent] referencing the AppComponent of Angular in <app-root>
    


  the App components will not be added to index.html, their selectors will not be added here, but in the document app.component.html  