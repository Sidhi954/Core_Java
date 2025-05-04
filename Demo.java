//classes and objects in java
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
public class Demo {
    public static void main(String[] args){
        Calculator calc=new Calculator();
        int res=calc.add(8,43);
        System.out.println("Addition of two numbers:" +res);
    }
}
