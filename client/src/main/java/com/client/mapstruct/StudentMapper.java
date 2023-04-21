package com.client.mapstruct;

import base.Request;
import com.client.dto.StudentRequest;
import entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    public static StudentMapper MAPSTRUCT = Mappers.getMapper(StudentMapper.class);
    public Student ToStudent(Request<StudentRequest> studentRequest) ;
}
