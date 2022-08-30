package net.runelite.client.plugins.JFKMI;

import java.lang.annotation.*;

interface ExtensionPoint {
}
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
@Documented
@interface Extension {
    int ordinal() default 0;

    Class<? extends ExtensionPoint>[] points() default {};

    String[] plugins() default {};
}
