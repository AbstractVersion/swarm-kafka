/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kafka.template.repository;

import com.kafka.template.entity.Book;
import com.kafka.template.entity.LibraryEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author onelove
 */
public interface LibraryEventsRepository extends MongoRepository<LibraryEvent, Integer> {
      Book findBy_id(Integer id);
}
