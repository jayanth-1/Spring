package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/subjects/{id}")
    public Subject getSubject(@PathVariable String id) {
        return subjectService.getSubject(id);
    }

    @PostMapping("/subjects/add")
    public String addSubject(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }

    @PutMapping(value = "/subjects/{id}")
    public String updateSubject(@RequestBody Subject subject, @PathVariable String id) {
        return subjectService.updateSubject(subject, id);
    }

    @DeleteMapping(value = "/subjects/{id}")
    public String deleteSubject(@PathVariable(value = "id") String id) {
       return subjectService.deleteSubject(id);
    }

}
