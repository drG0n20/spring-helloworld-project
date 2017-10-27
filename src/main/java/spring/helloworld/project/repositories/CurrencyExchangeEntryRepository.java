package spring.helloworld.project.repositories;

import spring.helloworld.project.model.CurrencyExchangeEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeEntryRepository extends JpaRepository<CurrencyExchangeEntry, Long>{

}
