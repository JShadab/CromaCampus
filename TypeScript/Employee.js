"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(employeeName) {
        this.employeeName = employeeName;
    }
    Employee.prototype.greet = function () {
        console.log("Hello ".concat(this.employeeName));
    };
    return Employee;
}());
exports.Employee = Employee;
