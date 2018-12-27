package com.sima.licensingservice.services;

import com.sima.licensingservice.model.License;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by qisima on 12/27/2018 3:37 PM
 */
@Service
public class LicenseService {
    public License getLicense(String id){
        return new License()
                .withId(id)
                .withOrganizationId(UUID.randomUUID().toString())
                .withProductName("Test Product Name")
                .withLicenseType("PreSeat");
    }
}
