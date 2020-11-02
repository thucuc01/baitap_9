import java.util.ArrayList;
import java.util.Scanner;

public class QuanlySach {

    ArrayList<TaiLieu> listTaiLieu=new ArrayList<>();

    public TaiLieu nhapInfo() {
        Scanner input=new Scanner(System.in);
        Menus menus=new Menus();
        menus.menu();
        try{
            int choice=Integer.parseInt(input.nextLine());
            System.out.println("Moi nhap ID");
            int id=Integer.parseInt(input.nextLine());
            System.out.println("Moi nhap ten NXB");
            String name=input.nextLine();
            System.out.println("Moi nhap so ban phat hanh");
            int number=Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Moi nhap ten Tac Gia:");
                    String nameTacgia = input.nextLine();
                    System.out.println("Nhap so trang sach :");
                    int sotrang = Integer.parseInt(input.nextLine());
                    TaiLieu sach = new Sach(id, name, number, nameTacgia, sotrang);
                    return sach;

                case 2:
                    System.out.println("Moi nhap so phat hanh :");
                    int soPhatHanh = Integer.parseInt(input.nextLine());
                    System.out.println("Nhap thang phat hanh :");
                    int thang = Integer.parseInt(input.nextLine());
                    TaiLieu tapchi = new TapChi(id, name, number, soPhatHanh, thang);
                    return tapchi;
                case 3:
                    System.out.println("Nhap ngay phat hanh :");
                    int ngay = Integer.parseInt(input.nextLine());
                    TaiLieu bao = new Bao(id, name, number, ngay);
                    return bao;
                default:
                    System.out.println("Khong co chuc nang nay");
                    return null;
            }
        }catch(Exception e){
            System.out.println("Moi nhap lai dung dinh dang: ");
            return null;
        }
    }

    public void creat(TaiLieu taiLieu){
        listTaiLieu.add(taiLieu);
    }
    public void find(int id){
        int count=0;

        for (int i = 0; i < listTaiLieu.size(); i++) {
            if(listTaiLieu.get(i).getID()==id){
                count ++;
                System.out.println("Tai lieu co id= "+id+" nam o vi tri index thu : "+i+" trong Thu Vien");
            }
        }
        if(count!=0){
            System.out.println("Trong thu vien co "+count+" co chung id ="+ id);
        } else {
            System.out.println("Khong co Tai lieu nay trong thu vien");
        }
    }

    public void printTaiLieu(int index){
        TaiLieu taiLieu=listTaiLieu.get(index);
        if(taiLieu instanceof Sach){
            Sach sach=(Sach) taiLieu;
            System.out.println(sach.toString());
        } else
        if(taiLieu instanceof TapChi){
            TapChi tapChi=(TapChi) taiLieu;
            System.out.println(tapChi.toString());
        } else
        if(taiLieu instanceof Bao){
            Bao bao=(Bao) taiLieu;
            System.out.println(bao.toString());
        }
    }
}
