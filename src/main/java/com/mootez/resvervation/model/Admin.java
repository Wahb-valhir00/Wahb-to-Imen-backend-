package com.mootez.resvervation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "admin")
public class Admin  {
    @Id
    private String id;
    
    private String name;
    private String email;
    private String password;
    private String telephone;
    
}

