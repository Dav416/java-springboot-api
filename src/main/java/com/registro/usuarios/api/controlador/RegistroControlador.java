package com.registro.usuarios.api.controlador;

import com.registro.usuarios.api.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// Se encarga de redirigir a las vistas del index y de iniciar sesión 
@Controller
public class RegistroControlador {
    
    @Autowired
    private UsuarioServicio servicio;

    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    //Permite listar usuarios en el index
    @GetMapping("/")
    public String verPaginaDeInicio(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listarUsuarios());
        return "index";
    }

}
