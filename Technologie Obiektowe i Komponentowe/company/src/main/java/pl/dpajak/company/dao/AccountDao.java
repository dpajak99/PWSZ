package pl.dpajak.company.dao;

import pl.dpajak.company.model.Account;

import java.util.List;

public interface AccountDao {
  List<Account> findAll() throws Exception;
}
