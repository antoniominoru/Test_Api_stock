package one.digitalinnovation.beerstock.controller;


import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.exception.BeerNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;

public interface BeerControllerDocs {

    BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException;


}
