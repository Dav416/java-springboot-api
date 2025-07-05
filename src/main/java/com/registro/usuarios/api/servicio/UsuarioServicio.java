package com.registro.usuarios.api.servicio;

import com.registro.usuarios.api.dto.UsuarioRegistroDTO;
import com.registro.usuarios.api.modelo.Usuario;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

// Métodos guardar y listar
public interface UsuarioServicio extends UserDetailsService{
    
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
    
    public List<Usuario> listarUsuarios();
}
