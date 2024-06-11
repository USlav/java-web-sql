package com.example.backend;

import org.springframework.web.bind.annotation.*;


import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;
    @CrossOrigin(origins = "http://127.0.0.1:61728")
    @PostMapping
    public String postData(@RequestBody DataRequest request) {
        DataEntity dataEntity = new DataEntity();
        dataEntity.setData(request.getData());
        dataRepository.save(dataEntity);
        return "Received data: " + request.getData();
    }

    public static class DataRequest {
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}



