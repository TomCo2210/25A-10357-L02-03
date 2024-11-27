package dev.tomco.a25a_10357_l02_03.model

import dev.tomco.a25a_10357_l02_03.R

class DataManager {
    companion object {
        private val names = arrayOf(
            "Ethiopia",
            "Italy",
            "Iraq",
            "North Korea",
            "Scotland",
            "Namibia",
            "Iceland",
            "Albania",
            "Ecuador",
            "Bahamas",
            "Chile",
            "Algeria",
            "Ukraine",
            "Cuba",
            "Germany",
            "Macao",
            "Bulgaria",
            "Colombia",
            "Peru",
            "Tonga",
            "Rwanda",
            "Indonesia",
            "Vietnam",
            "Yemen",
            "Australia",
            "Canada"
        )


        private val flagImages = arrayOf(
            R.drawable._005_ethiopia,
            R.drawable._013_italy,
            R.drawable._020_iraq,
            R.drawable._030_north_korea,
            R.drawable._055_scotland,
            R.drawable._062_namibia,
            R.drawable._080_iceland,
            R.drawable._099_albania,
            R.drawable._104_ecuador,
            R.drawable._120_bahamas,
            R.drawable._131_chile,
            R.drawable._144_algeria,
            R.drawable._145_ukraine,
            R.drawable._153_cuba,
            R.drawable._162_germany,
            R.drawable._167_macao,
            R.drawable._168_bulgaria,
            R.drawable._177_colombia,
            R.drawable._188_peru,
            R.drawable._191_tonga,
            R.drawable._206_rwanda,
            R.drawable._209_indonesia,
            R.drawable._220_vietnam,
            R.drawable._232_yemen,
            R.drawable._234_australia,
            R.drawable._243_canada,
        )


        private val canEnter = arrayOf(
            true,
            true,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            false,
            true,
            false,
            true,
            true
        )

        fun getAllCountries(): List<Country> {
            val allCountries = mutableListOf<Country>()
            for (i in names.indices){
                allCountries.add(
                    Country(
                        name = names[i],
                        flagImage = flagImages[i],
                        canEnter = canEnter[i]
                    )
                )
            }
            allCountries.shuffle()
            return allCountries
        }
    }
}