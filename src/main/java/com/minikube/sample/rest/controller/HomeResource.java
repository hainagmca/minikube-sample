package com.minikube.sample.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gorantla, Eresh
 * @created 06-12-2018
 */
@RestController
@RequestMapping("/home")
public class HomeResource {

    @Value("${test}")
    String test = null;

    @GetMapping("/data")
    public ResponseEntity<ResponseData> getData() {
        ResponseData responseData = new ResponseData();
        responseData.setId(1);
        responseData.setName("Eresh");
        responseData.setPlace("Hyderabad");
        responseData.setValue(test);
        return new ResponseEntity<ResponseData>(responseData, HttpStatus.OK);
    }

    @Getter
    @Setter
    public class ResponseData {
        private String name;
        private Integer id;
        private String place;
        private String value;
    }
}
