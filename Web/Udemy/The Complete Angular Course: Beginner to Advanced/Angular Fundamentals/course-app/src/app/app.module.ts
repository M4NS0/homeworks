import { SummaryPipe } from './summary.pipe';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoursesComponent } from './courses.component';
import { CourseComponent } from './course/course.component'; // auto generated by adding the declaration
import { CoursesService } from './course/courses.service';
import { AuthorsComponent } from './authors/authors.component';
import { AuthorsService } from './authors.service';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [    // here we add all the components
    AppComponent,
    CoursesComponent,
    CourseComponent,
    AuthorsComponent,  // this component was auto generated using: ng g c course
    SummaryPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    FormsModule
  ],
                
  providers: [  
    CoursesService,
    AuthorsService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
