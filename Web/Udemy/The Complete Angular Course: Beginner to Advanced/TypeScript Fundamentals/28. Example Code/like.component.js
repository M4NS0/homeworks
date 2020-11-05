"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LikeComponent = void 0;
var LikeComponent = /** @class */ (function () {
    function LikeComponent(_likesCount, _isSelected) {
        this._likesCount = _likesCount;
        this._isSelected = _isSelected;
    }
    LikeComponent.prototype.onClick = function () {
        /*
        if (this._isSelected) {
            this._likesCount --;

            this._isSelected = false;
        } else {
            this._likesCount ++;
            this._isSelected = true;
        }
        */
        this._likesCount += (this._isSelected) ? -1 : 1; // counters
        // If it's true add -1 to less count otherwise add 1 
        this._isSelected = !this._isSelected; // booleans
    };
    Object.defineProperty(LikeComponent.prototype, "likesCount", {
        get: function () {
            return this._likesCount;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(LikeComponent.prototype, "isSelected", {
        get: function () {
            return this._isSelected;
        },
        enumerable: false,
        configurable: true
    });
    return LikeComponent;
}());
exports.LikeComponent = LikeComponent;
