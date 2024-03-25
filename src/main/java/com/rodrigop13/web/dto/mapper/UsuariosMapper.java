package com.rodrigop13.web.dto.mapper;

import com.rodrigop13.entity.Usuarios;
import com.rodrigop13.web.dto.UsuariosCreateDto;
import com.rodrigop13.web.dto.UsuariosResponseDtop;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class UsuariosMapper {

    public static Usuarios toUsuario(UsuariosCreateDto createDto){
        return new ModelMapper().map(createDto, Usuarios.class); //conversao de usuarios dto para usuarios
    }

    public static UsuariosResponseDtop toDto(Usuarios usuarios){
        String role = usuarios.getRole().name().substring("ROLE_".length());
        PropertyMap<Usuarios, UsuariosResponseDtop> props = new PropertyMap<Usuarios, UsuariosResponseDtop>(){
            @Override
            protected void configure(){
                map().setRole(role);
            }
        };
        ModelMapper mapper= new ModelMapper();
        mapper.addMappings(props);
        return mapper.map(usuarios, UsuariosResponseDtop.class);
   }

   public static List<UsuariosResponseDtop> toListDto(List<Usuarios> usuarios){
        return usuarios.stream().map(users -> toDto(users)).collect(Collectors.toList());
   }
}
