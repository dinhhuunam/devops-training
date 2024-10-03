package test_deploy_spring_boot.deploy_demo_spring_boot.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test_deploy_spring_boot.deploy_demo_spring_boot.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
