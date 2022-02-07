package com.example.pollinationid

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_fourth.*

data class Insect(val title: String, val description: String, val img: Int)

class FourthFragment:Fragment(R.layout.fragment_fourth) {


    private val mInsectList = listOf(
        Insect("Alfalfa Leafcutter Bee", "(Megachile rotundata)",R.drawable.alfalfa_leafcutter_bee_1),
        Insect("American Grass Spider", "(Agelenopsis spp.)",R.drawable.american_grass_spiders_1),
        Insect("Apical Leafcutter Bee", "(Megachile apicalis)",R.drawable.apical_leafcutter_bee_1),
        Insect("Bark Centipede", "(Scoloprcryptops sexspinosus)",R.drawable.bark_centipede_1),
        Insect("Beetles", "(Order: Coleoptera)",R.drawable.beetles_1),
        Insect("Bellflower Resin Bee", "(Megachile campanulae)",R.drawable.bellflower_resin_bee_1),
        Insect("Blue Orchard Mason Bee", "(Osmia lignaria)",R.drawable.blue_orchard_mason_bee_1),
        Insect("Brown Lacewings", "(Family: Hemerobiidae)",R.drawable.brown_lacewings_1),
        Insect("Bufflehead Mason Bee", "(Osmia bucephala)",R.drawable.bufflehead_mason_bee_1),
        Insect("Carrot Wasps", "(Gasteruption spp.)",R.drawable.carrot_wasps_1),
        Insect("Centipedes", "(Class: Chilopoda)",R.drawable.centipedes_1),
        Insect("Common Barklice", "(Family: Psocidae)",R.drawable.common_barklice_1),
        Insect("Common Eastern Bumblebee", "(Bombus impatiens)",R.drawable.common_eastern_bumblebee_1),
        Insect("Common Pill Woodlouse", "(Armadillidium vulgare)",R.drawable.common_pill_woodlouse_1),
        Insect("Cuckoo Bees", "(Sphecodes spp.)",R.drawable.cuckoo_bees_1),
        Insect("Cuckoo Leafcutter Bees", "(Coelioxys spp.)",R.drawable.cuckoo_leaf_cutter_bees_1),
        Insect("Dwarf Mason Bee", "(Osmia pumila)",R.drawable.dwarf_mason_bee_1),
        Insect("Eastern Carpenter Bee", "(Xylocopa virginica)",R.drawable.brown_lacewings_1),
        Insect("Eastern Wool-Carder Bee", "(Anthidium manicatum)",R.drawable.eastern_caligrapher_bee_1),
        Insect("Flat-Tailed Leafcutter Bee", "(Megachile mendica)",R.drawable.flat_tailed_leafcutter_bee_1),
        Insect("Four-toothed Mason Wasp", "(Monobia quadridens)",R.drawable.four_toothed_mason_wasp_1),
        Insect("Green Lacewings", "(Chrysoperla spp.)",R.drawable.green_lacewing_1),
        Insect("Harvestmen", "(Order: Opiliones)",R.drawable.harvestmen_1),
        Insect("Hornets and Yellowjackets", "(Subfamily: Vespinae)",R.drawable.hornets_and_yellowjackets_1),
        Insect("Hornfaced Bee", "(Osmia cornifrons)",R.drawable.hornfaced_bee_1),
        Insect("Hoverflies", "(Family: Syrphidae)",R.drawable.hoverflies_1),
        Insect("Jumping Spiders", "(Family: Salticidae)",R.drawable.jumping_spiders_1),
        Insect("Lady Bugs", "(Family: Coccinellidae)",R.drawable.lady_bug_1),
        Insect("Leafcutter Bees", "(Megachile spp.)",R.drawable.leafcutter_bees_1),
        Insect("Maine Blueberry Bee", "(Osmia atriventris)",R.drawable.maine_blueberry_bee_1),
        Insect("Margined Calligrapher", "(Toxomerus marginatus)",R.drawable.margined_calligrapher_1),
        Insect("Mason Bees", "(Osmia spp.)",R.drawable.mason_bees_1),
        Insect("Metallic Bluish Green Cuckoo Wasp", "(Chrysis angolensis)",R.drawable.metallic_bluish_green_cuckoo_wasp_1),
        Insect("Mexican Grass-Carrying Wasp", "(Chrysis angolensis)",R.drawable.mexican_grass_carrying_wasp_1),
        Insect("Millipedes", "(Chrysis angolensis)",R.drawable.millipedes_1),
        Insect("Modest Masked Bee", "(Hylaeus modestus)",R.drawable.modest_masked_bee_1),
        Insect("Oblong wool Carder Bee", "(Anthidium oblongatum)",R.drawable.oblong_wool_carder_bee_1),
        Insect("Orange-tipped Wood-digger Bee", "(Anthophora terminalis)",R.drawable.orange_tipped_wood_digger_bee_1),
        Insect("Pugnacious Leafcutter Bee", "(Megachile pugnata)",R.drawable.pugnacious_leafcutter_bee_1),
        Insect("Pure Green Sweat Bee", "(Augochlora pura)",R.drawable.pure_green_sweat_bee_1),
        Insect("Scaly Bee Fly", "(Lepidophora lepidocera)",R.drawable.scaly_bee_fly_1),
        Insect("Sculptured Resin Bee", "(Megachile sculpturalis)",R.drawable.sculptured_resin_bee_1),
        Insect("Silver-tailed Petalcutter Bee", "(Megachile montivaga)",R.drawable.silver_tailed_petalcutter_bee_1),
        Insect("Small Carpenter Bees", "(Ceratina spp.)",R.drawable.small_carpenter_bees_1),
        Insect("Small Mason Bees", "(Hoplitis spp.)",R.drawable.small_mason_bees_1),
        Insect("Small Resin Bees", "(Heriades spp.)",R.drawable.small_resin_bees_1),
        Insect("Small Sweat Bees", "(Lasioglossum spp.)",R.drawable.small_sweat_bees_1),
        Insect("Small-Handed Leafcutter Bee", "(Megachile gemula)",R.drawable.small_handed_leafcutter_bee_1),
        Insect("Taurus Mason Bee", "(Osmia taurus)",R.drawable.taurus_mason_bee_1),
        Insect("Transverse-Banded Calligrapher", "(Eristalis transversa)",R.drawable.transverse_banded_calligrapher_1),
        Insect("Unarmed Leafcutter Bee", "(Megachile inermis)",R.drawable.unarmed_leafcutter_bee_1),
        Insect("Western Honeybee", "(Apis mellifera)",R.drawable.western_honeybee_1),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_fourth, container, false)

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        recycler_view1.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ListAdapter(mInsectList)
        }

    }

    companion object {
        fun newInstance(): FourthFragment = FourthFragment()
    }
}