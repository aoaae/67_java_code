package Y67;
import java.util.Scanner;
public class w10_03_Status {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("กรุณาป้อนเพศ (male/female): ");
        String gender = scanner.nextLine();

        System.out.print("กรุณาป้อนอายุ: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // อ่านบรรทัดที่ค้างจาก nextInt()

        System.out.print("กรุณาป้อนสถานะสมรส (single/married): ");
        String maritalStatus = scanner.nextLine();

        // ตรวจสอบและแนะนำคำหน้าชื่อ
        String title = "";

        if (gender.equalsIgnoreCase("male")) {
            if (age < 15) {
                title = "เด็กชาย";
            } else {
                title = "นาย";
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age < 15) {
                title = "เด็กหญิง";
            } else if (maritalStatus.equalsIgnoreCase("single")) {
                title = "นางสาว";
            } else if (maritalStatus.equalsIgnoreCase("married")) {
                title = "นาง";
            }
        }

        // แสดงผลคำหน้าชื่อ
        if (!title.isEmpty()) {
            System.out.println("คำหน้าชื่อที่เหมาะสมคือ: " + title);
        } else {
            System.out.println("ข้อมูลที่ป้อนไม่ถูกต้อง");
        }

        scanner.close();
    }
}


// การทำงานของโปรแกรม:
// 1. โปรแกรมจะขอให้ผู้ใช้ป้อนเพศ (ชาย/หญิง), อายุ และสถานะสมรส (โสด/แต่งงาน)
// 2. โปรแกรมจะทำการตรวจสอบข้อมูลที่ป้อนเข้ามา:
//     - ถ้าเป็นเพศชายและอายุน้อยกว่า 15 ปี จะใช้คำว่า "เด็กชาย"
//     - ถ้าเป็นเพศชายและอายุมากกว่า 15 ปี จะใช้คำว่า "นาย"
//     - ถ้าเป็นเพศหญิงและอายุน้อยกว่า 15 ปี จะใช้คำว่า "เด็กหญิง"
//     - ถ้าเป็นเพศหญิง, อายุมากกว่า 15 ปี และโสด จะใช้คำว่า "นางสาว"
//     - ถ้าเป็นเพศหญิง, อายุมากกว่า 15 ปี และแต่งงานแล้ว จะใช้คำว่า "นาง"
// 3. โปรแกรมจะแสดงคำหน้าชื่อที่เหมาะสมตามเงื่อนไขที่ตรวจสอบได้