package com.daumsoft.leaf.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String id;
    private String password;
    private String name;
    private String authType;

}