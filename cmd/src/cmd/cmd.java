package cmd;

public class cmd {  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
       openWinExe();  
       openMyExe();  
    }  
   
    // 用Java调用windows系统的exe文件，比如notepad，calc之类  
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
   
    // 2.0调用其他的可执行文件，例如：自己制作的exe，或是下载安装的软件  
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