import java.io.IOException;
import java.util.Scanner;


public class computer {
    int ch = 20;
    int vibor;

    public int getVibor() {
        return vibor;
    }

    public void setVibor(String title) throws IOException {
        vibor = Integer.parseInt(title);
       if (vibor<1||vibor>3){
         throw new IllegalArgumentException("Количество спичек должно быть от 1 до 3 ");
      }else {
          vibor = this.vibor;

      }
        }



    public String reader() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public int think(int ch) {
        if (ch%4==1&&ch>4){
            return 2;
        }
        if (ch%4==2&&ch>4){
            return 1;
        }
        if (ch%4==2&&ch<=4){
            return 1;
        }
        if (ch%4==3&&ch>4){
            return 2;
        }

        if (ch%4==3&&ch<=4){
            return 2;
        }
        if (ch%4==0){
            return 3;
        }

        return 0;
    }

}
