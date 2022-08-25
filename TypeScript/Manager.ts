import { Employee } from "./Employee";

export class Manager extends Employee {

    constructor(employeeName: string) { 
        super(employeeName);
    }

    assignTask(){
        console.log(`${this.employeeName} is Assigning the task..`);
        
    }

}