import { Engine } from "./Engine";
import { Tyres } from "./Tyres";

export class Car {
    engine;
    tyres;

    constructor(engine: Engine, tyres: Tyres) {
        this.engine = engine;
        this.tyres = tyres;
    }
}