/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kafka.template.controller;

import com.kafka.template.entity.LibraryEvent;
import com.kafka.template.repository.LibraryEventsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author onelove
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private LibraryEventsRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<LibraryEvent> getAllPets() {
        return repository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public LibraryEvent addAllPet(@RequestBody LibraryEvent event) {
        return repository.save(event);
    }

    @RequestMapping(value = "/{eventId}", method = RequestMethod.DELETE)
    public void addAllPet(@PathVariable Integer eventId) {
        repository.deleteById(eventId);
    }

}
