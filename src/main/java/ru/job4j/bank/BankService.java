package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!user.equals(users)) {
            users.putIfAbsent(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        if (findByPassport(passport) != null) {
            List<Account> userAccount = users.get(findByPassport(passport));
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User rsl : users.keySet()) {
            if (passport.contains(rsl.getPassport())) {
                return rsl;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            List<Account> userAccount = users.get(findByPassport(passport));
            for (Account rsl : userAccount) {
                if (rsl.getRequisite().equals(requisite)) {
                    return rsl;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcUser = findByRequisite(srcPassport, srcRequisite);
        Account destUser = findByRequisite(destPassport, destRequisite);
        if (srcUser != null && destUser != null && srcUser.getBalance() >= amount) {
            destUser.setBalance(destUser.getBalance() + amount);
            srcUser.setBalance(srcUser.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
