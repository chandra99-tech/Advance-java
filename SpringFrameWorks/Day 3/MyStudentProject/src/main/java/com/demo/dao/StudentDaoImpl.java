package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public List<Student> findAllStudents() {
		List<Student> slist = jdbcTemplate.query("select * from student2101", (rs,numrows)->{
			Student s = new Student();
			s.setsId(rs.getInt(1));
			s.setsName(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setUserName(rs.getString(4));
			s.setPassword(rs.getString(5));
			s.setCourse(rs.getString(6));
			if(rs.getDate(7)==null) {
				s.setDob(null);
			}else {
				s.setDob(rs.getDate(7).toLocalDate());
			}
			return s;
		});
		return slist;
	}


	@Override
	public boolean save(Student s) {
		int n=jdbcTemplate.update("insert into student2101 values(?,?,?,?,?,?,?)",new Object[] {
				s.getsId(),s.getsName(),s.getEmail(),s.getUserName(),s.getPassword(),s.getCourse(),s.getDob()
		});
		return n>0;
	}

}
