package com.kafka.template.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "library-events")
public class LibraryEvent {

    @Id
    private Integer libraryEventId;
    @JsonProperty("libraryEventType")
    @NonNull
    private LibraryEventType libraryEventType;
    @DBRef
    private Book book;

}
