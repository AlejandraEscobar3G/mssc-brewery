package com.hcl.msscbrewery.services.v2;

import com.hcl.msscbrewery.web.model.BeerDto;
import com.hcl.msscbrewery.web.model.v2.BeerDtoV2;
import com.hcl.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy beer")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // todo implementation - add a real impl update beer
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting beer..." + beerId.toString());
    }
}
