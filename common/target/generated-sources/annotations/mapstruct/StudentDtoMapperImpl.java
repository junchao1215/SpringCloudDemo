package mapstruct;

import entity.Level;
import entity.Parent;
import entity.Student;
import java.util.ArrayList;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-21T22:10:41+0800",
    comments = "version: 1.0.0.Final, compiler: javac, environment: Java 1.8.0_351 (Oracle Corporation)"
)
@Component
public class StudentDtoMapperImpl implements StudentDtoMapper {

    @Override
    public Student dtoToStudent(Student student) {
        if ( student == null ) {
            return null;
        }

        Student student_ = new Student();

        student_.setId( student.getId() );
        student_.setStudentNm( student.getStudentNm() );
        student_.setStudentNo( student.getStudentNo() );
        student_.setSex( student.getSex() );
        student_.setAge( student.getAge() );
        student_.setStat( student.getStat() );
        student_.setUpdateDt( student.getUpdateDt() );
        if ( student.getParentList() != null ) {
            student_.setParentList( new ArrayList<Parent>( student.getParentList() ) );
        }
        if ( student.getLevels() != null ) {
            student_.setLevels( new ArrayList<Level>( student.getLevels() ) );
        }
        student_.setUrl( student.getUrl() );

        return student_;
    }
}
