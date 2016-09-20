package me.j360.autovalue; /**
 * Package: me.j360.trace.mq
 * User: min_xu
 * Date: 16/9/20 下午3:28
 * 说明：
 */
import com.google.auto.value.AutoValue;

@AutoValue
abstract class Animal {
    static Animal create(String name, int numberOfLegs) {
        // See "How do I...?" below for nested classes.
        return new AutoValue_Animal(name, numberOfLegs);
    }

    abstract String name();
    abstract int numberOfLegs();
}