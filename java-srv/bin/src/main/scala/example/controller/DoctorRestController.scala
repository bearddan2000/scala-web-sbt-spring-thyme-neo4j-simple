package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import scala.jdk.CollectionConverters._
import scala.collection.Iterable

import example.model.Doctor;
import example.repository.DoctorRepository;

@RestController
class DoctorRestController (
	@Autowired() doctorRepository: DoctorRepository
) {

	def init(): Unit =
	{
	    val lst: List[Doctor] = List(
				new Doctor(1L, "Bill", "ER Medicine", "Cardiac")
				new Doctor(2L, "Sue", "Neurology", "Spinal Disorder")
				new Doctor(3L, "Jose", "Pediatrics", "General")
			);

			lst.foreach {doctor => doctorRepository.save(doctor)};

	}

	@GetMapping(Array("/doctors"))
	def getAllDoctors(): String =
	{
			init();
			val itr: List[Doctor] = doctorRepository.findAll().asScala.toList;
			var i = 0;
			val sb = new StringBuilder("[")
				itr.foreach {
					doctor =>
					sb ++= doctor.toString()
					if(i < itr.size-1)
						sb += ','
					i+=1
				}
			sb += ']'
			return sb.toString()
	}
}
