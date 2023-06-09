package edu.reactive.springreactive.service;

import edu.reactive.springreactive.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface BeerService {
    Flux<BeerDTO> listBeers();
    Mono<BeerDTO> getBeerById(Integer beerId);

    Mono<BeerDTO> saveNewBeer(BeerDTO beerDTO);

    Mono<BeerDTO> updateBeer(Integer beerId, BeerDTO beerDTO);

    Mono<BeerDTO> patchBeer(Integer beerId, BeerDTO beerDTO);

    Mono<Void> deleteBeerById(Integer beerId);
}
