package ru.kdv.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String name;
    private String level;
}
