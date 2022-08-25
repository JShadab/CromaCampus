"use strict";
exports.__esModule = true;
var readline = require("readline");
var process_1 = require("process");
var rl = readline.createInterface({
    input: process_1.stdin,
    output: process_1.stdout
});
rl.question("Enter year of your choice? ", function (answer) {
    console.log("Oh, so your year is ".concat(answer));
    var isLeap = checkLeapYear(answer);
    if (isLeap) {
        console.log(answer + " is a leap year");
    }
    else {
        console.log(answer + " is not a leap year");
    }
    console.log("Bye");
    rl.close();
});
function checkLeapYear(year) {
    var isLeap = false;
    if (year % 4 == 0) {
        if (year % 100 == 0 && year % 400 != 0) {
            return isLeap;
        }
        isLeap = true;
    }
    return isLeap;
}
