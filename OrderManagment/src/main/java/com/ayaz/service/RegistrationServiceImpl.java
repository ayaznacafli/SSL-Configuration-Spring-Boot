package com.ayaz.service;


import com.ayaz.model.SellerDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;


@Service
public class RegistrationServiceImpl implements RegistrationService {

    Logger logger = LoggerFactory.getLogger(RegistrationServiceImpl.class);
    private RestTemplate restTemplate;

    public RegistrationServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String registerSeller(SellerDto sellerDto) {
        String response = restTemplate.postForObject("https://localhost:8086/registration/addSeller", sellerDto, String.class);
        return response;
    }

    public List<SellerDto> getSellersList() {
        return restTemplate.getForObject("https://localhost:8086/registration/sellersList", List.class);
    }

}

