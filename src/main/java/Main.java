import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int ch = 20;
        boolean h = true;
         while (h){
          new console1().message1(ch);
          new console1().message2(new computer().think(ch));
          ch = ch - new computer().think(ch);
          new console1().message3(ch);
          String s = new computer().reader();
          ch = ch - Integer.parseInt(s);
          new computer().setVibor(s);
           if (ch<=4){
              h =  false;
              if (ch==1){
                  new console1().lastMessage();
              }else{
                  new console1().message1(ch);
                  new console1().message2(new computer().think(ch));
                  new console1().lastMessage();
              }
          }
      }
    }
}
