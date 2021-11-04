package br.com.alison.aws.awsdynamodb.dataproviders.springdata;

import br.com.alison.aws.awsdynamodb.dataproviders.entity.PersonEntity;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface PersonJpaRepository extends CrudRepository<PersonEntity, String> {
    Optional<PersonEntity> findById(String cpf);
}
