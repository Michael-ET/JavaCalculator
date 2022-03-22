public class Calculator {
  
    //contructor
    public Calculator(){
  
    } 
  
    //add method 
    public int add(int addA, int addB){
      int total = addA + addB;
      return total;
    }
  
    //subtract method 
    public int subtract(int subA, int subB){
      int total = subA - subB;
      return total;
    }
  
    //multiply method 
    public int mult(int multA, int multB){
      int total = multA * multB;
      return total;
    }
  
    //divide method 
    public int div(int divA, int divB){
      int total = divA / divB;
      return total;
    }
  
    //modulo method 
    public int mod(int modA, int modB){
      int total = modA % modB;
      return total;
    }
  
    public static void main(String[] args){
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45,11));
    }
  
  }