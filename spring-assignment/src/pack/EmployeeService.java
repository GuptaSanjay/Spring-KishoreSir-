package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;
	
	public void insert(Employee emp){
		dao.insert(emp);
	}
	
	public void delete(Employee emp){
		dao.delete(emp);
	}
	
	public List<Employee> getallEmployees(){
		return dao.getAllEmployees();
	}
	
	public void update(Employee emp){
		dao.update(emp);
	}

}
