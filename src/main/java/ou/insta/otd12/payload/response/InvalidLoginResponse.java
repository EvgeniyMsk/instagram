package ou.insta.otd12.payload.response;

import lombok.Getter;

@Getter
public class InvalidLoginResponse {
    private String usernate;
    private String password;

    public InvalidLoginResponse() {
        this.usernate = "Invalid username";
        this.password = "Invalid password";
    }
}
