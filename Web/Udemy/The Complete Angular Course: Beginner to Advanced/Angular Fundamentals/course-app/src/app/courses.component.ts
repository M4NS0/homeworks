import { Component } from '@angular/core';
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
          <li *ngFor="let course of courses"> {{ course }} </li>
        </ul>
        
        <img style="width: 30%;" src="{{ imageUrl }}" /> Property Binding
        <img style="width: 30%;" [src]="imageUrl" /> Property Binding
        
        <div>
          <button class="btn btn-primary" [class.active]="isActive">Save</button> Class Binding
        </div>
        <br />
        
        <div>
          <button [style.backgroundColor]="isActive ? 'white' : 'gray'">Save</button> Style Binding
        </div>
        <br />
        
        <div (click)="onDivClicked()">
          <button (click)="onSave($event)"> Save </button> Event Bubbling
        </div>
        
        <br />
        <input (keyup)="onKeyUp($event)" /> Event Binding
        
        <br />
        <input (keyup.enter)="onEnterKeyUp()" /> Event Filtering
        
        <br />
        <input (keyup.enter)="keyUp($event)" /> Event Filtering
        
        <br />
        <input #email (keyup.enter)="keyUpEmail(email.value)" /> Template Variables
        
        <!-- 
            <input (value)="NewMail" (keyup.enter)="NewMail = $event.target.value; twoWaykeyUpEmail();"/> Two-Way Binding
            -->
        
        <br />
        <input [(ngModel)]="newMail" (keyup.enter)="twoWaykeyUpEmail()" /> Two-Way Binding
        <!-- [()] this is a banana in the box XD  -->
        <br/>
        <br/>
        
        <div>
          <ul style="list-style-type:none;margin-top:50px"> Pipes:
            <li>Name: {{ course.title | uppercase | lowercase}} </li>
            <li>Rating: {{ course.rating | number:'1.2-2' }} </li>
            <li>Rating: {{ course.rating | number:'1.1-1' }} rounded </li>
            <li>Rating: {{ course.rating | number:'2.1-1' }} (left zero adding) </li>
            <li>Students: {{ course.students | number }} </li>
            <li>Price: {{ course.price | currency:'BRL':true:'3.2-2' }} </li>
            <li>Release Date: {{ course.releaseDate | date:'shortDate'}} </li>
          </ul>
        </div>
        <br/>
        Star On/Off: <br/>
        <div> 
          {{ text | summary:10 }}
          <span class="glyphicon" [class.glyphicon-star]="isFavorite" [class.glyphicon-star-empty]="!isFavorite" (click)="onClick()"></span>
        </div>
        <br/>
        Custom Pipe Example:<br/>

        <input type="text" [(ngModel)]="title">

        <p> 
                <br>You just typed: <br> 
                <br>{{title | titleCase}}
        </p> 

        <img [src]="imageUrl" />
        <button (click)="onClick()"></button>
        <favorite [isFavorite]="post.isFavorite"></favorite>
    
        
`
})


export class CoursesComponent {
    imageUrl = "https://www.geteducated.com/wp-content/uploads/2019/11/online-tutoring-concept-ebooks-internet-courses-process-vector-staff-vector-id1053519062.jpg";
    colSpan = 2;
    courses;
    email;
    newMail = "bruno@example.com"
    isActive = false;
    title = "List of Courses";
    course = {
        title: "The Complete Angular Course",
        rating: 4.9745,
        students: 30123,
        price: 190.95,
        releaseDate: new Date(2016, 3, 1)
    }
    
    text = `Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae lacinia risus. Pellentesque a felis tortor.`

    post = { 
    title: "Title",
    isFavorite: true
  }
    isFavorite: boolean;
    onClick() {
        this.isFavorite = !this.isFavorite;
    }

    twoWaykeyUpEmail() {
        window.alert(this.newMail);
    }

    keyUpEmail(email) {
        window.alert(email)
    }

    keyUp($event) {
        window.alert($event.target.value)
    }

    onKeyUp($event) {
        if ($event.keyCode == 13)
            window.alert("Enter Was pressed!")
    }

    onEnterKeyUp() {
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
    constructor(service: CoursesService) {
        this.courses = service.getCourses();
    }
}
