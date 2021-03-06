package ru.sberbank.school.task02;

import java.util.List;

import ru.sberbank.school.task02.util.Quote;
import ru.sberbank.school.task02.util.Symbol;

public interface ExternalQuotesService {

    List<Quote> getQuotes(Symbol symbol);
}
