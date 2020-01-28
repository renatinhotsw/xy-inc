package com.xyinc.br.xyinc.resource

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import org.springframework.data.jpa.repository.JpaRepository
import com.xyinc.br.xyinc.resource.Pois
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import com.xyinc.br.xyinc.resource.PoisRepository


@RestController
@RequestMapping("/rest/pois")
class PoisResource(val poisRepository: PoisRepository) {

	@GetMapping("/all")
	fun getPois(): List<Pois> {
		return poisRepository.findAll();
	}

	@GetMapping("/insert/{name}/{cord_x}/{cord_y}")
	fun insertPoi(@PathVariable name: String, @PathVariable cord_x: Int, @PathVariable cord_y: Int): List<Pois> {
		val pois = Pois(name, cord_x, cord_y)
		poisRepository.save(pois)
		return poisRepository.findAll()
	}

	@GetMapping("/get_euclideana/{point}/{dist}")
	fun getEuclideana(@PathVariable point: Int, @PathVariable dist: Int) {
		//distancia = Math.sqrt(Math.sqr(x1 - x2) + Math.sqr(y1 - y2));
		val cordinates = listOf(poisRepository.findAll())
		println(cordinates)

//		while (numbersIterator.hasNext()) {
//			println(numbersIterator.next())
//		}
//
//		val numbers = listOf("one", "two", "three", "four")
//		val longerThan3 = numbers.filter { it.length > 3 }
//		println(longerThan3)
//
//		val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
//		val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10 }
//		println(filteredMap)


	}
}


@Entity
class Pois(
	val name: String = "",
	val cord_x: Int, val cord_y: Int,
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	val id: Long = 0
)

//interface PoisRepository: JpaRepository<Pois,Long>
	

