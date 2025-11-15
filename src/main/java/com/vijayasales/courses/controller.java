package com.vijayasales.courses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/v1/Course")
public class controller {
    List<CourseDto> courses = new ArrayList<>();

    @GetMapping
    ResponseEntity<List<CourseDto>> getAllCourses(){
        return ResponseEntity.ok(courses);
    }
    @PostMapping
    ResponseEntity<CourseDto> addCourse(@RequestBody CourseDto courseDto){
        return new ResponseEntity(courses.add(courseDto), HttpStatus.CREATED);
    }
    @GetMapping("/greet")
    ResponseEntity<String> greetInfo(){
        return ResponseEntity.ok("Hello All, Welcome to home page");
    }
    //Testing
    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> deleteCourse(@PathVariable Long id){
        Integer currentIndex = IntStream.range(0, courses.size()).filter(index-> courses.get(index).id()==id).findFirst().orElse(-1);
        courses.remove(currentIndex);
        return  ResponseEntity.noContent().build();
    }
}
