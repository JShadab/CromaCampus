import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  num1 = 0;
  num2 = 0;
  output = 0;

  constructor() { }

  ngOnInit(): void {
  }
  add() { this.output = this.num1 + this.num2; }
  sub() { this.output = this.num1 - this.num2; }
  mul() { this.output = this.num1 * this.num2; }
  div() { this.output = this.num1 / this.num2; }
  pow() { this.output = this.num1 ** this.num2; }
}
