import { Component, OnInit } from '@angular/core';
import { Curso } from 'src/app/model/curso';
import { TestServicesService } from 'src/app/services/test-services.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  list: Curso[];

  constructor(
    private testServicesService: TestServicesService
  ) { }

  ngOnInit() {
    this.testServicesService.findAll().subscribe(res => {
      this.list = res;
      console.log(this.list);
      console.log(res);
    });
  }

}
