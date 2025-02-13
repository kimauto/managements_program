package service;

import dto.StudentDto;
import repository.StudentManager;

import java.util.Map;

public class StudentIOImp implements StudentIO{
    StudentManager studentManager;

    public StudentIOImp(StudentManager studentManager) {
        this.studentManager = studentManager;
    }


    @Override
    public Map<String, StudentDto> getStudentTable() {
        return studentManager.getStudentTable();
    }
    @Override
    public void setStudentTable(Map<String, StudentDto> studentTable) {
        studentManager.setStudentTable(studentTable);
    }

    @Override
    public void updateStudentTable(StudentDto studentDto) {
        studentManager.getStudentTable().put(studentDto.getStudentNumber(), studentDto);
    }
}
