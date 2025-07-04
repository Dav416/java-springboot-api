package com.registro.usuarios.api.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// Se encarga de redirigir a las vistas del index y de iniciar sesión 
@Controller
public class RegistroControlador {

    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @GetMapping("/")
    public String verPaginaDeInicio() {
        return "index";
    }

}
