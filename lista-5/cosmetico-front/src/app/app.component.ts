import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Cosmetico } from './model/cosmetico';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'cosmetico-front';

  cosmeticos!: Cosmetico[];

  constructor(private httpClient: HttpClient){
  }

  ngOnInit(){
    this.getCosmeticos();
  }

  getCosmeticos(){
    this.httpClient.get<Cosmetico[]>("http://localhost:8080/cosmeticos").subscribe(response =>{
      this.cosmeticos = response;
    })
  }
}
