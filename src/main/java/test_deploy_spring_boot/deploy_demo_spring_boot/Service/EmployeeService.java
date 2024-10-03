package test_deploy_spring_boot.deploy_demo_spring_boot.Service;

import test_deploy_spring_boot.deploy_demo_spring_boot.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Optional<Employee> findById(Integer theId);

    void save(Employee theEmployee);

    void delete(Integer theId);
}
