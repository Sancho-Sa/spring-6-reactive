package edu.reactive.springreactive.mapper;

import edu.reactive.springreactive.domain.Beer;
import edu.reactive.springreactive.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
