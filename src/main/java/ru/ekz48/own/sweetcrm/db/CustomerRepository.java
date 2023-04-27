package ru.ekz48.own.sweetcrm.db;

import org.springframework.data.repository.CrudRepository;
import ru.ekz48.own.sweetcrm.entities.db.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}
