import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class baglanti {
			
	
		
	
	
	
		//burayla id görüntülemeler gözüküyor
		static ResultSet sorgula(String sql_sorgu) { 
			ResultSet myRs =null;
			
		    
			try {
				Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kargotakip?serverTimezone=UTC","root","2626");
				Statement myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
					myRs =  myStat.executeQuery(sql_sorgu);
			    }catch(Exception e) {
					e.printStackTrace();
				}
			
			return myRs;
		}


		
		//Ekle butonu
		static void ekle(String SqlSorgu) {
		
			try {
				Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kargotakip?serverTimezone=UTC","root","2626");
				Statement myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
				myStat.executeUpdate(SqlSorgu);
			    }catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		//Sil butonu
				static void sil(String sql_sil) {
				
					try {
						Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kargotakip","root","2626");
						Statement myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
						myStat.executeUpdate(sql_sil);
					    }catch(Exception e) {
							e.printStackTrace();
						}
				}
		
		
				
			//personel giriþi için baðlantý
				static ResultSet yap() {
					ResultSet myRs =null;
					try {
						Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kargotakip","root","2626");
						Statement myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
						ResultSet myRs1= myStat.executeQuery("select *from personel");
		
					}catch(Exception e) {
						e.printStackTrace();
					}
					return myRs;
				}
				
				
				// kurye giriþi için baðlantý
				static ResultSet yap2() {
					ResultSet myRs =null;
					try {
						Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kargotakip","root","2626");
						Statement myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
						ResultSet myRs2= myStat.executeQuery("select *from kurye");
						
					}catch(Exception e) {
						e.printStackTrace();
					}
					return myRs;
				}
				// müþteri giriþi için baðlantý
				static ResultSet yap1() {
					ResultSet myRs =null;
					try {
						Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kargotakip","root","2626");
						Statement myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
						ResultSet myRs3= myStat.executeQuery("select *from musteri");
						
					}catch(Exception e) {
						e.printStackTrace();
					}
					return myRs;
				}
					
					
					// update kodu
					
					static void update(String sql_sorgu) {
						try {
							Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kargotakip","root","2626");
							Statement myStat = (Statement) ((java.sql.Connection) myConn).createStatement();
							myStat.executeUpdate(sql_sorgu);
						} catch (Exception e) {
							e.printStackTrace();
							
						}
						
				}
				
				
				
}
