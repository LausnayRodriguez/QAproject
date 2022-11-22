package com.demo.guru99.stepDefinitions;

import com.demo.guru99.models.DatosLogin;
import com.demo.guru99.steps.PaginaInicioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinition {
    @Steps
    PaginaInicioStep paginaInicioStep;
    @Dado("^el usuario se encuentre en la pagina web$")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() {
    paginaInicioStep.abrirNavegador();
    }


    @Cuando("^el ingrese el usuario con la clave$")
    public void elIngreseElUsuarioConLaClave(List<DatosLogin> datosLogins) {
       paginaInicioStep.ingresarUsuario(datosLogins.get(0).getUsuario());
       paginaInicioStep.ingresarClave(datosLogins.get(0).getClave());
       paginaInicioStep.submit();
    }

    @Entonces("^el visualizara un mensaje de bienvenida$")
    public void elVisualizaraUnMensajeDeBienvenida() {
        paginaInicioStep.mensajeBienvenida();
    }
}
