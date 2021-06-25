package ru.job4j.bank;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList <Account> ());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null){
            List <Account> userAccs = users.get(user);
            if (!userAccs.contains(account)){
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()){
            if (user.getPassport().equals(passport)){
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = users.get(findByPassport(passport));
        if (accounts != null) {
            for (Account acc : accounts) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc != null && accountDest != null && accountSrc.getBalance() >= amount){
            accountSrc.setBalance(accountSrc.getBalance() - amount);
            accountDest.setBalance(accountDest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
