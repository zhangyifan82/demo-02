package com.example.demo02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component
public class User {
    public String userName;
    public String password;
}
