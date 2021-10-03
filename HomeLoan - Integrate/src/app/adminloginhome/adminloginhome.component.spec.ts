import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminloginhomeComponent } from './adminloginhome.component';

describe('AdminloginhomeComponent', () => {
  let component: AdminloginhomeComponent;
  let fixture: ComponentFixture<AdminloginhomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminloginhomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminloginhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
