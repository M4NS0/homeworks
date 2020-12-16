import { Component } from '@angular/core';
import { $ } from 'protractor';
import { CoursesService } from './course/courses.service';



@Component({
   
    selector: 'courses',    
    template: 
    `
    <h2> {{title}} (Interpolation) </h2>
    <h2 [textContent]="title"> (Property Binding - This comment won't show up!!) </h2>  

    <table>
        <tr>
            <!-- <td [colspan]="colSpan"> </td> -->
            <td [attr.colspan]="colSpan"> </td>
        </tr>
    </table>

    <ul>
        <li *ngFor="let course of courses">  {{ course }} </li>
    </ul>

    <img style="width: 30%;" src="{{ imageUrl }}" /> Property Binding
    <img style="width: 30%;"[src]="imageUrl" />     Property Binding

    <div>
        <button class="btn btn-primary" [class.active]="isActive">Save</button> Class Binding
    </div>
    <br/>

    <div> 
        <button [style.backgroundColor]="isActive ? 'white' : 'gray'">Save</button> Style Binding 
    </div>
    <br/>

    <div (click)="onDivClicked()">
        <button (click)="onSave($event)"> Save </button> Event Bubbling
    </div>
    
    <br/>
    <input (keyup)="onKeyUp($event)"/> Event Binding

    <br/>
    <input (keyup.enter)="onEnterKeyUp()"/> Event Filtering

    <br/>
    <input (keyup.enter)="keyUp($event)"/> Event Filtering

    <br/>
    <input #email (keyup.enter)="keyUpEmail(email.value)"/> Template Variables
    `
})


export class CoursesComponent {
    isActive = false;
    title = "List of Courses";
    
    keyUpEmail(email) {
        window.alert(email)
    }

    keyUp($event) {
        window.alert($event.target.value)
    }

    onKeyUp ($event) {
        if ($event.keyCode == 13)
        window.alert("Enter Was pressed!")
    }

    onEnterKeyUp () {
        window.alert("Enter Was pressed!")
    }

    onDivClicked() {
        console.log("Div was clicked")
    }
   
    onSave($event) {
        
        $event.stopPropagation(); // bug
        window.alert("Button was clicked");
        console.log($event)
    }

    imageUrl = "https://www.geteducated.com/wp-content/uploads/2019/11/online-tutoring-concept-ebooks-internet-courses-process-vector-staff-vector-id1053519062.jpg";
    colSpan = 2;
    courses;
       constructor(service: CoursesService) {
        this.courses = service.getCourses();
    }
}
