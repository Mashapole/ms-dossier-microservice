package com.dossier.msdossiermicroservice.feign;


import com.dossier.msdossiermicroservice.dto.ApplicationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(value = "ms-deal", url="http://localhost:8080/deal/admin/application")

public interface feignClient {

    @GetMapping("/{applicationId}")
    ApplicationDTO getApplicationById(@PathVariable(value = "applicationId") Long id);

    @PutMapping("/{applicationId}/status")
    void updateApplicationStatus(@PathVariable(value = "applicationId") Long id);
}
