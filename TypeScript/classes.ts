import { Employee } from "./Employee";
import { Manager } from "./Manager";

let emp= new Employee('Musa');
console.log(emp.employeeName);
emp.greet();

let mgr = new Manager('Musa');

console.log(mgr.employeeName);
mgr.greet();

mgr.assignTask();

