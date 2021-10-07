package ou.insta.otd12.validations;

import ou.insta.otd12.annotations.PasswordMatches;
import ou.insta.otd12.payload.request.SignupRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches passwordMatches) {

    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        SignupRequest userSingUpRequest = (SignupRequest) obj;
        return userSingUpRequest.getPassword().equals(userSingUpRequest.getConfirmPassword());
    }
}
