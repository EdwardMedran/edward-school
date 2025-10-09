package com.edward.school.persistence.repository;

import com.edward.school.persistence.entity.TeacherEntity;
import com.edward.school.web.dto.TeacherDto;

public interface TeacherRepository {
    TeacherDto getById(Long id);
    TeacherDto add(TeacherDto teacherDto);
}
