package com.puscas.accounts.service.client;


import com.puscas.accounts.service.impl.CustomersServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CardsFallback implements CardsFeignClient{
    private static final Logger logger = LoggerFactory.getLogger(CustomersServiceImpl.class);

    @Override
    public ResponseEntity<com.puscas.accounts.dto.CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
            logger.info("a intrat in fallback cards");
        return null;
    }

}
