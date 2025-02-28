package ss8.mvc.service;

import ss8.mvc.entity.Student;
import ss8.mvc.repository.StudentRepository;
import ss8.mvc.utils.ComparatorStudentById;
import ss8.mvc.utils.ComparatorStudentByName;

import java.util.Comparator;
import java.util.List;

public class StudentService implements IStudentServices {
    private static StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();
        return students;
    }

    @Override
    public List getAllSortById() {
        List<Student> students = studentRepository.getAll();
        students.sort(new ComparatorStudentById());
        return students;
    }

    @Override
    public List getAllSortByName() {
        List<Student> students = studentRepository.getAll();
        students.sort(new ComparatorStudentByName());
        return students;
    }

    @Override
    public List<Student> addNewStudent(Student student) {
        return List.of();
    }

   // @Override
//    public List<Student> addNewStudent(Student student) {
//        List<Student> students = studentRepository.addNewStudent(student);
//        students.add(student);
//        return students;
//    }
}
