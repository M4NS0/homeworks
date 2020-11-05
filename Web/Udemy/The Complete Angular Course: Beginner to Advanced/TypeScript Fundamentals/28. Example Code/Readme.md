#### Background 
<br>
Imagine you're working at Facebook and your job is to implement the "Like" functionality. 
<br>
When a user clicks the "Like" button below a post, the button is highlighted (to indicate that it is selected) and the number of likes is increased. 
<br>
You're going to implement this feature in Angular and for that you'll need to create a component. This component is a TypeScript class that encapsulates the data for rendering the like button (eg: the number of likes, and whether the button is in the on/off state). It also responds to user actions. So, when the user clicks the "Like" button, the number of likes should be increased and the button should be in the "selected/on" state. If the user clicks the button again, the number of likes should be decreased and the button should be in the "unselected" state. 
<br>

#### Spec 
<br>
For the purpose of this exercise, forget about the HTML. Your focus should be purely on defining a TypeScript class with the right members (fields, properties, methods, constructor). 
<br>
Allow the consumer of this class to pass the initial number of likes when creating an instance of this class. 
<br>
Define this class in a separate module and use it in the main module. Simulate the scenario where the user clicks the like component. Display the total number of likes and whether the button is in the selected or unselected state on the console. <br>
<br>

like.component.ts code:
```ts
    export class LikeComponent {

        constructor(public likesCount: number, public isSelected: boolean) {        
        }
        onClick() { 
            /*
            if (this.isSelected) { 
                this.likesCount --;

                this.isSelected = false;
            } else { 
                this.likesCount ++; 
                this.isSelected = true;
            }
            */

            this.likesCount += (this.isSelected) ? -1: 1;  // counters
                                                           // If it's true add -1 to less count otherwise add 1 
            this.isSelected = !this.isSelected;            // booleans

        }
    }
```

<br>

main.ts code:
```ts
    import { LikeComponent } from './like.component';

    let component = new LikeComponent(10, true);
    component.onClick();
    console.log(`likesCount: ${component.likesCount}, isSelected: ${component.isSelected}`);
```

<br>

After ajustments...
like.component new code: 

```ts
    export class LikeComponent {

        constructor(private _likesCount: number, private _isSelected: boolean) {        
        }
        onClick() { 
            /*
            if (this._isSelected) { 
                this._likesCount --;

                this._isSelected = false;
            } else { 
                this._likesCount ++; 
                this._isSelected = true;
            }
            */

            this._likesCount += (this._isSelected) ? -1: 1;  // counters
                                                             // If it's true add -1 to less count otherwise add 1 
            this._isSelected = !this._isSelected;            // booleans

        }

        get likesCount() {
            return this._likesCount;
        }

        get isSelected () {
            return this._isSelected;
        }
    }
```
main.ts new code:
```ts
    import { LikeComponent } from './like.component';

    let component = new LikeComponent(10, true);
    // component.likesCount = 2;
    // component.isSelected = false;

    component.onClick();
    console.log(`likesCount: ${component.likesCount}, isSelected: ${component.isSelected}`);
```

<br>

#### Transpiling:

an error will come up in the code after the ajustment, while it's transpiling:

```sh
    tsc *.ts && node main.js

like.component.ts:23:9 - error TS1056: Accessors are only available when targeting ECMAScript 5 and higher.
23     get likesCount() {
           ~~~~~~~~~~
like.component.ts:27:9 - error TS1056: Accessors are only available when targeting ECMAScript 5 and higher.

27     get isSelected () {
           ~~~~~~~~~~

Found 2 errors.
```

To solve this problem, follow the new instruction to transpile it:

```sh
    sudo npm install -g typescript
    tsc *.ts --target ES5 && node main.js
```
