import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  name = 'Muhammad Musa';

  statement = 'Welcome to full stack java development course.'

  emp = {
    "name": "Abc",
    "age": "25",
    "salary": "1100"
  };

  dob = new Date(1986, 10, 19);

  phoneParent = 9988776655;

  message = '';


}
