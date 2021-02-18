package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
       String rsl = "null";
       int numb = -1;
        for (int i=0; i < users.length; i++ ) {
            if (users[i].equals(login)){
                rsl = login;
                numb = i;
                break;
            }
        }
        if (rsl.equals("null")){
            throw new UserNotFoundException("There is no user");
        }
        return users[numb];
    }


    public static boolean validate(User user) throws UserInvalidExceprion {
        if(user.isValid() == false){
            throw new UserInvalidExceprion("User name is not valid");
        }
        if (user.length() < 3){
            throw new UserInvalidExceprion("User name is not valid");
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
        }catch (UserInvalidExceprion ea) {
            ea.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }

    }
}
