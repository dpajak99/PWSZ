package com.mycompany.mavenproject;

import jdbc.impl.AccountServiceImp;
import model.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;

import java.util.List;

public class DemoApplication {
	public static void main(String[] args) throws Exception {

		ApplicationContext appCtx =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountServiceImp accountServiceImp = (AccountServiceImp)appCtx.getBean("AccountServiceImp");

		List<Account> delinquentAccounts = accountServiceImp.findAll();

		for (Account a : delinquentAccounts)
			System.out.println("Niesolidny to " + a.getAccountNo());
	}
}
