package spring.helloworld.project.service;

import spring.helloworld.project.dto.CurrencyExchangeResultDto;
import spring.helloworld.project.model.CurrencyExchangeEntry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CurrencyExchangeService {

    List<CurrencyExchangeEntry> getAll();
    CurrencyExchangeResultDto getExchangeRate(String from, String to, String amount);

    Page<CurrencyExchangeEntry> getPage(Pageable page);
}
