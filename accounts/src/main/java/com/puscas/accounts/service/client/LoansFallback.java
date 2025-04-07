package com.puscas.accounts.service.client;

import com.puscas.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallback implements LoansFeignClient{

    @Override
    public ResponseEntity<com.puscas.accounts.dto.LoansDto> fetchLoanDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
