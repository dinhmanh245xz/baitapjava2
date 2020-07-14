/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Laptop88
 */


   class MenuSon{
        String ten;
        String Mota;
        float pardent_id;
        
        void ShowMenu(){
            System.out.println("tên Menu cha : " + ten);
            System.out.println("menu con : "+Mota);
            System.out.println("pardent_id: "+pardent_id);
        }
        
   }
        class MenuParden{
       ArrayList<MenuSon> ListMenu = new ArrayList<MenuSon>();
       Scanner  input =  new Scanner(System.in);
       
       void MenuAdd (MenuSon Ms){
           System.out.println("mời bạn nhập tên menu cha: ");
           Ms.ten = input.nextLine();
            System.out.println("mời bạn nhập tên menu con: ");
           Ms.Mota = input.nextLine();
            System.out.println("mời bạn nhập pardent_id : ");
           Ms.pardent_id = input.nextFloat();
           ListMenu.add(Ms);
        }
       void ShowMenu(){
       if(ListMenu.size() == 0){
           System.out.println("danh sach chua co ");
            }
       else
       {
       for(MenuSon Ms : ListMenu){
          Ms.ShowMenu();
              }
       
       }
       
   }
 }
public class MainMenu {
    
    static void Menu(){
        System.out.println("===========================");
        System.out.println("Meu đa cấp ");
        System.out.println("1. thêm vao menu cha");
        System.out.println("2. xem danh sách menu");
        System.out.println("3. thoát chương trình ");
        System.out.println("===========================");

    }
    
    
    public static void main(String[] args) {
        int chon;
        MenuParden menuParden = new MenuParden();
         Scanner  input =  new Scanner(System.in);
        Menu();
        while(true){
            System.out.print("mời bạn chọn menu");
            chon = input.nextInt();
            switch(chon){
                case 1:
                    menuParden.MenuAdd(new MenuSon());
                    break;
                case 2:
                    menuParden.ShowMenu();
                    break;
                case 3: return;
            }
        }
    }
}
