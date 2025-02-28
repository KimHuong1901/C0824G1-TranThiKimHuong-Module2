package ss8.mvc.service;

import ss8.mvc.entity.Student;

import java.util.List;

public interface IStudentServices extends IPersonSerVices {
    List<Student> addNewStudent(Student student);

}
