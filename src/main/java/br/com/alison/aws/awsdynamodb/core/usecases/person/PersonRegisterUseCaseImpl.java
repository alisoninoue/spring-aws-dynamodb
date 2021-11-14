package br.com.alison.aws.awsdynamodb.core.usecases.person;

import br.com.alison.aws.awsdynamodb.core.usecases.person.ports.PersonCreate;
import br.com.alison.aws.awsdynamodb.core.model.Person;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonRegisterUseCaseImpl implements PersonRegisterUseCase{

    private final PersonCreate repository;

    @Override
    public Person register(Person person) {
        return repository.create(person);
    }
}
