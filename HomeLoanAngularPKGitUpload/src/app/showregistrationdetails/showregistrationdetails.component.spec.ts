import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowregistrationdetailsComponent } from './showregistrationdetails.component';

describe('ShowregistrationdetailsComponent', () => {
  let component: ShowregistrationdetailsComponent;
  let fixture: ComponentFixture<ShowregistrationdetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowregistrationdetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowregistrationdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
