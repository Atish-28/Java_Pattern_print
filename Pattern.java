import java.util.Scanner;
public class Pattern {
    private static void interestingalphabets(int input) {
        char start_char=(char)('A'+input-1);
        for(int row=1;row<=input;row++){
            char temp_char=start_char;
            for(int col=1;col<=row;col++){
                System.out.print(temp_char);
                temp_char=(char)(temp_char+1);
            }
            start_char=(char)(start_char-1);
            System.out.println();
        }
    }
    public static void characterpattern(int input) {
        char ch='A';
        for(int row=1;row<=input;row++){
            char temp_char=ch;
            for(int col=1;col<=row;col++){
                System.out.print(temp_char);
                temp_char=(char)(temp_char+1);
            }
            ch=(char)(ch+1);
            System.out.println();
        }
    }
    public static void alphapattern(int input){
        char ch='A';
        for(int row=1;row<=input;row++){
            for(int col=1;col<=row;col++){
                System.out.print(ch);
            }System.out.println();
            ch=(char)(ch+1);
        }
    }
    public static void reversenumberpattern(int input) {
        for(int row=1;row<=input;row++){
            int temp_row=row;
            for(int col=1;col<=row;col++){
                System.out.print(temp_row);
                temp_row-=1;
            }System.out.println();
        }
    }
    public static void triangularnumberpattern(int input) {
        for(int  i=1;i<=input;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }System.out.println();
        }
    }
    public static void triangularstarpattern(int input) {
        for(int  i=1;i<=input;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }System.out.println();
        }
    }
    public static void squarepattern(int input) {
            for(int  i=1;i<=input;i++){
                for(int j=1;j<=input;j++){
                    System.out.print(input);
                }System.out.println();
            }
    }
    public static void main(String[] args) {
        /* To print any pattern just remove the comment & done */
        System.out.print("Enter(no of row)>>>");
       try(Scanner str=new Scanner(System.in)){
            int input=str.nextInt();
            if(input>=0 && input<=50){          
               // squarepattern(input);
               // triangularstarpattern(input);
               //triangularnumberpattern(input);
               //reversenumberpattern(input);
               //alphapattern(input);
               //characterpattern(input);
               if(input<=26){
               // interestingalphabets(input);
               }
            }

       } catch (Exception e) {
          System.out.println(e);
       }
    }
}