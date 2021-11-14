package br.com.alison.aws.awsdynamodb.entrypoints.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private String cpf;
    private Integer age;
    private String name;
}
