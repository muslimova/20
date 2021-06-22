public class console1 {
    public void message1(int ch){
        System.out.println("На столе осталось "+ ch +" спичек");
    }
    public void message2(int vibor){
        System.out.println("Количество выбранных компьютером спичек = " + vibor);
    }
    public void message3(int ch){
        System.out.println("Ход игрока.На столе " + ch + " спичек.Введите количество спичек которое вы возьмёте :");
    }
    public void lastMessage(){
        System.out.println("Осталась 1 спичка. Вы проиграли");
    }
}
