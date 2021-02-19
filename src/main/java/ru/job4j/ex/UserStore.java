package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
       String rsl = "null";
       int numb = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)){
                rsl = login;
                numb = i;
                break;
            }
        }
        if (rsl == null){
            throw new UserNotFoundException("There is no user");
        }
        return users[numb];
    }


    public static boolean validate(User user) throws UserInvalidExceprion {
        if(!user.isValid()){
            throw new UserInvalidExceprion("User name is not valid");
        }
        if (user.length() < 3){
            throw new UserInvalidExceprion("User name is less then 3 symbols");
        }
        return true;
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
        } catch (UserInvalidExceprion ea) {
            ea.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }

    }
}
