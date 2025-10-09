package com.edward.school.persistence.crud;

import com.edward.school.persistence.entity.TeacherEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudTeacherEntity extends CrudRepository<TeacherEntity, Long> {
}
