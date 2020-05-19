package com.ayaz.service;

import com.ayaz.dto.SellerDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepository {

    List<SellerDto> sellerDtoList = new ArrayList<>();

    public boolean addSeller(SellerDto sellerDto) {

        return sellerDtoList.add(sellerDto);
    }

    public List<SellerDto> getSellerList() {
        return sellerDtoList;
    }

}
