package cmd;

public class cmd {  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
       openWinExe();  
       openMyExe();  
    }  
   
    // ��Java����windowsϵͳ��exe�ļ�������notepad��calc֮��  
    public static void openWinExe() {  
       Runtime rn = Runtime.getRuntime();  
       Process p = null;  
       try {  
           String command = "calc";  
           p = rn.exec(command);  
       } catch (Exception e) {  
           System.out.println("Error win exec ");  
       }  
    }  
   
    // 2.0���������Ŀ�ִ���ļ������磺�Լ�������exe���������ذ�װ�����  
    public static void openMyExe() {  
       Runtime rn = Runtime.getRuntime();  
       Process p = null;  
       try {  
           p = rn.exec("C:/Xilinx/Vivado/Vivado/2016.4/bin/vivado.bat");  
       } catch (Exception e) {  
           System.out.println("Error my exec ");  
       }  
    }  
}  