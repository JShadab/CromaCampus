export { }
function add(num1: number, num2?: number, num3?: number): number {

    if (num2) {
        return (num1 + num2);
    } else {
        return num1;
    }

}


console.log(add(10, 20));
console.log(add(10));

/*
let y = add("10", "20");
console.log(y);
*/
