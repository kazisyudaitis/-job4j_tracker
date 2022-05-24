package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковских переводов
 * @author Казис
 * @version 1.0
 */
public class BankService {

    /**
     * В Map хранятся все пользователи системы и все счета привязанные к пользователя.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     *  Метод принимает на вход пользователя и
     *  по умолчанию, добавляет пустой список счетов.
     *  Перед добавлением, производится
     *  проверка на существование пользователя.
     * @param user пользователь которого надо добавить.
     */
    public void addUser(User user) {

        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет счет пользователю.
     * Метод принимает на вход, паспорт и список всех счетов пользователя.
     * Перед добавлением счета, проверяется
     * существование данного счета.
     * @param passport паспорт пользователя.
     * @param account список счетов пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * Метод принимает на вход паспорт пользователя.
     * Перебор всех элементов производится через цикл.
     * @param passport паспорт пользователя.
     * @return возвращает паспорт пользователя или null, если паспорт не найден.
     */
    public User findByPassport(String passport) {
        for (User rsl : users.keySet()) {
            if (passport.equals(rsl.getPassport())) {
                return rsl;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам.
     * Метод на вход принимает паспорт пользователя и
     * реквизиты счета.
     * Сначала производится поиск пользователя по паспорту
     * с помощью метода findByPassport, если
     * вернулось значение не null,проверяется счет.
     * @param passport паспорт пользователя.
     * @param requisite реквизиты счета.
     * @return возвращает счет пользователя или null.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            for (Account rsl : userAccount) {
                if (rsl.getRequisite().equals(requisite)) {
                    return rsl;
                }
            }
        }
        return null;
    }

    /**
     * Метод перечисляет деньги со счета на счет.
     * @param srcPassport паспорт пользователя
     * @param srcRequisite счет пользователя для списания
     * @param destPassport паспорт пользователя
     * @param destRequisite счет пользователя для зачисления
     * @param amount количество денег
     * @return возвращает true при удачном зачислении или false
     */
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
