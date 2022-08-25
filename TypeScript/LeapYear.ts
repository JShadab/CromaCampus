export { }
import * as readline from 'readline';
import { stdin, stdout } from 'process';



const rl = readline.createInterface({
    input: stdin,
    output: stdout
});

rl.question("Enter year of your choice? ", function (answer: number) {
    console.log(`Oh, so your year is ${answer}`);

    let isLeap = checkLeapYear(answer);
    if (isLeap) {
        console.log(answer + " is a leap year");

    } else {
        console.log(answer + " is not a leap year");
    }

    console.log("Bye");
    rl.close();
});

function checkLeapYear(year: number) {

    let isLeap = false;
    if (year % 4 == 0) {
        
        if (year % 100 == 0 && year % 400 != 0) {
            return isLeap;
        }
        isLeap = true;

    }
    return isLeap;

}


