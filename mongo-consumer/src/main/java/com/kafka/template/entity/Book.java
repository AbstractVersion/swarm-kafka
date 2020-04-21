package com.kafka.template.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document
public class Book {
    @Id
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
//    @OneToOne
//    @JoinColumn(name = "libraryEventId")
    private LibraryEvent libraryEvent;
}
