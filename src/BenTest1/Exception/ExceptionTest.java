public class ExceptionTest {
    public static void main(String[] args) {
       class TestException extends Exception {}
    public void runTest() throws TestException {}
    public void test()throws Exception {}
    {
        runTest();
    }
}
}
