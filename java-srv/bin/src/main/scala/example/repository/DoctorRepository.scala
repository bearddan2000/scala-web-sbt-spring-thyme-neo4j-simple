package example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.model.Doctor;

@Repository("dogRepository")
trait DoctorRepository extends CrudRepository[Doctor, Long]{

}
