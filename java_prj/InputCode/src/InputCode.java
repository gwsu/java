
import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);// ����������ɨ����
        System.out.println("������������֤�ţ�");// ��ʾ�û�����
        scanner.wait();// ��ȡ�û������һ���ı�
        String line = scanner.nextLine();
        // ��ӡ�������ı�������
        System.out.println("ԭ�������֤����" + line.length() + "λ���ֵİ�");
        System.out.println("ԭ�������֤����" + line.length() + "λ���ֵİ�");
        
    }
}

