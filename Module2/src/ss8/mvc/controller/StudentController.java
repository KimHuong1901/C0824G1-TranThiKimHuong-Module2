package ss8.mvc.controller;

import ss8.mvc.entity.Student;
import ss8.mvc.service.IStudentServices;
import ss8.mvc.service.StudentService;

import java.util.List;

public class StudentController {
    private static StudentService studentService = new StudentService();

    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }

    public List<Student> displayAllStudentSortById() {
        return studentService.getAllSortById();
    }
    public List<Student> displayAllStudentByName(){
        return studentService.getAllSortByName();
    }
    public List<Student> addNewStudent(Student student) {
        return studentService.addNewStudent(student);
    }
}
