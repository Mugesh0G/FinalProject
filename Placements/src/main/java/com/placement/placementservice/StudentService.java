package com.placement.placementservice;

import java.util.List;

import com.placement.entity.StudentEntity;

public interface StudentService 
{
	public void addStudentDetails(StudentEntity place);
	public StudentEntity findByStudentEmailAndStudentPassword(String studentEmail,String studentPassword );
	public StudentEntity findByStudentId(int id);
	public List<StudentEntity> displayStudentList();
	
	
}
