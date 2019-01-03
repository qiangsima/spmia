package com.sima.licensingservice.services;

import com.sima.licensingservice.config.ServiceConfig;
import com.sima.licensingservice.model.License;
import com.sima.licensingservice.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by qisima on 12/27/2018 3:37 PM
 */
@Service
public class LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    @Autowired
    ServiceConfig config;

    public License getLicense(String id){
        return new License()
                .withId(id)
                .withOrganizationId(UUID.randomUUID().toString())
                .withProductName("Test Product Name")
                .withLicenseType("PreSeat");
    }

    public License getLicense(String organizationId, String licenseId){
        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
        return license.withProductName(config.getExampleProperty());
    }
}
