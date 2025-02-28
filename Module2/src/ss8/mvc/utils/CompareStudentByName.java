package ss8.mvc.utils;

import ss8.mvc.entity.Student;

import java.util.Comparator;

public class CompareStudentByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
