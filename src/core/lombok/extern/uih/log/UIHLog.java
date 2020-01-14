package lombok.extern.uih.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Causes lombok to generate a logger field.
 * <p>
 * Complete documentation is found at <a href="https://projectlombok.org/features/Log">the project lombok features page for lombok log annotations</a>.
 * <p>
 * Example:
 * <pre>
 * &#64;UIHLog
 * public class LogExample {
 * }
 * </pre>
 *
 * will generate:
 *
 * <pre>
 * public class LogExample {
 *     private static final com.uih.uplus.common.log.logger.IUihLogger logger = com.uih.uplus.common.log.logger.UihLoggerFactory.getUihLogger(LogExample.class);
 * }
 * </pre>
 *
 * This annotation is valid for classes and enumerations.<br>
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface UIHLog {
    /** @return The category of the constructed logger. By default, it will use the type where the annotation is placed. */
    String topic() default "";
}

