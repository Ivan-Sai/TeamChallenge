package teamchallenge.server.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(long id) {
        super("User with id " + id + " not found");
    }
}
