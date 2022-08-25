import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  template: `
  <div class="container">
    <h2>All Rights are reserved &copy; 2023</h2>
  </div>
  `,
  styles: [`h2{
    color:blue;
    text-align:center;
  }`]
})
export class FooterComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
