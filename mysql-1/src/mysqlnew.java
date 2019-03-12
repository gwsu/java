import java.sql.*;

public class mysqlnew {

    public static void main(String[] args) throws Exception {
        // 1.加载数据访问驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.连接到数据"库"上去
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlnew?characterEncoding=GBK", "root", "root");
        //3.构建SQL命令
        Statement state=conn.createStatement();
                       	
		System.out.println(conn.toString());
        
        String sql = "select * from name";
        //3.ResultSet类，用来存放获取的结果集！！
        ResultSet rs = state.executeQuery(sql);
        System.out.println("-----------------");
        System.out.println("执行结果如下所示:");  
        System.out.println("-----------------");  
        System.out.println("姓名" + "\t" + "职称");  
        System.out.println("-----------------");
        String job = null;
        String id = null;
        while(rs.next()){
            //获取stuname这列数据
            job = rs.getString("name");
            //获取stuid这列数据
            id = rs.getString("school");

            //输出结果
            System.out.println(id + "\t" + job);
        }
        rs.close();
        conn.close();
    }

}