package one.digitalinnovation.beerstock.dto;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuantityDTO {

    @NotNull
    @Max(100)
    private Integer quantity;

}
