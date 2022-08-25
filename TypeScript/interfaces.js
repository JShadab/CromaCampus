"use strict";
exports.__esModule = true;
function foo(p) {
    console.log("Hello ".concat(p.firstName, " ").concat(p.lastName));
}
function blah(p) {
    console.log("Hello ".concat(p.firstName, " ").concat(p.lastName));
}
var addr = { city: "Lucknow", state: "UP" };
var person1 = { firstName: "Muhammad", lastName: "Musa", email: "abc@papa.com", phone: 9876543210, address: addr };
foo(person1);
var addr2 = { state: "UP" };
var person2 = { firstName: "Croma", lastName: "Campus", email: "kbc@papa.com", address: addr2 };
blah(person2);
