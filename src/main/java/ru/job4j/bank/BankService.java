package ru.job4j.bank;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List <Account> accounts = new ArrayList<Account>();
        if (!users.containsKey(user.getPassport())){
            users.put(user, accounts);
        }
    }

    public void addAccount(String passport, Account account) {
        List <Account> userAccs = users.get(findByPassport(passport));
        if (!userAccs.contains(account)){
            users.get(findByPassport(passport)).add(account);
        }
    }

    public User findByPassport(String passport) {
        User rsl = new User[];
        for (User key : users.keySet()){
            if (key.getPassport().equals(passport)){
                rsl = key;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = new Account[];
        List <Account> userAccs = users.get(findByPassport(passport));
        for (Account acc : userAccs){
            if (acc.getRequisite().equals(requisite)){
                account = acc;
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = users.get(findByRequisite(srcPassport, srcRequisite));
        Account accountDest = users.get(findByRequisite(destPassport, destRequisite));
        if (accountSrc.getBalance() >= amount){
            double destBalance = accountDest.getBalance();
            double srcBalance = accountDest.getBalance();
            accountDest.setBalance(destBalance + amount);
            accountDest.setBalance(srcBalance - amount);
            rsl = true;
        }
        return rsl;
    }
}
