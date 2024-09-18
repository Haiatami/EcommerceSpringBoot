package com.hoanghai.Ecommerce.service.interf;

import com.hoanghai.Ecommerce.dto.AddressDto;
import com.hoanghai.Ecommerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}

