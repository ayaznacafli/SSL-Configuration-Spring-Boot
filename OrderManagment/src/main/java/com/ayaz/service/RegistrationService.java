package com.ayaz.service;

import com.ayaz.model.SellerDto;
import java.util.List;

public interface RegistrationService {
    String registerSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}
