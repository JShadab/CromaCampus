import { Car } from "./Car";
import { Engine } from "./Engine";
import { Tyres } from "./Tyres";

const engine = new Engine('Petrol');
const tyres = new Tyres();

const depA={};
const depB={};
const depC={};

const car = new Car(engine, tyres, depA, depB, depC);

console.log(car);
