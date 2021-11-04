package br.com.alison.aws.awsdynamodb.entrypoints.rest.dto;

import br.com.alison.aws.awsdynamodb.core.model.Person;
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

    public Person toModel() {
        return new Person(this.cpf, this.age, this.name);
    }
}
