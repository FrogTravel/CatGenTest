package com.belka.velka.ege.catgentest

import android.graphics.drawable.LayerDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.belka.velka.ege.catgentest.model.Animal
import com.belka.velka.ege.catgentest.model.Gene
import com.belka.velka.ege.catgentest.model.GeneProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        breed()
    }

    fun drawCat(imView: ImageView, animal: Animal) {
        val r = getResources()
        val layers = arrayOf(
            r.getDrawable(GeneProvider.getBody(animal.genes[0].dominant)),
            r.getDrawable(GeneProvider.getTail(animal.genes[1].dominant)),
            r.getDrawable(GeneProvider.getDetail(animal.genes[2].dominant)),
            r.getDrawable(GeneProvider.getEar(animal.genes[3].dominant)),
            r.getDrawable(GeneProvider.getEye(animal.genes[4].dominant)),
            r.getDrawable(GeneProvider.getFur(animal.genes[5].dominant)),
            r.getDrawable(R.drawable.mouth),
            r.getDrawable(R.drawable.must)
        )

        val layerDrawable = LayerDrawable(layers)

        imView.setImageDrawable(layerDrawable)
    }

    private fun breed() {
        val mom = Animal(mom = null, dad = null)
        val dad = Animal(mom = null, dad = null)

        dad.genes = arrayListOf(
            Gene(dominant = 101, recessive = 1),
            Gene(dominant = 111, recessive = 111),
            Gene(dominant = 121, recessive = 121),
            Gene(dominant = 131, recessive = 131),
            Gene(dominant = 141, recessive = 141),
            Gene(dominant = 151, recessive = 151)
        )

        mom.genes = arrayListOf(
            Gene(dominant = 102, recessive = 101),
            Gene(dominant = 112, recessive = 12),
            Gene(dominant = 122, recessive = 121),
            Gene(dominant = 132, recessive = 31),
            Gene(dominant = 142, recessive = 141),
            Gene(dominant = 152, recessive = 151)
        )

        drawCat(imageViewMom, mom)
        drawCat(imageViewDad, dad)

        val childrenF1 = arrayOf(Animal(dad, mom), Animal(dad, mom), Animal(dad, mom), Animal(dad, mom))

        drawCat(imageView1, childrenF1[0])
        drawCat(imageView2, childrenF1[1])
        drawCat(imageView3, childrenF1[2])
        drawCat(imageView4, childrenF1[3])

        val childrenF2 = arrayOf(
            Animal(childrenF1[0], childrenF1[1]),
            Animal(childrenF1[0], childrenF1[1]),
            Animal(childrenF1[0], childrenF1[1]),
            Animal(childrenF1[0], childrenF1[1]),

            Animal(childrenF1[2], childrenF1[3]),
            Animal(childrenF1[2], childrenF1[3]),
            Animal(childrenF1[2], childrenF1[3]),
            Animal(childrenF1[2], childrenF1[3])
        )

        drawCat(imageView5, childrenF2[0])
        drawCat(imageView6, childrenF2[1])
        drawCat(imageView7, childrenF2[2])
        drawCat(imageView8, childrenF2[3])
        drawCat(imageView9, childrenF2[4])
        drawCat(imageView10, childrenF2[5])
        drawCat(imageView11, childrenF2[6])
        drawCat(imageView12, childrenF2[7])
    }

    fun onBreed(view: View) {
        breed()
    }
}
