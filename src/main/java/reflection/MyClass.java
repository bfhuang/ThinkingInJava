package reflection;

public class MyClass {
    public int publicField;
    protected  int protectedField;
    private int privateField;

    public void publicFunction() {
        System.out.println("public function");
    }

    public void protectedFunction() {
        System.out.println("protected function");
    }

    void defaultFunction() {
        System.out.println("default funciton");
    }

    private void privateFunction() {
        System.out.println("private funciton");
    }

    public void setPrivateField(int privateField) {
        this.privateField = privateField;
    }

}
