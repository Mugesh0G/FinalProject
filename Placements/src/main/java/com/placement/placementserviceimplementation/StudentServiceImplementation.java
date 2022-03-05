package com.placement.placementserviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.StudentEntity;
import com.placement.placementservice.StudentService;
import com.placement.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentRepository studentRepository ;
	
	@Override
	public void addStudentDetails(StudentEntity studentEntityObj) {
		
		studentRepository.save(studentEntityObj);
		
	}
	
	public StudentEntity findByStudentEmailAndStudentPassword(String studentEmail,String studentPassword )
	{
		return studentRepository.findByStudentEmailAndStudentPassword(studentEmail, studentPassword);
	}

	@Override
	public List<StudentEntity> displayStudentList() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public StudentEntity findByStudentId(int id) {
		
		return studentRepository.findByStudentId(id);
	}

	
	

}
