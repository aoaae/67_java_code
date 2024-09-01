package Y67;

import java.util.Scanner;   // นำเข้าคลาส Scanner

public class W12_04_doWhile_selectMenu {
    public static void main(String[] args) {
        // ประกาศ Scanner object

        // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้เลือก

        // ให้ผู้ใช้เลือกเมนูซ้ำจนกว่าจะเลือกออก ใช้ do-while
            // เงื่อนไขคือ วนลูปไปเรื่อยๆ จนกว่าผู้ใช้จะเลือก 3
        


            // แสดงเมนู
            System.out.println("====================================");
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.println("====================================");
            
            // รับค่าเลือกเมนู
                // แสดงข้อความให้ผู้ใช้ป้อนเลือกเมนู Enter your choice:
                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร choice
            System.out.println("------------------------------------");
            
            
      
             


        // ตรวจสอบเมนูที่ผู้ใช้เลือก
        switch () {
            case 1:     // ถ้าผู้ใช้เลือก 1
                System.out.print("Enter the first number: ");
                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num1
                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num2
                // คำนวณผลรวม
                // แสดงผลรวม
                // ออกจาก switch
            case 2:
            
            case 3:
            
            default:    // ถ้าผู้ใช้เลือกเมนูอื่น
                // แสดงข้อความเลือกเมนูไม่ถูกต้อง
        }

        // ปิด Scanner object
    }  
}
