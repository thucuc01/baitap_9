import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Menus menus=new Menus();
        Scanner input=new Scanner(System.in);
        QuanlySach quanlySach=new QuanlySach();
       do{
           menus.menu2();
           int choice=Integer.parseInt(input.nextLine());
           switch (choice){
               case 1:
                   TaiLieu taiLieu=quanlySach.nhapInfo();
                   quanlySach.creat(taiLieu);
                   break;
               case 2:
                   System.out.println("Moi nhap ID sach can tim :");
                   quanlySach.find(Integer.parseInt(input.nextLine()));
                   break;
               case 3:
                   System.out.println("Moi nhap vi tri index cua Tai lieu can lay thong tin :");
                   quanlySach.printTaiLieu(Integer.parseInt(input.nextLine()));
                   break;
               default:
                   System.out.println("chua co chuc nang nay");
                   break;
           }
       } while (true);

    }

}
