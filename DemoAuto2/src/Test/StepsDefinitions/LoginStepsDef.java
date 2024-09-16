package Test.StepsDefinitions;

import Test.Steps.LoginSteps;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;

import static Test.Core.DriverManager.screenShot;
import static Test.Core.DriverManager.getDriver;

public class LoginStepsDef {
    private WebDriver driver;
    private Scenario scenario;


    @Dado("que me encuentro en la pagina principal TEST")
    public void que_me_encuentro_en_la_pagina_principal_TEST() {
       driver =getDriver();
       driver.get("https://enlinea.febcrp.pe/SIFEL/login.jsf/");
       screenShot(driver);
      //  driver.wait(5000);
    }

    @Cuando("inicio sesion com mis credenciales usuario {string} pass {string}")
    public void inicio_sesion_com_mis_credenciales_usuario_pass(String user, String pass){
        LoginSteps loginSteps = new LoginSteps(this.driver);
        loginSteps.typeUser(user);
        loginSteps.typePass(pass);
        screenShot(driver);
        loginSteps.clicLogin();
    }
    @Entonces("valido que deberia ingresar al home de la web TEST")
    public void validar_ingreso_fondoempleados() throws InterruptedException {
       // driver.wait(5000);
       screenShot(driver);
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

   @Entonces("valido mensaje de error")
    public void Validar_Mensaje_de_error(){
       LoginSteps loginSteps2 = new LoginSteps (this.driver);
        loginSteps2.searchAlert();
       screenShot(driver);
   }


}
