package com.registro.usuarios.api.servicio;

import com.registro.usuarios.api.dto.UsuarioRegistroDTO;
import com.registro.usuarios.api.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UsuarioServicio extends UserDetailsService{
    
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
    
}
