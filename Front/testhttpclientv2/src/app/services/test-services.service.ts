import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Curso } from '../model/curso';

@Injectable({
  providedIn: 'root'
})
export class TestServicesService {

  constructor(
    private http: HttpClient
  ) { }

  findAll() {
    const url = 'http://localhost:8080/employees';
    return this.http.get<Curso[]>(url);
  }
}
