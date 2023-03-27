import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componets/header/header.component';
import { LogoApComponent } from './componets/logo-ap/logo-ap.component';
import { BannerComponent } from './componets/banner/banner.component';
import { BienvenidaComponent } from './componets/bienvenida/bienvenida.component';
import { AcercaDeComponent } from './componets/acerca-de/acerca-de.component';
import { ExperienciasComponent } from './componets/experiencias/experiencias.component';
import { EducacionComponent } from './componets/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HysComponent } from './componets/hys/hys.component';
import { ProyectoComponent } from './componets/proyecto/proyecto.component';
import { FooterComponent } from './componets/footer/footer.component';
import { ModalLoginComponent } from './componets/modal-login/modal-login.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './componets/home/home.component';
import { LoginComponent } from './componets/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoApComponent,
    BannerComponent,
    BienvenidaComponent,
    AcercaDeComponent,
    ExperienciasComponent,
    EducacionComponent,
    HysComponent,
    ProyectoComponent,
    FooterComponent,
    ModalLoginComponent,
    HomeComponent,
    LoginComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
