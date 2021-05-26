package dao;

import model.Account;
import java.util.List;

public interface AccountDao	{
    List<Account> findAll() throws	Exception;
}
