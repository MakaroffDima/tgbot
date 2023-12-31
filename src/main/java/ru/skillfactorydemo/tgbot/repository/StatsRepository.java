package ru.skillfactorydemo.tgbot.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

@Repository
@RequiredArgsConstructor
public class StatsRepository {

    private final JdbcTemplate jdbcTemplate;

    public int getCountOfIncomesThatGreaterThan(BigDecimal amount) {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM INCOMES WHERE income > ?" ,Integer.class, amount);

    }
    public int getCountOfIncomesThatGreaterBetweenDates(Long amount) {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM INCOMES WHERE income > ? AND WHERE dates BETWEEN '?' and '?'" ,Integer.class, amount);

    }

}
