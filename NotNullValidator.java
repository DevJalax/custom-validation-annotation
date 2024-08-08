import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotNullValidator implements ConstraintValidator<NotNull, Object> {

    @Override
    public void initialize(NotNull constraintAnnotation) {
        // Initialization code, if needed
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return value != null; // Check if the object is not null
    }
}
