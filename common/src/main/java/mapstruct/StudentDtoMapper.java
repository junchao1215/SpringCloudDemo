package mapstruct;

import entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface StudentDtoMapper {
    public Student dtoToStudent(Student student) ;
}
