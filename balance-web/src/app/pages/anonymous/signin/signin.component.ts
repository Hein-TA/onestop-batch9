import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { WidgetsModule } from '../../../widgets/widgets.module';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-signin',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule, WidgetsModule, RouterLink],
  templateUrl: './signin.component.html',
  styles: ``
})
export class SigninComponent {

  form: FormGroup;

  constructor(buidler: FormBuilder, private router: Router) {
    this.form = buidler.group({
      username: ['', [Validators.required, Validators.minLength(6)]],
      password: ['', [Validators.required, Validators.minLength(6)]]
    })
  }

  signIn() {
    this.router.navigate(['/members']);
  }
}
