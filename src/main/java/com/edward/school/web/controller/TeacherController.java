package com.edward.school.web.controller;

import com.edward.school.domain.service.TeacherService;
import com.edward.school.persistence.entity.TeacherEntity;
import com.edward.school.web.dto.TeacherDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeacherDto> getById(@PathVariable Long id){
        TeacherDto teacherDto = this.service.getById(id);
        return ResponseEntity.ok(teacherDto);
    }

    @PostMapping
    public ResponseEntity<TeacherDto> add(@RequestBody TeacherDto teacherDto) {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.service.add(teacherDto));
    }
}
