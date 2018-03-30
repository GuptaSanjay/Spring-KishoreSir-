package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	
	public void insert(Employee e){
		template.update("insert into employee values(?,?,?,?)", new Object[]{e.getId(),e.getName(),e.getSalary(),e.getDesignation()});
		
	}
	
	public void delete(Employee e){
		template.update("delete from employee where id=?", new Object[]{e.getId()});
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee> list=template.query("select*from employee", new EmployeeRowMapper());
		return list;
	}
	
	
	public void update(Employee e){
		template.update("update employee set name=? where id=?", new Object[]{e.getName(),e.getId()});
		template.update("update employee set salary=? where id=?", new Object[]{e.getSalary(),e.getId()});
		template.update("update employee set designation=? where id=?", new Object[]{e.getDesignation(),e.getId()});
	}
}
