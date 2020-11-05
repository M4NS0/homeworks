"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var like_component_1 = require("./like.component");
var component = new like_component_1.LikeComponent(10, true);
// component.likesCount = 2;
// component.isSelected = false;
component.onClick();
console.log("likesCount: " + component.likesCount + ", isSelected: " + component.isSelected);
