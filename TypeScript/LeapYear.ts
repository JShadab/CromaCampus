export { }
import * as readline from 'readline';
import { stdin, stdout } from 'process';



const rl = readline.createInterface({
    input: stdin,
    output: stdout
});

rl.question("Enter year of your choice? ", function (answer: number) {
    console.log(`Oh, so your year is ${answer}`);

    checkLeapYear(answer);

    console.log("Closing the interface");
    rl.close();
});

function checkLeapYear(year: number) {


    //Code

    console.log("Its is Leap year ");
}


