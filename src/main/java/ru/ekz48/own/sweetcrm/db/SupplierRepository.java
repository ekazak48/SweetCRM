package ru.ekz48.own.sweetcrm.db;

import org.springframework.data.repository.CrudRepository;
import ru.ekz48.own.sweetcrm.entities.db.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {

}
