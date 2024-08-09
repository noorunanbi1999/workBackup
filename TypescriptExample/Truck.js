"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var Car_1 = require("./Car");
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck(speed, regularPrice, color, weight) {
        var _this = _super.call(this, speed, regularPrice, color) || this;
        _this.weight = weight;
        return _this;
    }
    Truck.prototype.getSalePrice = function () {
        if (this.weight > 2000)
            return this.regularPrice * 0.9;
        else
            return this.regularPrice * 0.8;
    };
    return Truck;
}(Car_1.default));
var truck = new Truck(180, 30000, "Red", 2100);
console.log(truck.getSalePrice());
