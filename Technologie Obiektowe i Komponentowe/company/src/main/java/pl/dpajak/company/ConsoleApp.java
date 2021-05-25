package pl.dpajak.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dpajak.company.model.Account;
import pl.dpajak.company.service.AccountService;

import java.util.List;

public class ConsoleApp {

  public static void main(String[] args) throws Exception {
    ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
    AccountService accountService = (AccountService) appCtx.getBean("accountService");
    List<Account> deliquentAccounts = accountService.fieldDeliquentAccounts();
    for(Account a : deliquentAccounts) {
      System.out.println("Niesolidny klient: " + a.getAccountNo());
    }
  }

}
