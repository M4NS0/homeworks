import { Component } from '@angular/core';
import { CoursesService } from './course/courses.service';


// v Decorator
// inside brackets, will tell how this component works
@Component({
    // selector - anywhere we have an element called courses angular will render the template inside that element
    selector: 'courses',     // <course> => "courses"
                            // <div class="courses"> => ".courses"
                            // <div id="courses" => "#courses"

           // '<h2>{{ getTitle() }}</h2>'    // getTitle - String interpolation
    template: `
    <h2> {{title}} </h2>
    <ul>
        <!-- Loop variable in JS v -->
        <li *ngFor="let course of courses">
        <!--^ Directives is used to manipulate the dom  -->
            {{ course }}
        </li>
    </ul>
    `
    
         
})


export class CoursesComponent {
    title = "List of Courses";
    // getTitle() {
    //     return this.title;
    // }

    // courses = ["Angular","JavaScript","Css"];
    
    // Logic for calling an HTTP service
    // Component should NOT include any logic other then the presentation logic
    // one of the reason that services are used in Angular
    
    // services can be reused

    courses;
        // Dependency Injection:
        // Injecting/providing a dependency of a class into it's constructor
        // It will initiate and passes it to the coursesComponent
        // Angular has a dependency injection framework build into it
        //                     v Dependency, needs to be registered somewhere in our model (continue on app.module.ts )
    constructor(service: CoursesService) {
        // passing a parameter ^ angular will always instantiate a new coursesService Option
        // fake implementations for unit tests 
        
        // no need to create a new Object variable:
        // let service = new CoursesService();

        this.courses = service.getCourses();
    }
}
