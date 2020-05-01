package Singleton;

class A{
    private static A obj;
    private A(){}

    public static A getA(){
        if (obj == null){
            //Instance will be created when required
            synchronized(A.class){
                if (obj == null){
                    obj = new A();
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}