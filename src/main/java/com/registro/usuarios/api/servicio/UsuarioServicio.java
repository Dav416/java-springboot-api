package com.registro.usuarios.api.servicio;

import com.registro.usuarios.api.dto.UsuarioRegistroDTO;
import com.registro.usuarios.api.modelo.Usuario;


public interface UsuarioServicio {
    
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
    
}
