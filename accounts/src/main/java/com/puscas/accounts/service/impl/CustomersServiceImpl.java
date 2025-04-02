package com.puscas.accounts.service.impl;

import com.puscas.accounts.dto.AccountsDto;
import com.puscas.accounts.dto.CardsDto;
import com.puscas.accounts.dto.CustomerDetailsDto;
import com.puscas.accounts.dto.LoansDto;
import com.puscas.accounts.entity.Accounts;
import com.puscas.accounts.entity.Customer;
import com.puscas.accounts.exception.ResourceNotFoundException;
import com.puscas.accounts.mapper.AccountsMapper;
import com.puscas.accounts.mapper.CustomerMapper;
import com.puscas.accounts.repository.AccountsRepository;
import com.puscas.accounts.repository.CustomerRepository;
import com.puscas.accounts.service.ICustomersService;
import com.puscas.accounts.service.client.CardsFeignClient;
import com.puscas.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomersServiceImpl implements ICustomersService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    /**
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        Customer customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
        );
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString())
        );

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(mobileNumber);
        customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(mobileNumber);
        customerDetailsDto.setCardsDto(cardsDtoResponseEntity.getBody());

        return customerDetailsDto;

    }
}
