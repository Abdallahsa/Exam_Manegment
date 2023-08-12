package com.projects.exam_management.exam;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private ExamService examService;

    public ExamController(ExamService examService){
        this.examService = examService;
    }
    @GetMapping("/findAll")
    public List<Exam> findAll(){
        return examService.findAllExam();
    }
    @GetMapping("/countByCourseId/{id}")
    public int countByCourseId(@PathVariable int id){
        return examService.countByCourseId(id);
    }

    @GetMapping("/countByDoctorId/{id}")

    public int countByDoctorId(@PathVariable int id){
        return examService.countByDoctorId(id);
    }

    @GetMapping("/findByExamUrl/{id}")

    public Exam findByExamUrl(@PathVariable long id){
        return examService.findByExamUrl(id);
    }

    @GetMapping("/findExamId/{id}")
    public Exam findExamId(@PathVariable int id ){
        return examService.findExamById(id);
    }

    @GetMapping("/findByCourseId/{id}")
    public Exam findByCourseId(@PathVariable long id){
        return examService.findByCourseId(id);
    }
    @PostMapping("/insert")
    public ExamDTO insert(@RequestBody Exam exam) {
        return examService.addExam(exam);
    }
    @PostMapping("/deleteByQuestionId")
    public boolean deleteByQuestionId(@PathVariable int id){
        return examService.deleteByQuestionId(id);
    }



}
