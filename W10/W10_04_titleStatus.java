//  ตรวจสอบคำนำหน้าชื่อ
//  ด.ญ.  ด.ช. นาย  นาง  นางสาว
//  ถ้าเป็นด.ญ. หรือ นางสาว ให้แสดงข้อความว่า "เป็นผู้หญิง"
//  ถ้าเป็นด.ช. หรือ นาย ให้แสดงข้อความว่า "เป็นผู้ชาย"
//  อายุ
//  ถ้าอายุน้อยกว่า 15 ให้แสดงข้อความว่า "เด็ก"
//  สถานสมรส

//  เพศ   อายุ   สถานะสมรส


package W10;
import java.util.Scanner;
public class W10_04_titleStatus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ระบุเพศ (male/female): ");
        String gender = kb.next();

        System.out.print("ระบุอายุ: ");
        int age = kb.nextInt();

        System.out.print("สถานสมรส (single/married): ");
        String isMarried = kb.next();

        if(gender.equalsIgnoreCase("male")){
            // ถ้าเป็นผู้ชาย => ด.ช.  นาย
            if(age < 15){
                System.out.println("ด.ช.");                
            }else{
                System.out.println("นาย");
            }
        }else{
            // ถ้าเป็นผู้หญิง => ด.ญ.  นาง  นางสาว
            if(age < 15){
                System.out.println("ด.ญ.");                
            }else if(isMarried.equalsIgnoreCase("married")){
                System.out.println("นาง");
            }else{
                System.out.println("นางสาว");
            }
        }
    }
}
