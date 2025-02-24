public class LoginValidation {
    private String expectedUserName;
    private String expectedPassword;
    private int maxAttempts;
    private int curAttempts;

    public LoginValidation(String initExpectedUsername, String initExpectedPassword, int initMaxAttempts) {
        expectedUserName = initExpectedUsername;
        expectedPassword = initExpectedPassword;
        maxAttempts = initMaxAttempts;
        curAttempts = 0;
    }

    public int validateLogin(String username, String password) {
        if (curAttempts >= maxAttempts) {
            return 4;
        }
        curAttempts++;
        if (!username.equals(expectedUserName) && !password.equals(expectedPassword)) {
            return 3;
        } else if (!username.equals(expectedUserName)) {
            return 1;
        } else if (!password.equals(expectedPassword)) {
            return 2;
        } else {
            return 0;
        }
    }
}


