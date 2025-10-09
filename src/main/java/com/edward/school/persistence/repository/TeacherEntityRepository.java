package com.edward.school.persistence.repository;

import com.edward.school.persistence.crud.CrudTeacherEntity;
import com.edward.school.persistence.entity.TeacherEntity;
import com.edward.school.persistence.mapper.TeacherMapper;
import com.edward.school.web.dto.TeacherDto;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherEntityRepository implements TeacherRepository {
    private final CrudTeacherEntity crudTeacherEntity;
    private final TeacherMapper teacherMapper;

    public TeacherEntityRepository(CrudTeacherEntity crudTeacherEntity, TeacherMapper teacherMapper) {
        this.crudTeacherEntity = crudTeacherEntity;
        this.teacherMapper = teacherMapper;
    }

    @Override
    public TeacherDto getById(Long id) {
        TeacherEntity entity = this.crudTeacherEntity.findById(id).orElse(null);
        return this.teacherMapper.toDto(entity);
    }

    @Override
    public TeacherDto add(TeacherDto teacherDto) {
        TeacherEntity entity = this.teacherMapper.toEntity(teacherDto);
        this.crudTeacherEntity.save(entity);
        return this.teacherMapper.toDto(entity);
    }
}
