package br.com.alison.aws.awsdynamodb.dataproviders.entity;

import br.com.alison.aws.awsdynamodb.core.model.Person;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PersonToEntityConverter implements Converter<Person, PersonEntity> {
    @Override
    public PersonEntity convert(Person source) {
        return new PersonEntity(source.getCpf(), source.getAge(), source.getName());
    }
}
