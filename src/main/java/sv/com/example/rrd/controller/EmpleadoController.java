/**
 * 
 */
package sv.com.example.rrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sv.com.example.rrd.entity.Empleados;
import sv.com.example.rrd.services.EmpleadosService;

/**
 * @author tony
 *
 */


@RestController
@RequestMapping("/empleado")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EmpleadoController extends AbstractBaseController{
	
	@Autowired
	EmpleadosService empleadosService;
	
	@GetMapping("/")
	public ResponseEntity<?> allEmpleados(){
	//public List<Empleados> allEmpleados(){
		
		List<Empleados> listAllEmp = empleadosService.findAll();
		
		return generateSingleHashMapResponse(listAllEmp, "Datos Extraidos Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
		
		//return empleadosService.findAll();
	}
	
	@GetMapping("/activos")
	public ResponseEntity<?> allEmployeeActive
	(){
		
		List<Empleados> listAllEmp = empleadosService.findAllActivos();
		
		return generateSingleHashMapResponse(listAllEmp, "Datos Extraidos Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> employeeById(@PathVariable("id") Long id){
		
		Empleados employees = empleadosService.empleadoById(id);
		
		if(employees != null)
			return generateSingleHashMapResponse(employees, "Dato Extraido Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
		else
			return generateSingleHashMapResponse("", "Id "+ id + " no encontrado", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@PutMapping(value = "/")
	public ResponseEntity<?> updateEmployee(@RequestBody Empleados empleados){
		
		empleadosService.update(empleados);
		return generateSingleHashMapResponse("", "Datos Actualizados Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<?> createEmployee(@RequestBody Empleados empleado){
		empleadosService.create(empleado);
		return generateSingleHashMapResponse("", "Datos Registrado Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@DeleteMapping(value = "/{Id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("Id") Long Id ){
		Empleados employees = empleadosService.empleadoById(Id);
		empleadosService.delete(employees);
		return generateSingleHashMapResponse("", "Dato Eliminado Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	
	

}
