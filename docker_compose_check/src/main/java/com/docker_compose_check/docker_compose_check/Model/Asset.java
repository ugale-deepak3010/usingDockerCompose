package com.docker_compose_check.docker_compose_check.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Document
@Data
public class Asset {

    @Id
    private String id;
    private String name;
    private int quantity;
    private String category;

}
