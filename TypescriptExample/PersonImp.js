"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var PersonImp = /** @class */ (function () {
    function PersonImp() {
    }
    PersonImp.prototype.getFullName = function () {
        return this.firstName + this.lastName;
    };
    return PersonImp;
}());
var p1 = new PersonImp();
p1.firstName = "Noor";
p1.lastName = "Un Nabi";
console.log(p1.getFullName());
