package ss8.mvc.utils;

import ss8.mvc.entity.Student;

import java.util.Comparator;

public class ComparatorStudentById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getCode() > o2.getCode()) {
            return 1;
        } else if (o1.getCode() == o2.getCode()) {
            return 0;
        } else {
            return -1;
        }
    }
}

