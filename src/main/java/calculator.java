import java.lang.Math;

public class calculator {
  double result = 0;

  public void add(String num){
      double nums=Float.parseFloat(num);  
    result+=nums;
  }
  public void minus(String num){
      double nums=Float.parseFloat(num);  
    result-=nums;
  }

  public void divide(String num){
      double nums=Float.parseFloat(num);  
    result/=nums;
  }

  public void multiply(String num){
      double nums=Float.parseFloat(num);  
    result*=nums;
  }

  public void clear(){ 
    result=0;
  }
  
  public void fib(String num){
    double n=Float.parseFloat(num);
    if (n % 1 != 0){
      n = Math.floor(n);
    }
    result = fibhelp(n);
  }

  public void sqrt(String num){
      double nums=Float.parseFloat(num);
    result = Math.sqrt(nums);
  }

  public void customsqrt(String num, String input){
    double nums=Float.parseFloat(num);
    double inputnum=Float.parseFloat(input);

    result = Math.pow(nums, 1/inputnum);
  }

  public void square(String num){
    double nums=Float.parseFloat(num);
    result = Math.pow(nums, 2);
  }

  public void customsquare(String num, String input){
    double nums=Float.parseFloat(num);
    double inputnum=Float.parseFloat(input);

    result = Math.pow(nums, inputnum);
  }
  

  public double getResult(){
    return result;
  }

  //PRIVATE FUNCTIONS
  
  private double fibhelp(double n){
    if(n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }
    return fibhelp(n-1)+fibhelp(n-2);
  }
  
}