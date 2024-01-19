package com.xiaolin.accounts.service;

import com.xiaolin.accounts.dto.CustomerDetailsDto;
import com.xiaolin.accounts.dto.CustomerDto;

public interface ICustomersService {

    CustomerDetailsDto fetchCustomerDetails(String mobilePhone);

}