import { TestBed } from '@angular/core/testing';

import { ArthService } from './arth.service';
//method used to club all testcase into one testsuit and write all testcases in a array function
describe('ArthService', () => {
  let service: ArthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.get(ArthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  describe('service.add',()=>{
    
    it('should return a positive value when operands are positve',()=>{
      let result = service.add(10,10);
      expect(result).toBe(20); //toBe() is a jasmine matcher
    });

    it('should return a negative value when operands are negative',()=>{
      expect(service.add(-10,-10)).toBe(-20);
    });

    it('should return a same non-zero value when one of the operands is zero',()=>{
      expect(service.add(10,0)).toBe(10);
    });
  }); 
});

//jasmine matchers:
//toBe(expected)-expected value of test case
//toBeCloseTo(expected,precision)-actual value must be within specific precision of expected value
//toBeDefined()-actual value to be defined
//toBeFalsy()-expect(result).toBeFalsy()-actual value to be falsy
//toBeGreaterThan(expected)-actual value must be greater than expected value
//browse remaining