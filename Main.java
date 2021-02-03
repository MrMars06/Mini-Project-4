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
    System.out.println("How many bones have you broken?");
    int yourBones = scan.nextInt();
    System.out.println("How many bones has your friends broken?");
    int theirBones = scan.nextInt();

    //creates int for the total age
    int getAge = totalAge(yourAge, theirAge);
    //creates int for the total bones
    int getBones = totalBones(yourBones, theirBones);

    //prints first method get age
    System.out.println("Both of your ages added together is " + getAge + ". Wow!");

  }

  //method for adding both ages
  static int totalAge(int yourAge, int theirAge){
    int getAge = yourAge + theirAge;
    return getAge;
  }

  

}