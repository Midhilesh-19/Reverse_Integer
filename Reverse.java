import java.util.Scanner;

public class Reverse {
//    printing digits of input number

    //    public void counting(){
//        Scanner n =new Scanner(System.in);
//        int x=n.nextInt();
//        int count=0;
//        String z=Integer.toString(x);
//        for(int i=0;i<=z.length()-1;i++){
//            char a =z.charAt(i);
//            System.out.println(a);
//        }
//    }

//    printing reverse digits of input number
    public void counting(){
    Scanner n =new Scanner(System.in);
    int x=n.nextInt();
    int count=0;
    int z=x;
    while (z!=0){
        z=z/10;
        count++;
    }
    int t =(int) Math.pow(10,count-1);

    while (t!=0){
        int q=x%10;
        System.out.print(q);
        x=x/10;
        t=t/10;
    }
    //uncomment this to get no of divisons done  
//        System.out.println("\nCount of no of divisons: "+count);
}
    public static void main(String[] args) {
        Reverse Obj = new Reverse();
        Obj.counting();
    }

}
