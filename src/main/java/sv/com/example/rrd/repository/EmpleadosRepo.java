/**
 * 
 */
package sv.com.example.rrd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sv.com.example.rrd.entity.Empleados;

/**
 * @author tony
 *
 */

@Repository
public interface EmpleadosRepo extends JpaRepository<Empleados, Long> {
	
	@Query("select e from Empleados e where e.activo=:activo")
	List<Empleados> findAllByActiveEmpleados(@Param("activo")String activo);

}
