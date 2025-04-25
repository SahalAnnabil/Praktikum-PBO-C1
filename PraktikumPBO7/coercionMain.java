public class coercionMain {
    public static void main(String[] args) {
        int output = 'a';
        System.out.println(output);//Output: 97
        
        double x = 15.5;
        int output1 = (int) x;
        System.out.println(output1);//Output: 15
        
        int y = 25;
        double output2 = y;
        System.out.println(output2);//Output: 25.0
        
        int z = 78;
        char output3 = (char) z;
        System.out.println(output3);//Output: 'N'
        
        char a = 'a';
        double output4 = a;
        System.out.println(output4);//Output: 97.0
        
        
    }
}