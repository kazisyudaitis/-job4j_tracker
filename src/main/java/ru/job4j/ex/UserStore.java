package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUserName())) {
               rsl = users[i];
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Element not found in array");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUserName().length() < 3) {
            throw new UserInvalidException("Name cannot be less than 3 characters or incorrect");
        }
        return false;
    }

    public static void main(String[] args) {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        }

    }
}
