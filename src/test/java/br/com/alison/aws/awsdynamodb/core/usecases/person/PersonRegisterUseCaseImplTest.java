package br.com.alison.aws.awsdynamodb.core.usecases.person;

import br.com.alison.aws.awsdynamodb.core.dataproviders.PersonCreate;
import br.com.alison.aws.awsdynamodb.core.model.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PersonRegisterUseCaseImplTest {

    @Mock
    PersonCreate repository;

    @Test
    void shouldRegister() {
        Person person = new Person("123", 1, "Teste");
        when(repository.create(any())).thenReturn(person);

        PersonRegisterUseCaseImpl personRegisterUseCase = new PersonRegisterUseCaseImpl(repository);
        Person personRegistered = personRegisterUseCase.register(person);
        assertThat(person, equalTo(personRegistered));

    }
}