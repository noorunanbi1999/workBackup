"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Car = /** @class */ (function () {
    function Car(speed, price, color) {
        this.speed = speed;
        this.regularPrice = price;
        this.color = color;
    }
    Car.prototype.getSalePrice = function () {
        return this.regularPrice;
    };
    return Car;
}());
exports.default = Car;
