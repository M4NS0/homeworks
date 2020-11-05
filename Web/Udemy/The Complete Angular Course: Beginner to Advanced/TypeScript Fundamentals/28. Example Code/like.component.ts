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