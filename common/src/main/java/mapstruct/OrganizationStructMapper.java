package mapstruct;

import dto.OrganRequest;
import entity.Organ;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface OrganizationStructMapper {

    public static OrganizationStructMapper MAPSTRUCT = Mappers.getMapper(OrganizationStructMapper.class);
    public Organ ToOrgan(OrganRequest organRequest) ;
}
