import { Person } from "./Person";

function foo(p: Person) {
    console.log(`Hello ${p.firstName} ${p.lastName}`);
}

function blah(p: Person) {
    console.log(`Hello ${p.firstName} ${p.lastName}`);
}

let addr={city:"Lucknow", state:"UP"} ;
let person1 = { firstName: "Muhammad", lastName: "Musa", email:"abc@papa.com", phone:9876543210, address:addr};
foo(person1);

let addr2={ state:"UP"} ;
let person2 = { firstName: "Croma", lastName: "Campus", email:"kbc@papa.com", address:addr2};
blah(person2)
