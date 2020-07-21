package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.CourseMapper;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.entity.Course;
import com.xiaoshu.entity.StudentVo;

@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;
 
	@Autowired
	CourseMapper courseMapper;

	public PageInfo<StudentVo> findStudentPage(StudentVo studentVo, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<StudentVo> list=studentMapper.findList(studentVo);
		return new PageInfo<>(list);
	}

	public List<Course> findAll() {
	return 	courseMapper.selectAll();
		
	}


}
