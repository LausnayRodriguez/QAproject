package com.demo.guru99.steps;

import com.demo.guru99.pageObjects.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;


public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject(); //Instancia clase paginaInicioPageObject

    @Step
    public void abrirNavegador(){
        paginaInicioPageObject.open();
    }

    @Step
    public void ingresarUsuario(String usuario){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtUsuario()).sendKeys(usuario);
    }

    @Step
    public void ingresarClave(String clave){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtClave()).sendKeys(clave);
    }

    @Step
    public void submit(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnSubmit()).click();
    }

    @Step
    public void mensajeBienvenida(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getMsjBienvenida());
        System.out.println("Prueba Bienvenida: Login Successfully");
    }
}
