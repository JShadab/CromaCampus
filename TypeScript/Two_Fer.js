"use strict";
exports.__esModule = true;
var readline = require("readline");
var process_1 = require("process");
var rl = readline.createInterface({
    input: process_1.stdin,
    output: process_1.stdout
});
rl.question("Enter your friend name? ", function (name) {
    console.log("One for ".concat(name, " and one for me"));
    rl.close();
});
