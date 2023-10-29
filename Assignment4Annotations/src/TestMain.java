import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TestMain {

    @Test
    public void testMethod() {
        System.out.println("This is a test method.");
    }

    public static void main(String[] args) {
        TestMain obj = new TestMain();
        obj.testMethod();
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {
}