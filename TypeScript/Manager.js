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
exports.__esModule = true;
exports.Manager = void 0;
var Employee_1 = require("./Employee");
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(employeeName) {
        return _super.call(this, employeeName) || this;
    }
    Manager.prototype.assignTask = function () {
        console.log("".concat(this.employeeName, " is Assigning the task.."));
    };
    return Manager;
}(Employee_1.Employee));
exports.Manager = Manager;
