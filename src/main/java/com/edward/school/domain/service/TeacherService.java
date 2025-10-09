package com.edward.school.domain.service;

import com.edward.school.persistence.entity.TeacherEntity;
import com.edward.school.persistence.repository.TeacherRepository;
import com.edward.school.web.dto.TeacherDto;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final TeacherRepository repository;

    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }

    public TeacherDto getById(Long id){
        return this.repository.getById(id);
    }

    public TeacherDto add(TeacherDto teacherDto) {
        return this.repository.add(teacherDto);
    }
}
