package com.demo.contacts.controllers;

import com.demo.contacts.model.Contact;
import com.demo.contacts.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;


    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


//    @GetMapping("/randomContactSingle")
//    public ResponseEntity<Contact> getRandomContactSingle() {
//        Contact contact = new Contact(UUID.randomUUID(), "John", "john@example.com");
//        return ResponseEntity.ok(contact);
//    }

    @GetMapping("/randomContactList")
    public ResponseEntity<Contact> getRandomContactList() {
        Contact contact = contactService.getContact();
        return  ResponseEntity.ok(contact);
    }
}
