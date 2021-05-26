package jdbc.impl;

import dao.AccountDao;
import jdbc.AccountRowMapper;
import model.Account;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;

@Service
public class AccountServiceImp implements AccountDao {
    private static final String FIND_ALL_SQL = "select account_no, balance, last_paid_on from account";

    @Inject private NamedParameterJdbcOperations jdbcTemplate;
    @Inject private AccountRowMapper accountRowMapper;

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query(FIND_ALL_SQL, new HashMap<String, Object>(), accountRowMapper);
    }

}
