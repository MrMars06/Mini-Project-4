import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //new Scanner
    Scanner scan = new Scanner(System.in);

    //Asking for age
    System.out.println("How old are you?");
    int yourAge = scan.nextInt();
    System.out.println("How old is your best friend?");
    int theirAge = scan.nextInt();

    int getAge = totalAge(yourAge, theirAge);

    System.out.println("Both of your ages added together is " + getAge + ". Wow!");

  }

  //method for adding both ages
  static int totalAge(int yourAge, int theirAge){
    int getAge = yourAge + theirAge;
    return getAge;
  }

  
}