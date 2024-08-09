"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(id, name, classs) {
        this.stdID = id;
        this.stdName = name;
        this.stdClass = classs;
    }
    Student.prototype.display = function () {
        console.log(this.stdID);
        console.log(this.stdName);
        console.log(this.stdClass);
    };
    return Student;
}());
exports.Student = Student;
var obj1 = new Student(12, "Noor", 5);
var obj2 = new Student(143, "Abdul", 10);
obj1.display();
obj2.display();
