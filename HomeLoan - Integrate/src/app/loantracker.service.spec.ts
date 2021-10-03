import { TestBed } from '@angular/core/testing';

import { LoantrackerService } from './loantracker.service';

describe('LoantrackerService', () => {
  let service: LoantrackerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoantrackerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
