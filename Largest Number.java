public class LargestNumber{
  public static void main (String[] args){
    int a=10, b=200, c=3000;
    int largest = ((a>b)? (a>c)?a:c :(b>c)?b:c);
    System.out.print("Biggest number : "+largest);
  }
}
