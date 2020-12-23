"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.CoursesComponent = void 0;
var core_1 = require("@angular/core");
var CoursesComponent = /** @class */ (function () {
    function CoursesComponent(service) {
        this.imageUrl = "https://www.geteducated.com/wp-content/uploads/2019/11/online-tutoring-concept-ebooks-internet-courses-process-vector-staff-vector-id1053519062.jpg";
        this.colSpan = 2;
        this.newMail = "bruno@example.com";
        this.isActive = false;
        this.title = "List of Courses";
        this.course = {
            title: "The Complete Angular Course",
            rating: 4.9745,
            students: 30123,
            price: 190.95,
            releaseDate: new Date(2016, 3, 1)
        };
        this.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae lacinia risus. Pellentesque a felis tortor.";
        this.courses = service.getCourses();
    }
    CoursesComponent.prototype.onClick = function () {
        this.isFavorite = !this.isFavorite;
    };
    CoursesComponent.prototype.twoWaykeyUpEmail = function () {
        window.alert(this.newMail);
    };
    CoursesComponent.prototype.keyUpEmail = function (email) {
        window.alert(email);
    };
    CoursesComponent.prototype.keyUp = function ($event) {
        window.alert($event.target.value);
    };
    CoursesComponent.prototype.onKeyUp = function ($event) {
        if ($event.keyCode == 13)
            window.alert("Enter Was pressed!");
    };
    CoursesComponent.prototype.onEnterKeyUp = function () {
        window.alert("Enter Was pressed!");
    };
    CoursesComponent.prototype.onDivClicked = function () {
        console.log("Div was clicked");
    };
    CoursesComponent.prototype.onSave = function ($event) {
        $event.stopPropagation(); // bug
        window.alert("Button was clicked");
        console.log($event);
    };
    CoursesComponent = __decorate([
        core_1.Component({
            selector: 'courses',
            template: "\n        <h2> {{title}} (Interpolation) </h2>\n        <h2 [textContent]=\"title\"> (Property Binding - This comment won't show up!!) </h2>\n        \n        <table>\n          <tr>\n            <!-- <td [colspan]=\"colSpan\"> </td> -->\n            <td [attr.colspan]=\"colSpan\"> </td>\n          </tr>\n        </table>\n        \n        <ul>\n          <li *ngFor=\"let course of courses\"> {{ course }} </li>\n        </ul>\n        \n        <img style=\"width: 30%;\" src=\"{{ imageUrl }}\" /> Property Binding\n        <img style=\"width: 30%;\" [src]=\"imageUrl\" /> Property Binding\n        \n        <div>\n          <button class=\"btn btn-primary\" [class.active]=\"isActive\">Save</button> Class Binding\n        </div>\n        <br />\n        \n        <div>\n          <button [style.backgroundColor]=\"isActive ? 'white' : 'gray'\">Save</button> Style Binding\n        </div>\n        <br />\n        \n        <div (click)=\"onDivClicked()\">\n          <button (click)=\"onSave($event)\"> Save </button> Event Bubbling\n        </div>\n        \n        <br />\n        <input (keyup)=\"onKeyUp($event)\" /> Event Binding\n        \n        <br />\n        <input (keyup.enter)=\"onEnterKeyUp()\" /> Event Filtering\n        \n        <br />\n        <input (keyup.enter)=\"keyUp($event)\" /> Event Filtering\n        \n        <br />\n        <input #email (keyup.enter)=\"keyUpEmail(email.value)\" /> Template Variables\n        \n        <!-- \n            <input (value)=\"NewMail\" (keyup.enter)=\"NewMail = $event.target.value; twoWaykeyUpEmail();\"/> Two-Way Binding\n            -->\n        \n        <br />\n        <input [(ngModel)]=\"newMail\" (keyup.enter)=\"twoWaykeyUpEmail()\" /> Two-Way Binding\n        <!-- [()] this is a banana in the box XD  -->\n        \n        \n        <div>\n          <ul style=\"list-style-type:none;margin-top:50px\">\n            <li>Name: {{ course.title | uppercase | lowercase}} </li>\n            <li>Rating: {{ course.rating | number:'1.2-2' }} </li>\n            <li>Rating: {{ course.rating | number:'1.1-1' }} rounded </li>\n            <li>Rating: {{ course.rating | number:'2.1-1' }} (left zero adding) </li>\n            <li>Students: {{ course.students | number }} </li>\n            <li>Price: {{ course.price | currency:'BRL':true:'3.2-2' }} </li>\n            <li>Release Date: {{ course.releaseDate | date:'shortDate'}} </li>\n          </ul>\n        </div>\n        <div>\n          {{ text | summary:10 }}\n          <span class=\"glyphicon\" [class.glyphicon-star]=\"isFavorite\" [class.glyphicon-star-empty]=\"!isFavorite\" (click)=\"onClick()\"></span>\n        </div>\n        \n    \n    "
        })
    ], CoursesComponent);
    return CoursesComponent;
}());
exports.CoursesComponent = CoursesComponent;
