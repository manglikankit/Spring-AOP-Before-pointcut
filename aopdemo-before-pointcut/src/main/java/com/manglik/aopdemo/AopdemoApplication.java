package com.manglik.aopdemo;

import com.manglik.aopdemo.dao.AccountDao;
import com.manglik.aopdemo.dao.MembershipDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao accountDao, MembershipDao membershipDao){
		return runner -> {
			demoTheBeforeAdvice(accountDao, membershipDao);
		};

	}

	private void demoTheBeforeAdvice(AccountDao accountDao, MembershipDao membershipDao) {
		Account account = new Account();
		account.setName("A");
		account.setLevel("Level A");
		accountDao.addAccount(account, true);
		membershipDao.addAccount();
		accountDao.setName("TestName");
		accountDao.setServiceCode("Test Code");

		accountDao.getName();
		accountDao.getServiceCode();
	}


}
