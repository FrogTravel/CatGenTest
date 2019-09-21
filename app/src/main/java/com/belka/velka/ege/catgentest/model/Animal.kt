package com.belka.velka.ege.catgentest.model

import java.util.*
import kotlin.collections.ArrayList


/**
 * Genes:
 * * - body
 * 1* - tail
 * 2* - detail
 *
 */
data class Animal(val mom: Animal?, val dad: Animal?) {
    val genomSize = 6
    var genes: ArrayList<Gene>


    init {
        if (mom != null && dad != null) {
            genes = generateGenes()
        } else {
            genes = arrayListOf()
        }
    }

    fun generateGenes(): ArrayList<Gene> {
        if (mom != null && dad != null) {
            val random = Random()
            var resultGenes = arrayListOf<Gene>()

            for (i in 0 until genomSize) {
                var gene = if (random.nextBoolean())
                    Gene(dominant = if (random.nextBoolean()) mom.genes[i].dominant else mom.genes[i].recessive, recessive = if (random.nextBoolean()) dad.genes[i].dominant else dad.genes[i].recessive)
                else
                    Gene(dominant = if (random.nextBoolean()) dad.genes[i].dominant else dad.genes[i].recessive, recessive = if (random.nextBoolean()) mom.genes[i].dominant else mom.genes[i].recessive)

                if (gene.dominant < 100 && gene.recessive > 100) {
                    gene = Gene(dominant = gene.recessive, recessive = gene.dominant)
                }

                resultGenes.add(i, gene)
            }

            return resultGenes
        } else {
            print("SOMETHING WENT WRONG!!")
            return arrayListOf()
        }

    }

    override fun toString(): String {
        return "$genes \n"
    }


}
