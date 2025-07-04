package com.registro.usuarios.api.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WellKnownController {

    @RequestMapping("/.well-known/appspecific/com.chrome.devtools.json")
    public ResponseEntity<Void> ignoreDevToolsRequest() {
        // Devuelve 204 No Content
        return ResponseEntity.noContent().build();
    }
}
