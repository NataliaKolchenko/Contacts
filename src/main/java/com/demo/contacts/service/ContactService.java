package com.demo.contacts.service;

import com.demo.contacts.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class ContactService {
    private final List<Contact> contacts = Arrays.asList(
            new Contact(UUID.randomUUID(), "John Doe", "john@example.com"),
            new Contact(UUID.randomUUID(), "Jane Smith", "jane@example.com"),
            new Contact(UUID.randomUUID(), "Alice Brown", "alice@example.com")
    );

    public Contact getContact() {
        Random random = new Random();
        int index = random.nextInt(contacts.size());
        Contact randomContact = contacts.get(index);
        return randomContact;
    }
}
