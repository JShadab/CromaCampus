export { }

//array
let arr1: number[] = [1, 2, 3, 4, 5]

//tuple
let arr2: [number, string, boolean] = [10, 'Hello', false];

//enum

enum DAY {
    MONDAY = 'College', TUESDAY = 'Doctor', WEDNESDAY = 'Cinema',
    THURSDAY = 'TudeyKabab', FRIDAY = 'Office', SATURDAY = 'Weekend', SUNDAY = 'Washing day'
}

let d = DAY.WEDNESDAY;
console.log(d);

let n: null = null;
let u: undefined = undefined

// We cannot assign null and undefined type vaules to other types and VICE-VERSA except any

//ANY type:

let randomeValue:any;

randomeValue=10;
randomeValue='hello'
randomeValue= false

randomeValue = null;
randomeValue= undefined

//Multi type

let multiType: string | number;

multiType = 11;
multiType= 'Bye';
//multiType = false;

let multiType2: string | null;

multiType2 = 'Bye';
multiType2 = null;






