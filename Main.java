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
    System.out.println("How many bones have YOU broken?");
    int yourBones = scan.nextInt();
    System.out.println("How many bones has your FRIEND broken?");
    int theirBones = scan.nextInt();

    //creates int for the total age
    int getAge = totalAge(yourAge, theirAge);
    //creates int for total broken bones
    int getBones = totalBones(yourBones, theirBones);

    //prints first method get age
    System.out.println("Both of your ages added together is " + getAge + ". Wow!");
    
    System.out.println("Both of you combined have broken up to " + getBones + " bones! Hope you don't break any more anytime soon!");
  }

  //method for adding both ages
  static int totalAge(int yourAge, int theirAge){
    int getAge = yourAge + theirAge;
    return getAge;
  }

  static int totalBones(int yourBones, int theirBones){
    int getBones = yourBones + theirBones;
    return getBones;
  }
  
}