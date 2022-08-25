"use strict";
exports.__esModule = true;
//array
var arr1 = [1, 2, 3, 4, 5];
//tuple
var arr2 = [10, 'Hello', false];
//enum
var DAY;
(function (DAY) {
    DAY["MONDAY"] = "College";
    DAY["TUESDAY"] = "Doctor";
    DAY["WEDNESDAY"] = "Cinema";
    DAY["THURSDAY"] = "TudeyKabab";
    DAY["FRIDAY"] = "Office";
    DAY["SATURDAY"] = "Weekend";
    DAY["SUNDAY"] = "Washing day";
})(DAY || (DAY = {}));
var d = DAY.WEDNESDAY;
console.log(d);
var n = null;
var u = undefined;
// We cannot assign null and undefined type vaules to other types and VICE-VERSA except any
//ANY type:
var randomeValue;
randomeValue = 10;
randomeValue = 'hello';
randomeValue = false;
randomeValue = null;
randomeValue = undefined;
//Multi type
var multiType;
multiType = 11;
multiType = 'Bye';
//multiType = false;
var multiType2;
multiType2 = 'Bye';
multiType2 = null;
