package com.example.jajanankekiniansby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main. layoutManager = LinearLayoutManager (this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = AdapterJajanan(data, { onItem: DataJajanan -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataJajanan) {
        val showDetailActivityIntent = Intent(this, DetailJajanan::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgJjn)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameJjn)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descJjn)
        startActivity(showDetailActivityIntent)
    }

    private fun createFac(): List<DataJajanan> {
        val rvList = ArrayList<DataJajanan>()
        rvList.add(
            DataJajanan(
                        R.drawable.basoaci,
                        "BASO ACI",
                        "Bakso aci atau yang biasa disebut dengan baso aci adalah salah satu kuliner khas Garut yang sampai saat ini masih digandrungi oleh banyak kalangan. Kuliner ini terbuat dari tepung kanji atau yang biasa orang sunda sebut aci. Baso aci mempunyai ciri khas kuah yang gurih, asam dengan aroma kencur yang menggugah selera. Di Surabaya sendiri, terdapat tempat makan baso aci yang cukup terkenal, yaitu Baso Aci Akang di daerah Dharmahusada."
                )
        )
        rvList.add(
                DataJajanan(
                        R.drawable.boba,
                        "BOBA",
                        "Boba adalah bola tapioka yang kerap menjadi isian dari minuman bubble tea. Bubble tea merupakan minuman yang tengah naik daun karena rasanya yang manis, creamy berpadu dengan tekstur boba yang kenyal. Boba berbahan dasar tepung tapioka yaitu tepung dari singkong. Di Surabaya, terdapat banyak merk minuman yang disajikan dengan boba. Xing Fu Tang, Chatime, dan Xiboba adalah contoh dari sekian banyak merk minuman yang menyediakan boba sebagai toppingnya."
                )
        )
        rvList.add(
            DataJajanan(
                        R.drawable.dessertbox,
                        "DESSERT BOX",
                        "Dessert box merupakan makanan penutup (cake) yang ada di dalam kotak makanan. Berbeda dengan dessert biasa yang disajikan di piring, dessert box bisa langsung dimakan dari tempatnya. Makanan manis yang ditata dalam kotak bening ini biasanya terdiri dari beberapa lapisan seperti kue sponge, krim lembut, taburan bubuk coklat, biskuit sebagai toping, dan lain sebagainya. Di Surabaya, Bittersweet by Najla merupakan salah satu merk yang terkenal dalam berjualan dessert box."
                )
        )
        rvList.add(
                DataJajanan(
                        R.drawable.kopisusu,
                        "KOPI SUSU",
                        "Es kopi susu kekinian (kadang disebut es kopi susu gula aren) adalah istilah untuk mencakup jenis racikan kopi yang mengandung susu dan gula aren. Racikan ini umumnya disajikan dingin dengan es dalam kemasan gelas plastik bertutup. Di Surabaya, banyak kedai yang menyediakan kopi susu ini. Contohnya yang paling terkenal adalah Jokopi, Janji Jiwa, dan Kopi Kenangan."
                )
        )
        rvList.add(
                DataJajanan( R.drawable.seblak,
                        "SEBLAK",
                        "Seblak adalah makanan Indonesia yang dikenal berasal dari Bandung, Jawa Barat yang bercita rasa gurih dan pedas. Terbuat dari kerupuk basah yang dimasak dengan sayuran dan sumber protein seperti telur, ayam, boga bahari atau olahan daging sapi, dan dimasak dengan kencur. Di Surabaya, terdapat beberapa tempat makan seblak yang enak, seperti Seblak Jeletot Mpok Adek di daerah Lidah Kulon, Seblak Manten di daerah Nginden Semolo, dan Seblak Aulia di daerah Dharmawangsa."
                )
        )
        rvList.add(
                DataJajanan( R.drawable.toast,
                        "TOAST",
                        "Toast merujuk kepada kepingan roti yang dibakar atau dipanggang dengan proses radiasi termal sehingga roti menjadi lebih kecoklatan dan garing sehingga lebih mudah untuk menaburkan topping di atasnya. Seiring dengan berkembangnya waktu, toast diberi isian-isian yang kekinian agar masyarakat tidak mudah bosan, contohnya diberi isian saos mentai, ikan tuna, saos pedas, dan banyak isian lainnya yang membuat toast makin lezat. Di Surabaya, Jiwa Toast by Janji Jiwa merupakan salah satu merk yang terkenal dalam berjualan toast."
                )
        )
        return rvList
    }
}