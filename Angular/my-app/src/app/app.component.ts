import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  public name = 'Musa';

  public successClass = 'text-danger';

  public highlightColor = 'orange';

  public hasError = false;
  public isSpecial = true;

  public messageClasses = {
    'text-success': !this.hasError,
    'text-danger': this.hasError,
    'text-special': this.isSpecial,
  }

  public myStyle = {
    'color': 'blue',
    'font-style': 'italic'
  }

  public validate(message: string) {
    if (!message) {
      console.log('Please try to understand, why u are doing such a sily mistakes');

    }
    else {
      console.log("Working..");

    }
  }
  public logMessage(message: string) {
    if (!message) {
      console.log('Please try to understand, why u are doing such a sily mistakes');
      return;
    }

    console.log(`Hello ${message}`);

  }
  public logEvent(event: any) {
    console.log(event);

  }
}
