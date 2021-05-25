package pl.dpajak.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.jdbc.impl.AccountServiceImp;
import spring.model.Account;
import spring.service.AccountService;

import java.util.List;

public class ConsoleApp {

  public static void main(String[] args) throws Exception {
    System.out.println("Start");
    ApplicationContext appCtx =
      new ClassPathXmlApplicationContext("applicationContext.xml");

    AccountServiceImp accountServiceImp = (AccountServiceImp)appCtx.getBean("AccountServiceImp");

    List<Account> delinquentAccounts = accountServiceImp.findAll();
    System.out.println(delinquentAccounts);
    for (Account a : delinquentAccounts) {
      System.out.println("Niesolidny to " + a.getAccountNo());
    }
    System.out.println("Finish");
  }
}
