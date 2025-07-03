package com.registro.usuarios.api.servicio;

import com.registro.usuarios.api.dto.UsuarioRegistroDTO;
import com.registro.usuarios.api.modelo.Rol;
import com.registro.usuarios.api.modelo.Usuario;
import com.registro.usuarios.api.repositorio.UsuarioRepositorio;
import java.util.Arrays;
import org.springframework.stereotype.Service;


// Archivo de implementación para guardar usuarios

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }
    
    
    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(),
                registroDTO.getApellido(), registroDTO.getEmail(), registroDTO.getPassword(),Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepositorio.save(usuario);
    }
    
    
    
    
}
