import org.junit.jupiter.api.*;

public class LifecycleHooksExample {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all tests");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }
}