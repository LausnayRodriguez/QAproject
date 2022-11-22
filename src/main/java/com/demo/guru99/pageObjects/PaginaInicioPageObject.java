package com.demo.guru99.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class PaginaInicioPageObject extends PageObject {

    By txtUsuario = By.name("userName");
    By txtClave = By.name("password");
    By btnSubmit = By.name("submit");
    By msjBienvenida = By.xpath("//h3[contains(text(),'Login Successfully')]");

    public By getTxtUsuario() {

        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getMsjBienvenida() {
        return msjBienvenida;
    }
}

