export class Employee {
   
    protected employeeName: string;

    constructor(employeeName: string) { 
        this.employeeName= employeeName;
    }

    greet() {
        console.log(`Hello ${this.employeeName}`);
    }
}