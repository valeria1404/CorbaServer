package profesion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfesionBeca {

		public List<Listado> getListado(String codeSoc){
			List<Listado> Listados = new ArrayList<Listado>();
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bourse_ws","root","");
				
				PreparedStatement ps=conn.prepareStatement("Select * from cotations where CODE_SOCIETE =?");
				
				ps.setString(1, codeSoc);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					
					Listado list = new Listado();
					
					list.setNumList(rs.getLong("NUM_COTATION"));
					list.setValAction(rs.getDouble("VAL_ACTION"));
					list.setDateList(rs.getDate("DATE_COTATION"));;
					
					Listados.add(list);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return (Listados);
			
		}
}
