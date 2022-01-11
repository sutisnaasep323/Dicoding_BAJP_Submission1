package com.example.mymovies.utils

import com.example.mymovies.R
import com.example.mymovies.data.FilmEntity

object DataDummy {
    fun getMovies(): List<FilmEntity> {
        return listOf(
            FilmEntity(
                "m1",
                "Black Panther",
                "14/02/2018",
                "Sebagai Raja baru dari Wakanda, T’Challa (Chadwick Boseman) masih bergumul mengenai perasaannya atas meninggalnya sang ayah, T’Chaka (John Kani). Namun ia kemudian memutuskan untuk meneruskan perjuangan sang ayah. Ketika Wakanda berada dalam ancaman dua musuh berbahaya yang dapat mengancam keselamatan negara, Black Panther berusaha membuktikan diri sebagai raja sejati Wakanda. Ia harus menggunakan kostum barunya serta kekuatannya untuk membela Wakanda dan negara lainnya.",
                "2h 15m",
                "Action, Adventure",
                R.drawable.img_blackpanther,
                90
            ),
            FilmEntity(
                "m2",
                "Avengers: Infinity War",
                "04/27/2018",
                "The Avengers dan sekutu mereka harus bersedia mengorbankan segalanya dalam upaya untuk mengalahkan Thanos yang kuat sebelum ia berhasil menghancurkan alam semesta.",
                "2h 29m",
                "Adventure, Action",
                R.drawable.img_inifinitywar,
                92
            ),
            FilmEntity(
                "m3",
                "Avengers: Endgame",
                "24/04/2019",
                "Melanjutkan Avengers Infinity War, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones dan memusnahkan 50% semua mahluk hidup di alam semesta. Akankah para Avengers berhasil mengalahkan Thanos?",
                "3h 1m",
                "Action, Adventure",
                R.drawable.img_endgame,
                94
            ),
            FilmEntity(
                "m4",
                "Toy Story 4",
                "15/08/2019",
                "Woody selalu merasa percaya diri akan posisinya di dunia, dan prioritasnya adalah menjaga anaknya, baik itu Andy atau Bonnie. Namun ketika Bonnie menambahkan sebuah mainan baru bernama Forky dalam kamar mainannya, sebuah pengembaraan bersama teman-teman lama dan baru akan membawa Woody untuk menyaksikan betapa besarnya dunia ini bagi sebuah mainan seperti dirinya.",
                "1h 40m",
                "Children, Comedy",
                R.drawable.img_toystory4,
                87
            ),
            FilmEntity(
                "m5",
                "Mission: Impossible - Fallout",
                "25/07/2018",
                "Ketika sebuah misi IMF berjalan di luar rencana, keselamatan dunia terancam. Ethan Hunt beraksi sendiri sesuai arahan awal, dan CIA mulai mempertanyakan loyalitas dan motifnya. Hunt harus berpacu melawan waktu, diburu para pembunuh dan mantan rekan misinya, untuk mencegah sebuah ancaman global.",
                "2h 28m",
                "Action, Fun story",
                R.drawable.img_impossible,
                89
            ),
            FilmEntity(
                "m6",
                "Spider-Man: No Way Home",
                "15/12/2021",
                "Identitas Spider-Man sekarang sudah terungkap, dan Peter meminta bantuan Doctor Strange. namun sebuah kesalahan terjadi, dan itu justru mengundang musuh berbahaya dari dunia lain, mereka mulai bermunculan. Hal itu memaksa Peter mencari apa makna sebenarnya menjadi Spider-Man.",
                "2h 28m",
                "Action, Adventure",
                R.drawable.img_spiderman,
                98
            ),
            FilmEntity(
                "m7",
                "Shang-Chi",
                "22/09/2021",
                "Shang-Chi (Simu Liu) harus menghadapi masa lalunya sebelum ia memilih untuk meninggalkan dan bergabung ke dalam sebuah organisasi bernama Ten Rings.",
                "2h 12m",
                "Action, Fantasy",
                R.drawable.img_shangchi,
                93
            ),
            FilmEntity(
                "m8",
                "Venom",
                "03/10/2018",
                "Seorang jurnalis, Eddie Brock (Tom Hardy) ingin melakukan sebuah investasi kasus terhadap penemuan yang dipimpin oleh Dr. Carlton Drake (Riz Ahmed). Karena investigasinya, Eddie mengunjungi lab milik Dr. Calrlton Drake. Semuanya ditujukan untuk membuktikan bahwa Dr. Carlton Drake sedang sedang melakukan tindakan jahat menggunakan Symbiote.",
                "2h 20m",
                "Adventure, Action",
                R.drawable.img_venom,
                87
            ),
            FilmEntity(
                "m9",
                "Mortal Kombat",
                "14/04/2021",
                "Petarung MMA Cole Young, yang terbiasa menerima pukulan demi uang, tidak menyadari warisannya-atau mengapa Kaisar Dunia Luar Shang Tsung telah mengirim prajurit terbaiknya, Sub-Zero, seorang Cryomancer dunia lain, untuk memburu Cole. Khawatir akan keselamatan keluarganya, Cole pergi mencari Sonya Blade ke arah Jax, seorang Mayor Pasukan Khusus yang memiliki tanda naga aneh yang sama dengan Cole saat lahir.",
                "1h 50m",
                "Action, Fantasy",
                R.drawable.img_mortalkombat,
                85
            ),
            FilmEntity(
                "m10",
                "Godzilla vs. Kong",
                "24/03/2021",
                "Sebuah pertarungan epic dalam sinematik Monsterverse antara Godzilla dan Kong. Pertarungan Godzilla vs. Kong membuat umat manusia harus bertahan dengan berbagai cara. Salah satunya adalah memusnahkan kedua raksasa tersebut.Siapa yang akan menang?",
                "1h 53m",
                "Action, Adventure",
                R.drawable.img_godzilla,
                91
            )
        )
    }

    fun getTvShows(): List<FilmEntity> {
        return listOf(
            FilmEntity(
                "tv1",
                "86-Eight Six",
                "2021",
                "86 adalah seri novel ringan Jepang beraliran fiksi ilmiah, ditulis oleh Asato Asato dan diilustrasikan oleh Shirabi. Mulai diterbitkan melalui ASCII Media Works lalu di cetak oleh Dengeki Bunko. Serial ini dilisensikan di Amerika Utara oleh Yen Press",
                "24m",
                "Animation",
                R.drawable.img_86,
                82
            ),
            FilmEntity(
                "tv2",
                "Re-Main",
                "2021",
                "Re-Main adalah serial televisi anime Jepang asli yang dianimasikan oleh MAPPA yang disutradarai oleh Kiyoshi Matsuda, dan ditulis oleh Masafumi Nishida. Serial ini ditayangkan dari Juli hingga Oktober 2021 di blok NUMANimation TV Asahi",
                "31m",
                "Sport, Animation",
                R.drawable.img_remain,
                95
            ),
            FilmEntity(
                "tv3",
                "Trese",
                "2021",
                "Berlatar di kota Manila, serial ini fokus pada kisah Alexandra Trese yang harus berjuang melawan makhluk-makluk supranatural jahat dari dunia lain dan para kriminal di kota tersebut.",
                "31 m",
                "Horror fiction",
                R.drawable.img_trese,
                94
            ),
            FilmEntity(
                "tv4",
                "Lupin",
                "2021",
                "Lupin adalah serial televisi streaming thriller misteri Prancis yang dibuat oleh George Kay dan François Uzan yang ditayangkan perdana di Netflix pada 8 Januari 2021. Serial ini terdiri dari sepuluh episode, dengan lima episode pertama dirilis pada Januari 2021 dan sisanya pada 11 Juni 2021",
                "48m",
                "Mystery, Adventure",
                R.drawable.img_lupin,
                95
            ),
            FilmEntity(
                "tv5",
                "Vikings",
                "2013",
                "Vikings adalah serial televisi drama sejarah yang dibuat dan ditulis oleh Michael Hirst untuk saluran televisi Kanada History. Serial ini secara luas mengikuti eksploitasi kepala suku Viking legendaris Ragnar Lothbrok dan krunya, dan di musim-musim berikutnya putra-putranya.",
                "47m",
                "Drama, Action",
                R.drawable.img_vikings,
                85
            ),
            FilmEntity(
                "tv6",
                "Arrow",
                "2012",
                "Arrow adalah serial televisi Amerika yang dikembangkan oleh Greg Berlanti, Andrew Kreisberg, dan Geoff Johns, yang mengudara di The CW. Serial ini didasari tokoh DC Comics Green Arrow, seorang pahlawan super berkostum, penumpas-kejahatan yang bersenjatakan busur & panah",
                "42m",
                "Crime, Action",
                R.drawable.img_arrow,
                81
            ),
            FilmEntity(
                "tv7",
                "Riverdale",
                "2017",
                "Riverdale adalah serial televisi drama remaja Amerika Serikat yang didasarkan pada karakter Archie Comics. Serial ini diadaptasi untuk The CW oleh kepala kreatif kantor Archie Comics, Roberto Aguirre-Sacasa dan diproduksi oleh Warner Bros.",
                "43m",
                "Mystery, Drama",
                R.drawable.img_riverdale,
                93
            ),
            FilmEntity(
                "tv8",
                "Treadstone",
                "2019",
                "Treadstone adalah sebuah serial televisi drama aksi Amerika, yang didasarkan pada sebuah serial film Bourne. Serial ini berjumlah 10 episode dan mulai ditayangkan perdana pada 24 September 2019. Serial ini dibintangi oleh Jeremy Irvine, Tracy Ifeachor, Omar Metwally, Han Hyo-joo, Brian J.",
                "53m",
                "Action fiction",
                R.drawable.img_treadstone,
                72
            ),
            FilmEntity(
                "tv9",
                "The Last Kingdom",
                "2015",
                "The Last Kingdom adalah serial televisi fiksi sejarah Inggris berdasarkan serial novel The Saxon Stories karya Bernard Cornwell. Ini ditayangkan perdana pada tahun 2015 di BBC America, BBC Two dan kemudian pada tahun 2018 di Netflix.",
                "58m",
                "Drama, Action fiction",
                R.drawable.img_thelastkingdom,
                95
            ),
            FilmEntity(
                "tv10",
                "The 100",
                "2014",
                "The 100 adalah serial drama fiksi ilmiah pasca-apokaliptik Amerika Serikat yang di tayangkan perdana pada 19 Maret 2014 di The CW, dan berakhir pada tanggal 30 September 2020. Serial ini dikembangkan oleh Jason Rothenberg dan berdasarkan pada seri novel dengan nama yang sama oleh Kass Morgan",
                "40m",
                "Action, Adventure",
                R.drawable.img_the100,
                91
            )
        )
    }
}
