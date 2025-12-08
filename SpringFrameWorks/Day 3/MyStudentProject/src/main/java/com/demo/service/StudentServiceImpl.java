package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao sDao;

	@Override
	public List<Student> getAllStudents() {
		return sDao.findAllStudents();
	}

	@Override
	public boolean addstudent(Student s) {
		return sDao.save(s);
	}

}
