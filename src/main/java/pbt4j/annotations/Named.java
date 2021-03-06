package pbt4j.annotations;

import java.lang.annotation.*;

/**
 * @author Linas on 2016.03.06.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Named {

    String value();

}
