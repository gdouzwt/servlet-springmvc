package io.zwt.spring.app19a.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    private static final long serialVersionUID = 1520961851058396786L;
    private long id;
    private String isbn;
    private String title;
    private Category category;
    private String author;
}
