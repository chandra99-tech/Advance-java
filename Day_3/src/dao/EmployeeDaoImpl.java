package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;



import java.util.ArrayList;

import bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	static Connection conn;
	static PreparedStatement save,showAllData,remove,update,search,sorted;
	
	static {
		try {
			conn=DBUtil.getMyConnection();
			save=conn.prepareStatement("insert into temp15 values(?,?,?)");
			showAllData=conn.prepareStatement("select * from temp15");
			remove=conn.prepareStatement("delete from temp15 where id=?");
			update=conn.prepareStatement("update temp15 set ename=?,T_date=? where id=?");
			search=conn.prepareStatement("select * from temp15 where id=?");
			sorted=conn.prepareStatement("select * from temp15 order by T_date ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean save(Employee e) {
		try {
			save.setInt(1, e.geteId());
			save.setString(2, e.geteName());
			save.setDate(3, java.sql.Date.valueOf(e.getldt()));
			
			int n= save.executeUpdate();
			return n>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Employee> showAllData() {
		List<Employee> elist=new ArrayList<>();
		try {			
			ResultSet rs=showAllData.executeQuery();
			while(rs.next()) {
				if(rs.getDate(3)!=null) {
					elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDate(3).toLocalDate()));
				}else {
					elist.add(new Employee(rs.getInt(1),rs.getString(2),null));
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return elist;
	}

	@Override
	public boolean removeEmployee(int eId) {
		try {
			remove.setInt(1, eId);
			int n=remove.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	

	@Override
	public boolean updateData(int eId, String eName, LocalDate ldt) {
		try {
			update.setString(1, eName);
			update.setDate(2, java.sql.Date.valueOf(ldt));
			update.setInt(3, eId);
			
			int n = update.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee searchById(int eId) {
		Employee E=null;
		try {
			search.setInt(1, eId);
			ResultSet rs=search.executeQuery();
			if(rs.next()) {
				if(rs.getDate(3)!=null) {
					E=new Employee(rs.getInt(1),rs.getString(2),rs.getDate(3).toLocalDate());
				}else {
					E=new Employee(rs.getInt(1),rs.getString(2),null);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return E;
	}

	@Override
	public List<Employee> sortedOrder() {
		List<Employee> elist=new ArrayList<>();
		try {			
			ResultSet rs=sorted.executeQuery();
			while(rs.next()) {
				if(rs.getDate(3)!=null) {
					elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDate(3).toLocalDate()));
				}else {
					elist.add(new Employee(rs.getInt(1),rs.getString(2),null));
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return elist;
	}

	@Override
	public void closes() {
		DBUtil.closeMyConnection();
		
	}

}
