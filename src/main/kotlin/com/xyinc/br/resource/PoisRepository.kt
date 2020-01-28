package com.xyinc.br.xyinc.resource
import org.springframework.data.jpa.repository.JpaRepository

interface PoisRepository : JpaRepository<Pois,Long>
interface MutableList<E> : List<E>, MutableCollection<E>



