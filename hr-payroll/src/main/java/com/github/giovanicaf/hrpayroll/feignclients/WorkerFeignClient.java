package com.github.giovanicaf.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.github.giovanicaf.hrpayroll.dto.WorkerDto;

@Component
@FeignClient(name = "hr-worker", path="/workers")
public interface WorkerFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<WorkerDto> findById(@PathVariable Long id);
}
