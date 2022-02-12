package com.example.pollinationid

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_fourth.*

data class Insect(val title: String, val description: String, val img1: Int, val img2: Int, val img3: Int, val img4: Int,
                  val about: String, val keyChar: String, val plants: String)

class FourthFragment:Fragment(R.layout.fragment_fourth) {

    //this is where all the information for the encylopedia is stored
    private val mInsectList = listOf(
        Insect("Alfalfa Leafcutter Bee", "(Megachile rotundata)",
            R.drawable.alfalfa_leafcutter_bee_1,R.drawable.alfalfa_leafcutter_bee_2,R.drawable.alfalfa_leafcutter_bee_3,R.drawable.alfalfa_leafcutter_bee_4,
                "The Alfalfa Leafcutter Bee was introduced to the U.S. before the 1940sto pollinate alfalfa and carrots1\n" +
                        ".\n" +
                        "They are a solitary species that nest both above and below the ground in cavities. Above ground nesting\n" +
                        "sites include hollow plant stems, holes in standing dead trees, rock cavities, and abandoned mud dauber\n" +
                        "wasp nests1\n" +
                        "\n" +
                        ". The females seem to prefer tunnels with a diameter between 4mm and 6mm2\n" +
                        "\n" +
                        "and lay eggs\n" +
                        "\n" +
                        "after the June/July mating season3\n" +
                        "\n" +
                        ". After finding a suitable nesting site, a female Alfalfa Leafcutter Bee\n" +
                        "will build chambers starting with a cell furthest from the opening. She deposits a single egg with a bundle\n" +
                        "of pollen (and sometimes nectar) for food. The female then uses her large mandibles (bee teeth) to cut\n" +
                        "M. rotundata\n" +
                        "6mm to\n" +
                        "9mm long\n" +
                        "\n" +
                        "oval leaves from plants to seal off each chamber4\n" +
                        "\n" +
                        ". She repeats this process up to 24 times3 depending on\n" +
                        "the size of the tunnel before sealing off the nest entrance with leaves. The larvae will hatch in early\n" +
                        "winter, consume the food bundle, and overwinter as mature larva before pupating in spring3\n" +
                        ".\n" +
                        "The Alfalfa Leafcutter Bee faces three distinct challenges: chalkbrood, parasitism, and pesticide\n" +
                        "exposure4\n" +
                        ". Chalkbrood is a fungal infection that impacts brood (bee eggs, larva, and/or pupa)4\n" +
                        ". The\n" +
                        "\n" +
                        "parasitic wasp Ptesomalus venustus is a common threat to the Alfalfa Leafcutter Bee4\n" +
                        "\n" +
                        ". As the bee larva\n" +
                        "begins to spin its cocoon in preparation to pupate, a female P. venustus wasp will sting and paralyze the\n" +
                        "larva before depositing her own eggs onto it4\n" +
                        "\n" +
                        ". The wasp larva hatch within a day or two and consume the\n" +
                        "\n" +
                        "bee larva4\n" +
                        ". The Alfalfa Leafcutter Bee larva also faces possible predation by the Checkered Flower Beetle,\n" +
                        "T. ornatus, which invades the nest and eats the developing brood3\n" +
                        "\n" +
                        ". Pesticides and insecticides also\n" +
                        "challenge the Alfalfa Leafcutter Bee and pollinators in general. The toxins within pesticides do not\n" +
                        "discriminate between harmful and beneficial insects. Pollinators foraging in gardens or fields sprayed with\n" +
                        "chemicals can consume or carry the toxins back to their nests. This results in high mortality rates of bees\n" +
                        "and other pollinators that encounter these chemicals5\n" +
                        ".\n" +
                        "\n" +
                        "While the Alfalfa Leafcutter Bee is not native to the U.S., it has been recognized as an important pollinator\n" +
                        "despite its range being limited to agricultural settings6\n" +
                        ".\n" +
                        "\n" +
                        "SEASONALITY: June to August7\n" +
                        "CONSERVATION STATUS: Not threatened3\n" +
                        "STATUS: Non-native\n" +
                        "Sources: 1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN:\n" +
                        "Pollination Press LLC.\n" +
                        "2Osgood, C. E. (1964). Foraging and Nesting Behavior of the Leafcutter Bee Megachile rotundata\n" +
                        "(Fabricius). Retrieved January 18, 2020 from https://ir.library.oregonstate.edu/downloads/dv13zx37q\n" +
                        "3\n" +
                        "Yajcaji, A. (2011). Megachile rotundata. Accessed January 18, 2020 at\n" +
                        "https://animaldiversity.org/accounts/Megachile_rotundata/\n" +
                        "4\n" +
                        "Snyder, R. (2014, July). Alfalfa Leafcutter Bee (Megachile rotundata). Retrieved January 18, 2020 from\n" +
                        "https://beeinformed.org/2014/07/30/alfalfa-leafcutter-bee-megachile-rotundata/\n" +
                        "5University of Georgia. (n.d.). Protecting Pollinators from Pesticides. Retrieved January 18, 2020 from\n" +
                        "\n" +
                        "https://bees.caes.uga.edu/bees-beekeeping-pollination/pollination/pollination-protecting-pollinators-\n" +
                        "from-pesticides.html\n" +
                        "\n" +
                        "6Burrows, S., Ritner, C., Christman, M., Spears, L., Smith-Pardo, A., Price, S., ... Redford, A. (2018, August).\n" +
                        "Megachile. Retrieved January 17, 2020, from\n" +
                        "http://idtools.org/id/bees/exotic/factsheet.php?name=16425\n" +
                        "7Alfalfa Leafcutter Bee (Fabricius, 1787). (n.d.). Retrieved January 17, 2020, from\n" +
                        "\n" +
                        "https://www.inaturalist.org/taxa/47219-Apis-\n" +
                        "melliferahttps://www.discoverlife.org/20/q?search=Megachile+rotundata",
                "• Black or gray with white/pale cream banding on abdomen\n" +
                        "• Females have rows of pale hair beneath abdomen (scopa)\n" +
                        "• Males with creamy white or yellow spots at end of abdomen",
                "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "\n" +
                        "COMMON PLANTS USED FOR NESTING MATERIAL\n" +
                        "Tick trefoils, Desmodium spp.\n" +
                        "Roses, Rosa spp.\n" +
                        "St. John’s wort, Hypericum spp.\n" +
                        "Ash, Fraxinus spp.\n" +
                        "Eastern redbud, Cercis canadensis\n" +
                        "SPRING\n" +
                        "Golden Alexanders, Zizia aurea\n" +
                        "Harebell, Campanula rotundifolia\n" +
                        "Wild Indigo, Baptisia spp.\n" +
                        "Coneflower, Echinacea spp.\n" +
                        "Beardtongue, Penstemon spp.\n" +
                        "Canada Anemone, Anemone canadensis\n" +
                        "Balsam Ragwort, Packera paupercula\n" +
                        "SUMMER\n" +
                        "Yellow Coneflower, Ratibida pinnata\n" +
                        "Black-eyed Susan, Rudbeckia hirta\n" +
                        "Milkweed, Asclepias spp.\n" +
                        "Joe Pye Weed, Eutrochium spp.\n" +
                        "Tickseed, Coreopsis spp.\n" +
                        "Anise Hyssop, Agastache foeniculum\n" +
                        "Prairie Onion, Allium stellatum\n" +
                        "Tick Trefoil, Desmodium spp.\n" +
                        "Blazingstar, Liatris spp.\n" +
                        "Vervain, Verbena spp.\n" +
                        "Prairie Clover, Dalea spp.\n" +
                        "Leadplant, Amorpha canescens\n" +
                        "AUTUMN\n" +
                        "Goldenrod, Solidago spp.\n" +
                        "Aster, Symphyotrichum spp."),
        Insect("American Grass Spider", "(Agelenopsis spp.)",
            R.drawable.american_grass_spiders_1,R.drawable.american_grass_spiders_2,R.drawable.american_grass_spiders_3,R.drawable.american_grass_spiders_4,
                    "American Grass Spiders are some of the most common funnel weavers seen in the United States and\n" +
                            "Canada1\n" +
                            ". You’ve likely seen their webs in the grass in the early morning. They are a striking sight if\n" +
                            "sprinkled with dew. American Grass Spider webs are flat and sheet-like with a tube (funnel) either in the\n" +
                            "middle or off to the side. This funnel is where the American Grass Spider will wait to ambush its prey1\n" +
                            ".\n" +
                            "They wait until a prey item (flies, mosquitoes, moths, butterflies, etc.) lands on their web. The silk strands\n" +
                            "ensnare the insect and alerts the spider, who will then dart out of its funnel. The spider quickly bites and\n" +
                            "injects a fast-acting venom to paralyze the prey before dragging its meal back to the safety of its funnel1\n" +
                            ".\n" +
                            "The range of the American Grass Spiders extends throughout the United States and Canada and can be\n" +
                            "found in some parts of Europe, Australia, and South America2\n" +
                            ".\n" +
                            "\n" +
                            "Agelenopsis spp.\n" +
                            "1mm to\n" +
                            "35mm long\n" +
                            "\n" +
                            "SEASONALITY: April to November2\n" +
                            "EASTERN US AND CANADA: 131\n" +
                            "Sources:\n" +
                            "1Bartlett, T., Cotinis, McLeod, R., Elliott, L., Hunt, C., Entz, C., Howe, M., & P., L. (2004). Family\n" +
                            "Agelenidae – Funnel Weavers. Retrieved March 7, 2020 from\n" +
                            "https://bugguide.net/node/view/1974\n" +
                            "2Grass Spiders (Genus Agelenopsis). (n.d.) Retrieved March 7, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/82116-Agelenopsis",
                    "• (Web) Flat, sheet-like, horizontal web with a funnel near the middle or side\n" +
                            "• “small” brown body with vertical striping on cephalothorax (first major body segment)\n" +
                            "• Prominent spinnerets (organ at end of abdomen that allows spider to spin web)",
                    "American Grass Spiders are ambush predators and will commonly build their webs on grass or hedges."),
        Insect("Apical Leafcutter Bee", "(Megachile apicalis)",
            R.drawable.apical_leafcutter_bee_1,R.drawable.apical_leafcutter_bee_2,R.drawable.apical_leafcutter_bee_3,R.drawable.apical_leafcutter_bee_4,
                    "The Apical Leafcutter Bee was introduced to the United States from Europe1\n" +
                            "\n" +
                            ". Part of their name comes\n" +
                            "from the behavior of cutting leaves with their mandibles (bee teeth) for nesting material. They are solitary\n" +
                            "bees that nest in pre-existing cavities in wood, rocks, or plant stems2\n" +
                            "\n" +
                            ". After finding a suitable site, a\n" +
                            "female will gather leaf pieces and begin building chambers for each of her eggs, starting the furthest\n" +
                            "away from the nest opening2\n" +
                            "\n" +
                            ". She will deposit a single egg atop a bundle of pollen (and sometimes\n" +
                            "nectar) that will feed the developing larva. She then seals the chamber with chewed leaf bits and repeats\n" +
                            "the process, each time leaving one egg and food bundle per chamber and sealing it off with plant\n" +
                            "material2\n" +
                            ".\n" +
                            "Leafcutter Bees in the Midwest and Northeast U.S. typically emerge in late spring or early summer2\n" +
                            ". They\n" +
                            "immediately seek a mate and search for nesting sites to prepare the next generation which will\n" +
                            "overwinter and emerge in the next season2"+
                            "The range of the Apical Leafcutter Bee extends throughout Europe, though since its introduction into the\n" +
                            "U.S. it has been documented on both the northeast and northwestern states4\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: May to July3\n" +
                            "STATUS: non-native\n" +
                            "Sources:\n" +
                            "1Ormes, M. & Schweitzer, D., F. (2015). Megachile apicalis - Spinola, 1808. Retrieved February 27, 2020\n" +
                            "from http://explorer.natureserve.org/servlet/NatureServe?searchName=Megachile%20apicalis\n" +
                            "2Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "3Apical Leaf-cutter Bee (Megachile apicalis). (n.d.). Retrieved February 27, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/335714-Megachile-apicalis\n" +
                            "4Megachile apicalis Spinola, 1808. (n.d.) Retrieved February 29, 2020 from\n" +
                            "https://www.discoverlife.org/20/q?search=Megachile+apicalis",
                    "• (females) white scopa (hair beneath abdomen) that" +
                            "becomes black on the last two abdominal segments" +
                            "(terga 5 & 6)\n" +
                            "• Black body with pale hair bands on abdomen\n" +
                            "• Pale facial hair",
                    "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "COMMON PLANTS USED FOR NESTING MATERIAL\n" +
                            "Tick Trefoils, Desmodium spp.\n" +
                            "Roses, Rosa spp.\n" +
                            "St. John’s Wort, Hypericum spp.\n" +
                            "Ash, Fraxinus spp.\n" +
                            "Eastern Redbud, Cercis canadensis\n" +
                            "\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Wild Indigo, Baptisia spp.\n" +
                            "Coneflower, Echinacea spp.\n" +
                            "Beardtongue, Penstemon spp.\n" +
                            "Canada Anemone, Anemone canadensis\n" +
                            "Balsam Ragwort, Packera paupercula\n" +
                            "FALL\n" +
                            "Yellow Coneflower, Ratibida pinnata\n" +
                            "Black-eyed Susan, Rudbeckia hirta\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Joe Pye Weed, Eutrochium spp.\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "Anise Hyssop, Agastache foeniculum\n" +
                            "\n" +
                            "Prairie Onion, Allium stellatum\n" +
                            "Tick Trefoil, Desmodium spp.\n" +
                            "Blazingstar, Liatris spp.\n" +
                            "Vervain, Verbena spp.\n" +
                            "Prairie Clover, Dalea spp.\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Aster, Symphyotrichum spp."),
        Insect("Bark Centipede", "(Scoloprcryptops sexspinosus)",
            R.drawable.bark_centipede_1,R.drawable.bark_centipede_2,R.drawable.bark_centipede_3,R.drawable.bark_centipede_4,
                    "Bark Centipedes are fast moving arthropods with multiple body segments. They have one leg-pair per\n" +
                            "body segment (Millipedes have two leg-pairs per segment) and a flat body shape. They are active hunters\n" +
                            "and will eat any invertebrate their size or smaller, like insects and spiders1\n" +
                            "\n" +
                            ". Bark Centipedes use venom to\n" +
                            "\n" +
                            "immobilize their prey and their bites can sting2\n" +
                            "\n" +
                            ". If threatened, they can pinch with their hind legs1\n" +
                            ". Bark\n" +
                            "Centipedes are found in areas with a lot of moisture like underneath rocks, logs, leaf litter, and debris\n" +
                            "piles2\n" +
                            ". They may be found in an insect hotel filled with bark, twigs, and debris hunting the other\n" +
                            "invertebrates there.\n" +
                            "While Bark Centipedes are not deadly, they can deliver a painful bite or pinch. It is advised to leave them\n" +
                            "be and not handle them. Bark Centipedes are important to the ecological community as they control the\n" +
                            "populations of other invertebrates. They are also a popular menu item for animals such as beetles, birds,\n" +
                            "toads, snakes, salamanders, and more.\n" +
                            "The range of the Bark Centipede extends throughout the eastern United States as far west as Nebraska,\n" +
                            "Kansas, and Oklahoma3\n" +
                            ".\n" +
                            "SEASONALITY: year-round3\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "STATUS: Native\n" +
                            "Sources:\n" +
                            "\n" +
                            "1Pest ID – Bark Centipede. (n.d.). Retrieved February 20, 2020 from https://proactivepestga.com/pest-id-\n" +
                            "bark-centipede/\n" +
                            "\n" +
                            "2Bark Centipede (Scolopocryptops sexspinosus). (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.insectidentification.org/insect-description.asp?identification=Bark-Centipede\n" +
                            "3Eastern Fire Centipede (Scolopocryptops sexspinosus). (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/123663-Scolopocryptops-sexspinosus",
                    "• 23 leg pairs\n" +
                            "• One leg-pair per body segment\n" +
                            "• Reddish-brown body, pale to yellow legs",
                    "The Bark Centipede is a predaceous arthropod and can typically be found in moist habitats (beneath\n" +
                            "rocks, leaf litter, etc.) with a higher activity at night."),
        Insect("Beetles", "(Order: Coleoptera)",
            R.drawable.beetles_1,R.drawable.beetles_2,R.drawable.beetles_3,R.drawable.beetles_4,
                    "Beetles are some of the most diverse insects on the planet; they make up about 30% of all animals1\n" +
                            ". They\n" +
                            "live on every single continent except Antarctica and come in a wide range of sizes and colors. The smallest\n" +
                            "beetles are under a millimeter while the largest tropical species can reach nearly 8 inches in length2\n" +
                            ".\n" +
                            "Some Beetles are predacious. Others eat living or dead plants, are scavengers, or are parasites3\n" +
                            ".\n" +
                            "Regardless, Beetles help maintain life on the planet. They serve as biological controls of pests,\n" +
                            "decomposers, nutrient recyclers, and food resources for other animals3\n" +
                            "\n" +
                            ". Not all beetles have positive\n" +
                            "impacts, however. Some species of bark beetles can kill thousands of trees. The Cotton Boll Weevil and\n" +
                            "other Rootworms threaten agriculture in the United States3" +
                            "Given the wide variety of Beetles, you may find them on or in an insect hotel depending on the material\n" +
                            "used.\n" +
                            "SEASONALITY: year-long4\n" +
                            "UNITED STATES: 30,000 species3\n" +
                            "Sources:\n" +
                            "1Coleoptera: beetles and weevils. (n.d.) Retrieved March 7, 2020 from\n" +
                            "http://www.ento.csiro.au/education/insects/coleoptera.html\n" +
                            "2Bartlett, B., cotinis, Stephen_WV, McLeod, R., Harpootlian, P. Roth, M., McClarin, J., Wirth, C. C., Entz, C.,\n" +
                            "Quinn, M., Belov, V., Parker, H. S., & Ruden, E. (2004). Order Coleoptera – Beetles. Retrieved March 7,\n" +
                            "2020 from https://bugguide.net/node/view/60\n" +
                            "3Beetles. (n.d.) Retrieved March 7, 2020 from https://www.si.edu/spotlight/buginfo/beetle\n" +
                            "4Beetles (Order Coleoptera). (n.d.) Retrieved March 7, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/47208-Coleoptera",
                    "• Hard outer wings typically meeting in middle (elytra) when at rest\n" +
                            "• Chewing mouthparts",
                    "Beetles can be found in nearly every habitat on the planet and are commonly encountered outdoors. As a" +
                            "result, there is a large list of plants that serve as attractants and hosts to both them and their food items."),
        Insect("Bellflower Resin Bee", "(Megachile campanulae)",
            R.drawable.bellflower_resin_bee_1,R.drawable.bellflower_resin_bee_2,R.drawable.bellflower_resin_bee_3,R.drawable.bellflower_resin_bee_4,
              "The Bellflower Resin Bee is considered a solitary mason bee. The female makes her nest in hollow plant\n" +
                    "stems or abandoned tunnels in pieces of wood. Once she has identified an ideal site, the female uses her\n" +
                    "mandibles (jaws) to collect natural resins from plants and trees1\n" +
                    "\n" +
                    ". This material will line the individual cells\n" +
                    "for her eggs. As she builds the chambers, she starts with the cell furthest from the opening, deposits a\n" +
                    "single egg with a bundle of pollen (and sometimes nectar) for food, and then seals off the cell with plant\n" +
                    "resin1\n" +
                    ". This helps protect the eggs from pathogens, parasites, and the elements2\n" +
                    "\n" +
                    ". The female will repeat\n" +
                    "\n" +
                    "this process, each time leaving one egg and food bundle per cell.\n" +
                    "The Bellflower Resin Bee’s range extends from the New England states to Minnesota, Nebraska and\n" +
                    "Texas3\n" +
                    ". It is native to the southern Ontario region and pollinates a large diversity of plants1\n" +
                    ".\n" +
                    "\n" +
                    "SEASONALITY: April to September\n" +
                    "STATUS: Native\n" +
                    "CONSERVATION STATUS (IUCN): Unknown\n" +
                    "Sources:\n" +
                    "1Bellflower Resin Bee. (n.d.). Retrieved from https://eol.org/pages/2751057/articles\n" +
                    "2Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                    "Press LLC.\n" +
                    "3Megachile campanulae (Robertson, 1903). (2020). Retrieved January 17, 2020, from\n" +
                    "https://www.discoverlife.org/mp/20q?search=Megachile+campanulae",
            "• Pale to white pubescence (soft, short, scattered down-like hairs)\n" +
                    "• Rows of white hair beneath abdomen (scopa)\n" +
                    "• Basal white stripes on abdomen\n" +
                    "• 3 visible metasomal sterna",
            "The Bellflower Resin Bee has been recorded on the following plants3\n" +
                    ":\n" +
                    "\n" +
                    "Milkweed, Asclepias spp.\n" +
                    "Wild Indigo, Baptisia spp.\n" +
                    "Bellflower, Campanula spp.\n" +
                    "Milkepea, Galactia spp.\n" +
                    "Mallow, Malva spp.\n" +
                    "Sweet Clover, Melilotus spp.\n" +
                    "Evening Primrose, Oenothera spp.\n" +
                    "\n" +
                    "M. campanulae\n" +
                    "8mm to\n" +
                    "11mm long\n" +
                    "\n" +
                    "Lobelia, Lobelia spp.\n" +
                    "Loosestrife, Lythrum spp.\n" +
                    "Catmint, Nepeta spp.\n" +
                    "Fountain Bush, Psoralea spp.\n" +
                    "Mountain Mint, Pycnanthemum spp.\n" +
                    "Coneflowers, Rudbeckia spp.\n" +
                    "Fuzzy Bean, Strophostyles spp.\n" +
                    "Snowberry, Symphoricarpus spp.\n" +
                    "Vervain, Verbena spp.\n" +
                    "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                    "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                    "SPRING\n" +
                    "Golden Alexanders, Zizia aurea\n" +
                    "Harebell, Campanula rotundifolia\n" +
                    "Wild Indigo, Baptisia spp.\n" +
                    "Coneflower, Echinacea spp.\n" +
                    "Beardtongue, Penstemon spp.\n" +
                    "Canada Anemone, Anemone canadensis\n" +
                    "Balsam Ragwort, Packera paupercula\n" +
                    "SUMMER\n" +
                    "Yellow Coneflower, Ratibida pinnata\n" +
                    "Black-eyed Susan, Rudbeckia hirta\n" +
                    "Milkweed, Asclepias spp.\n" +
                    "Joe Pye Weed, Eutrochium spp.\n" +
                    "Tickseed, Coreopsis spp.\n" +
                    "Anise Hyssop, Agastache foeniculum\n" +
                    "Prairie Onion, Allium stellatum\n" +
                    "Tick Trefoil, Desmodium spp.\n" +
                    "Blazingstar, Liatris spp.\n" +
                    "Vervain, Verbena spp.\n" +
                    "Prairie Clover, Dalea spp.\n" +
                    "Leadplant, Amorpha canescens\n" +
                    "AUTUMN\n" +
                    "Goldenrod, Solidago spp.\n" +
                    "Aster, Symphyotrichum spp."),
        Insect("Blue Orchard Mason Bee", "(Osmia lignaria)",
            R.drawable.blue_orchard_mason_bee_1,R.drawable.blue_orchard_mason_bee_2,R.drawable.blue_orchard_mason_bee_3,R.drawable.blue_orchard_mason_bee_4,
                    "The Blue Orchard Mason Bee is named as such because of its role in pollinating fruiting trees1\n" +
                            ".\n" +
                            "As soon as they emerge as adults, both males and females search for a mate. After mating, the female\n" +
                            "begins the search for a suitable nesting site1\n" +
                            "\n" +
                            ". These sites can include insect hotels, paper straws, reeds,\n" +
                            "and holes in wood. A female Blue Orchard Mason Bee uses mud to build a back wall for her nest if one\n" +
                            "isn’t already present. She then collects pollen and nectar and rolls it into a ball inside the nest before\n" +
                            "depositing a single egg on top of it1\n" +
                            "\n" +
                            ". The female then seals off this chamber with mud. She repeats this\n" +
                            "process five to eight times before finally capping the closure of the nest with a thicker layer mud1\n" +
                            ".\n" +
                            "Interestingly enough, the larvae closest to the entrance will develop into males; the cells furthest from\n" +
                            "the entrance house larvae that will emerge as females1\n" +
                            "\n" +
                            ".This is believed to give males an advantage in\n" +
                            "emerging first and preparing to mate with emerging females. A secondary advantage could be to protect\n" +
                            "the female brood from parasitism since the first cells are the most vulnerable1\n" +
                            ".\n" +
                            "\n" +
                            "To attract O. lignaria, leave a small patch of mud (silty-clay) nearby available nesting sites (insect hotels,\n" +
                            "paper tubes, reeds, etc.) and plenty of foraging plants.\n" +
                            "\n" +
                            "O. lignaria\n" +
                            "9mm to\n" +
                            "11mm long\n" +
                            "\n" +
                            "The range of the Blue Orchard Mason Bee extends throughout most of temperate North America and the\n" +
                            "U.S. except for Alaska, Hawaii, and Florida2\n" +
                            ".\n" +
                            "SEASONALITY: Late March to June3\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "STATUS: Native\n" +
                            "Sources: 1Moisset, B., & Wojcik, V. (n.d.). Blue Orchard Mason Bee (Osmia lignaria). Retrieved January 17,\n" +
                            "2020, from https://www.fs.fed.us/wildflowers/pollinators/pollinator-of-the-month/mason_bees.shtml\n" +
                            "2Osmia Lignaria. (n.d.). Retrieved January 17, 2020, from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?searchName=Osmia+lignaria\n" +
                            "3Osmia lignaria Say, 1837. (n.d.). Retrieved January 17, 2020, from\n" +
                            "https://www.discoverlife.org/mp/20q?search=Osmia+lignaria",
                    "• Dark metallic blue, sometimes with green tint\n" +
                            "• Mostly black hair; pale hairs are interspersed\n" +
                            "• Females collect pollen on hairs beneath the abdomen (scopa)",
                    "The Blue Orchard Mason Bee has been recorded on the following species3\n" +
                            ":\n" +
                            "\n" +
                            "Wild Hyacinth, Camassia spp.\n" +
                            "Bittercress/Toothwort, Cardamine spp.\n" +
                            "Redbuds, Cercis spp.\n" +
                            "Chervil, Chaerophyllum spp.\n" +
                            "Claytonia spp.\n" +
                            "Collinsia, Collinsia spp.\n" +
                            "Toothwort, Dentaria spp.\n" +
                            "Bleeding-hearts, Dicentra spp.\n" +
                            "Harbinger-of-Spring, Erigenia bulbosa\n" +
                            "Lilies, Erythronium spp.\n" +
                            "Strawberry, Fragaria spp.\n" +
                            "Geranium, Geranium spp.\n" +
                            "Waterleaf, Hydrophyllum spp.\n" +
                            "Lupine, Lupinus spp.\n" +
                            "Crabapples, Malus spp.\n" +
                            "Bluebell, Mertensia spp.\n" +
                            "Sweetroot, Osmorhiza spp.\n" +
                            "Wood Sorrel, Oxalis spp.\n" +
                            "Stone fruit, Prunus spp.\n" +
                            "Pear, Pyrus spp.\n" +
                            "Buttercup, Ranunculus spp.\n" +
                            "Gooseberries, Ribes spp.\n" +
                            "Raspberry/Blackberry/Dewberry, Rubus spp.\n" +
                            "Willow, Salix spp.\n" +
                            "Dandelions, Taraxacum spp.\n" +
                            "Viburnum, Viburnum spp.\n" +
                            "Vetch, Vicia spp.\n" +
                            "\n" +
                            "Pansy, Viola spp.\n" +
                            "Rue/Citrus, Zanthoxylurn spp.\n" +
                            "The following species attract members from the genus Osmia. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "SPRING - PERENNIALS\n" +
                            "Wild Lupine, Lupinus perennis\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Spiderwort, Tradescantia spp.\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Waterleaf, Hydrophyllum spp.\n" +
                            "Wild Geranium, Geranium maculatum\n" +
                            "SPRING - TREES AND SHRUBS\n" +
                            "American Plum, Prunus americana\n" +
                            "Willow, Salix spp.\n" +
                            "Red Maple, Acer rubrum\n" +
                            "Viburnum, Viburnum spp."),
        Insect("Brown Lacewings", "(Family: Hemerobiidae)",
            R.drawable.brown_lacewings_1,R.drawable.brown_lacewings_2,R.drawable.brown_lacewings_3,R.drawable.brown_lacewings_4,
                    "Brown Lacewings (like Common Green Lacewings [Chrysoperla spp.]) are common woodland residents1\n" +
                            ".\n" +
                            "Unlike Chrysoperla spp., Brown Lacewings are typically smaller in size, brown, and have more rounded\n" +
                            "wings1\n" +
                            ". Both adults and larvae are important biological controls on aphid populations. Female Brown\n" +
                            "Lacewings lay their eggs directly onto a leaf2\n" +
                            ".\n" +
                            "\n" +
                            "The range of Brown Lacewings extends around the globe and throughout the United States3\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: April to November3\n" +
                            "EASTERN US AND CANADA: >601\n" +
                            "Sources:\n" +
                            "1Cotinis, Beatriz, M., Wisch, H., smccann27, Schusteff, A., Belov, V. (2004). Family Hemerobiidae - Brown\n" +
                            "Lacewings. Retrieved February 27, 2020 from https://bugguide.net/node/view/3577\n" +
                            "2MacLeod, E. G. & Stange, L. A. (2001). Common name: brown lacewings (of Florida)\n" +
                            "scientific name: (Insecta: Neuroptera: Hemerobiidae). Retrieved February 27, 2020 from\n" +
                            "http://entnemdept.ufl.edu/creatures/beneficial/brown_lacewings.htm",
                    "• Thin, long, brown body\n" +
                            "• Long antennae\n" +
                            "• Large, rounded, brown to transparent (clear) wings folded over body\n" +
                            "• (larvae) brown and white; “alligator-like”; large jaws",
                    "Brown Lacewings are beneficial controls on pest populations and will typically be found near aphid-\n" +
                            "infested plants in woodland habitats1\n" +
                            "\n" +
                            "."),
        Insect("Bufflehead Mason Bee", "(Osmia bucephala)",
            R.drawable.bufflehead_mason_bee_1,R.drawable.bufflehead_mason_bee_2,R.drawable.bufflehead_mason_bee_3,R.drawable.bufflehead_mason_bee_4,
                "The Bufflehead Mason Bee looks like the Common Eastern Bumblebee (B. impatiens); however, it is not\n" +
                        "as stocky as B. impatiens and lacks a pollen-basket on its hind-leg (corbicula). Like other bees in the\n" +
                        "Megachilidae family, Bufflehead Mason Bee females carry pollen on modified hairs beneath the abdomen\n" +
                        "known as scopa. They nest in wood cavities and use chewed leaves combined with wood and/or pith (a\n" +
                        "type of soft tissue inside vascular plant stems) to separate each chamber1\n" +
                        "\n" +
                        ". After finding a suitable nesting\n" +
                        "site, the female will collect pollen and/or nectar using her scopa and return to the nest. She will roll the\n" +
                        "food into a ball inside the first cell before laying an egg on it. She then seals of the chamber with plant\n" +
                        "material and begins collecting more pollen and/or nectar for the next egg. She will repeat this process\n" +
                        "before capping the nest entrance with more plant material.\n" +
                        "\n" +
                        "The range of the Bufflehead Mason Bee extends throughout the northeast United States2\n" +
                        ".\n" +
                        "\n" +
                        "SEASONALITY: March to July2\n" +
                        "\n" +
                        "O. bucephala\n" +
                        "13mm to\n" +
                        "16mm long\n" +
                        "\n" +
                        "CONSERVATION STATUS: Secure3\n" +
                        "STATUS: Native\n" +
                        "Sources:\n" +
                        "1Cane, J. H., Griswold, T., and Parker F. D. (2007). Substrates and Materials Used for Nesting by North\n" +
                        "American Osmia Bees (Hymenoptera: Apiformes: Megachilidae). Retrieved February 8, 2020 from\n" +
                        "https://www.fs.fed.us/rm/pubs_other/rmrs_2007_cane_j001.pdf\n" +
                        "2Bufflehead Mason Bee (Osmia bucephala). (n.d.). Retrieved February 8, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/199125-Osmia-bucephala\n" +
                        "3\n" +
                        "Schweitzer, D. F. (2012). Osmia bucephala - Cresson, 1864. Retrieved February 8, 2020 from\n" +
                        "http://explorer.natureserve.org/servlet/NatureServe?searchName=Osmia+bucephala\n" +
                        "4Osmia bucephala Cresson, 1864. (n.d.) Retrieved February 8, 2020 from\n" +
                        "https://www.discoverlife.org/20/q?search=Osmia+bucephala",
                "• Black with a bluish tint on head and thorax\n" +
                        "• Pale hair on head, thorax, and first abdominal segment (T1)\n" +
                        "• Black abdominal hair",
                "The Bufflehead Mason Bee has been recorded on the following4\n" +
                        ":\n" +
                        "\n" +
                        "Astragalus, Astragalus spp.\n" +
                        "Balsam roots, Balsamorhiza spp.\n" +
                        "Baptisia, Baptisia spp.\n" +
                        "Beardtongues, Pentstemon spp.\n" +
                        "Bleading-hearts, Dicentra spp.\n" +
                        "Bluebells, Mertensia spp.\n" +
                        "Clover, Trifolium spp.\n" +
                        "Common Dandelion, Taraxacum officinale\n" +
                        "False Lupines, Thermopsis spp.\n" +
                        "Fawn Lilies, Erythronium spp.\n" +
                        "Lupines, Lupinus spp.\n" +
                        "Milkweed, Asclepias spp.\n" +
                        "Packera, Packera spp.\n" +
                        "Thistles, Cirsium spp.\n" +
                        "Toothwort, Dentaria spp.\n" +
                        "Wild Geranium, Geranium maculatum\n" +
                        "The following species attract members from the genus Osmia. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "SPRING - PERENNIALS\n" +
                        "Wild Lupine, Lupinus perennis\n" +
                        "Golden Alexanders, Zizia aurea\n" +
                        "Spiderwort, Tradescantia spp.\n" +
                        "Harebell, Campanula rotundifolia\n" +
                        "Waterleaf, Hydrophyllum spp.\n" +
                        "Wild Geranium, Geranium maculatum\n" +
                        "SPRING - TREES AND SHRUBS\n" +
                        "\n" +
                        "American Plum, Prunus americana\n" +
                        "Willow, Salix spp.\n" +
                        "Red Maple, Acer rubrum\n" +
                        "Viburnum, Viburnum spp."),
        Insect("Carrot Wasps", "(Gasteruption spp.)",
            R.drawable.carrot_wasps_1,R.drawable.carrot_wasps_2,R.drawable.carrot_wasps_3,R.drawable.carrot_wasps_4,
                    "Gasteruption is a genus within the larger family of carrot wasps, Gasteruptiinae. These wasps are visually\n" +
                            "striking because of the female’s long tail, a modified ovipositor used to lay eggs. These wasps parasitize\n" +
                            "the nests of twig- and cavity-nesting bees1\n" +
                            "\n" +
                            ". Using their long, modified ovipositor, the female repeatedly\n" +
                            "\n" +
                            "pierces the sealed (or unsealed) entrance of a bee’s nest and deposits her own eggs inside1\n" +
                            "\n" +
                            ". The eggs will\n" +
                            "\n" +
                            "hatch into larvae and consume the pollen ball, the host larva, or both2\n" +
                            ".\n" +
                            "\n" +
                            "As adults, Carrot-wasps spend their days foraging nectar from a wide variety of flowers1\n" +
                            "\n" +
                            ". Their range\n" +
                            "\n" +
                            "extends throughout the United States and Canada2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: May and October3\n" +
                            "EASTERN US AND CANADA: 15\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "Sources:\n" +
                            "1\n" +
                            "Jennings, J. T. and A. R. Deans. (2005). Gasteruptiinae. Gasteruption. Version 06. Retrieved February 13,\n" +
                            "2020 from http://tolweb.org/Gasteruption/25832/2005.05.06 in The Tree of Life Web Project,\n" +
                            "http://tolweb.org\n" +
                            "2Balaban, J., Balaban, J., Nendick-Mason, H., Cotinis, Schusteff, A., Maxwell, J., and Belov, V. (2004). Genus\n" +
                            "Gasteruption. Retrieved February 13, 2020 from https://bugguide.net/node/view/7742\n" +
                            "3Genus Gasteruption. (n.d.) Retrieved February 13, 2020 from https://www.inaturalist.org/taxa/250313-\n" +
                            "Gasteruption",
                    "• Black hairless body\n" +
                            "• Long, narrow abdomen\n" +
                            "• Distinctive long tail",
                    "Carrot-wasps are generalists and visit a wide variety of flowers. True to their name, they show a\n" +
                            "preference for flowers in the carrot or parsley family (Apiaceae)2"),
        Insect("Centipedes", "(Class: Chilopoda)",
            R.drawable.centipedes_1,R.drawable.centipedes_2,R.drawable.centipedes_3,R.drawable.centipedes_4,
                    "Centipedes are fast moving arthropods with multiple body segments. They have one leg-pair per body\n" +
                            "segment (Millipedes have two leg-pairs per segment) and a flat shape. They are active hunters and will\n" +
                            "catch and eat any invertebrate their size or smaller, like insects and spiders1\n" +
                            "\n" +
                            ". The smallest Centipedes are\n" +
                            "around an inch while the largest tropical species can grow well over six inches. The largest North\n" +
                            "American species is the Giant Desert Centipede (Scolopendra heros) which on average grows to be\n" +
                            "around 6.5” (though some eye-witness accounts have reported up to 12”)2\n" +
                            "\n" +
                            ". By far the most common\n" +
                            "\n" +
                            "species in North America is the House Centipede (Scutigera coleoptera).\n" +
                            "Centipedes use venom to immobilize their prey and their bites can sting3\n" +
                            "\n" +
                            ". If threatened, Centipedes can\n" +
                            "\n" +
                            "pinch with their hind legs1\n" +
                            "\n" +
                            ". Since these invertebrates do not have a protective water-retaining layer, they\n" +
                            "\n" +
                            "are often found in moist areas like underneath rocks, logs, leaf litter, and debris piles3,4\n" +
                            "\n" +
                            ". They may be\n" +
                            "found in an insect hotel filled with bark, twigs, and debris hunting the other invertebrates there.\n" +
                            "While Centipedes are not deadly, they can deliver a painful bite or pinch and it is advised to not handle\n" +
                            "them. They help control other invertebrate populations while also serving as a food source for a wide\n" +
                            "variety of animals such as beetles, birds, toads, snakes, salamanders, and others.\n" +
                            "The range of the Centipede extends around the globe and can be found throughout the Unites States5\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: year-round5\n" +
                            "UNITED STATES: ~6 species\n" +
                            "\n" +
                            "Sources:\n" +
                            "\n" +
                            "1Pest ID – Bark Centipede. (n.d.). Retrieved February 20, 2020 from https://proactivepestga.com/pest-id-\n" +
                            "bark-centipede/\n" +
                            "\n" +
                            "2Elliott, L., Balaban, J., Balaban, J., Moisset, B., Quinn, M., Belov, V., Parker, H. S., & Hedlund, T. (2005).\n" +
                            "Species Scolopendra heros - Giant Redheaded Centipede. Retrieved March 19, 2020 from\n" +
                            "https://bugguide.net/node/view/34475.\n" +
                            "3Bark Centipede (Scolopocryptops sexspinosus). (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.insectidentification.org/insect-description.asp?identification=Bark-Centipede\n" +
                            "4Centipedes of North America. (n.d.). Retrieved March 19, 2020 from\n" +
                            "https://www.insectidentification.org/centipedes.asp\n" +
                            "5Centipedes (Order: Chilopoda). (n.d.). Retrieved March 19, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/123663-Scolopocryptops-sexspinosus",
                    "• Multi-segmented body (15 to 180 segments)\n" +
                            "• One leg-pair per body segment\n" +
                            "• Long antennae",
                    "The Centipede is a predaceous arthropod and can typically be found in moist habitats (beneath rocks, leaf " +
                            "litter, etc.) with a higher activity at night."),
        Insect("Common Barklice", "(Family: Psocidae)",
            R.drawable.common_barklice_1,R.drawable.common_barklice_2,R.drawable.common_barklice_3,R.drawable.common_barklice_4,
                    "Common Barklice are harmless detritivores (organisms that eat dead or decaying organic material) that\n" +
                            "come in a variety of colors. They are often mistaken for aphids, a common garden pest. However, a quick\n" +
                            "glance under a magnifying glass or hand-lens will reveal the Common Barklice’s larger head and chewing\n" +
                            "mouth parts (as opposed to the aphid’s small head and round, sucker-mouth)1\n" +
                            "\n" +
                            ". Unlike aphids, Common\n" +
                            "Barklice are typically considered beneficial backyard insects. They usually live in clusters known as “herds”\n" +
                            "and can be found on bark or rocks eating any fungi, algae, and/or lichen growing there. Common Barklice\n" +
                            "also eat dead bark and other materials found on tree trunks and limbs2\n" +
                            "\n" +
                            ". They do not harm the tree. In\n" +
                            "fact, they benefit their host by “cleaning off” the decaying materials and foreign bodies found there\n" +
                            "(algae, fungi, etc.)1\n" +
                            ".\n" +
                            "\n" +
                            "Common Barklice larvae go through four to six developmental stages and resemble tiny wingless adults\n" +
                            "before fully maturing3\n" +
                            ".\n" +
                            "\n" +
                            "Some species of Common Barklice have glands in their mouths that let them spin delicate webs1\n" +
                            ". It is\n" +
                            "thought that these webs protect the adults and offspring from predators. While they are unlikely to use\n" +
                            "an insect hotel, they may be encountered on nearby trees or woody plants. A they are beneficial backyard\n" +
                            "insects, there is no need to control or manage them. The best practice is to let them be.\n" +
                            "Common Barklice can be found throughout the Eastern and Southern states, though they are also found\n" +
                            "along the West coast and down throughout Mexico4\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: May to October2\n" +
                            "EASTERN US AND CANADA: 60 species5\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "Sources:\n" +
                            "1Raupp, M. J. (2018). TINY RECYCLERS: BOOKLICE AND BARKLICE, PSOCOPTERA. Retrieved February 20,\n" +
                            "2020 from http://bugoftheweek.com/blog/2018/7/9/tiny-recyclers-booklice-and-barklice-psocoptera\n" +
                            "2Common Barklice (Family Psocidae). (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/120991-Psocidae\n" +
                            "3Drees, B. (n.d.). Barklice. Retrieved February 20, 2020 from\n" +
                            "https://agrilife.org/extensionento/publications/barklice/\n" +
                            "4Murray, T., Nendick-Mason, H., Moisset, B., Quinn, M., Kropiewnicki, T., Zimlich, R. L., Belov, V., &\n" +
                            "Penner, L. (2006). Species Cerastipsocus venosus. Retrieved February 20, 2020 from\n" +
                            "https://bugguide.net/node/view/83280\n" +
                            "5Murray, T., Moisset, B., & Belov, V. (2016). Family Psocidae – Common Barklice. Retrieved February 20,\n" +
                            "2020 from https://bugguide.net/node/view/83277",
                    "• Large head with chewing mouth parts\n" +
                            "• Tent-like wings (cover entire body)\n" +
                            "• Long antennae",
                    "Oaks and pecans are common hosts, though any tree with lichen or algae growth has the potential to\n" +
                            "support Common Barklice3"),
        Insect("Common Eastern Bumblebee", "(Bombus impatiens)",
            R.drawable.common_eastern_bumblebee_1,R.drawable.common_eastern_bumblebee_2,R.drawable.common_eastern_bumblebee_3,R.drawable.common_eastern_bumblebee_4,
                  "The Common Eastern Bumblebee is a frequent backyard visitor to flowering gardens. Due to their\n" +
                        "extensive hair, bumblebees are able to fly in cooler temperatures which makes them an important early\n" +
                        "Spring pollinator1\n" +
                        "\n" +
                        ". They shake large quantities of pollen out of a single flower by buzz-pollinating\n" +
                        "\n" +
                        "(sonication)1\n" +
                        "\n" +
                        ". Like honeybees, the Common Eastern Bumblebee is a social species. A gyne (inseminated\n" +
                        "\n" +
                        "female) will overwinter in an insulated location until the spring1\n" +
                        "\n" +
                        ". As temperatures warm, the gyne\n" +
                        "emerges and begins looking for a suitable nesting site – typically a hole in the ground, a pile of plant\n" +
                        "debris, a shed, or other insulated area1\n" +
                        "\n" +
                        ". Once the nest is secure, the gyne collects pollen and nectar into a\n" +
                        "ball and begins laying eggs. The first generation will take roughly a month to fully develop from egg to\n" +
                        "worker and will most likely consist of all females1\n" +
                        ".\n" +
                        "\n" +
                        "While bumblebees do not use insect hotels, they are important pollinators for a number of reasons. Their\n" +
                        "ability to fly in cooler temperatures means they can pollinate early season crops. They also exhibit floral\n" +
                        "constancy1\n" +
                        ". This means that when they forage, they visit flowers of the same species, thus increasing the\n" +
                        "likelihood of that plant being pollinated. Bumblebees also use a pollinating technique known as\n" +
                        "sonication, which releases more pollen in a shorter timeframe, meaning bumblebees can visit more\n" +
                        "flowers than other bees in the same amount of time. Sonication also allows bumblebees to carry more\n" +
                        "pollen with each flower visit, increasing the chance of successful pollination1\n" +
                        ".\n" +
                        "\n" +
                        "The bumblebee’s size, foraging habits, and ability to fly in cooler temperatures makes it an important\n" +
                        "flower and crop pollinator.\n" +
                        "The range of the Common Eastern Bumblebee extends throughout much of eastern North America\n" +
                        "including parts of Canada2\n" +
                        "\n" +
                        ". It has also been reported more frequently in the Pacific Northwest3\n" +
                        ".\n" +
                        "\n" +
                        "SEASONALITY: March to October\n" +
                        "STATUS: Native\n" +
                        "CONSERVATION STATUS: Least Concern; stable (IUCN)\n" +
                        "Sources: 1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN:\n" +
                        "Pollination Press LLC.\n" +
                        "2Bombus impatiens Cresson, 1863. (n.d.). Retrieved January 17, 2020, from\n" +
                        "https://www.discoverlife.org/mp/20q?search=Bombus+impatiens&flags=subgenus:\n" +
                        "3Common Eastern Bumble Bee (Bombus impatiens). (n.d.). Retrieved January 17, 2020, from\n" +
                        "https://www.inaturalist.org/taxa/118970-Bombus-impatiens",
                 "• Pale yellow hair on thorax and first abdominal segment.\n" +
                        "• Black spot in middle of thorax\n" +
                        "• Abdomen covered in black hair",
                  "The following species attract members from the genus Bombus. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "COMMON FORAGE PLANTS\n" +
                        "ANNUALS AND PERENNIALS\n" +
                        "Anise Hyssop, Agastache foeniculum\n" +
                        "Prairie Onion, Allium stellatum\n" +
                        "Wild Columbine, Aquilegia canadensis\n" +
                        "Milkweed, Ascleppias spp.\n" +
                        "Canada Milkvetch, Astragalus canadensis\n" +
                        "White Indigo, Baptisia spp.\n" +
                        "Partridge Pea, Chamaecrista fasciculata\n" +
                        "White Turtlehead, Chelone glabra\n" +
                        "Prairie Clover, Dalea spp.\n" +
                        "Wild Larkspur, Delphinium virescens\n" +
                        "Canada Tick Trefoil, Desmodium canadense\n" +
                        "Shooting Star, Dodecatheon media\n" +
                        "Coneflower, Echinacea spp.\n" +
                        "Spotted Joe Pye Weed, Eutrochium maculatum\n" +
                        "Wild Geranium, Geranium maculatum\n" +
                        "Prairie Smoke, Geum triflorum\n" +
                        "Sneezeweed, Helenium autumnale\n" +
                        "Virginia Waterleaf, Hydrophyllum virginianum\n" +
                        "Bottle Gentian, Gentiana andrewsii\n" +
                        "Blazingstar, Liatris spp.\n" +
                        "Blue Lobelia, Lobelia siphilitica\n" +
                        "Wild Lupine, Lupinus perennis\n" +
                        "Wild Bergamot, Monarda fistulosa\n" +
                        "Beardtongue, Penstemon spp.\n" +
                        "Obedient Plant, Physostegia virginiana\n" +
                        "Jacob’s Ladder, Polemonium reptans\n" +
                        "Solomon’s Seal, Polygonatum spp.\n" +
                        "Gray-headed Coneflower, Ratibida pinnata\n" +
                        "Black-eyed Susan, Rudbeckia hirta\n" +
                        "Wild Senna, Senna hebecarpa\n" +
                        "Goldenrod, Solidago spp.\n" +
                        "Aster, Symphyotrichum spp.\n" +
                        "Spiderwort, Tradescantia spp.\n" +
                        "Common Ironweed, Wernonia fasciculata\n" +
                        "Culver’s Root, Veronicastrum virginicum\n" +
                        "Vervain, Verbena spp.\n" +
                        "Golden Alexanders, Zizia aurea\n" +
                        "SHRUBS\n" +
                        "\n" +
                        "Black Chokecherry, Aronia melanocarpa\n" +
                        "New Jersey tea, Ceanothus americanus\n" +
                        "Buttonbush, Cephalanthus occidentalis\n" +
                        "Leadplant/False Indigo, Amorpha spp.\n" +
                        "Gray Dogwood, Cornus racemosa\n" +
                        "Red Osier Dogwood, Cornus sericea\n" +
                        "Bush Honeysuckle, Diervilla lonicera\n" +
                        "Sumac, Rhus spp.\n" +
                        "Willow, Salix spp.\n" +
                        "Smooth Wild Rose, Rosa blanda\n" +
                        "Prickly Ash, Zanthoxylum americanum\n" +
                        "TREES\n" +
                        "Buckeye, Aesculus spp.\n" +
                        "Eastern Redbud, Cercis canadensis\n" +
                        "Kentucky Coffeetree, Gymnocladus dioicus\n" +
                        "Tulip Poplar, Liriodendron tulipifera\n" +
                        "American Plum, Prunus americana\n" +
                        "Black Cherry, Prunus serotina\n" +
                        "American Bladdernut, Staphylea trifolia\n" +
                        "American Basswood, Tilia americana\n" +
                        "Crops pollinated\n" +
                        "Apples, cherries, plums, currants, gooseberries, tomatoes, eggplants, blueberries, cranberries"),
        Insect("Common Pill Woodlouse", "(Armadillidium vulgare)",
            R.drawable.common_pill_woodlouse_1,R.drawable.common_pill_woodlouse_2,R.drawable.common_pill_woodlouse_3,R.drawable.common_pill_woodlouse_4,
                    "The Common Woodlouse (pill bug or “roly-poly”) is a multi-segmented arthropod whose trademark is\n" +
                            "curling into an armored ball when disturbed or threatened. They are harmless detritivores (organisms\n" +
                            "that eat dead and decaying organic matter) that live in humid places beneath rocks, logs, bricks, stones,\n" +
                            "and more1\n" +
                            ". The Common Woodlouse benefits ecosystems by cycling nutrients back into the soil; it has\n" +
                            "been shown to modify the chemical composition of topsoil by raising pH and concentrations of\n" +
                            "phosphorous, potassium, and nitrate while increasing the removal of carbon from leaf litter1\n" +
                            ".\n" +
                            "\n" +
                            "“During the breeding season, reproductive females develop a [fluid-filled] ‘brood-pouch’” where fertilized\n" +
                            "eggs mature and the young emerge from once fully developed2\n" +
                            ".\n" +
                            "\n" +
                            "The Common Woodlouse originated from Europe but can now be found worldwide.\n" +
                            "SEASONALITY: year-round\n" +
                            "CONSERVATION STATUS: stable\n" +
                            "STATUS: Introduced\n" +
                            "\n" +
                            "A. vulgare\n" +
                            "18mm long\n" +
                            "\n" +
                            "Sources:\n" +
                            "1Entz, C., Cotinis, Moisset, B., Kropiewnicki, T., Ceisemen, Danko, E., Blocky. (2007). Species Armadillidium\n" +
                            "vulgare – Common Pill Bug. Retrieved February 24, 2020 from https://bugguide.net/node/view/94180\n" +
                            "2Pill Woodlouse - Armadillidium vulgare. (n.d.). Retrieved February 24, 2020 from\n" +
                            "https://www.naturespot.org.uk/species/pill-woodlouse\n" +
                            "3\n" +
                            "Franklin, J., Byron, M., & Gillett-Kaufman, J. (2015). common name: pillbug, roly-poly, woodlouse\n" +
                            "scientific name: Armadillidium vulgare (Latreille) (Malacostraca: Isopoda: Armadillidiidae). Retrieved\n" +
                            "February 24, 2020 from http://entnemdept.ufl.edu/creatures/MISC/Armadillidium_vulgare.htm",
                    "• Several visible body segments resembling an armadillo’s back\n" +
                            "• Trapezoidal endplate\n" +
                            "• Dark grey body\n" +
                            "• Curls into ball when threatened",
                    "The Common Pill Woodlouse is a detritivore and can be found in a large variety of habitats with different\n" +
                            "floral and tree species, though they prefer soils with a neutral or alkaline pH and high organic content3"),
        Insect("Cuckoo or \"Blood\" Bees", "(Sphecodes spp.)",
            R.drawable.cuckoo_bees_1,R.drawable.cuckoo_bees_2,R.drawable.cuckoo_bees_3,R.drawable.cuckoo_bees_4,
                    "Cuckoo Bees are commonly called “Blood Bees” because of their red abdomens. The adults feed on\n" +
                            "nectar from flowers and can be seen foraging throughout the season until autumn1\n" +
                            "\n" +
                            ". These solitary bees\n" +
                            "are cleptoparasites, meaning they steal the nests of other bees (typically the ground-nesting species of\n" +
                            "Lasioglassum, Colletes, Andrena, and Halictus)\n" +
                            "1\n" +
                            ". Once they find another bee’s nest, the female Cuckoo\n" +
                            "\n" +
                            "Bee enters and lays her own egg inside the while destroying the host bee’s egg/larvae1\n" +
                            "\n" +
                            ". Since Cuckoo\n" +
                            "Bees search for the nests of ground-dwelling bees, they may or may not be found around an insect hotel.\n" +
                            "The range of the Cuckoo Bee extends around the world, especially in North America and Europe2\n" +
                            ". Cuckoo\n" +
                            "\n" +
                            "Bees are found throughout the United States2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: May to September2\n" +
                            "EASTERN US AND CANADA: 41 species1\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Blood Bees (Genus Sphecodes). (n.d.). Retrieved March 5, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/61891-Sphecodes",
                    "• Black bees with distinct red abdomen (males are sometimes " +
                            "all black)\n" +
                            "• Black wings",
                    "The following species attract members from the genus Sphecodes. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "SPRING\n" +
                            "Goat’s Beard, Aruncus dioicus\n" +
                            "SUMMER\n" +
                            "Fleabane, Erigeron spp.\n" +
                            "Boneset, Eupatorium perfoliatum\n" +
                            "Common Yarrow, Achillea millefolium\n" +
                            "Wild Quinine, Parthenium integrifolium\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Aster, Symphyotrichum spp."),
        Insect("Cuckoo Leafcutter Bees", "(Coelioxys spp.)",
            R.drawable.cuckoo_leaf_cutter_bees_1,R.drawable.cuckoo_leaf_cutter_bees_2,R.drawable.cuckoo_leaf_cutter_bees_3,R.drawable.cuckoo_leaf_cutter_bees_4,
                    "Cuckoo Leafcutter Bees are specialists that steal nests. They are cleptoparasites of Leafcutter Bees\n" +
                            "(Megachile spp.)1\n" +
                            "\n" +
                            ". Females look for unattended nests and will use her pointed abdomen to poke through\n" +
                            "\n" +
                            "the nest covering and lay her own eggs inside1\n" +
                            "\n" +
                            ". Her larvae tend to develop more quickly than the host\n" +
                            "\n" +
                            "(original) bee1\n" +
                            "\n" +
                            ". After the Cuckoo Leafcutter Bee larvae’s third instar (developmental stage), it uses its\n" +
                            "\n" +
                            "mandibles (bee teeth) to get rid of the host and any competing siblings1\n" +
                            ".\n" +
                            "\n" +
                            "\n" +
                            "While the larvae steals the food of Leafcutter Bees, the adult Cuckoo Leafcutter Bee feeds on nectar from\n" +
                            "flowers2\n" +
                            ".\n" +
                            "The range of the Cuckoo Leafcutter Bee extends around the globe and throughout the United States3\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: June to November3\n" +
                            "EASTERN US AND CANADA: 22 species1\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Cotinis, Moisset, B., Ascher, J. S., Belov, V., & Go, H. (2004). Genus Coelioxys – Cuckoo-leaf-cutter Bees.\n" +
                            "Retrieved February 27, 2020 from https://bugguide.net/node/view/7605\n" +
                            "3Cuckoo Leaf-cutter Bees (Genus Coelioxys). (n.d.). Retrieved February 27, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/199145-Coelioxys",
                    "• Pointed abdomen\n" +
                            "• Black body with white bands at the end of (apical) each abdominal segment\n" +
                            "• No abdominal scopae (pollen-collecting hairs)\n" +
                            "• (male) “Teeth” common at end of abdomen or thorax",
                    "The following species attract members from the genus Coelyoxsys. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017):\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "EARLY SUMMER\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "SUMMER\n" +
                            "Vervain, Verbena spp.\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Prairie Clover, Dalea spp.\n" +
                            "Black-Eyed Susan, Rudbeckia hirta\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Sneezeweed, Helenium autumnale"),
        Insect("Dwarf Mason Bee", "(Osmia pumila)",
            R.drawable.dwarf_mason_bee_1,R.drawable.dwarf_mason_bee_2,R.drawable.dwarf_mason_bee_3,R.drawable.dwarf_mason_bee_4,
                    "Dwarf Mason Bees are small, generalist bees1\n" +
                            "\n" +
                            "that visit a wide variety of flowers. Like other mason and\n" +
                            "leafcutter bees, they nest in pre-existing holes in wood or other natural cavities such as reeds, insect\n" +
                            "hotels, bamboo, paper straws, and more. Dwarf Mason Bees use chewed leaves to separate their brood\n" +
                            "(bee eggs, larva, and/or pupa) cells. The female will search for a suitable nesting site. Once found, she will\n" +
                            "collect enough pollen and nectar to roll it into a ball at the back of the nest before depositing a single egg\n" +
                            "on top of it1\n" +
                            "\n" +
                            ". The female then seals off this chamber with chewed leaves before going to collect more\n" +
                            "resources for the next chamber. She will repeat this process and then close off the nest entrance with\n" +
                            "chewed leaves.\n" +
                            "The range of the Dwarf Mason Bee stretches throughout most of the Northeastern U.S. and Canada and\n" +
                            "some Midwestern states1\n" +
                            ".\n" +
                            "SEASONALITY: April to July2\n" +
                            "CONSERVATION STATUS: Secure – last evaluated in 2017\n" +
                            "1\n" +
                            "\n" +
                            "O. pumila\n" +
                            "7mm to\n" +
                            "8mm long\n" +
                            "\n" +
                            "STATUS: Native\n" +
                            "Sources: 1Osmia pumila. (2019). Retrieved January 17, 2020, from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?sourceTemplate=tabular_report.wmt&loadTemplat\n" +
                            "e=species_RptComprehensive.wmt&selectedReport=RptComprehensive.wmt&summaryView=tabular_re\n" +
                            "port.wmt&elKey=837220&paging=home&save=true&startIndex=1&nextStartIndex=1&reset=false&offPa\n" +
                            "geSelectedElKey=837220&offPageSelectedElType=species&offPageYesNo=true&post_processes=&radiob\n" +
                            "utton=radiobutton&selectedIndexes=837220\n" +
                            "2Osmia pumila Cresson, 1864. (n.d.). Retrieved January 17, 2020, from\n" +
                            "https://www.discoverlife.org/20/q?search=Osmia+pumila",
                    "• Blue with black legs\n" +
                            "• White to yellowish hair; white scopa\n" +
                            "• Noticeably pitted (like a golfball)",
                    "The Dwarf Mason Bee has been recorded on the following species2\n" +
                            ":\n" +
                            "\n" +
                            "Butterfly Milkweed, Asclepias tuberosa\n" +
                            "Astragalus, Astragalus spp.\n" +
                            "Wild Indigo, Baptisia tinctoria\n" +
                            "Yellow Rocket, Barbarea spp.\n" +
                            "Japanese Barberry, Berberis thunbergii\n" +
                            "Camas, Camassia spp.\n" +
                            "Bittercress/Toothwort, Cardamine spp.\n" +
                            "Redbud, Cercis spp.\n" +
                            "Chervil, Chaerophyllum spp.\n" +
                            "Claytonia, Claytonia spp.\n" +
                            "Blue-Eyed Mary, Collinsia spp.\n" +
                            "Toadflax, Commandra spp.\n" +
                            "Dogwood, Cornus spp.\n" +
                            "Hawthorn, Crataegus spp.\n" +
                            "Persimmon/Yam, Diospyros spp.\n" +
                            "Aunt Lucy, Ellisia nyctelea\n" +
                            "Eastern False Rue Anemone, Enemion biternatum\n" +
                            "Harbinger-of-Spring, Erigenia bulbosa\n" +
                            "Lily, Erythronium spp.\n" +
                            "Strawberry, Fragaria spp.\n" +
                            "Wild Geranium, Geranium maculatum\n" +
                            "Bluet, Houstonia spp.\n" +
                            "Dwarf Dandelion, Krigia spp.\n" +
                            "Wild Lupine, Lupinus perennis\n" +
                            "Crabapple, Malus spp.\n" +
                            "Bluebells, Mertensia spp.\n" +
                            "Violet Wood-sorrel, Oxalis violacea\n" +
                            "Lousewort, Pedicularis spp.\n" +
                            "Smallflower Phacelia, Phacelia dubia\n" +
                            "Jacob’s Ladder, Polemonium spp.\n" +
                            "Cinquefoil, Potentilla spp.\n" +
                            "\n" +
                            "Buttercup, Ranunculus spp.\n" +
                            "Currant, Ribes spp.\n" +
                            "Sawtooth Blackberry, Rubus argutus\n" +
                            "Willow, Salix spp.\n" +
                            "Sassafras, Sassafras albiduman\n" +
                            "Greenbriar/Carrionflower, Smilax spp.\n" +
                            "Dandelions, Taraxacum spp.\n" +
                            "Buffalo Clover, Trifolium reflexum\n" +
                            "Berry Tree, Vaccinium spp.\n" +
                            "Wright Viburnum, Viburnum wrightii\n" +
                            "Vetch, Vicia spp.\n" +
                            "Lesser Periwinkle, Vinca minor\n" +
                            "Prickly Ash, Zanthoxylum spp.\n" +
                            "Zizia, Zizia spp.\n" +
                            "The following species attract members from the genus Osmia. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "SPRING - PERENNIALS\n" +
                            "Wild Lupine, Lupinus perennis\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Spiderwort, Tradescantia spp.\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Waterleaf, Hydrophyllum spp.\n" +
                            "Wild Geranium, Geranium maculatum\n" +
                            "SPRING - TREES AND SHRUBS\n" +
                            "American Plum, Prunus americana\n" +
                            "Willow, Salix spp.\n" +
                            "Red Maple, Acer rubrum\n" +
                            "Viburnum, Viburnum spp."),
        Insect("Eastern Carpenter Bee", "(Xylocopa virginica)",
            R.drawable.eastern_carpenter_bee_1,R.drawable.eastern_carpenter_bee_2,R.drawable.eastern_carpenter_bee_3,R.drawable.eastern_carpenter_bee_4,
                "The Eastern Carpenter Bee is a common backyard visitor and perhaps the reason your wooden cabin is\n" +
                        "dotted with holes. Males and females overwinter as adults and emerge in the spring1\n" +
                        "\n" +
                        ". After mating, the\n" +
                        "female uses her powerful mandibles (bee teeth) to excavate a new nest burrow, typically in pine or cedar\n" +
                        "boards or perhaps your deck1\n" +
                        "\n" +
                        ". The entrance will branch off into several different tunnels2\n" +
                        "\n" +
                        ". The female\n" +
                        "Eastern Carpenter Bee will gather pollen and nectar into a ball and deposit it at the furthest end of the\n" +
                        "tunnel2\n" +
                        ". She will then lay an egg on top of it before working on the next cell. Often the male will stand\n" +
                        "guard while the female works3\n" +
                        ".\n" +
                        "\n" +
                        "While this habit of chewing holes can be a nuisance for homeowners, the Eastern Carpenter Bee remains\n" +
                        "an important native pollinator and a welcomed visitor to any flowering plant. Like bumblebees, they use a\n" +
                        "form of pollination known as sonication2\n" +
                        "\n" +
                        ". Sonication is an incredibly efficient form of pollination. It\n" +
                        "releases more pollen in a shorter amount of time, meaning the Eastern Carpenter Bee can visit more\n" +
                        "flowers than other bees in a given timeframe. Sonication is so effective that it allows the Eastern\n" +
                        "Carpenter Bee to carry more pollen with each flower visit1which increases the chance of successful\n" +
                        "pollination.\n" +
                        "Many bees live less than a year, but the Eastern Carpenter Bee can survive up to 3 years2\n" +
                        "\n" +
                        ". Their range\n" +
                        "extends throughout the eastern United States, stretching down into Florida and as far West as Texas,\n" +
                        "Nebraska, Kansas, and a couple sitings in Idaho3\n" +
                        ".\n" +
                        "\n" +
                        "SEASONALITY: April to October3\n" +
                        "CONSERVATION STATUS: Secure4\n" +
                        "STATUS: Native\n" +
                        "\n" +
                        "X. virginica\n" +
                        "17mm to\n" +
                        "23mm long\n" +
                        "\n" +
                        "Sources: 1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN:\n" +
                        "Pollination Press LLC.\n" +
                        "2Buchman, S. (n.d.). Eastern Carpenter Bee (Xylocopa spp.). Retrieved January 22, 2020 from\n" +
                        "https://www.fs.fed.us/wildflowers/pollinators/pollinator-of-the-month/carpenter_bees.shtml\n" +
                        "3Eastern Carpenter Bee (Xylocopa virginica). (n.d.). Retrieved January 22, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/51110-Xylocopa-virginica\n" +
                        "4Xylocopa virginica. (n.d.). Retrieved January 22, 2020 from\n" +
                        "http://explorer.natureserve.org/servlet/NatureServe?searchName=Xylocopa+virginica",
                "• Black with pale hairs on thorax and first abdominal segment\n" +
                        "• Black and bald abdomen; glossy\n" +
                        "• Wings held outward at 45̊angle when foraging\n" +
                        "• Males have white patch on face",
                "Information obtained from Bees: An Identification and Native Plant Forage Guide (Holm 2017):\n" +
                        "COMMON FORAGE PLANTS\n" +
                        "SPRING\n" +
                        "Beardtongue, Penstemon spp.\n" +
                        "Eastern Redbud, Cercis canadensis\n" +
                        "Northern Catalpa, Catalpa speciosa\n" +
                        "SUMMER\n" +
                        "Milkweed, Asclepias spp.\n" +
                        "Thistle, Cirsium spp.\n" +
                        "Ironweed, Veronia spp.\n" +
                        "Wild Bergamot, Monarda fistulosa\n" +
                        "Yellow Coneflower, Ratibida pinnata\n" +
                        "Smooth Oxeye, Heliopsis helianthoides\n" +
                        "Coneflower, Echinacea spp.\n" +
                        "AUTUMN\n" +
                        "Goldenrod, Solidago spp.\n" +
                        "Aster, Symphyotrichum spp."),
        Insect("Eastern Calligrapher", "(Toxomerus geminatus)",
            R.drawable.eastern_caligrapher_bee_1,R.drawable.eastern_caligrapher_bee_2,R.drawable.eastern_caligrapher_bee_3,R.drawable.eastern_caligrapher_bee_4,
                "The Eastern Calligrapher is a hover fly in the Syrphid family and commonly found throughout the eastern\n" +
                        "United States. They feed on nectar and pollen and are found in forests, meadows, fields, savannas, fens,\n" +
                        "marshes, and bogs1\n" +
                        "\n" +
                        ". While typically not found in insect hotels, the slug-like larvae of the Eastern\n" +
                        "Calligrapher and other syrphid flies are important natural controls on pest populations and eat aphids,\n" +
                        "thrips, and small caterpillars2\n" +
                        "\n" +
                        ". An abundance of syrphid larva can reduce aphid populations by 70 to\n" +
                        "\n" +
                        "100%1\n" +
                        ", making them a welcomed occupant in gardens and agricultural fields.\n" +
                        "\n" +
                        "T. geminatus\n" +
                        "7mm average\n" +
                        "\n" +
                        "In optimal environmental conditions, adult Eastern Calligrapher females will lay their eggs on plants\n" +
                        "infested with prey2\n" +
                        "\n" +
                        ". The eggs will hatch around 3 days later and develop over a period of 1 to 3 weeks, all\n" +
                        "\n" +
                        "the while eating resident pests2\n" +
                        "\n" +
                        ". Unless overwintering, the larva will pupate and emerge 1 or 2 weeks\n" +
                        "\n" +
                        "later2\n" +
                        ". There can be several generations each year depending on environmental conditions2\n" +
                        ".\n" +
                        "\n" +
                        "Eastern Calligraphers have similar coloration to some bee and wasp species. This similarity in appearance\n" +
                        "is a tactic known as batesian mimicry, where an organism imitates another toxic or non-appetizing\n" +
                        "organism to avoid predation.\n" +
                        "True to its name, the range of the Eastern Calligrapher extends from some parts of south-east Canada\n" +
                        "down throughout the eastern U.S. It has been recorded as far west as Texas, Oklahoma, Kansas, and\n" +
                        "Nebraska3\n" +
                        ".\n" +
                        "SEASONALITY: March to November3\n" +
                        "CONSERVATION STATUS: Unknown\n" +
                        "STATUS: Native\n" +
                        "Sources: 1\n" +
                        "Iowa State University. (n.d.) Species Toxomerus geminatus. Retrieved January 18, 2020 from\n" +
                        "https://bugguide.net/node/view/8222\n" +
                        "2Gu, A. (n.d.). Syrphid Flies. Retrieved January 18, 2020 from\n" +
                        "https://biocontrol.entomology.cornell.edu/predators/syrphids.php\n" +
                        "3Eastern Calligrapher (Toxomerus geminatus). (n.d.). Retrieved January 18, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/126532-Toxomerus-geminatus",
                "• Distinct black and yellow pattern\n" +
                        "• Yellow margin (middle-line) outlined in black down abdomen\n" +
                        "• Large reddish-brown eyes\n" +
                        "• Hovers often around flowers",
                "The Eastern Calligrapher can be found near aphid-infested plants2\n" +
                        "\n" +
                        ". Adults visit a wide variety of flowers."),
        Insect("European Wool-Carder Bee", "(Anthidium manicatum)",
            R.drawable.european_wool_carder_bee_1,R.drawable.european_wool_carder_bee_2,R.drawable.european_wool_carder_bee_3,R.drawable.european_wool_carder_bee_4,
                "The European Wool Carder Bee can often be mistaken for wasps due to their bright yellow and black\n" +
                        "patterns. Their name comes from their behavior of scraping hairs from plants for nest materials, a process\n" +
                        "likened to wool carding. Plants like Lamb’s Ear (Stachys byzantina), Spiderwort (Tradescentia spp.), and\n" +
                        "Sagewort (Artemesia spp.) attract the females of this species due to their hairy parts. Male European\n" +
                        "Wool Carder Bees are substantially larger than females and behave aggressively towards other males.\n" +
                        "They defend their territory using modified “teeth” at the end of their abdomens to fight off other bees.\n" +
                        "This often maims or kills native bees as they have not evolved any defense against this1\n" +
                        "\n" +
                        ". The European\n" +
                        "Wool Carder Bee nests in pre-existing holes in wood or hollow plant stems and seems to inhabit mostly\n" +
                        "urban landscapes1\n" +
                        ".\n" +
                        "\n" +
                        "While first introduced in the northeastern U.S. in the 1960s, these bees can now be found throughout\n" +
                        "Canada, the U.S., and South America1\n" +
                        ".\n" +
                        "SEASONALITY: Late January to early November1\n" +
                        "STATUS: Invasive\n" +
                        "\n" +
                        "A. manicatum\n" +
                        "11mm to\n" +
                        "17mm long\n" +
                        "\n" +
                        "Sources: 1Burrows, S., Ritner, C., Christman, M., Spears, L., Smith-Pardo, A., Price, S., ... Redford, A. (2018,\n" +
                        "August). Anthidium manicatum. Retrieved January 17, 2020, from\n" +
                        "http://idtools.org/id/bees/exotic/factsheet.php?name=16911",
                "• Black and yellow; distinct black “V” on abdomen\n" +
                        "• Yellow mandibles (jaws) and legs\n" +
                        "• Black tegula (plate where wings connect to body)",
                "The European Wool Carder Bee is a generalist bee and visits a wide variety of flowers1\n" +
                        ".\n" +
                        "\n" +
                        "The following species attract members from the genus Anthidium. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "EARLY SUMMER\n" +
                        "Spiderwort, Tradescantia spp. (hairs from this plant are used as nesting material)\n" +
                        "Beardtongue, Penstemon spp.\n" +
                        "Coneflower, Echincaea spp.\n" +
                        "Scurfy Pea, Psoralea spp.\n" +
                        "Milkvetch, Astragalus spp.\n" +
                        "SUMMER\n" +
                        "Anise Hyssop, Agastache foeniculum\n" +
                        "Sagewort, Artemesia spp. (hairs from this plant are used as nesting material)\n" +
                        "Vervain, Verbena spp.\n" +
                        "Tickseed, Coreopsis spp.\n" +
                        "AUTUMN\n" +
                        "Goldenrod, Solidago and Euthamia spp.\n" +
                        "Aster, Symphyotrichum and Eurybia spp."),
        Insect("Flat-Tailed Leafcutter Bee", "(Megachile mendica)",
            R.drawable.flat_tailed_leafcutter_bee_1,R.drawable.flat_tailed_leafcutter_bee_2,R.drawable.flat_tailed_leafcutter_bee_3,R.drawable.flat_tailed_leafcutter_bee_4,
                    "The Flat-tailed Leafcutter Bee gets part of its name from their behavior of cutting leaf parts with their\n" +
                            "mandibles (bee teeth) for their nests. The “flat-tailed” is in reference to their flattened terminal (end)\n" +
                            "abdominal segment (terga 6). They are solitary bees that nest in pre-existing cavities in wood, rocks, or\n" +
                            "plant stems1\n" +
                            "\n" +
                            ". After finding a suitable site, a female uses her large mandibles to cut leaves and build\n" +
                            "chambers for each of her eggs, starting with the chamber the furthest from the opening1\n" +
                            "\n" +
                            ". She deposits a\n" +
                            "single egg atop a bundle of pollen (and sometimes nectar) that will feed the developing larva. The female\n" +
                            "then seals off the chamber and repeats this process, each time leaving one egg and food bundle per cell\n" +
                            "and sealing it off with plant material.\n" +
                            "Leafcutter Bees in the Midwest and Northeast U.S. typically emerge in late spring or early summer1\n" +
                            ". They\n" +
                            "immediately seek a mate and search for nesting sites to prepare the next generation, which will\n" +
                            "overwinter and emerge in the next season1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Flat-tailed Leafcutter Bee extends throughout the United States, though many public\n" +
                            "observations have been submitted along the eastern U.S2,3\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: May to October3\n" +
                            "CONSERVATION STATUS: unknown\n" +
                            "STATUS: native\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Moisset, B., Cotinis, Ascher, J. S., & Go, H. (2006). Species Megachile mendica – Flat-tailed Leaf-cutter\n" +
                            "Bee. Retrieved February 29, 2020 from https://bugguide.net/node/view/81669\n" +
                            "3\n" +
                            "Flat-tailed Leafcutter Bee (Megachile mendica). (n.d.). Retrieved February 29, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/199131-Megachile-mendica\n" +
                            "4Megachile mendica Cresson, 1878. (n.d.). Retrieved February 29, 2020 from\n" +
                            "https://www.discoverlife.org/mp/20q?search=Megachile+mendica",
                    "• Black bee with white abdominal stripes\n" +
                            "• (female) pale yellow hairs underneath abdomen (scopa)\n" +
                            "• Last abdominal segment (T6) is straight and" +
                            "flattened when viewed laterally (from the side)",
                    "The Flat-tailed Leafcutter Bee has been recorded on the following:\n" +
                            "Coastal Plain Honeycombhead, Balduina angustifolia\n" +
                            "Pale Indian Plantain, Cacalia atriplicifolia\n" +
                            "Thistles, Cirsium spp.\n" +
                            "Robins-Plantain, Erigeron philadelphicus\n" +
                            "Sunflower, Helianthus spp.\n" +
                            "Smooth Oxeye, Heliopsis helianthoides\n" +
                            "Ironweeds, Vernonia spp.\n" +
                            "Orange Balsam, Impatiens capensis\n" +
                            "Winter-Cress, Barbarea vulgaris\n" +
                            "Indian-Tobacco, Lobelia inflata\n" +
                            "Deerberry, Vaccinium stamineum\n" +
                            "... the full list can be viewed found in the Discover Life link in the source list.\n" +
                            "\n" +
                            "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "COMMON PLANTS USED FOR NESTING MATERIAL\n" +
                            "Tick Trefoils, Desmodium spp.\n" +
                            "Roses, Rosa spp.\n" +
                            "St. John’s Wort, Hypericum spp.\n" +
                            "Ash, Fraxinus spp.\n" +
                            "Eastern Redbud, Cercis canadensis\n" +
                            "\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Wild Indigo, Baptisia spp.\n" +
                            "Coneflower, Echinacea spp.\n" +
                            "Beardtongue, Penstemon spp.\n" +
                            "Canada Anemone, Anemone canadensis\n" +
                            "Balsam Ragwort, Packera paupercula\n" +
                            "\n" +
                            "FALL\n" +
                            "Yellow Coneflower, Ratibida pinnata\n" +
                            "Black-eyed Susan, Rudbeckia hirta\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Joe Pye Weed, Eutrochium spp.\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "Anise Hyssop, Agastache foeniculum\n" +
                            "Prairie Onion, Allium stellatum\n" +
                            "Tick Trefoil, Desmodium spp.\n" +
                            "Blazingstar, Liatris spp.\n" +
                            "Vervain, Verbena spp.\n" +
                            "Prairie Clover, Dalea spp.\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Aster, Symphyotrichum spp."),
        Insect("Four-toothed Mason Wasp", "(Monobia quadridens)",
            R.drawable.four_toothed_mason_wasp_1,R.drawable.four_toothed_mason_wasp_2,R.drawable.four_toothed_mason_wasp_3,R.drawable.four_toothed_mason_wasp_4,
                    "The Four-toothed Mason Wasp is a solitary, mostly black wasp with a white or cream band on the first\n" +
                            "segment of its abdomen. They look like the Bald-faced Hornet (Dolichovespula maculate) and a sting from\n" +
                            "either is said to feel similar. The Bald-faced Hornet lives in a social nest and has more white markings on\n" +
                            "the face, thorax, and abdomen than the Four-toothed Mason Wasp.\n" +
                            "The Four-toothed Mason Wasp feeds on nectar from a wide variety of flowers and therefore assists in\n" +
                            "pollination1\n" +
                            "\n" +
                            ". They nest in pre-existing cavities in wood (left by carpenter bees or wood-boring beetles)\n" +
                            "\n" +
                            "and the ground but will sometimes dig or carve out their own nest1\n" +
                            "\n" +
                            ". The female is known to take over the\n" +
                            "\n" +
                            "nests of other solitary bees by removing the latter’s eggs1\n" +
                            ".\n" +
                            "\n" +
                            "After finding a suitable nesting site, the Four-toothed Mason Wasp lays a single egg at the far end of the\n" +
                            "cavity1\n" +
                            ". She then hunts for caterpillars (typically moth species)1\n" +
                            "\n" +
                            "to paralyze and carry back to the nest\n" +
                            "\n" +
                            "where they will be stored for her larva to eat1\n" +
                            "\n" +
                            ". After collecting enough food, she builds a mud wall to seal\n" +
                            "\n" +
                            "the egg and caterpillars together in a chamber1\n" +
                            "\n" +
                            ". Before laying another egg, she’ll build a second mud wall,\n" +
                            "leaving a gap between the first egg chamber and the beginning of the second (intercalary cells)1\n" +
                            ". Once\n" +
                            "complete, she’ll begin the process anew by laying another egg and filling the chamber with paralyzed\n" +
                            "caterpillars before sealing it with mud1\n" +
                            "\n" +
                            ". This process continues until the cavity is full of egg chambers with\n" +
                            "\n" +
                            "“blanks” in between1\n" +
                            "\n" +
                            ". The eggs will hatch into larvae, eat the caterpillars, and overwinter before pupating\n" +
                            "\n" +
                            "in the spring1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Four-toothed Mason Wasp extends throughout eastern North America, southern\n" +
                            "Canada and northern Mexico1\n" +
                            ".\n" +
                            "SEASONALITY: March to November2\n" +
                            "CONSERVATION STATUS: Imperiled3\n" +
                            "STATUS: native\n" +
                            "Sources:\n" +
                            "1The Buglady. (2017). Four-toothed Mason Wasp (Family Vespidae). Retrieved March 5, 2020 from\n" +
                            "https://uwm.edu/field-station/four-toothed-mason-wasp/\n" +
                            "2\n" +
                            "Four-toothed Mason Wasp (Monobia quadridens). (n.d.). Retrieved March 5, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/126215-Monobia-quadridens\n" +
                            "3Monobia quadridens - (Linnaeus, 1763). (n.d.). Retrieved March 5, 2020 from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?searchName=Monobia+quadridens",
                    "• Hairless black body with large white band at the end of first " +
                            "abdominal band\n" +
                            "• White spots on thorax\n" +
                            "• Black wings",
                    "N/A"),
        Insect("Green Lacewings", "(Chrysoperla spp.)",
            R.drawable.green_lacewing_1,R.drawable.green_lacewing_2,R.drawable.green_lacewing_3,R.drawable.green_lacewing_4,
                    "Common Green Lacewings (like Brown Lacewings [Family: Hemerobiidae]) are a welcomed backyard and\n" +
                            "farm-field resident. Their larvae are prized biological controls on aphid populations and “spider mites\n" +
                            "(especially red mites), thrips, whiteflies, eggs of leafhoppers, moths, leafminers, small caterpillars, and\n" +
                            "beetle larvae.”1 The larvae are active hunters while the adults feed on pollen, nectar, and the honeydew\n" +
                            "excreted by adult aphids2\n" +
                            "\n" +
                            ". Female Common Green Lacewings lay their light green eggs on silken strands\n" +
                            "1\n" +
                            "\n" +
                            "attached to leaves – like tiny balloons.\n" +
                            "Common Green Lacewing larvae are prone to drying out and need a source of moisture1\n" +
                            "\n" +
                            ". Adults rely on\n" +
                            "nectar and aphid honeydew to stay hydrated. To promote the presence of Common Green Lacewings, a\n" +
                            "nearby supply of flowering plants and a small population of aphids should be tolerated1\n" +
                            ".\n" +
                            "\n" +
                            "The range of Common Green Lacewings extends around the globe and throughout the United States3\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: April to November3\n" +
                            "EASTERN US AND CANADA: 8 species2\n" +
                            "Sources:\n" +
                            "1Chrysoperla (=Chrysopa) carnea, C. rufilabris (Neuroptera: Chrysopidae). (n.d.). Retrieved February 26,\n" +
                            "2020 from https://biocontrol.entomology.cornell.edu/predators/Chrysoperla.php\n" +
                            "2Moisset, B., Nendick-Mason, H., Ceiseman, Belov, V. (2005). Genus Chrysoperla. Retrieved February 26,\n" +
                            "2020 from https://bugguide.net/node/view/32027\n" +
                            "3Genus: Chrysoperla. (n.d.). Retrieved February 26, 2020 from https://www.inaturalist.org/taxa/59441-\n" +
                            "Chrysoperla",
                    "• Bright green\n" +
                            "• Long antennae\n" +
                            "• Thin, long body\n" +
                            "• Large, transparent (clear) wings folded over body\n" +
                            "• (larvae) brown and white; “alligator-like”; large jaws",
                    "Common Green Lacewings are considered beneficial generalists and will typically be found near aphid-\n" +
                            "infested and/or flowering plants."),
        Insect("Harvestmen", "(Order: Opiliones)",
            R.drawable.harvestmen_1,R.drawable.harvestmen_2,R.drawable.harvestmen_3,R.drawable.harvestmen_4,
                    "Harvestmen, or “daddy-long-legs,” are non-venomous, normally solitary Arachnids more closely related\n" +
                            "to scorpions than spiders1\n" +
                            "\n" +
                            ". They are easily distinguished from spiders by their long, spindly legs and the\n" +
                            "\n" +
                            "broad fusion of their two body segments1\n" +
                            "\n" +
                            ". This gives them the appearance of only having one body\n" +
                            "\n" +
                            "segment. While spiders have eight eyes, harvestmen only have two2\n" +
                            "\n" +
                            ". They also do not have silk glands\n" +
                            "\n" +
                            "and therefore do not spin webs.\n" +
                            "Harvestmen are beneficial members of a garden as they are generalist predators, eating both living and\n" +
                            "dead organisms, and help control pest populations3\n" +
                            "\n" +
                            ". Some of the pests they eat include aphids,\n" +
                            "\n" +
                            "caterpillars, slugs, grasshoppers, psyllids, beetle larvae, and mites3\n" +
                            "\n" +
                            ". They may be seen on or around an\n" +
                            "insect hotel looking for prey. Providing logs, mulch, and rocks in your garden will help prevent them from\n" +
                            "dehydrating in the sun3\n" +
                            ".\n" +
                            "\n" +
                            "The range of Harvestmen extends around the globe, and they are commonly found in the United States4\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: May to November, though some species are active in winter4\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "Sources:\n" +
                            "1Bartlett, T., Nanz, S. Moisset, B., Elliott, L., Wisch, H., Stephen, C., Hall, K., Belov, V., Parker, H. S.,\n" +
                            "Reynolds, B., Hedin, M. (2004). Order Opiliones – Harvestmen. Retrieved February 20, 2020 from\n" +
                            "https://bugguide.net/node/view/2405\n" +
                            "2 HARVESTMEN (one of several kinds of arthropod known as Daddy Longlegs). (n.d.). Retrieved February\n" +
                            "20, 2020 from https://www.backyardnature.net/longlegs.htm\n" +
                            "3Gardiner, M., & Griffith, M. (2016). Ohio’s Natural Enemies: Harvestmen (also known as daddy longlegs).\n" +
                            "Retrieved February 20, 2020 from https://ohioline.osu.edu/factsheet/ent-68\n" +
                            "4Harvestment (Order Opiliones). (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/47367-Opiliones",
                    "• One body segment (actually two, but broadly fused together)\n" +
                            "• Very long, thin legs\n" +
                            "• Wandering; not on a web",
                    "Harvestmen are predators and are found in a multitude of habitats and media searching for their prey\n" +
                            "items."),
        Insect("Hornets and Yellowjackets", "(Subfamily: Vespinae)",
            R.drawable.hornets_and_yellowjackets_1,R.drawable.hornets_and_yellowjackets_2,R.drawable.hornets_and_yellowjackets_3,R.drawable.hornets_and_yellowjackets_4,
                    "Hornets and Yellowjackets are some of the most recognizable wasps in North America. Many common\n" +
                            "species have striped or stippled pale cream to yellow patterns on a black body. Others are completely\n" +
                            "black or a mixture of deep reds and metallic shades. They are social species that build paper nests using a\n" +
                            "mixture of saliva and plant fibers1\n" +
                            "\n" +
                            ". These are annual nests that only last a single year before being\n" +
                            "\n" +
                            "abandoned, though some nests can be used longer in warm climates2\n" +
                            "\n" +
                            ". The nests can range from the size\n" +
                            "\n" +
                            "of a baseball to larger than a basketball2\n" +
                            "\n" +
                            ". Since they build their own nests, Hornets and Yellowjackets are\n" +
                            "\n" +
                            "not likely to use an insect hotel.\n" +
                            "Different species of Vespinae have different types of sociality. The simplest form is subsocial behavior,\n" +
                            "where the brood (young wasps) are cared for during a limited timeframe2\n" +
                            "\n" +
                            ". The most extreme case of\n" +
                            "social behavior is eusociality. In this case, one female (a queen) or a few related females lay all the eggs. A\n" +
                            "sterile caste of female workers from overlapping generations work together to care for the brood (ex:\n" +
                            "yellowjackets)2\n" +
                            "\n" +
                            ". When disturbed or threatened, a wasp will emit a pheromone that alerts the hive to a\n" +
                            "\n" +
                            "perceived threat and causes them to swarm3\n" +
                            ".\n" +
                            "\n" +
                            "Hornet and Yellowjacket larvae mostly eat caterpillars while the adults feed on nectar from flowers4\n" +
                            ".\n" +
                            "Despite the fear surrounding them and their sting, Hornets and Yellowjackets are important biological\n" +
                            "controls on pest populations. They, along with most wasps in the Vespidae family, prey upon nearly every\n" +
                            "pest species on the planet3\n" +
                            "\n" +
                            ". This makes them especially useful in protecting crops and farmland from\n" +
                            "\n" +
                            "damaging swarms of pest species3\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Hornet and Yellowjacket subfamily extends around the globe and are commonly found\n" +
                            "throughout the United States5\n" +
                            ".\n" +
                            "SEASONALITY: March to November5\n" +
                            "EASTERN US AND CANADA: 224\n" +
                            "Sources:\n" +
                            "1Persson, S. (2015). Phylogeny and taxonomy of the subfamily Vespinae (Hymenoptera: Vespidae), based\n" +
                            "on five molecular markers. Retrieved March 5, 2020 from\n" +
                            "https://bioenv.gu.se/digitalAssets/1536/1536726_suzanna-persson.pdf\n" +
                            "2Kimsey, L. S. & Carpenter, J., M. (2012). The Vespinae of North America (Vespidae, Hymenoptera).\n" +
                            "Journal of Hymenoptera Research 28, https://doi.org/10.3897/jhr.28.3514\n" +
                            "3Wasps. (n.d.). Retrieved March 6, 2020 from\n" +
                            "https://www.nationalgeographic.com/animals/invertebrates/group/wasps/ \n" +
                            "4Bartlett, T., Moisset, B., Tony-2, Buck, M., & Belov, V. (2004). Subfamily Vespinae – Hornets and\n" +
                            "Yellowjackets. Retrieved March 6, 2020 from https://bugguide.net/node/view/385\n" +
                            "5Hornets and Yellowjackets (Subfamily Vespinae). (n.d.). Retrieved March 6, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/84738-Vespinae",
                    "• “wasp waist” – narrow connection between thorax " +
                            "and abdomen (petiole)\n" +
                            "• Flat or straight clypeus (facial plate above mandibles)\n" +
                            "• Triangular mandibles with serrated “teeth”\n" +
                            "• Often with pale cream or yellow markings\n" +
                            "• Relatively hairless",
                    "Hornets and Wasps will be attracted to gardens that have a lot of pests and flowers. They are important " +
                            "biological controls on pest populations, though they can be a nuisance if they build a nest close to a " +
                            "human dwelling where frequent encounters occur."),
        Insect("Hornfaced Bee", "(Osmia cornifrons)",
            R.drawable.hornfaced_bee_1,R.drawable.hornfaced_bee_2,R.drawable.hornfaced_bee_3,R.drawable.hornfaced_bee_4,
                "The Horn-faced Bee was introduced to the U.S. from Japan sometime in the 1980s1\n" +
                        "\n" +
                        ". This was done\n" +
                        "\n" +
                        "intentionally by USDA scientists to aid with apple crop pollination2\n" +
                        "\n" +
                        ". Recently, scientists have begun\n" +
                        "O. cornifrons\n" +
                        "8mm to\n" +
                        "12mm long\n" +
                        "\n" +
                        "looking at the Japanese Horn-faced Bee as a potential alternative pollinator for certain crops in Michigan3\n" +
                        ".\n" +
                        "\n" +
                        "These bees exhibit a preference for fruit trees and can fly in cooler temperatures3\n" +
                        "\n" +
                        ". Their foraging habits\n" +
                        "make them an effective pollinator which is why scientists now view them as a candidate for use as cherry\n" +
                        "tree pollinators in Michigan3\n" +
                        ".\n" +
                        "\n" +
                        "The Horn-faced Bee becomes active in early spring3\n" +
                        "\n" +
                        ". After mating, the female feeds for a couple days\n" +
                        "before searching out a suitable nest-cavity around 5/16-inches in diameter and 6 inches in length3\n" +
                        ". The\n" +
                        "female will divide this cavity into multiple cells for her offspring. The Horn-faced Bee collects pollen\n" +
                        "and/or nectar using specialized hairs beneath her abdomen (scopa) and rolls it into a ball inside the first\n" +
                        "cell before laying an egg on it. She then seals the chamber with a mud wall and begins collecting more\n" +
                        "pollen and/or nectar for the next egg. She repeats this process up to five times before capping the nest\n" +
                        "entrance with a mud wall3\n" +
                        ".\n" +
                        "\n" +
                        "One generation of Horn-faced Bees are produced each year; the eggs hatch roughly a week after being\n" +
                        "laid, pupate in the late summer, and molt into adult bees a month later3\n" +
                        "\n" +
                        ". These new adults will remain\n" +
                        "\n" +
                        "inside the nest until the following spring3\n" +
                        ".\n" +
                        "\n" +
                        "The range of the Horn-faced bee extends throughout the northeastern United States, thought there have\n" +
                        "also been observations of the bee in Oregon4\n" +
                        ".\n" +
                        "\n" +
                        "SEASONALITY: March to May4\n" +
                        "CONSERVATION STATUS: Secure and Increasing5\n" +
                        "STATUS: Introduced\n" +
                        "Sources:\n" +
                        "1USGS Bee Inventory and Monitoring Lab. (2015). Osmia cornifrons, F, Face, Washington, DC_2014-02-23-\n" +
                        "15.08.06 ZS PMax. Retrieved February 8, 2020 from\n" +
                        "\n" +
                        "https://www.flickr.com/photos/usgsbiml/22502757351/in/photolist-Lj8n3j-Kwy1Aq-AhuvM2-jMCg5h-\n" +
                        "jMzNSn-KwJH1H-jMAwSx\n" +
                        "\n" +
                        "2Kropiewnicki, T. Moisset, B. Quinn, M., Ascher, and J. Go, H. (2008). Species Osmia cornifrons - Hornfaced\n" +
                        "Bee. Retrieved February 8, 2020 from https://bugguide.net/node/view/174363\n" +
                        "3Rothwell, N. (2014). MSU pollination project expands to investigate an alternative pollinator. Retrieved\n" +
                        "February 8, 2020 from\n" +
                        "https://www.canr.msu.edu/news/msu_pollination_project_expands_to_investigate_an_alternative_polli\n" +
                        "nator\n" +
                        "4Hornfaced Bee (Osmia cornifrons). (n.d.) Retrieved February 8, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/121508-Osmia-cornifrons\n" +
                        "5\n" +
                        "Schweitzer, D.F. (2012). Osmia cornifrons - (Radoszkowski, 1887). Retrieved February 8, 2020 from\n" +
                        "http://explorer.natureserve.org/servlet/NatureServe?searchName=Osmia+cornifrons\n" +
                        "6Osmia cornifrons (Radoszkowski, 1887). (n.d.) Retrieved February 8, 2020 from\n" +
                        "https://www.discoverlife.org/20/q?search=Osmia+cornifrons",
                "• Long lateral horns on face (clypeus)\n" +
                        "• Small horn in lower (apical)\n" +
                        "• Pale yellow hair on head, thorax, and abdomen\n" +
                        "• Reddish-brown hairs beneath abdomen (scopa)",
                "The Hornfaced Bee has been recorded on the following6\n" +
                        ":\n" +
                        "\n" +
                        "Garlic Mustard, Alliaria petiolate\n" +
                        "Leatherleaf, Chamaedaphne calyculata\n" +
                        "Common Gypsyweed, Veronica officinalis\n" +
                        "Raspberries – Blackberries -Dewberries, Rubus spp.\n" +
                        "The following species attract members from the genus Osmia. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "SPRING - PERENNIALS\n" +
                        "Wild Lupine, Lupinus perennis\n" +
                        "Golden Alexanders, Zizia aurea\n" +
                        "Spiderwort, Tradescantia spp.\n" +
                        "Harebell, Campanula rotundifolia\n" +
                        "Waterleaf, Hydrophyllum spp.\n" +
                        "Wild Geranium, Geranium maculatum\n" +
                        "SPRING - TREES AND SHRUBS\n" +
                        "American Plum, Prunus americana\n" +
                        "Willow, Salix spp.\n" +
                        "Red Maple, Acer rubrum\n" +
                        "Viburnum, Viburnum spp."),
        Insect("House Centipede", "(Scutigera coleoptera)",
            R.drawable.house_centipede_1,R.drawable.house_centipede_2,R.drawable.house_centipede_3,R.drawable.house_centipede_4,
                    "House Centipedes are fast moving arthropods with multiple body segments. Their legs are long compared\n" +
                            "to their body. In females, the last leg pair is more than twice the length of her body1\n" +
                            "\n" +
                            ". Centipedes have\n" +
                            "one leg-pair per body segment (Millipedes have two leg-pairs per segment) and a flat shape. They are\n" +
                            "active hunters and hunt any invertebrate their size or smaller. House Centipedes immobilize prey with\n" +
                            "venom and are considered one of the most beneficial indoor insects to have since they eat other\n" +
                            "household pests such as “cockroach nymphs, flies, moths, bedbugs, crickets, silverfish, earwigs, and small\n" +
                            "spiders.”\n" +
                            "1 They typically run from people and do not bite, but if threatened enough, their bite is said to be\n" +
                            "no worse than a bee sting and cause some swelling1\n" +
                            ".\n" +
                            "\n" +
                            "House Centipedes are common in basements or other moist, cool areas in the house2\n" +
                            "\n" +
                            ". When outdoors,\n" +
                            "\n" +
                            "they are typically found beneath logs, rocks, twigs, and in other cool, moist locations1\n" +
                            "\n" +
                            ". They may be found\n" +
                            "\n" +
                            "in an insect hotel filled with bark, twigs, and debris hunting the other invertebrates there.\n" +
                            "The range of the House Centipede extends throughout the United States.\n" +
                            "SEASONALITY: year-round3\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "STATUS: Introduced1\n" +
                            "Sources:\n" +
                            "1Bartlett, T., Nendick-Mason, H., VanDyck, J., Moisset, B., McLeod, R., Quinn, M., Kropiewnicki, T., &\n" +
                            "KenW. (2004). Species Scutigera coleoptrata – House Centipede. Retrieved February 22, 2020 from\n" +
                            "https://bugguide.net/node/view/25",
                    "• 15 pairs of long legs\n" +
                            "• One leg-pair per body segment\n" +
                            "• Pale yellow body with three long stripes down back",
                    "The House Centipede is a predaceous arthropod and can typically be found in moist habitats (basements,\n" +
                            "underneath rocks, leaf litter, etc.) with a higher activity at night."),
        Insect("Hoverflies", "(Family: Syrphidae)",
            R.drawable.hoverflies_1,R.drawable.hoverflies_2,R.drawable.hoverflies_3,R.drawable.hoverflies_4,
                    "Hoverflies (also known as Flower Flies) is a family of over 6,000 fly species that visit flowers for nectar and\n" +
                            "pollen as adults1\n" +
                            "\n" +
                            ". A vast majority of Hoverflies mimic the patterns and behaviors of bees and wasps. This\n" +
                            "is known as batesian mimicry. The untrained eye can sometimes mistake them for a bee or wasp, though\n" +
                            "Hoverflies can be distinguished from Hymenoptera (bees and wasps) by their single pair of wings, large\n" +
                            "eyes, short antennae, and extra wing vein (spurious vein). Hoverflies are often overlooked as a group\n" +
                            "despite playing an indispensable role as “bio-control agents of plant pests, recyclers of dead plant and\n" +
                            "animal matter, pests of some ornamental plants, and pollinators”1\n" +
                            "\n" +
                            ". Larvae can be found in a wide range of\n" +
                            "habitats and have a varied diet, though most are predators of other arthropods including aphids1,2\n" +
                            ".\n" +
                            "Most Hoverflies lay their eggs near a food source (ex: an aphid infested plant) and are not typically\n" +
                            "associated with insect hotels. They are still a beautiful and welcomed backyard inhabitant.\n" +
                            "The range of the Hoverfly family extends throughout North America and are found worldwide2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: April to November3\n" +
                            "EASTERN US AND CANADA: approximately 8002\n" +
                            "\n" +
                            "Syrphidae\n" +
                            "1mm to\n" +
                            "35mm long\n" +
                            "\n" +
                            "Sources:\n" +
                            "1Welcome to Syrphidae Community Website. (n.d.). Retrieved February 23, 2020 from\n" +
                            "http://syrphidae.myspecies.info/\n" +
                            "2Bartlett, T., Cotinis, Moisset, B., Wisch, H., Bbarnd, Schusteff, A., Belov, V., Byers, K., & Moran, K. (2004).\n" +
                            "Family Syrphidae – Syrphid Flies. Retrieved February 23, 2020 from https://bugguide.net/node/view/196\n" +
                            "3Hover Flies (Family Syrphidae). (n.d.). Retrieved February 24, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/49995-Syrphidae\n" +
                            "4Kautz, A. & Gardiner, M. M. (2016). Ohio's Natural Enemies: Hover Flies. Retrieved February 24, 2020\n" +
                            "from https://ohioline.osu.edu/factsheet/ent-73",
                    "• Behavior of “hovering” around flowers\n" +
                            "• Large eyes; short antennae\n" +
                            "• One pair of wings\n" +
                            "• Presence of extra wing vein (spurious)\n" +
                            "• Bee or wasp look-alike (common)",
                    "Hoverflies are said to be attracted to white or yellow flowers with easy-to-access nectar and\n" +
                            "pollen4\n" +
                            ". Some floral attractants include4\n" +
                            ":\n" +
                            "Sweet Alyssum, Lobularia maritima\n" +
                            "Parsley, Petroselinum crispum\n" +
                            "Dill, Anethum graveolens\n" +
                            "Yarrow, Achillea millefolium\n" +
                            "Clover, Trifolium spp.\n" +
                            "Buckwheat, Fagopyrum esculentum"),
        Insect("Jumping Spiders", "(Family: Salticidae)",
            R.drawable.jumping_spiders_1,R.drawable.jumping_spiders_2,R.drawable.jumping_spiders_3,R.drawable.jumping_spiders_4,
                    "Despite their tiny size, Jumping Spiders have the best vision of any spider, making them excellent\n" +
                            "hunters1\n" +
                            ". Their name comes from their agile, sudden jumps (typically seen when hunting prey). This\n" +
                            "family of spiders contains over 6,000 species, many of which boast incredibly vibrant colors and striking\n" +
                            "patterns. Typical colors are black, brown, and gray, but males of certain species have patches or patterns\n" +
                            "with red, orange, yellow, metallic green and blue, copper, silver, gold and others1\n" +
                            "\n" +
                            ". The mating rituals of\n" +
                            "these spiders are unique, often involving the male “dancing” and showing off his colors for the female.\n" +
                            "Jumping Spiders are not aggressive towards people and will usually stay in place while “watching” an\n" +
                            "approaching person. Jumping Spiders are hunter-stalkers that use their incredible vision to slowly sneak\n" +
                            "up on their prey before pouncing – like a cat – up to several times their body-length onto the target1\n" +
                            ".\n" +
                            "They do not spin webs but may make tiny shelters out of silk or draglines to prevent a fall during a jump1\n" +
                            ".\n" +
                            "Jumping Spiders may make use of insect hotels as a shelter or use it as a hunting ground for small insects.\n" +
                            "They typically have a one-year life cycle; some species have an indistinct cycle, meaning all life-stages can\n" +
                            "be found at the same time throughout the year1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Jumping Spider family is extensive. They have been recorded on every continent except\n" +
                            "Antarctica and are common throughout the United States2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: Year-long1\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "Sources:\n" +
                            "1Cranshaw, W. (n.d.). Jumping Spider. Retrieved February 20, 2020 from\n" +
                            "https://wiki.bugwood.org/HPIPM:Jumping_Spider\n" +
                            "2\n" +
                            "Jumping Spiders (Family Salticidae). (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/48139-Salticidae",
                    "• Large front eyes\n" +
                            "• Small, compact shape\n" +
                            "• Agile movements and jumps",
                    "Jumping Spiders are hunter-stalkers, meaning they can be found in nearly any environment given that\n" +
                            "there are prey items around."),
        Insect("Lady Bugs", "(Family: Coccinellidae)",
            R.drawable.lady_bug_1,R.drawable.lady_bug_2,R.drawable.lady_bug_3,R.drawable.lady_bug_4,
                    "Ladybugs are some of the most well-known insects on the planet. They are valued for their role in" +
                            "controlling aphid and scale insect populations1\n" +
                            "\n" +
                            ". Some cultures consider them good luck and signs of a\n" +
                            "\n" +
                            "good harvest.\n" +
                            "Ladybugs come in many different sizes, shapes and colors1\n" +
                            "\n" +
                            ". The most well-known pattern is red with black\n" +
                            "spots, but there is a wide variety of patterns from checkered, striped, banded, radial, metallic and more1\n" +
                            ".\n" +
                            "\n" +
                            "Their body shapes also vary from being compact to oval to elongate.\n" +
                            "While most ladybugs are predatory, some will eat plants, fungi, and even pollen2\n" +
                            "\n" +
                            ". Most Ladybugs are\n" +
                            "\n" +
                            "beneficial to have in the garden, but some of the plant-eating species can be harmful.\n" +
                            "The range of Ladybugs extends around the globe and throughout the United States3\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: April to November3\n" +
                            "EASTERN US AND CANADA: > 480 species2\n" +
                            "Sources:\n" +
                            "1Giorgi, A. & Vandenberg, N. (2009). Coccinellidae. Retrieved February 27, 2020 from\n" +
                            "http://tolweb.org/Coccinellidae\n" +
                            "2Bartlett, T., Cotinis, Nendick-Mason, H., Moisset, B., McLeod, R., Harpootlian, P., Elliott, L., Entz, C.,\n" +
                            "Quinn, M., Moyer, T., ceiseman, Haines, R. D., Belov, V., Parker, H. S., Parker, A. & Hedlund, T. (2004).\n" +
                            "Family Coccinellidae – Lady Beetles. Retrieved February 27, 2020 from\n" +
                            "https://bugguide.net/node/view/179\n" +
                            "Lady Beetles (Family Coccinellidae). (n.d.). Retrieved February 27, 2020 from Lady Beetles Family\n" +
                            "Coccinellidae",
                    "Key Characteristics\n" +
                            "• Round or dome-shaped body\n" +
                            "• antennae shore\n" +
                            "• Red ladybugs with black spots most common; many colors and patterns\n" +
                            "• (larvae) soft-bodied, flattened, and elongated",
                    "Ladybugs are predacious insects and will be found on flowers that attract their prey items, namely aphids and scaly insects."),
        Insect("Leafcutter Bees", "(Megachile spp.)",
            R.drawable.leafcutter_bees_1,R.drawable.leafcutter_bees_2,R.drawable.leafcutter_bees_3,R.drawable.leafcutter_bees_4,
            "Leafcutter bees get their name from using their mandibles (bee teeth) to cut leaf parts for their nests.\n" +
                    "They are all solitary species that nest both above and below the ground in cavities. Above ground nesting\n" +
                    "sites include hollow plant stems, holes in standing dead trees, rock cavities, and abandoned mud dauber\n" +
                    "wasp nests. After finding a suitable site, a female will build chambers starting from the furthest from the\n" +
                    "opening. The females collect pollen using specialized hairs underneath their abdomen known as scopa.\n" +
                    "Using her scopa, she will collect enough pollen to feed her developing young and deposits it along with a\n" +
                    "single egg in the first chamber. The female then uses her large mandibles to cut petals and/or leaves from\n" +
                    "plants to seal off the chamber. She repeats this process, each time leaving one egg and pollen ball per\n" +
                    "chamber and sealing it off with plant material to protect her brood (offspring). The larvae will hatch,\n" +
                    "consume the food bundle, and overwinter as mature larva before pupating in spring.\n" +
                    "Leafcutter bees in the Midwest and Northeast U.S. typically emerge in late spring or early summer. They\n" +
                    "immediately seek a mate and search for nesting sites to prepare the next generation, which will\n" +
                    "overwinter and emerge in the next season.\n" +
                    "SEASONALITY: Early May to October\n" +
                    "EASTERN US AND CANADA: 44 species\n" +
                    "CONSERVATION STATUS: Unknown\n" +
                    "Sources: Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN:\n" +
                    "Pollination Press LLC.",
            "• Females have rows of pale scopa beneath abdomen\n" +
                    "• Grey or black bees with pale bands on abdomen\n" +
                    "• Males with long hairs on forelegs",
            "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                    "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                    "SPRING\n" +
                    "Golden Alexanders, Zizia aurea\n" +
                    "Harebell, Campanula rotundifolia\n" +
                    "Wild Indigo, Baptisia spp.\n" +
                    "Coneflower, Echinacea spp.\n" +
                    "Beardtongue, Penstemon spp.\n" +
                    "Canada Anemone, Anemone canadensis\n" +
                    "Balsam Ragwort, Packera paupercula\n" +
                    "SUMMER\n" +
                    "\n" +
                    "Megachile spp.\n" +
                    "5mm to\n" +
                    "21mm long\n" +
                    "\n" +
                    "Yellow Coneflower, Ratibida pinnata\n" +
                    "Black-eyed Susan, Rudbeckia hirta\n" +
                    "Milkweed, Asclepias spp.\n" +
                    "Joe Pye Weed, Eutrochium spp.\n" +
                    "Tickseed, Coreopsis spp.\n" +
                    "Anise Hyssop, Agastache foeniculum\n" +
                    "Prairie Onion, Allium stellatum\n" +
                    "Tick Trefoil, Desmodium spp.\n" +
                    "Blazingstar, Liatris spp.\n" +
                    "Vervain, Verbena spp.\n" +
                    "Prairie Clover, Dalea spp.\n" +
                    "Leadplant, Amorpha canescens\n" +
                    "AUTUMN\n" +
                    "Goldenrod, Solidago spp.\n" +
                    "Aster, Symphyotrichum spp."),
        Insect("Maine Blueberry Bee", "(Osmia atriventris)",
            R.drawable.maine_blueberry_bee_1,R.drawable.maine_blueberry_bee_2,R.drawable.maine_blueberry_bee_3,R.drawable.maine_blueberry_bee_4,
                    "The Maine Blueberry Bee is a beautiful metallic blue bee about the size of a house fly. They are smaller\n" +
                            "and less hairy than their cousin, the Blue Orchard Mason Bee. None-the-less, the Maine Blueberry Bee is\n" +
                            "O. atriventris\n" +
                            "7mm to\n" +
                            "8mm long\n" +
                            "\n" +
                            "an important pollinator of blueberries and other fruiting trees, and their life cycle is closely tied to the\n" +
                            "blueberry bloom1\n" +
                            "\n" +
                            ". They are known pollinators of high- and low-bush blueberries. These bees nest in pre-\n" +
                            "existing cavities in wood, reeds, insect hotels, paper straws, and bamboo.\n" +
                            "\n" +
                            "The range of the Maine Blueberry Bee extends throughout the Midwest and Eastern U.S. and extends\n" +
                            "northward into Canada, where it has been recorded as far west as British Columbia2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: Unknown\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "STATUS: Native\n" +
                            "Sources: 1Drummond, F. & Stubbs, C. (2003, June). 630 – Wild Bee Conservation for Wild Blueberry Fields.\n" +
                            "UMaine Extension No. 2111. Retrieved January 17, 2020, from\n" +
                            "\n" +
                            "https://extension.umaine.edu/blueberries/factsheets/bees/630-wild-bee-conservation-for-wild-\n" +
                            "blueberry-fields/\n" +
                            "\n" +
                            "2Osmia atriventris. (2009). Retrieved January 17, 2020, from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?searchName=Osmia+atriventris\n" +
                            "3Osmia atriventris, Cresson, 1864. (n.d.). Retrieved January 17, 2020, from\n" +
                            "https://www.discoverlife.org/20/q?search=Osmia+atriventris",
                    "• Dark metallic blue, sometimes with green tint\n" +
                            "• Mostly black hair: pale hairs are interspersed (very discreet\n" +
                            "on abdomen)\n" +
                            "• Females collect pollen on black hairs beneath the abdomen (scopae)",
                    "The Maine Blueberry Bee has been recorded on the following plants3\n" +
                            ":\n" +
                            "\n" +
                            "Rockcress, Arabis spp.\n" +
                            "Astragalus, Astragalus spp.\n" +
                            "Yellow Rocket, Barbarea spp.\n" +
                            "Bittercress/Toothwort, Cardamine spp.\n" +
                            "Redbuds, Cercis spp.\n" +
                            "Mums, Chrysanthemum spp.\n" +
                            "Claytonia, Claytonia spp.\n" +
                            "Collinsia, Collinsia spp.\n" +
                            "Ellisia, Ellisia spp.\n" +
                            "Harbinger-of-Spring, Erigenia bulbosa\n" +
                            "Strawberry, Fragaria spp.\n" +
                            "Geranium, Geranium spp.\n" +
                            "Bowman’s root, Gillenia trifoliata\n" +
                            "Hydrangea, Hydrangea spp.\n" +
                            "Stoneseed, Lithospermum spp.\n" +
                            "Bluebell, Mertensia spp.\n" +
                            "Northoscordum, Nothoscordum spp.\n" +
                            "Beardtongue, Pentstemon spp.\n" +
                            "Psoralea, Psoralea spp.\n" +
                            "Raspberry/Blackberry/Dewberry, Rubus spp.\n" +
                            "Trefoil, Trifolium spp.\n" +
                            "\n" +
                            "Bellwort, Uvularia spp.\n" +
                            "Berry Tree, Vaccinium spp.\n" +
                            "Vetch, Vicia spp.\n" +
                            "Pansy, Viola spp.\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "The following species attract members from the genus Osmia. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "SPRING - PERENNIALS\n" +
                            "Wild Lupine, Lupinus perennis\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Spiderwort, Tradescantia spp.\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Waterleaf, Hydrophyllum spp.\n" +
                            "Wild Geranium, Geranium maculatum\n" +
                            "SPRING - TREES AND SHRUBS\n" +
                            "American Plum, Prunus americana\n" +
                            "Willow, Salix spp.\n" +
                            "Red Maple, Acer rubrum\n" +
                            "Viburnum, Viburnum spp."),
        Insect("Margined Calligrapher", "(Toxomerus marginatus)",
            R.drawable.margined_calligrapher_1,R.drawable.margined_calligrapher_2,R.drawable.margined_calligrapher_3,R.drawable.margined_calligrapher_4,
                    "The Margined Calligrapher is among one of the most common hover flies (family: Syrphid) found in the\n" +
                            "United States. They feed on nectar and pollen and are found in diverse habitats ranging from roadsides to\n" +
                            "woodland edges1\n" +
                            "\n" +
                            ". While typically not found in insect hotels, the slug-like larvae of the Margined\n" +
                            "Calligrapher and other syrphid flies are important natural controls on pest populations and eat aphids,\n" +
                            "T. marginatus\n" +
                            "5.5mm\n" +
                            "average\n" +
                            "\n" +
                            "thrips, and small caterpillars1\n" +
                            "\n" +
                            ". An abundance of syrphid larva can reduce aphid populations by 70 to\n" +
                            "\n" +
                            "100%1\n" +
                            ", making them a welcomed occupant in gardens and agricultural fields.\n" +
                            "In optimal environmental conditions, adult Margined Calligrapher females will lay their eggs on plants\n" +
                            "infested with prey2\n" +
                            "\n" +
                            ". The eggs will hatch around 3 days later and develop over a period of 1 to 3 weeks, all\n" +
                            "\n" +
                            "the while eating the resident pests2\n" +
                            "\n" +
                            ". Unless overwintering, the larva will pupate and emerge 1 or 2 weeks\n" +
                            "\n" +
                            "later2\n" +
                            ". There can be several generations each year depending on environmental conditions2\n" +
                            ".\n" +
                            "Margined Calligraphers have similar coloration to some bee and wasp species. This similarity in\n" +
                            "\n" +
                            "appearance is a tactic known as batesian mimicry, where an organism imitates another toxic or non-\n" +
                            "appetizing organism to avoid predation.\n" +
                            "\n" +
                            "The range of the Margined Calligrapher extends from southern Canada, throughout the U.S. (including\n" +
                            "Hawaii), and down into parts of Mexico3\n" +
                            ".\n" +
                            "SEASONALITY: March to November\n" +
                            "3\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "STATUS: Native\n" +
                            "Sources: 1\n" +
                            "Iowa State University. (n.d.) Species Toxomerus marginatus. Retrieved January 18, 2020 from\n" +
                            "https://bugguide.net/node/view/8221\n" +
                            "2Gu, A. (n.d.). Syrphid Flies. Retrieved January 18, 2020 from\n" +
                            "https://biocontrol.entomology.cornell.edu/predators/syrphids.php\n" +
                            "3Margined Calligrapher (Toxomerus marginatus). (n.d.). Retrieved January 18, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/126889-Toxomerus-marginatus",
                    "• Distinct black and yellow pattern\n" +
                            "• consistent yellow margin (middle-line) down abdomen\n" +
                            "• Large reddish-brown eyes\n" +
                            "• Hovers often around flowers",
                    "The Margined Calligrapher can be found near aphid-infested plants2\n" +
                            "\n" +
                            ". Adults visit a wide variety of flowers."),
        Insect("Mason Bees", "(Osmia spp.)",
            R.drawable.mason_bees_1,R.drawable.mason_bees_2,R.drawable.mason_bees_3,R.drawable.mason_bees_4,
                "Mason bees can play a significant role in pollinating orchards in the Great Lakes and Northeast. These\n" +
                        "bees nest in cavities both above and below ground. When nesting above ground, they search for hollow\n" +
                        "plant stems, holes in standing dead trees, abandoned mud dauber wasp nests, and snail shells (O.\n" +
                        "\n" +
                        "Osmia spp.\n" +
                        "5mm to\n" +
                        "17mm long\n" +
                        "\n" +
                        "conjuncta). After finding a suitable nesting site, a female will build multiple chambers starting with a cell\n" +
                        "furthest from the opening. She deposits a single egg with a bundle of pollen (and sometimes nectar) for\n" +
                        "food and then seals off the chamber with chewed plants parts or mud (O. lignaria). She repeats this\n" +
                        "process three to five times before finally capping off the nest with mud or chewed leaves. The larvae will\n" +
                        "hatch, consume the food bundle, and normally overwinter as mature larva before pupating in spring and\n" +
                        "emerging as an adult bee.\n" +
                        "SEASONALITY: Late March to September\n" +
                        "EASTERN US AND CANADA: 30 species\n" +
                        "CONSERVATION STATUS: Unknown\n" +
                        "Sources: Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN:\n" +
                        "Pollination Press LLC.",
                "• Dark blue or green with metallic sheen\n" +
                        "• Moderately hairy head, thorax, and abdomen\n" +
                        "• Females collect pollen on hairs beneath the abdomen (scopae)",
                "The following species attract members from the genus Osmia. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "SPRING - PERENNIALS\n" +
                        "Wild Lupine, Lupinus perennis\n" +
                        "Golden Alexanders, Zizia aurea\n" +
                        "Spiderwort, Tradescantia spp.\n" +
                        "Harebell, Campanula rotundifolia\n" +
                        "Waterleaf, Hydrophyllum spp.\n" +
                        "Wild Geranium, Geranium maculatum\n" +
                        "SPRING - TREES AND SHRUBS\n" +
                        "American Plum, Prunus americana\n" +
                        "Willow, Salix spp.\n" +
                        "Red Maple, Acer rubrum\n" +
                        "Viburnum, Viburnum spp."),
        Insect("Metallic Bluish Green Cuckoo Wasp", "(Chrysis angolensis)",
            R.drawable.metallic_bluish_green_cuckoo_wasp_1,R.drawable.metallic_bluish_green_cuckoo_wasp_2,R.drawable.metallic_bluish_green_cuckoo_wasp_3,R.drawable.metallic_bluish_green_cuckoo_wasp_4,
                "The Metallic Bluish Green Cuckoo Wasp can be mistaken for the Pure Green Sweat Bee (A. pura).\n" +
                        "However, the four teeth at the end of its abdomen and the ability to curl into a ball is what distinguishes\n" +
                        "the Metallic Bluish Green Cuckoo Wasp from A. pura.\n" +
                        "The Metallic Bluish Green Cuckoo Wasp parasitizes the larva of some bee and wasp species, including\n" +
                        "those in the Megachilidae (Leafcutter bee) family1\n" +
                        "\n" +
                        ". An adult female will search for the nest of another bee\n" +
                        "or wasp and lay its own eggs inside. When the egg hatches into a larva, it will eat the resident bee or\n" +
                        "wasp larva and the remaining pollen/nectar reserves. Adult Metallic Bluish Green Cuckoo Wasps feed on\n" +
                        "nectar from a variety of plants2\n" +
                        ".\n" +
                        "\n" +
                        "The Metallic Bluish Green Cuckoo Wasp was introduced to the United States sometime during World War\n" +
                        "II, possibly via parasitized mud nests in machinery or returning aircraft3\n" +
                        "\n" +
                        ". Its range now extends\n" +
                        "\n" +
                        "throughout the United States4\n" +
                        ".\n" +
                        "SEASONALITY: April to November3\n" +
                        "STATUS: Introduced\n" +
                        "Sources:\n" +
                        "1Cotinis, Moisset, B., Schneider, K., and Belov, V. (2004). Genus Chrysis. Retrieved February 8, 2020 from\n" +
                        "https://bugguide.net/node/view/8067\n" +
                        "\n" +
                        "A. angolensis\n" +
                        "7mm to\n" +
                        "11mm long\n" +
                        "\n" +
                        "2Cuckoo Wasp (Chrysis spp.). (n.d.). Retrieved February 8, 2020 from\n" +
                        "https://www.insectidentification.org/insect-description.asp?identification=Cuckoo-Wasp\n" +
                        "3Chrysis angolensis Radoszkowski, 1881. (n.d.). Retrieved February 8, 2020 from\n" +
                        "https://www.discoverlife.org/mp/20q?search=Chrysis+angolensis&guide=Chrysididae&mobile=1\n" +
                        "4Chrysis angolensis. (n.d.) Retrieved February 8, 2020 from https://www.inaturalist.org/taxa/325772-\n" +
                        "Chrysis-angolensis",
                "• Bright dimpled, green body; blue square on thorax\n" +
                        "• Blue terminal segment\n" +
                        "• Dark brown/black wings\n" +
                        "• Abdomen ends in 4 teeth",
                "The Metallic Bluish Green Cuckoo Wasp can be found in many habitats visiting the flowers there."),
        Insect("Mexican Grass-Carrying Wasp", "(Chrysis angolensis)",
            R.drawable.mexican_grass_carrying_wasp_1,R.drawable.mexican_grass_carrying_wasp_2,R.drawable.mexican_grass_carrying_wasp_3,R.drawable.mexican_grass_carrying_wasp_4,
                    "The Mexican Grass-carrying Wasp is a solitary species that spends its days gathering nectar from flowers\n" +
                            "and hunting insects (usually tree crickets)1\n" +
                            "\n" +
                            ". Solitary Wasps, including the Grass-carrying Wasp, are not\n" +
                            "\n" +
                            "aggressive as they do not defend their nests1\n" +
                            "\n" +
                            ". The Grass-Carrying Wasp nests in hollowed tubes or\n" +
                            "\n" +
                            "cavities in wood. Their nests are easy to spot because of the long blades of grass used to cap the cavity-\n" +
                            "entrance.\n" +
                            "\n" +
                            "Before laying her eggs, the female first stocks the nest with paralyzed crickets that the larvae will eat once\n" +
                            "they hatch1\n" +
                            "\n" +
                            ". After carrying enough back to the nest, the female will either make each cell individually with\n" +
                            "an egg, a grasshopper, and a grass wall, or creates a “communal area” where the larvae will feed and\n" +
                            "grow together1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Mexican Grass-carrying Wasp extends throughout the United States though less\n" +
                            "observations have been reported throughout the interior states2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: April to September2\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "STATUS: Native2\n" +
                            "Sources:\n" +
                            "1Holm, H. (2016). Meet the Grass-Carrying Wasp, a Gentle Pollinator of Summer Flowers. Retrieved 11\n" +
                            "\n" +
                            "February 2020 from https://www.houzz.com/magazine/meet-the-grass-carrying-wasp-a-gentle-\n" +
                            "pollinator-of-summer-flowers-stsetivw-vs~58817932\n" +
                            "\n" +
                            "2Mexican Grass-carrying Wasp (Isodontia mexicana). (n.d.) Retrieved 12 February, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/203340-Isodontia-mexicana",
                    "• Black body with pale hair\n" +
                            "• Narrow waist between thorax and abdomen\n" +
                            "• Often a brown spot between waist and first\n" +
                            "abdominal segment (T1)",
                    "SUMMER1\n" +
                            "American Spikenard, Aralia racemose\n" +
                            "Common Boneset, Eupatorium perfoliatum\n" +
                            "Rattlesnake Master, Eryngium yuccifolium\n" +
                            "LATE SUMMER AND FALL1\n" +
                            "Goldenrod, Solidago spp."),
        Insect("Millipedes", "(Chrysis angolensis)",
            R.drawable.millipedes_1,R.drawable.millipedes_2,R.drawable.millipedes_3,R.drawable.millipedes_4,
                    "Millipedes are multi-segmented and come in many sizes. They can be round or flat depending on the\n" +
                            "species. The smaller species remain around a quarter of an inch while the largest species grow up to 15\n" +
                            "inches long1\n" +
                            "\n" +
                            ". In North America, the longest species (Paeromopus paniculus) is a little over 6 inches2\n" +
                            ".\n" +
                            "Millipedes have two leg-pairs for each body segment (except for the first three) as opposed to centipedes\n" +
                            "which only have one leg-pair per segment3\n" +
                            "\n" +
                            ". Contrary to their name, Millipedes do not have 1,000 legs; at\n" +
                            "\n" +
                            "most, they may have up to 200 leg pairs1\n" +
                            "\n" +
                            ". When they walk, their legs move in a wave-like motion.\n" +
                            "Millipedes eat decaying vegetation, but a few species are known to be occasional carnivores2\n" +
                            "\n" +
                            ". Millipedes\n" +
                            "are valuable detritivores (organisms that eat dead or decaying organic material) because they cycle\n" +
                            "nutrients back into the environment faster than plants and animals do naturally1\n" +
                            "\n" +
                            ". They are also an\n" +
                            "important food source for other animals such as birds and toads. Millipedes can dry out easily and\n" +
                            "therefore prefer moist habitats1\n" +
                            "\n" +
                            ". This may lead them to be more active at night when it is cooler.\n" +
                            "While they are not known users of insect hotels, you may find a millipede hanging around nearby. They\n" +
                            "are more likely to be on the ground since that is where most of their food will be. Having rocks or a pile of\n" +
                            "wood provides perfect habitat for these important recyclers.\n" +
                            "Millipedes are found around the globe and throughout the United States4\n" +
                            "\n" +
                            ". Some species can live up to\n" +
                            "\n" +
                            "several years2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: March to October4\n" +
                            "CONSERVATION STATUS: Unknown\n" +
                            "Sources:\n" +
                            "1\n" +
                            "Interesting Facts about Millipedes. (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.terminix.com/blog/bug-facts/interesting-facts-about-millipedes/\n" +
                            "2Bartlett, T., Moisset, B., McLeod, R., Elliott, L., Wirth, C. C., Entz, C., Quinn, M., Belov, V., KenW, Hennen,\n" +
                            "D., & biosam. (2004). Class Diplopoda – Millipedes. Retrieved February 20, 2020 from\n" +
                            "https://bugguide.net/node/view/37\n" +
                            "3Millipede (Eurymerodesmus spp.). (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.insectidentification.org/insect-description.asp?identification=Millipede\n" +
                            "4Millipedes (Class Diplopoda). (n.d.). Retrieved February 20, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/47735-Diplopoda",
                    "• Armored body\n" +
                            "• Worm-like appearance; many body segments (25 – 100+)\n" +
                            "• Two leg-pairs per body segment",
                    "Millipedes are primarily detritivores and can typically be found in moist habitats (beneath rocks, leaf\n" +
                            "litter, etc.) with a higher activity at night."),
        Insect("Modest Masked Bee", "(Hylaeus modestus)",
            R.drawable.modest_masked_bee_1,R.drawable.modest_masked_bee_2,R.drawable.modest_masked_bee_3,R.drawable.modest_masked_bee_4,
                    "The Modest Masked Bee is a little different from other bees. The females are completely hairless; unlike\n" +
                            "their hairy cousins, these bees carry pollen internally inside stomach-like organs1\n" +
                            "\n" +
                            ". To make a nest, the\n" +
                            "females will find a pre-existing cavity (typically in wood) or pithy (a type of soft tissue in vascular plants)\n" +
                            "plant stem1\n" +
                            "\n" +
                            ". She’ll then build chambers for each egg using a combination of saliva and pith1\n" +
                            ". After\n" +
                            "prepping the chamber, she’ll gather pollen and return to the prepared nest, regurgitate the pollen, and\n" +
                            "lay an egg on top of it before capping off the chamber1\n" +
                            "\n" +
                            ". She’ll either repeat this process for the next\n" +
                            "\n" +
                            "chamber or close off the nest by capping the entrance with more pith and saliva.\n" +
                            "The range of the Modest Masked Bee extends throughout the eastern United States2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: May to September3\n" +
                            "STATUS: Native\n" +
                            "CONSERVATION STATUS: Secure4\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Modest Masked Bee (Hylaeus modestus). (n.d.). Retrieved February 23, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/199048-Hylaeus-modestus\n" +
                            "3Murray, T., Moisset, B., Quinn, M., Ascher, J. M., Schusteff, A., & Go, H. (2006). Retrieved February 22,\n" +
                            "2020 from https://bugguide.net/node/view/78945\n" +
                            "4Hylaeus modestus - Say, 1837. (n.d.) Retrieved February 22, 2020 from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?searchName=Hylaeus%20modestus\n" +
                            "5Hylaeus modestus Say, 1837. (n.d.). Retrieved February 22, 2020 from\n" +
                            "https://www.discoverlife.org/20/q?search=Hylaeus+modestus",
                    "• Hairless black body; yellow triangular markings on face\n" +
                            "• (male) Yellow clypeus (face)\n" +
                            "• Yellow spot or stripe on mid-leg",
                    "The Modest Masked Bee has been recorded on the following5\n" +
                            ":\n" +
                            "\n" +
                            "Maples, Acer spp.\n" +
                            "Yarrows, Achillea spp.\n" +
                            "Agalinis, Agalinis spp.\n" +
                            "False indigos, Amorpha spp.\n" +
                            "Wild celery, Angelica spp.\n" +
                            "Dogbane, Apocynum spp.\n" +
                            "Rockress, Arabis spp.\n" +
                            "Spikenard, Aralia spp.\n" +
                            "Goat’s Beard, Aruncus spp.\n" +
                            "\n" +
                            "H. modestus\n" +
                            "4.5mm to\n" +
                            "7 mm long\n" +
                            "\n" +
                            "Rhododendron, Azalea spp.\n" +
                            "Dwarf Chestnut, Castanea pumila\n" +
                            "California Lilac, Ceanothus spp.\n" +
                            "Chrysanthemum, Chrysanthemum spp.\n" +
                            "Dogwood, Cornus spp.\n" +
                            "Hawthorn, Crataegus spp.\n" +
                            "Spotted Cowbane, Cicuta maculata\n" +
                            "Wild carrot, Daucus carota\n" +
                            "Fleabane, Erigeron spp.\n" +
                            "Bonesets, Eupatorium spp.\n" +
                            "Avens, Geum spp.\n" +
                            "Cow Parsnip, Heracleum spp.\n" +
                            "Woodland bluet, Houstonia purpurea\n" +
                            "Hydrangea, Hydrangea spp.\n" +
                            "Mallow, Malva spp.\n" +
                            "Bee Balms, Monarda spp.\n" +
                            "Sweet Cicely, Osmorhiza spp.\n" +
                            "Parsnips, Pastinaca spp.\n" +
                            "Elm Tree, Ptelea spp.\n" +
                            "Mountain Mints, Pycnanthemum spp.\n" +
                            "Firethorns, Pyracantha spp.\n" +
                            "Sumac, Rhus spp.\n" +
                            "Rose, Rosa spp.\n" +
                            "Brambles, Rubus spp.\n" +
                            "Sanicula, Sanicula spp.\n" +
                            "Sium, Sium spp.\n" +
                            "Solidago, Solidago spp.\n" +
                            "Meadowsweets, Spiraea spp.\n" +
                            "Snowberry, Symphoricarpos spp.\n" +
                            "Pimpernels, Taenidia spp.\n" +
                            "Thaspium, Thaspium spp.\n" +
                            "Zizia, Zizia spp.\n" +
                            "The following species attract members from the genus Hylaeus. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Golden Alexanders, Zizea aurea\n" +
                            "Canada Anemone, Anemone canadensis\n" +
                            "Dogwood, Cornus spp.\n" +
                            "SUMMER\n" +
                            "Swamp Milkweed, Asclepias incarnata\n" +
                            "Boneset, Eupatorium perfoliatum\n" +
                            "Rattlesnake Master, Eryngium yuccifolium\n" +
                            "Prairie Onion, Allium stellatum\n" +
                            "\n" +
                            "Prairie Cinquefoil, Potentilla arguta\n" +
                            "Culver’s Root, Veronicastrum virginicum\n" +
                            "Obedient Plant, Physostegia virginiana\n" +
                            "American Spikenard, Aralia racemosa\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Wild Quinine, Parthenium integrifolium\n" +
                            "Large-leaved Aster, Eurybia macrophylla\n" +
                            "AUTUMN\n" +
                            "Stiff Goldenrod, Solidago rigida\n" +
                            "Blue Lobelia, Lobelia siphilitica\n" +
                            "Lindley’s Aster, Symphyotrichum ciliolatum"),
        Insect("Oblong wool Carder Bee", "(Anthidium oblongatum)",
            R.drawable.oblong_wool_carder_bee_1,R.drawable.oblong_wool_carder_bee_2,R.drawable.oblong_wool_carder_bee_3,R.drawable.oblong_wool_carder_bee_4,
                "The Oblong Wool Carder Bee was accidentally introduced to the U.S. from Europe in the 1990s1\n" +
                        ". Since\n" +
                        "then, they have expanded their range to include the Midwest and Eastern States. They can often be\n" +
                        "mistaken for wasps due to their bold yellow and black pattern. They are also strikingly alike to the\n" +
                        "European Wool Carder Bee. A distinct difference between the two is the tegula (the protective plate that\n" +
                        "covers the connection between the wings and the body of the bee). The Oblong Wool Carder Bee has an\n" +
                        "orange tegula while the European Wool Carder Bee’s is black. Their name comes from their behavior of\n" +
                        "scraping plant hairs for their nest materials, a process likened to wool carding. They nest in cavities found\n" +
                        "in wood, rocks, and hollow plants stems1\n" +
                        "\n" +
                        ". There can be up to eight cells within one nest, each containing\n" +
                        "\n" +
                        "a single egg and pollen ball1\n" +
                        "\n" +
                        "that the larva will eat as they develop.\n" +
                        "\n" +
                        "A. oblongatum\n" +
                        "8mm to\n" +
                        "11mm long\n" +
                        "\n" +
                        "SEASONALITY: May to September1\n" +
                        "STATUS: Invasive\n" +
                        "SOURCES: 1Burrows, S., Ritner, C., Christman, M., Spears, L., Smith-Pardo, A., Price, S., ... Redford, A.\n" +
                        "(2018, August). Anthidium oblongatum. Retrieved January 17, 2020, from\n" +
                        "http://idtools.org/id/bees/exotic/factsheet.php?name=16916",
                "• Black with distinct yellow pattern\n" +
                        "• Yellow jaws (mandibles) and legs\n" +
                        "• Orange tegula (the plate where wings connect to body)",
                "The following species attract members from the genus Anthidium. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "EARLY SUMMER\n" +
                        "Spiderwort, Tradescantia spp. (hairs from this plant are used as nesting material)\n" +
                        "Beardtongue, Penstemon spp.\n" +
                        "Coneflower, Echincaea spp.\n" +
                        "Scurfy Pea, Psoralea spp.\n" +
                        "Milkvetch, Astragalus spp.\n" +
                        "SUMMER\n" +
                        "Anise Hyssop, Agastache foeniculum\n" +
                        "Sagewort, Artemesia spp. (hairs from this plant are used as nesting material)\n" +
                        "Vervain, Verbena spp.\n" +
                        "Tickseed, Coreopsis spp.\n" +
                        "AUTUMN\n" +
                        "Goldenrod, Solidago and Euthamia spp.\n" +
                        "Aster, Symphyotrichum and Eurybia spp."),
        Insect("Orange-tipped Wood-digger Bee", "(Anthophora terminalis)",
            R.drawable.orange_tipped_wood_digger_bee_1,R.drawable.orange_tipped_wood_digger_bee_2,R.drawable.orange_tipped_wood_digger_bee_3,R.drawable.orange_tipped_wood_digger_bee_4,
                    "The Orange-tipped Wood-digger Bee is unique from other bees in the genus Anthophora in that it nests in\n" +
                            "pre-existing holes in logs or rotting wood1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Orange-tipped Wood-differ Bee extends throughout the north-eastern United States\n" +
                            "and some parts of southern Canada2\n" +
                            ".\n" +
                            "SEASONALITY: June to October\n" +
                            "CONSERVATION STATUS: Stable3\n" +
                            "STATUS: Native\n" +
                            "Sources:\n" +
                            "\n" +
                            "A. terminalis\n" +
                            "10mm to\n" +
                            "13.5 mm long\n" +
                            "\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Orange-tipped Wood-digger Bee (Anthophora terminalis). (n.d.). Retrieved February 10, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/198854-Anthophora-terminalis\n" +
                            "3Almquist, D. T. (2018). Anthophora terminalis – Cresson, 1869. Retrieved 10 February 2020 from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?searchName=Anthophora+terminalis\n" +
                            "4Anthophora terminalis Cresson, 1869. (n.d.) Retrieved February 10, 2020 from\n" +
                            "https://www.discoverlife.org/20/q?search=Anthophora+terminalis",
                    "• Black bee with orange-brown hair at end of abdomen\n" +
                            "• Pale bands that do not meet in middle on abdomen\n" +
                            "• Long, pale hair on hind legs\n" +
                            "• Pale face (males)",
                    "The Orange-tipped Wood-digger Bee has been recorded on the following4\n" +
                            ":\n" +
                            "\n" +
                            "Beabalms, Monarda spp.\n" +
                            "Beard-tongue, Pentstemon spp.\n" +
                            "Bluebell, Mertensia spp.\n" +
                            "Medick, Medicago spp\n" +
                            "Parrys Bellflower, Campanula parryi\n" +
                            "Richardsons Geranium, Geranium richardsonii\n" +
                            "Rose, Rosa spp.\n" +
                            "Heal-all, Prunella spp.\n" +
                            "Skullcaps, Scutellaria spp.\n" +
                            "Thistle, Cirsium spp.\n" +
                            "Wallflower, Erysimum spp.\n" +
                            "Wood mint, Blephilia spp.\n" +
                            "\n" +
                            "The following species attract members from the genus Anthophora. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017):\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Virginia Waterleaf, Hydrophyllum virginianum\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Beardtongue, Pentstemon spp.\n" +
                            "Wild Geranium, Geranium maculatum\n" +
                            "SUMMER\n" +
                            "Wild Bergamot, Monarda fistulosa\n" +
                            "Blue Lobelia, Lobelia siphilitica\n" +
                            "Monkey Flower, Mimulus ringens\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Dogbane, Apocynum spp.\n" +
                            "Thistle, Cirsium spp.\n" +
                            "Ironweed, Vernonia spp.\n" +
                            "Hoary Vervain, Verbena stricta"),
        Insect("Pugnacious Leafcutter Bee", "(Megachile pugnata)",
            R.drawable.pugnacious_leafcutter_bee_1,R.drawable.pugnacious_leafcutter_bee_2,R.drawable.pugnacious_leafcutter_bee_3,R.drawable.pugnacious_leafcutter_bee_4,
                    "The Pugnacious Leafcutter Bee gets part of its name from their behavior of cutting leaf parts with their\n" +
                            "mandibles (bee teeth) for their nests. The defining characteristic of this species is their shortened clypeus\n" +
                            "(face plate). They are a solitary bee that nests in pre-existing cavities in wood, rocks, or plant stems1\n" +
                            ". After\n" +
                            "finding a nesting suitable site, the female uses her large mandibles to cut leaves and build chambers for\n" +
                            "each of her eggs, starting with the chamber the furthest away from the opening1\n" +
                            "\n" +
                            ". She deposits a single\n" +
                            "egg atop a bundle of pollen (and sometimes nectar) that will feed the developing larva. The female then\n" +
                            "seals off the chamber and repeats this process, each time leaving one egg and food bundle per chamber\n" +
                            "and sealing it off with plant material.\n" +
                            "Leafcutter Bees in the Midwest and Northeast U.S. typically emerge in late spring or early summer1\n" +
                            ". They\n" +
                            "immediately seek a mate and search for nesting sites to prepare the next generation, which will\n" +
                            "overwinter and emerge in the next season1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Pugnacious Leafcutter Bee extends throughout the United States3\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: June to October3\n" +
                            "CONSERVATION STATUS: secure4\n" +
                            "STATUS: native\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Moisset, B., Cotinis, Ascher, J. S., & Go, H. (2006). Species Megachile mendica – Flat-tailed Leaf-cutter\n" +
                            "Bee. Retrieved February 29, 2020 from https://bugguide.net/node/view/81669\n" +
                            "3Pugnacious Leafcutter Bee (Megachile pugnata). (n.d.). Retrieved February 29, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/198850-Megachile-pugnata\n" +
                            "4\n" +
                            "Schweitzer, D. F. (2015). Megachile pugnata – Say, 1837. Retrieved February 29, 2020 from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?searchName=Megachile+pugnata\n" +
                            "5Megachile pugnata Say, 1837. (n.d.). Retrieved February 29, 2020 from\n" +
                            "https://www.discoverlife.org/mp/20q?search=Megachile+pugnata#Hosts",
                    "• Face (clypeus) extremely shortened\n" +
                            "• (female) entirely black body\n" +
                            "• (female) Pale yellow hairs underneath abdomen (scopa)",
                    "The Pugnacious Leafcutter Bee has been recorded on the following5\n" +
                            ":\n" +
                            "\n" +
                            "Thistles, Cirsium spp.\n" +
                            "Coneflower, Echinacea spp.\n" +
                            "Fleabane, Erigeron spp.\n" +
                            "Gumwood, Grindelia spp.\n"+
                            "Sunflower, Helianthus spp.\n" +
                            "Smooth Oxeye, Heliopsis helianthoides\n" +
                            "Deerberry, Vaccinium stamineum\n" +
                            "... the full list can be viewed found in the Discover Life link in the source list.\n" +
                            "\n" +
                            "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "COMMON PLANTS USED FOR NESTING MATERIAL\n" +
                            "Tick Trefoils, Desmodium spp.\n" +
                            "Roses, Rosa spp.\n" +
                            "St. John’s Wort, Hypericum spp.\n" +
                            "Ash, Fraxinus spp.\n" +
                            "Eastern Redbud, Cercis canadensis\n" +
                            "\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Wild Indigo, Baptisia spp.\n" +
                            "Coneflower, Echinacea spp.\n" +
                            "Beardtongue, Penstemon spp.\n" +
                            "Canada Anemone, Anemone canadensis\n" +
                            "Balsam Ragwort, Packera paupercula\n" +
                            "FALL\n" +
                            "Yellow Coneflower, Ratibida pinnata\n" +
                            "Black-eyed Susan, Rudbeckia hirta\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Joe Pye Weed, Eutrochium spp.\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "Anise Hyssop, Agastache foeniculum\n" +
                            "Prairie Onion, Allium stellatum\n" +
                            "Tick Trefoil, Desmodium spp.\n" +
                            "Blazingstar, Liatris spp.\n" +
                            "Vervain, Verbena spp.\n" +
                            "Prairie Clover, Dalea spp.\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Aster, Symphyotrichum spp."),
        Insect("Pure Green Sweat Bee", "(Augochlora pura)",
            R.drawable.pure_green_sweat_bee_1,R.drawable.pure_green_sweat_bee_2,R.drawable.pure_green_sweat_bee_3,R.drawable.pure_green_sweat_bee_4,
                "The Pure Green Sweat Bees is a small, typically iridescent green bee that visits a wide variety of flowers1\n" +
                        ".\n" +
                        "\n" +
                        "The female makes her nest underneath bark or in pre-existing holes in rotting trees1, 2\n" +
                        "\n" +
                        ". The female uses\n" +
                        "\n" +
                        "mud and debris found in or near the stumps to create her nest1\n" +
                        "\n" +
                        ". She provisions the nest with pollen,\n" +
                        "\n" +
                        "nectar, and some of her saliva which may have antiseptic qualities1\n" +
                        "\n" +
                        ". The eggs she lay develop and hatch in\n" +
                        "\n" +
                        "the summer before pupating and emerging as adults later in the summer or fall1\n" +
                        "\n" +
                        ". Pure Green Sweat Bees\n" +
                        "\n" +
                        "mate in the fall1\n" +
                        "\n" +
                        ". Males will die shortly after mating1\n" +
                        "\n" +
                        ", but the females will continue to forage and prepare\n" +
                        "\n" +
                        "for overwintering in a rotten log or cavity in a wood stump2\n" +
                        "\n" +
                        ". Overwintering females emerge in the spring\n" +
                        "and establish a nest shortly after. Pure Green Sweat Bees will have between two or three generations\n" +
                        "each year.2\n" +
                        "The range of the Pure Green Sweat Bee covers the eastern United States and southeast Canada3\n" +
                        ". While\n" +
                        "they do not use insect hotels, Pure Green Sweat Bees are important generalist pollinators in many\n" +
                        "habitats including eastern deciduous forests; they may also be one of the few pollinators of walnut4\n" +
                        ".\n" +
                        "\n" +
                        "SEASONALITY: April to October1\n" +
                        "CONSERVATION STATUS: Unknown\n" +
                        "STATUS: Native\n" +
                        "Sources: 1Moisset, B. & Wojcik, V. (n.d.). The Pure Golden Green Sweat Bee (Augochlora pura). Retrieved\n" +
                        "\n" +
                        "January 19, 2020 from https://www.fs.fed.us/wildflowers/pollinators/pollinator-of-the-\n" +
                        "month/augochlora_pura.shtml\n" +
                        "\n" +
                        "2Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                        "Press LLC.\n" +
                        "3Pure Green Sweat Bee (Augochlora pura). (n.d.) Retrieved January 19, 2020 from\n" +
                        "https://www.inaturalist.org/observations?place_id=any&taxon_id=82523\n" +
                        "4\n" +
                        "Short, C. A. & Lucky, A. (2018, September). common name: pure gold-green sweat bee (suggested\n" +
                        "common name) scientific name: Augochlora pura (Say 1837) (Insecta: Hymenoptera: Halictidae:\n" +
                        "Halictinae). Retrieved January 19, 2020 from\n" +
                        "http://entnemdept.ufl.edu/creatures/MISC/BEES/Augochlora_pura.html",
                "• Bright green/golden body\n" +
                        "• Dark brown wings and tegula\n" +
                        "(plate where wing connects to body)\n" +
                        "• Curved basal vein in forewing*",
                "Information obtained from Bees: An Identification and Native Plant Forage Guide (Holm 2017):\n" +
                        "COMMON FORAGE PLANTS:\n" +
                        "\n" +
                        "A. pura\n" +
                        "5mm to\n" +
                        "9mm long\n" +
                        "\n" +
                        "SPRING\n" +
                        "Ragwort, Packera spp.\n" +
                        "Beardtongue, Penstemon spp.\n" +
                        "SUMMER\n" +
                        "Milkweed, Asclepias spp.\n" +
                        "Smooth Oxeye, Heliopsis helianthoides\n" +
                        "Black-Eyed Susan, Rudbeckia spp.\n" +
                        "Purple Prairie Clower, Dalea purpurea\n" +
                        "Common Yarrow, Achillea millefolium\n" +
                        "AUTUMN\n" +
                        "Aster, Symphyotrichum spp.\n" +
                        "Goldenrod, Solidago spp.\n" +
                        "Sneezeweed, Helenium autumnale"),
        Insect("Scaly Bee Fly", "(Lepidophora lepidocera)",
            R.drawable.scaly_bee_fly_1,R.drawable.scaly_bee_fly_2,R.drawable.scaly_bee_fly_3,R.drawable.scaly_bee_fly_4,
                "The Scaly Bee Fly is an early spring visitor that feeds on nectar as an adult1\n" +
                        "\n" +
                        ". Adult females fly early in the\n" +
                        "\n" +
                        "season to find the tunnels of solitary bee nests that haven’t been sealed off yet1\n" +
                        "\n" +
                        ". When the female bee or\n" +
                        "wasp leaves her burrow unattended, the female Scaly Bee Fly will hover in front of the burrow and\n" +
                        "deposit an egg by flicking her abdomen1\n" +
                        "\n" +
                        ". The resulting larva will consume the bee or wasp larva1, 2 and are\n" +
                        "\n" +
                        "thus considered parasitoids of cavity nesting bees and wasps.\n" +
                        "The range of the Scaly Bee Fly is scattered throughout the eastern United States3\n" +
                        ".\n" +
                        "\n" +
                        "L. lepidocera\n" +
                        "10 mm\n" +
                        "\n" +
                        "SEASONALITY: May through November3\n" +
                        "CONSERVATION STATUS: Unknown\n" +
                        "STATUS: Native\n" +
                        "Sources: 1Bee Fly – Lepidophora lepidocera. (n.d.). Retrieved January 18, 2020 from\n" +
                        "https://www.cirrusimage.com/flies_bee_lepidophora_lepidocera/\n" +
                        "2\n" +
                        "Iowa State University. (n.d.) Species Lepidophora lepidocera. Retrieved January 18, 2020 from\n" +
                        "https://bugguide.net/node/view/2770\n" +
                        "3\n" +
                        "Scaly Bee Fly (Lepidophora lepidocera). (n.d.). Retrieved January 18, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/319147-Lepidophora-lepidocera",
                "• Hump-back shape\n" +
                        "• Pale white or yellow scales\n" +
                        "• Dark wings\n" +
                        "• Fringe at end of abdomen",
                "The Scaly Bee Fly has been recorded on the following2\n" +
                        ":\n" +
                        "Mountain Mint, Pycnanthemum virginianum\n" +
                        "Black-eyed Susan, Rudbeckia hirta\n" +
                        "Goldenrod, Solidago spp.\n" +
                        "Bushy Aster, Symphyotrichum dumosum"),
        Insect("Sculptured Resin Bee", "(Megachile sculpturalis)",
            R.drawable.sculptured_resin_bee_1,R.drawable.sculptured_resin_bee_2,R.drawable.sculptured_resin_bee_3,R.drawable.sculptured_resin_bee_4,
                "The Sculptured Resin Bee is native to Japan and Asia and was first introduced to the U.S. on accident in\n" +
                        "North Carolina in the 1990s1,2\n" +
                        "\n" +
                        ". It is a large bee compared to other native species and may be mistaken for\n" +
                        "the Eastern Carpenter bee (x. virginica), but the presence of hairs beneath the abdomen and the absence\n" +
                        "of a corbicula (pollen basket on the hind-leg) can help distinguish the two species.\n" +
                        "\n" +
                        "M.\n" +
                        "sculpturalis\n" +
                        "14mm to\n" +
                        "24mm long\n" +
                        "\n" +
                        "The Sculptured Resin Bee nests in pre-existing cavities left behind by carpenter bees or other animals1\n" +
                        ". It\n" +
                        "\n" +
                        "will not excavate its own nest3\n" +
                        "\n" +
                        ". After finding a suitable nesting site, the female collects sap and/or resin to\n" +
                        "\n" +
                        "prepare the nest cavity3\n" +
                        "\n" +
                        ". Like other bees in the Megachilidae family, the female Sculptured Resin Bee\n" +
                        "\n" +
                        "collects pollen underneath her abdomen on modified hairs known as scopa. She will make several pollen-\n" +
                        "collecting trips before laying an egg on top of the collected pollen ball inside the nest cavity3\n" +
                        "\n" +
                        ". The\n" +
                        "chamber containing the pollen ball and egg will be sealed with resin, mud, or wood and the female will\n" +
                        "continue to construct up to ten chambers in this fashion (depending on the length of the cavity)3\n" +
                        ". The\n" +
                        "\n" +
                        "nest entrance may be capped with resin, wood, mud, or a mixture of the three3\n" +
                        "\n" +
                        ". The eggs will hatch into\n" +
                        "larva, eat the pollen, and overwinter before pupating the following spring and emerging as adults in the\n" +
                        "summer3\n" +
                        ".\n" +
                        "Sculptured Resin Bees are known pollinators of kudzu, an invasive vine from Asia3\n" +
                        ".\n" +
                        "\n" +
                        "The range of the Sculptured Resin Bee has expanded since its introduction. It can now be found\n" +
                        "throughout the eastern U.S. and has been recorded as far west as Nebraska and Texas1\n" +
                        ".\n" +
                        "\n" +
                        "SEASONALITY: May to October1\n" +
                        "STATUS: Invasive\n" +
                        "Sources:\n" +
                        "1\n" +
                        "Sculptured Resin Bee (Megachile sculpturalis). (n.d.). Retrieved February 8, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/52785-Megachile-sculpturalis\n" +
                        "2Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                        "Press LLC.\n" +
                        "3Moisset, M., Boone, M., Entz, C., Ascher, J., Belov, V., and Go, H. (2005). Species Megachile sculpturalis -\n" +
                        "Sculptured Resin Bee. Retrieved February 8, 2020 from https://bugguide.net/node/view/15541\n" +
                        "4Megachile sculpturalis Smith, 1853. (n.d.) Retrieved February 8, 2020 from\n" +
                        "https://www.discoverlife.org/mp/20q?search=Megachile+sculpturalis#Hosts",
                "• Auburn hair on thorax and first abdominal segment\n" +
                        "• Black, hairless abdomen with noticeable pits (like a golfball)\n" +
                        "• Dark transparent wings\n" +
                        "• Large jaw (mandibles)",
                "The Sculptured Resin Bee has been found to forage on the following4\n" +
                        ":\n" +
                        "\n" +
                        "Broad-Leaved Everlasting-Pea, Lathyrus latifolius L.\n" +
                        "Butterfly Bush, Buddleia spp.\n" +
                        "Golden Raintree, Koelreuteria paniculata\n" +
                        "Japanese Pagoda Tree, Styphnolobium japonicum\n" +
                        "Mountain Mints, Pycnanthemum spp.\n" +
                        "Perovskia, Perovskia spp.\n" +
                        "Purple Loosestrife, Lythrum salicaria L.\n" +
                        "\n" +
                        "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "COMMON PLANTS USED FOR NESTING MATERIAL\n" +
                        "Tick trefoils, Desmodium spp.\n" +
                        "\n" +
                        "Roses, Rosa spp.\n" +
                        "St. John’s wort, Hypericum spp.\n" +
                        "Ash, Fraxinus spp.\n" +
                        "Eastern redbud, Cercis canadensis\n" +
                        "SPRING\n" +
                        "Golden Alexanders, Zizia aurea\n" +
                        "Harebell, Campanula rotundifolia\n" +
                        "Wild Indigo, Baptisia spp.\n" +
                        "Coneflower, Echinacea spp.\n" +
                        "Beardtongue, Penstemon spp.\n" +
                        "Canada Anemone, Anemone canadensis\n" +
                        "Balsam Ragwort, Packera paupercula\n" +
                        "SUMMER\n" +
                        "Yellow Coneflower, Ratibida pinnata\n" +
                        "Black-eyed Susan, Rudbeckia hirta\n" +
                        "Milkweed, Asclepias spp.\n" +
                        "Joe Pye Weed, Eutrochium spp.\n" +
                        "Tickseed, Coreopsis spp.\n" +
                        "Anise Hyssop, Agastache foeniculum\n" +
                        "Prairie Onion, Allium stellatum\n" +
                        "Tick Trefoil, Desmodium spp.\n" +
                        "Blazingstar, Liatris spp.\n" +
                        "Vervain, Verbena spp.\n" +
                        "Prairie Clover, Dalea spp.\n" +
                        "Leadplant, Amorpha canescens\n" +
                        "AUTUMN\n" +
                        "Goldenrod, Solidago spp.\n" +
                        "Aster, Symphyotrichum spp."),
        Insect("Silver-tailed Petalcutter Bee", "(Megachile montivaga)",
            R.drawable.silver_tailed_petalcutter_bee_1,R.drawable.silver_tailed_petalcutter_bee_2,R.drawable.silver_tailed_petalcutter_bee_3,R.drawable.silver_tailed_petalcutter_bee_4,
                    "Part of the Silver-tailed Petalcutter Bee’s name comes from their behavior of using their mandibles (bee\n" +
                            "teeth) to cut flower petals for lining their nests. They are a solitary bee that nests in pre-existing cavities\n" +
                            "in wood, rocks, or plant stems1\n" +
                            "\n" +
                            ". After finding a suitable nesting site, the female uses her large mandibles\n" +
                            "to cut petals and build chambers for each of her eggs, starting with the chamber the furthest away from\n" +
                            "the opening1\n" +
                            "\n" +
                            ". She deposits a single egg atop a bundle of pollen (and sometimes nectar) that will feed the\n" +
                            "developing larva. The female then seals off the chamber and repeats this process, each time leaving one\n" +
                            "egg and food bundle per chamber and sealing it off with petals.\n" +
                            "Leafcutter Bees in the Midwest and Northeast U.S. typically emerge in late spring or early summer1\n" +
                            ". They\n" +
                            "immediately seek a mate and search for nesting sites to prepare the next generation, which will\n" +
                            "overwinter and emerge in the next season1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Silver-tailed Petalcutter Bee is interspersed throughout the United States2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: April to September2\n" +
                            "CONSERVATION STATUS: unknown\n" +
                            "STATUS: native\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2\n" +
                            "Silver-tailed Petalcutter Bee (Megachile montivaga). (n.d.). Retrieved February 29, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/199130-Megachile-montivaga\n" +
                            "3Megachile montivaga Cresson 1878. (n.d.) Retrieved March 1, 2020 from\n" +
                            "https://www.discoverlife.org/20/q?search=Megachile+montivaga",
                    "• Terminal (end) abdominal segment concave when " +
                            "viewed from side\n" +
                            "• (female) entirely black body\n" +
                            "• (female) Pale hairs underneath abdomen (scopa)",
                    "The Silver-tailed Petalcutter Bee has been recorded on the following3\n" +
                            ":\n" +
                            "\n" +
                            "Thistles, Cirsium spp.\n" +
                            "Fleabane, Erigeron spp.\n" +
                            "Gumwood, Grindelia spp.\n" +
                            "Sunflower, Helianthus spp.\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "... the full list can be viewed found in the Discover Life link in the source list.\n"+
                            "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "COMMON PLANTS USED FOR NESTING MATERIAL\n" +
                            "Tick Trefoils, Desmodium spp.\n" +
                            "Roses, Rosa spp.\n" +
                            "St. John’s Wort, Hypericum spp.\n" +
                            "Ash, Fraxinus spp.\n" +
                            "Eastern Redbud, Cercis canadensis\n" +
                            "\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Wild Indigo, Baptisia spp.\n" +
                            "Coneflower, Echinacea spp.\n" +
                            "Beardtongue, Penstemon spp.\n" +
                            "Canada Anemone, Anemone canadensis\n" +
                            "Balsam Ragwort, Packera paupercula\n" +
                            "FALL\n" +
                            "Yellow Coneflower, Ratibida pinnata\n" +
                            "Black-eyed Susan, Rudbeckia hirta\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Joe Pye Weed, Eutrochium spp.\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "Anise Hyssop, Agastache foeniculum\n" +
                            "Prairie Onion, Allium stellatum\n" +
                            "Tick Trefoil, Desmodium spp.\n" +
                            "Blazingstar, Liatris spp.\n" +
                            "Vervain, Verbena spp.\n" +
                            "Prairie Clover, Dalea spp.\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Aster, Symphyotrichum spp."),
        Insect("Small Carpenter Bees", "(Ceratina spp.)",
            R.drawable.small_carpenter_bees_1,R.drawable.small_carpenter_bees_2,R.drawable.small_carpenter_bees_3,R.drawable.small_carpenter_bees_4,
                    "Small Carpenter Bees are tiny, metallic bees often with a white spot/stripe (female) or inverted T (male)\n" +
                            "on their face (clypeus)1\n" +
                            "\n" +
                            ". They nest in cavities that are filled with pith (soft tissue inside a vascular plant),\n" +
                            "\n" +
                            "woody stems, or sometimes rotting wood1\n" +
                            "\n" +
                            ". Females that have overwintered will mate in the spring and\n" +
                            "\n" +
                            "begin a nest by excavating a suitable site1\n" +
                            "\n" +
                            ". The females prefer a nearly vertical nest site and will use her\n" +
                            "\n" +
                            "mandibles to chew through pith to create a long tunnel1\n" +
                            "\n" +
                            ". She will then begin stocking the tunnel with\n" +
                            "pollen and nectar from multiple foraging trips using the fine hairs on her back legs (hind-tibia) to carry the\n" +
                            "provisions1\n" +
                            ". After enough food has been collected, she will deposit the pollen at the end of her nest and\n" +
                            "lay a single egg on top of it. She will then close-off the chamber by creating a wall of pith1\n" +
                            "\n" +
                            ". She repeats\n" +
                            "this process of collecting pollen, laying eggs, and sealing each chamber before sealing the entrance to the\n" +
                            "entire nest. The female will guard her completed nest until her young (progeny) emerge2\n" +
                            ".\n" +
                            "\n" +
                            "Providing habitat for Small Carpenter Bees is easy. Plant a native perennial garden with tall flower stalks.\n" +
                            "In the fall and winter, leave the dead stems standing. Once the spring comes, cut the stalks to about 15\n" +
                            "inches above the ground and leave the flower heads1\n" +
                            "\n" +
                            ". That is all that is required! Be on the lookout for\n" +
                            "signs of excavated stalks. As the season continues, new growth will fill in and hide the old stalks which will\n" +
                            "naturally degrade as the season continues1\n" +
                            ".\n" +
                            "\n" +
                            "The range of Small Carpenter Bees extends around the globe and throughout the United States3\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: April to November3\n" +
                            "EASTERN US AND CANADA: 5 species1\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Grissell, E. E. & Sanford, M. T. (1999). common name: small carpenter bees scientific name: Ceratina spp.\n" +
                            "(Insecta: Hymenoptera: Apidae: Xylocopinae). Retrieved February 27, 2020 from\n" +
                            "http://entnemdept.ufl.edu/creatures/misc/bees/ceratina.htm\n" +
                            "3\n" +
                            "Small Carpenter Bees (Genus Ceratina). (n.d.). Retrieved February 27, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/155108-Ceratina",
                    "• Hourglass shape\n" +
                            "• Metallic, relatively hairless body\n" +
                            "• Barrel abdomen that narrows to a near point",
                    "The following species attract members from the genus Ceratina. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017):\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Wild Geranium, Geranium maculatum\n" +
                            "Spiderwort, Tradescantia spp.\n" +
                            "Hepatica, Anemone spp.\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Beardtongue, Penstemon spp.\n" +
                            "Violets, Viola spp.\n" +
                            "Blue-Eyed Grass, Sisyrinchium spp.\n" +
                            "Bloodroot, Sanguinaria canadensis\n" +
                            "Wild Rose, Rosa spp.\n" +
                            "Ragwort, Packera spp.\n" +
                            "Willow, Salix spp.\n" +
                            "SUMMER\n" +
                            "Vervain, Verbena spp.\n" +
                            "Butterfly Milkweed, Asclepias tuberosa\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "Blue Lobelia, Lobelia siphilitica\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Aster, Symphyotrichum spp.\n" +
                            "Sneezeweed, Helenium autumnale"),
        Insect("Small Mason Bees", "(Hoplitis spp.)",
            R.drawable.small_mason_bees_1,R.drawable.small_mason_bees_2,R.drawable.small_mason_bees_3,R.drawable.small_mason_bees_4,
                "Small Mason Bees are solitary bees that emerge as adults in late spring or early summer1\n" +
                        "\n" +
                        ". After mating\n" +
                        "\n" +
                        "with a male, the female searches for a nesting site in a pithy flower stalk or woody stem1\n" +
                        "\n" +
                        ". Pith refers to a\n" +
                        "\n" +
                        "type of soft tissue inside the stems of vascular plants2\n" +
                        "\n" +
                        ". Small Mason Bee females supply their nesting\n" +
                        "cavity with pollen and nectar before laying a single egg with the food bundle. The females then use their\n" +
                        "mandibles (bee teeth) to cut and gather plant pith or chewed leaves to block off the cell and either make\n" +
                        "another chamber for a new egg or seal the entrance to the nest1\n" +
                        "\n" +
                        ". The larvae develop over the summer\n" +
                        "Hoplitis spp.\n" +
                        "4mm to\n" +
                        "14mm long\n" +
                        "\n" +
                        "before spinning a cocoon and overwintering as prepupae1\n" +
                        "\n" +
                        ". They will finish pupating in the spring and\n" +
                        "\n" +
                        "emerge as adults1\n" +
                        ".\n" +
                        "\n" +
                        "The range of the Small Mason Bee genus extends throughout the continental US into Canada3\n" +
                        ". They are\n" +
                        "\n" +
                        "also found in Europe, Africa, and Asia3\n" +
                        ".\n" +
                        "SEASONALITY: April to August3\n" +
                        "EASTERN US AND CANADA: 10 species1\n" +
                        "CONSERVATION STATUS: Unknown\n" +
                        "Sources: 1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN:\n" +
                        "Pollination Press LLC.\n" +
                        "2pith. (n.d.) Retrieved January 23, 2020 from https://www.merriam-webster.com/dictionary/pith\n" +
                        "3\n" +
                        "Small Mason Bees (Genus Hoplitis). (n.d.) Retrieved January 23, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/177785-Hoplitis",
                "• Black with few hairs on head and thorax\n" +
                        "• White hair bands on abdomen that do not meet in middle\n" +
                        "• Light blue or green colored eyes (common)1",
                "Information obtained from Bees: An Identification and Native Plant Forage Guide (Holm 2017):\n" +
                        "COMMON FORAGE PLANTS\n" +
                        "SPRING/EARLY SUMMER\n" +
                        "Harebell, Campanula rotundifolia\n" +
                        "Beardtongue, Penstemon spp.\n" +
                        "Wild rose, Rosa spp.\n" +
                        "SUMMER\n" +
                        "Leadplant, Amorpha canescens\n" +
                        "Hoary Vervain, Verbena stricta\n" +
                        "Wild Bergamot, Monarda fistulosa"),
        Insect("Small Resin Bees", "(Heriades spp.)",
            R.drawable.small_resin_bees_1,R.drawable.small_resin_bees_2,R.drawable.small_resin_bees_3,R.drawable.small_resin_bees_4,
                    "Small Resin Bees are solitary bees that make their nest in a wooden cavity or stem1\n" +
                            "\n" +
                            ". Once a female finds a\n" +
                            "suitable nest site, she collects resin from plants and begins building chambers for each of her eggs2\n" +
                            ". She\n" +
                            "will go on several trips to collect pollen using specialized hairs beneath her abdomen known as scopa.\n" +
                            "This pollen will later serve as the food source for the bee larva as it develops. After collecting enough\n" +
                            "pollen, the female will return to the nest-cavity, roll the pollen into a ball at the furthest end, and deposit\n" +
                            "a single egg on top of it. She then seals the chamber with resin and will either close off the entrance to\n" +
                            "the nest or continue making more chambers with a pollen ball and egg.\n" +
                            "Small Resin Bees are found on every continent except Australia and South America2\n" +
                            "\n" +
                            ". Their range extends\n" +
                            "\n" +
                            "throughout the United States3\n" +
                            ".\n" +
                            "SEASONALITY: Late May to October1\n" +
                            "EASTERN US AND CANADA: 4 species1\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Burrows, S., Ritner, C., Christman, M., Spears, L., Smith-Pardo, A., Price, S., Ramirez, R., Griswold, T., &\n" +
                            "Redford, A. (2018). Retrieved February 25, 2020 from\n" +
                            "http://idtools.org/id/bees/exotic/factsheet.php?name=16626\n" +
                            "3Resin Bees (Genus Heriades). (n.d.). Retrieved February 25, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/124222-Heriades",
                    "• Round, constricted-looking abdomen; narrow white bands on rim\n" +
                            "• Coarsely-pitted thorax and abdomen (like a golf ball)\n" +
                            "• (males) end of abdomen rounded downward",
                    "Information obtained from Bees: An Identification and Native Plant Forage Guide (Holm 2017):\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "EARLY SUMMER\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "SUMMER\n" +
                            "Wild Bergamot, Monarda fistulosa\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "New Jersey Tea, Ceanothus americanus\n" +
                            "Wild Quinine, Parthenium integrifolium\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "Anise Hyssop, Agastache foeniculum\n" +
                            "Dogbane, Apocynum spp.\n" +
                            "Fleabane, Erigeron spp.\n" +
                            "Sunflower, Helianthus spp.\n" +
                            "Smooth Oxeye, Heliopsis helianthoides\n" +
                            "Ironweed, Vernonia spp.\n" +
                            "Coneflower, Ratibida spp.\n" +
                            "Nodding Onion, Allium cernuum"),
        Insect("Small Sweat Bees", "(Lasioglossum spp.)",
            R.drawable.small_sweat_bees_1,R.drawable.small_sweat_bees_2,R.drawable.small_sweat_bees_3,R.drawable.small_sweat_bees_4,
                    "The Small Sweat Bee genus is the largest bee genus on the planet1\n" +
                            "\n" +
                            ". Depending on the species, there can\n" +
                            "\n" +
                            "be up to three generations in a single year2\n" +
                            "\n" +
                            ". Females that mate in the Autumn will overwinter and, in the\n" +
                            "\n" +
                            "spring, start either a social or solitary nest2\n" +
                            "\n" +
                            ". A few species in the subgenus Dialictus will nest in rotting\n" +
                            "\n" +
                            "wood or cavities2\n" +
                            "\n" +
                            ". These Small Sweat Bees are dark brown, gray, black, or metallic, uniformly hairy, and\n" +
                            "\n" +
                            "lack prominent white hair bands on their abdomen2\n" +
                            ".\n" +
                            "\n" +
                            "The “larger” Small Sweat Bees (non-Dialictus, Lasioglossum spp.) resemble Sweat Bees (Halictus spp.)2\n" +
                            ".\n" +
                            "The main visible difference between the two groups is the location of the white hair bands. In\n" +
                            "Lasioglossum spp., the hair band is at the base (top) of the abdominal segment (terga)2\n" +
                            "\n" +
                            ". In Halictus spp.,\n" +
                            "\n" +
                            "the hair band is at the apical (bottom or end) of each abdominal segment (terga).2" +
                            "Small Sweat Bees frequently visit flowers but go unnoticed due to their tiny size3\n" +
                            "\n" +
                            ". Their range extends\n" +
                            "\n" +
                            "around the globe and throughout the United States4\n" +
                            ".\n" +
                            "SEASONALITY: Mid-March to Late October2\n" +
                            "EASTERN US AND CANADA: 126 species2\n" +
                            "Sources:\n" +
                            "1\n" +
                            "Laioglossum. (n.d.). Retrieved February 26, 2020 from\n" +
                            "https://en.wikipedia.org/wiki/Lasioglossum#cite_note-1\n" +
                            "2Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "3\n" +
                            "Leung, R., Moisset B., Quinn, M., Ascher, J. S., Block, N., Belov, V., Hess, M. (2004). Genus Lasioglossum.\n" +
                            "Retrieved February 26, 2020 from https://bugguide.net/node/view/9033\n" +
                            "4Genus: Lasioglossum. (n.d.). Retrieved February 26, 2020 from https://www.inaturalist.org/taxa/57678-\n" +
                            "Lasioglossum",
                    "• Uniformly hairy\n" +
                            "• (subgenus Dialictus) dark brown, gray, black, or metallic\n" +
                            "• (some species) prominent white basal (base of) abdominal hair bands",
                    "Information obtained from Bees: An Identification and Native Plant Forage Guide (Holm 2017):\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Bloodroot, Sanguinaria canadensis\n" +
                            "Wild Geranium, Geranium maculatum\n" +
                            "Bishop’s Cap, Mitella diphylla\n" +
                            "Wild Columbine, Aquilegia canadensis\n" +
                            "Pasque Flower, Anemone patens\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Violet, Viola spp.\n" +
                            "Jacob’s Ladder, Polemonium reptans\n" +
                            "Prairie Alumroot, Heuchera richardsonii\n" +
                            "Marsh Marigold, Caltha palustris\n" +
                            "Serviceberry, Amelanchier spp.\n" +
                            "Dogwood, Cornus spp.\n" +
                            "American Plum, Prunus Americana\n" +
                            "Prickly Ash, Zanthoxylum americanum\n" +
                            "Lance-leaf Figwort, Scrophularia lanceolate\n" +
                            "SUMMER\n" +
                            "Spotted Beebalm, Monarda punctata\n" +
                            "Culver’s Root, Veronicasturm virginicum\n" +
                            "Boneset, Eupatorium perfoliatum\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Spiderwort, Tradescantia spp.\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "Swamp Milkweed, Asclepias incarnata\n" +
                            "Whorled Loosestrife, Lysimachia ciliata\n" +
                            "\n" +
                            "Rattlesnake Master, Eryngium yuccifolium\n" +
                            "Obedient Plant, Physostegia virginiana\n" +
                            "Smooth Sumac, Rhus glabra\n" +
                            "Bush Honeysuckle, Diervilla lonicera\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago and Euthamia spp.\n" +
                            "Aster, Symphyotrichum and Eurybia spp."),
        Insect("Small-Handed Leafcutter Bee", "(Megachile gemula)",
            R.drawable.small_handed_leafcutter_bee_1,R.drawable.small_handed_leafcutter_bee_2,R.drawable.small_handed_leafcutter_bee_3,R.drawable.small_handed_leafcutter_bee_4,
                    "The Small-handed Leafcutter Bee gets part of its name from their behavior of cutting leaf parts with their\n" +
                            "mandibles (bee teeth) for their nests. They are solitary bees that nest in hollowed twigs or logs2\n" +
                            ". After\n" +
                            "finding a suitable nesting site, the female uses her large mandibles to cut leaves and build chambers for\n" +
                            "each of her eggs, starting with the chamber the furthest away from the opening1\n" +
                            "\n" +
                            ". She deposits a single\n" +
                            "egg atop a bundle of pollen (and sometimes nectar) that will feed the developing larva. The female then\n" +
                            "seals off the chamber and repeats this process, each time leaving one egg and food bundle per chamber\n" +
                            "and sealing it off with plant material.\n" +
                            "Leafcutter Bees in the Midwest and Northeast U.S. typically emerge in late spring or early summer1\n" +
                            ". They\n" +
                            "immediately seek a mate and search for nesting sites to prepare the next generation, which will\n" +
                            "overwinter and emerge in the next season1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Small-handed Leafcutter Bee extends throughout the U.S. though many public records\n" +
                            "have been submitted predominantly in the northeast U.S. and southeast Canada3,4\n" +
                            "SEASONALITY: June to August3\n" +
                            "CONSERVATION STATUS: Secure5\n" +
                            "STATUS: native\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Gibbs, J. (2017). Notes on the Nests of Augochloropsis metallica fulgida and Megachile mucida in Central\n" +
                            "Michigan (Hymenoptera: Halictidae, Megachilidae). The Great Lakes Entomologist, 50(1). Retrieved March\n" +
                            "4, 2020 from https://scholar.valpo.edu/tgle/vol50/iss1/4\n" +
                            "3\n" +
                            "Small-handed Leaf-cutter Bee (Megachile gemula). (n.d.). Retrieved March 4, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/199135-Megachile-gemula\n" +
                            "4Megachile gemula Cresson, 1878. (n.d.). Retrieved March 4, 2020 from\n" +
                            "https://www.discoverlife.org/20/q?search=Megachile+gemula\n" +
                            "5\n" +
                            "Schweitzer, D.F. & Ormes, M. (2015). Megachile gemula - Cresson, 1878. Retrieved March 4, 2020 from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?searchName=Megachile%20gemula",
                    "• (female) entirely black body with pale hair (pubescence) on thorax\n" +
                            "• (female) Black hairs underneath abdomen (scopa)\n" +
                            "• No pale bands on abdomen\n" +
                            "• Thin pale hair on first 2 abdominal segments (T1 &2); black hair" +
                            "on rest (T3 – 6)",
                    "The Small-handed Leafcutter Bee has been recorded on the following4\n" +
                            ":\n" +
                            "\n" +
                            "Indian Hemp, Apocynum spp.\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Wild Indigo, Baptisia spp.\n" +
                            "Bellflowers, Campanula spp.\n" +
                            "Mums, Chrysanthemum spp.\n" +
                            "Clematis, Clematis spp.\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "Geranium, Geranium spp.\n" +
                            "Stenandrium spp.\n" +
                            "Hydrangea, Hydrangea spp.\n" +
                            "Mock-orange, Philadelphus spp.\n" +
                            "Mountain Mints, Pycnanthemum spp.\n" +
                            "Rhododendron, Rhododendron spp.\n" +
                            "Brambles, Rubus spp.\n" +
                            "Coneflowers, Rudbeckia spp.\n" +
                            "Goldenrod, Solidago spp\n" +
                            "Trefoil, Trifolium spp.\n" +
                            "Berry Tree, Vaccinium spp.\n" +
                            "Vetch, Vicia spp.\n" +
                            "... the full list can be viewed found in the Discover Life link in the source list.\n" +
                            "\n" +
                            "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "COMMON PLANTS USED FOR NESTING MATERIAL\n" +
                            "Tick Trefoils, Desmodium spp.\n" +
                            "Roses, Rosa spp.\n" +
                            "St. John’s Wort, Hypericum spp.\n" +
                            "Ash, Fraxinus spp.\n" +
                            "Eastern Redbud, Cercis canadensis\n" +
                            "\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Wild Indigo, Baptisia spp.\n" +
                            "Coneflower, Echinacea spp.\n" +
                            "Beardtongue, Penstemon spp.\n" +
                            "Canada Anemone, Anemone canadensis\n" +
                            "Balsam Ragwort, Packera paupercula\n" +
                            "FALL\n" +
                            "Yellow Coneflower, Ratibida pinnata\n" +
                            "Black-eyed Susan, Rudbeckia hirta\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Joe Pye Weed, Eutrochium spp.\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "Anise Hyssop, Agastache foeniculum\n" +
                            "Prairie Onion, Allium stellatum\n" +
                            "Tick Trefoil, Desmodium spp.\n" +
                            "Blazingstar, Liatris spp.\n" +
                            "Vervain, Verbena spp.\n" +
                            "Prairie Clover, Dalea spp.\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Aster, Symphyotrichum spp."),
        Insect("Taurus Mason Bee", "(Osmia taurus)",
            R.drawable.taurus_mason_bee_1,R.drawable.taurus_mason_bee_2,R.drawable.taurus_mason_bee_3,R.drawable.taurus_mason_bee_4,
                "The Taurus Mason Bee is native to Japan but was introduced to the United States around the same time\n" +
                        "as the Hornfaced Bee (O. cornifrons)\n" +
                        "1\n" +
                        "in the 1980s. The two species look so similar that it is likely the\n" +
                        "\n" +
                        "Taurus Mason Bee was mistaken for O. cornifrons and released into the U.S2\n" +
                        "\n" +
                        ". The two species can be\n" +
                        "differentiated by the shortened or flat inner tooth of the mandible (bee teeth) and smooth basal\n" +
                        "(bottom) half of the clypeus (bee face) in O. taurus2\n" +
                        ".\n" +
                        "\n" +
                        "Like other mason bees, the Taurus Mason Bee nests in pre-existing cavities in wood, hollow stems, tubes,\n" +
                        "or insect hotels2\n" +
                        "\n" +
                        ". They collect pollen and form a pollen ball inside the chamber furthest from the opening\n" +
                        "before laying a single egg on top of it. They then use mud to seal off the chamber and repeat this process\n" +
                        "until sealing the entrance to their nest2\n" +
                        ".\n" +
                        "\n" +
                        "The range of the Taurus Mason Bee now extends throughout the eastern United States and as far west as\n" +
                        "Wisconsin and Illinois3\n" +
                        ".\n" +
                        "SEASONALITY: February to July2\n" +
                        "CONSERVATION STATUS: Secure and increasing4\n" +
                        "STATUS: Introduced1\n" +
                        "Sources:\n" +
                        "1Chatfield-Taylor, W., Moisset, B., Ascher, J., Belov, V., and Go, H. (2007). Species Osmia Taurus – Taurus\n" +
                        "Mason Bee. Retrieved February 9, 2020 from https://bugguide.net/node/view/104830\n" +
                        "2\n" +
                        "S. Burrows, C. Ritner, M. Christman, L. Spears, A. Smith-Pardo, S. Price, R. Ramirez, T. Griswold, A.\n" +
                        "Redford. (2018). Osmia taurus. Retrieved February 9, 2020 from\n" +
                        "http://idtools.org/id/bees/exotic/factsheet.php?name=16958\n" +
                        "3Taurus Mason Bee (Osmia taurus). (n.d.). Retrieved February 9, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/461507-Osmia-taurus3\n" +
                        "4\n" +
                        "Schweitzer, D. F. (2014). Osmia taurus – Smith, 1873. Retrieved February 9, 2020 from\n" +
                        "http://explorer.natureserve.org/servlet/NatureServe?searchName=Osmia+taurus\n" +
                        "5Osmia Taurus Smith, 1873. (n.d.) Retrieved February 9, 2020 from\n" +
                        "https://www.discoverlife.org/20/q?search=Osmia+taurus",
                "• Horn or small projection on lower face (clypeus)\n" +
                        "• Red to orange hue on abdominal hair\n" +
                        "• Pale reddish-yellow hair beneath abdomen (scopa) on females",
                "The Taurus Mason Bee has been seen on the following5\n" +
                        ":\n" +
                        "\n" +
                        "Blueberry, Vaccinium corymbosum\n" +
                        "Fawn Lilies, Erythronium\n" +
                        "Heathers, Ericaceae\n" +
                        "\n" +
                        "The following species attract members from the genus Osmia. Information obtained from Bees: An\n" +
                        "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                        "SPRING - PERENNIALS\n" +
                        "Wild Lupine, Lupinus perennis\n" +
                        "Golden Alexanders, Zizia aurea\n" +
                        "Spiderwort, Tradescantia spp.\n" +
                        "Harebell, Campanula rotundifolia\n" +
                        "Waterleaf, Hydrophyllum spp.\n" +
                        "Wild Geranium, Geranium maculatum\n" +
                        "SPRING - TREES AND SHRUBS\n" +
                        "American Plum, Prunus americana\n" +
                        "Willow, Salix spp.\n" +
                        "Red Maple, Acer rubrum\n" +
                        "Viburnum, Viburnum spp."),
        Insect("Transverse-Banded Calligrapher", "(Eristalis transversa)",
            R.drawable.transverse_banded_calligrapher_1,R.drawable.transverse_banded_calligrapher_2,R.drawable.transverse_banded_calligrapher_3,R.drawable.transverse_banded_calligrapher_4,
                "The Transverse-Banded Calligrapher is a hover fly in the Syrphid family and commonly found throughout\n" +
                        "\n" +
                        "the eastern United States. While typically not found in insect hotels, the slug-like larvae of the Transverse-\n" +
                        "Banded Calligrapher and other syrphid flies are important natural controls on pest populations and eat\n" +
                        "\n" +
                        "aphids, thrips, and small caterpillars1\n" +
                        "\n" +
                        ". An abundance of syrphid larva can reduce aphid populations by 70\n" +
                        "\n" +
                        "to 100%1\n" +
                        ", making them a welcomed occupant in gardens and agricultural fields.\n" +
                        "\n" +
                        "E. transversa\n" +
                        "9mm to\n" +
                        "11mm\n" +
                        "\n" +
                        "In optimal environmental conditions, adult Transverse-Banded Calligrapher females will lay their eggs on\n" +
                        "plants infested with prey1\n" +
                        "\n" +
                        ". The eggs will hatch around 3 days later and develop over a period of 1 to 3\n" +
                        "\n" +
                        "weeks, all the while eating resident pests1\n" +
                        "\n" +
                        ". Unless overwintering, the larva will pupate and emerge 1 or 2\n" +
                        "\n" +
                        "weeks later1\n" +
                        "\n" +
                        ". There can be several generations each year depending on environmental conditions1\n" +
                        ".\n" +
                        "Transverse-Banded Calligraphers have similar coloration to some bee and wasp species. This similarity in\n" +
                        "\n" +
                        "appearance is a tactic known as batesian mimicry, where an organism imitates another toxic or non-\n" +
                        "appetizing organism to avoid predation.\n" +
                        "\n" +
                        "The range of the Transverse-Banded Calligrapher extends from some parts of south-east Canada down\n" +
                        "throughout the eastern U.S. It has been recorded as far west as Texas, Oklahoma, Kansas, Nebraska and\n" +
                        "South Dakota2\n" +
                        ".\n" +
                        "\n" +
                        "SEASONALITY: April to November2\n" +
                        "CONSERVATION STATUS: Unknown\n" +
                        "STATUS: Native\n" +
                        "Sources: 1Gu, A. (n.d.). Syrphid Flies. Retrieved January 18, 2020 from\n" +
                        "https://biocontrol.entomology.cornell.edu/predators/syrphids.php\n" +
                        "2Transverse-Banded Calligrapher (Eristalis transversa). (n.d.). Retrieved January 18, 2020 from\n" +
                        "https://www.inaturalist.org/taxa/145436-Eristalis-transversa",
                "• Thorax bi-colored: gray top half; black bottom half\n" +
                        "• Yellow and black patterned abdomen\n" +
                        "• Large reddish-brown eyes\n" +
                        "• Hovers often around flowers",
                "The Transverse-Banded Calligrapher can be found near aphid-infested plants1\n" +
                        "\n" +
                        ". Adults visit a wide variety\n" +
                        "\n" +
                        "of flowers."),
        Insect("Unarmed Leafcutter Bee", "(Megachile inermis)",
            R.drawable.unarmed_leafcutter_bee_1,R.drawable.unarmed_leafcutter_bee_2,R.drawable.unarmed_leafcutter_bee_3,R.drawable.unarmed_leafcutter_bee_4,
                    "Part of the Unarmed Leafcutter Bee’s name comes from their behavior of using their mandibles (bee\n" +
                            "teeth) to cut leaves for lining their nests. They are a large solitary bee that nests in pre-existing cavities in\n" +
                            "wood, rocks, or plant stems1\n" +
                            "\n" +
                            ". After finding a suitable nesting site, the female uses her large mandibles to\n" +
                            "cut leaves and build chambers for each of her eggs, starting with the chamber the furthest away from the\n" +
                            "opening1\n" +
                            ". She deposits a single egg atop a bundle of pollen (and sometimes nectar) that will feed the\n" +
                            "developing larva. The female then seals off the chamber and repeats this process, each time leaving one\n" +
                            "egg and food bundle per chamber and sealing it off with chewed leaves.\n" +
                            "Leafcutter Bees in the Midwest and Northeast U.S. typically emerge in late spring or early summer1\n" +
                            ". They\n" +
                            "immediately seek a mate and search for nesting sites to prepare the next generation, which will\n" +
                            "overwinter and emerge in the next season1\n" +
                            ".\n" +
                            "\n" +
                            "The range of the Unarmed Leafcutter Bee is spread throughout the northern United States2\n" +
                            ".\n" +
                            "\n" +
                            "SEASONALITY: June to October2\n" +
                            "CONSERVATION STATUS: secure3\n" +
                            "STATUS: native\n" +
                            "Sources:\n" +
                            "1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN: Pollination\n" +
                            "Press LLC.\n" +
                            "2Unarmed Leafcutter Bee (Megachile inermis). (n.d.). Retrieved March 2, 2020 from\n" +
                            "https://www.inaturalist.org/taxa/199134-Megachile-inermis\n" +
                            "3\n" +
                            "Schweitzer, D. F. (2015). Megachile inermis – Provancher, 1888. Retrieved March 2, 2020 from\n" +
                            "http://explorer.natureserve.org/servlet/NatureServe?searchName=Megachile+inermis\n" +
                            "4Megachile inermis – Provancher, 1888. (n.d.) Retrieved March 1, 2020 from\n" +
                            "https://www.discoverlife.org/20/q?search=Megachile+inermis",
                    "• Black body with white abdominal hair bands\n" +
                            "• Gena (area between eyes) is wider than width of eye\n" +
                            "• (female) Pale hairs underneath abdomen (scopa)\n" +
                            "• 5 “teeth” on the mandible",
                    "The Unarmed Leafcutter Bee has been recorded on the following4\n" +
                            ":\n" +
                            "\n" +
                            "Thistles, Cirsium spp.\n" +
                            "Fleabane, Erigeron spp.\n" +
                            "Gumwood, Grindelia spp.\n" +
                            "Sunflower, Helianthus spp.\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "... the full list can be viewed found in the Discover Life link in the source list.\n" +
                            "\n" +
                            "The following species attract members from the genus Megachile. Information obtained from Bees: An\n" +
                            "Identification and Native Plant Forage Guide (Holm 2017)\n" +
                            "\n" +
                            "COMMON PLANTS USED FOR NESTING MATERIAL\n" +
                            "Tick Trefoils, Desmodium spp.\n" +
                            "Roses, Rosa spp.\n" +
                            "St. John’s Wort, Hypericum spp.\n" +
                            "Ash, Fraxinus spp.\n" +
                            "Eastern Redbud, Cercis canadensis\n" +
                            "\n" +
                            "COMMON FORAGE PLANTS\n" +
                            "SPRING\n" +
                            "Golden Alexanders, Zizia aurea\n" +
                            "Harebell, Campanula rotundifolia\n" +
                            "Wild Indigo, Baptisia spp.\n" +
                            "Coneflower, Echinacea spp.\n" +
                            "Beardtongue, Penstemon spp.\n" +
                            "Canada Anemone, Anemone canadensis\n" +
                            "Balsam Ragwort, Packera paupercula\n" +
                            "FALL\n" +
                            "Yellow Coneflower, Ratibida pinnata\n" +
                            "Black-eyed Susan, Rudbeckia hirta\n" +
                            "Milkweed, Asclepias spp.\n" +
                            "Joe Pye Weed, Eutrochium spp.\n" +
                            "Tickseed, Coreopsis spp.\n" +
                            "Anise Hyssop, Agastache foeniculum\n" +
                            "Prairie Onion, Allium stellatum\n" +
                            "Tick Trefoil, Desmodium spp.\n" +
                            "Blazingstar, Liatris spp.\n" +
                            "Vervain, Verbena spp.\n" +
                            "Prairie Clover, Dalea spp.\n" +
                            "Leadplant, Amorpha canescens\n" +
                            "AUTUMN\n" +
                            "Goldenrod, Solidago spp.\n" +
                            "Aster, Symphyotrichum spp."),
        Insect("Western Honeybee", "(Apis mellifera)",
            R.drawable.western_honeybee_1,R.drawable.western_honeybee_2,R.drawable.western_honeybee_3,R.drawable.western_honeybee_4,
            "The Western Honeybee has become synonymous with the word bee. Honeybees are one of the few\n" +
                    "species that produce honey. European settlers introduced the species to North America early in the\n" +
                    "1620s1\n" +
                    ". Since then, they have become the most widely used commercial pollinator and producer of wax\n" +
                    "and honey. California alone depends on nearly 1.8 million honeybee colonies to pollinate their almond\n" +
                    "orchards2\n" +
                    ".\n" +
                    "This social species forms large nests with upwards to 80,000 members all working under the rule of a\n" +
                    "single queen. The workers are all sterile females that fulfill a number of tasks vital for the success of the\n" +
                    "hive including3\n" +
                    ":\n" +
                    "• Foraging\n" +
                    "• Guarding\n" +
                    "\n" +
                    "A. mellifera\n" +
                    "10mm to\n" +
                    "11mm long\n" +
                    "\n" +
                    "• propolizing*\n" +
                    "• honeycomb building\n" +
                    "• honey sealing\n" +
                    "• drone feeding\n" +
                    "• fanning (cools the hive)\n" +
                    "The queen is the largest bee in the hive and the sole producer of eggs. Male honeybees’ (drones) main\n" +
                    "duty is to find and mate with queens.\n" +
                    "A phenomenon known as Colony Collapse Disorder (CCD) has resulted in recent declines of hive\n" +
                    "populations. The exact cause of this disorder is still unknown, though many speculate it is due to\n" +
                    "pesticides, parasites, fewer food resources, or a combination of these. Since 1950, the U.S. has lost\n" +
                    "approximately 50% of managed honeybee hives4\n" +
                    ".\n" +
                    "\n" +
                    "*Propolis is a resinous substance obtain from plants. When worker bees add their own enzymes to it, the\n" +
                    "resulting hard waxy substance obtains antibacterial and antifungal properties.\n" +
                    "SEASONALITY: March to November\n" +
                    "STATUS: Non-native\n" +
                    "CONSERVATION STATUS: Data deficient (IUCN), in decline (U.S.)\n" +
                    "Sources: 1Holm, H. (2017). Bees: An Identification and Native Plant Forage Guide. Minnetonka, MN:\n" +
                    "Pollination Press LLC.\n" +
                    "2Honey Bees Are Pollinators. (n.d.). Retrieved January 17, 2020, from\n" +
                    "https://www.abfnet.org/page/PollinatorFacts\n" +
                    "3Western Honey Bee (Apis mellifera). (n.d.). Retrieved January 17, 2020, from\n" +
                    "https://www.inaturalist.org/taxa/47219-Apis-mellifera\n" +
                    "4Vanengelsdorp, D., & Meixner, M. D. (2009). A historical review of managed honey bee populations in\n" +
                    "Europe and the United States and the factors that may affect them. Journal of Invertebrate Pathology,\n" +
                    "103, s83–s83. doi: 10.1016/j.jip.2009.06.011",
            "• Alternating amber to brown stripes on abdomen (common)\n" +
                    "• Pollen basket on hind legs\n" +
                    "• Hairy eyes\n" +
                    "• Wings held parallel over back when foraging",
            "Honeybees are generalist foragers and will visit any available, nearby flower."
            ),
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