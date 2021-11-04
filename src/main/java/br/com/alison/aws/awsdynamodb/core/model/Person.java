package br.com.alison.aws.awsdynamodb.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String cpf;
    private Integer age;
    private String name;
}
