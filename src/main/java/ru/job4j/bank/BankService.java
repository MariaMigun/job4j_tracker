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
        List <Account> userAccs = users.get(findByPassport(passport));
        if (!userAccs.contains(account)){
            users.get(findByPassport(passport)).add(account);
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
        for (Account account : users.get(findByPassport(passport))){
            if (account.getRequisite().equals(requisite)){
                return account;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        int srcIndex = users.get(srcUser).indexOf(accountSrc);
        int destIndex = users.get(destUser).indexOf(accountDest);
        double destBalance = users.get(destUser).get(destIndex).getBalance();
        double srcBalance = users.get(srcUser).get(srcIndex).getBalance();
        if (accountSrc != null && accountDest != null && accountSrc.getBalance() >= amount){
            users.get(srcUser).get(srcIndex).setBalance(srcBalance - amount);
            users.get(destUser).get(destIndex).setBalance(destBalance + amount);
            rsl = true;
        }
        return rsl;
    }
}
