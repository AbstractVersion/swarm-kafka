package com.kafka.template.entity;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document
public class LibraryEvent {

    @Id
//    @GeneratedValue
    private Integer libraryEventId;
//    @Enumerated(EnumType.STRING)
    private LibraryEventType libraryEventType;
//    @OneToOne(mappedBy = "libraryEvent", cascade = {CascadeType.ALL})
    @ToString.Exclude
    private Book book;

}
