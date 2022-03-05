package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>
{
	public StudentEntity findByStudentEmailAndStudentPassword(String studentEmail,String studentPassword );
	
	public StudentEntity findByStudentId(int id);
}
