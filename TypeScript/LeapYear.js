"use strict";
exports.__esModule = true;
var readline = require("readline");
var process_1 = require("process");
var rl = readline.createInterface({
    input: process_1.stdin,
    output: process_1.stdout
});
rl.question("Enter year of your choice? ", function (answer) {
    console.log("Oh, so your yer is ".concat(answer));
    checkLeapYear(answer);
    console.log("Closing the interface");
    rl.close();
});
function checkLeapYear(year) {
    //Code
    console.log("Its is Leap year ");
}
