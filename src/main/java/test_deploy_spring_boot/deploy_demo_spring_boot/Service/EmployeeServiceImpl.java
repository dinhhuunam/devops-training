package test_deploy_spring_boot.deploy_demo_spring_boot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test_deploy_spring_boot.deploy_demo_spring_boot.Dao.EmployeeRepository;
import test_deploy_spring_boot.deploy_demo_spring_boot.Entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Integer theId) {
        return employeeRepository.findById(theId);
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void delete(Integer id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee theEmployee = null;
        if(result.isPresent()){
            theEmployee = result.get();
            employeeRepository.deleteById(id);
        }else{
            //We didn't find the employee
            throw new RuntimeException("Did not find employee id - "+id);
        }
    }
}
