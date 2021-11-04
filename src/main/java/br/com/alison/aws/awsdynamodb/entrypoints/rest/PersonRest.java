package br.com.alison.aws.awsdynamodb.entrypoints.rest;

import br.com.alison.aws.awsdynamodb.core.model.Person;
import br.com.alison.aws.awsdynamodb.core.usecases.person.PersonRegisterUseCase;
import br.com.alison.aws.awsdynamodb.entrypoints.rest.dto.PersonDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class PersonRest {

    private final PersonRegisterUseCase registerUseCase;

    @PostMapping("/register")
    public Person register(@RequestBody PersonDto personDto) {
        return registerUseCase.register(personDto.toModel());
    }

    @GetMapping("/teste")
    public String register() {
        return "teste";
    }
}
