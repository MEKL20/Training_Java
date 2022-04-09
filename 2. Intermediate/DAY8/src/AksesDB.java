import java.sql.*;

public class AksesDB
{
	public static void main(String [] bebas)
	{
		//1. buat koneksi ke db server
		String url="jdbc:mysql://localhost:3306/hr";
		String username="root";
		String password="";
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection conn=DriverManager.getConnection(url,username,password);
			//2. Siapkan object statement (statement : helper object yg digunakan untuk mengirim perintah sql ke db server)
			Statement stm=conn.createStatement();

			//3. Siapkan perintah SQL yang akan dikirim ke db server
			String perintahSQL="select employee_id,first_name,salary from employees";

			//4. EKseskusi perintah SQL
			ResultSet hasil=stm.executeQuery(perintahSQL);

			//5. Olah Hasil
			while(hasil.next()){
				System.out.println("NIP : "+hasil.getString("employee_id"));
				System.out.println("NAMA : "+hasil.getString("first_name"));
				System.out.println("GAJI : "+hasil.getString("salary"));
				System.out.println("================");
			}

			//6. Close Connection
			conn.close();
		}catch(Exception e){
			System.out.println("Error -_- "+e.getMessage());
		}
	}
}
