interface User {
    username: string;
    password: string;
    confirmPassword?: string; // Opitional property, don't have to be implemented // Not required
}

let user:User; // user assigned

// user = {anything: 'anything', anynumber: 5} // This value dows not satisfy the interface => compilation error // IDE will refuse it


user = { username: 'Jimmy', password: 'areUexperienced?'}; // This value does not satisfy the interface

interface CanDrive { 
    accelerate(speed:number): void;
}

let car:CanDrive = {
    accelerate: function (speed:number) {
        // ...
    }
};