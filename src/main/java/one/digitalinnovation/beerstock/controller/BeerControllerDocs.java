package one.digitalinnovation.beerstock.controller;


import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.exception.BeerAlreadyRegisteredException;
import one.digitalinnovation.beerstock.exception.BeerNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BeerControllerDocs {

    BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;

    BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException;

    List<BeerDTO> listBeers();

    void deleteById(@PathVariable Long id) throws BeerNotFoundException;

}
