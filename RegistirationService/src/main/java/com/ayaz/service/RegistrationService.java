package com.ayaz.service;

import com.ayaz.dto.SellerDto;
import java.util.List;

public interface RegistrationService {

    String addSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}
