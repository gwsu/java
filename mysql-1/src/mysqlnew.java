import java.sql.*;

public class mysqlnew {

    public static void main(String[] args) throws Exception {
        // 1.�������ݷ�������
        Class.forName("com.mysql.jdbc.Driver");
        //2.���ӵ�����"��"��ȥ
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlnew?characterEncoding=GBK", "root", "root");
        //3.����SQL����
        Statement state=conn.createStatement();
                       	
		System.out.println(conn.toString());
        
        String sql = "select * from name";
        //3.ResultSet�࣬������Ż�ȡ�Ľ��������
        ResultSet rs = state.executeQuery(sql);
        System.out.println("-----------------");
        System.out.println("ִ�н��������ʾ:");  
        System.out.println("-----------------");  
        System.out.println("����" + "\t" + "ְ��");  
        System.out.println("-----------------");
        String job = null;
        String id = null;
        while(rs.next()){
            //��ȡstuname��������
            job = rs.getString("name");
            //��ȡstuid��������
            id = rs.getString("school");

            //������
            System.out.println(id + "\t" + job);
        }
        rs.close();
        conn.close();
    }

}