export { }
import * as readline from 'readline';
import { stdin, stdout } from 'process';



const rl = readline.createInterface({
    input: stdin,
    output: stdout
});

rl.question("Enter your friend name? ", function (name: string) {
    console.log(`One for ${name} and one for me`);
    rl.close();
});

