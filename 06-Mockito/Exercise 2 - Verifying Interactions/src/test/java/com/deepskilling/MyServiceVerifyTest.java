package com.deepskilling;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
public class MyServiceVerifyTest {
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();
    }
    public static void main(String[] args) {
        TestRunner.runTests(MyServiceVerifyTest.class);
    }
}
