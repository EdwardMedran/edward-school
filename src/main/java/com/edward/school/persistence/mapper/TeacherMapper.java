package com.edward.school.persistence.mapper;

import com.edward.school.persistence.entity.TeacherEntity;
import com.edward.school.web.dto.TeacherDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    @Mapping(source = "name", target = "nombre")
    @Mapping(source = "lastname", target = "apellido")
    @Mapping(source = "course", target = "curso")
    @Mapping(source = "email", target = "correo")
    TeacherDto toDto(TeacherEntity entity);

    @InheritInverseConfiguration
    TeacherEntity toEntity(TeacherDto dto);
}
