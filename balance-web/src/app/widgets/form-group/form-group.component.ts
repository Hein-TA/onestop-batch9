import { Component, computed, input } from '@angular/core';

@Component({
  selector: 'app-form-group',
  templateUrl: './form-group.component.html',
  styles: ``
})
export class FormGroupComponent {

  label = input.required<string>();
  valid = input<boolean | undefined>();
  mb = input<string | undefined>();
  mbClass = computed(() => this.mb() ?? 'mb-4');
  
}
