package com.demo.contacts.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getItemById(@PathVariable("id") String value) {
        String response =
                String.format("Передано значение: %s", value);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/postItem")
    public ResponseEntity<String> postItemWithValue (@RequestBody String data) {
        String response = String.format("postItemWithValue получил данные: %s", data);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<String> postItem (@RequestBody String data) {
        String response = String.format("postItem получил данные: %s", data);
        return ResponseEntity.ok(response);
    }

    //    @GetMapping("/hello")
//    ResponseEntity<String> hello() {
//        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
//    }
//    @GetMapping("/hello")
//    ResponseEntity<String> hello() {
//        return ResponseEntity.ok("Hello World!");
//    }

//    @GetMapping("/customHeader")
//    ResponseEntity<String> customHeader() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Custom-Header", "foo");
//
//        return new ResponseEntity<>(
//                "Custom header set", headers, HttpStatus.OK);
//    }
}
