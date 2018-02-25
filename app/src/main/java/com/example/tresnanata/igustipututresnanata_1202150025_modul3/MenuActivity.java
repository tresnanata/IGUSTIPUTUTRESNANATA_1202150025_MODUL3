package com.example.tresnanata.igustipututresnanata_1202150025_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private minumanAdapter mAdapter;

    public static ArrayList<minuman> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new minumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    public ArrayList<minuman> isi(){
        ArrayList<minuman> data = new ArrayList<>();
        data.add(new minuman("Aqua","Ini adalah Air Minum merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new minuman("Amidis","Ini adalah Air Minum merk AMIDIS","AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.",R.drawable.amidis));
        data.add(new minuman("Cleo","Ini adalah Air Minum CLEO","Tanobel adalah identitas perusahaan PT Sariguna Primatirta, pertama kali beroperasi pada tanggal 17 September 2003 dengan memproduksi Air Minum dalam Kemasan (AMDK) dengan merk Anda.\n" +
                "\n" +
                "Pada 7 Maret 2004, diluncurkan produk Air Murni Cleo sebagai salah satu produk andalan Tanobel dalam kemasan cup 250 mL, botol 330 mL, 550 mL, 1.200 mL, 6 L dan galon 19 L. Setelah itu, Tanobel melebarkan sayap produksi Air Murni Cleo ke berbagai daerah di Indonesia.\n",R.drawable.cleo));
        data.add(new minuman("Club","Ini adalah Air Minum CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new minuman("Equil","Ini adalah Air Minum EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new minuman("Evian","Ini adalah Air Minum EVIAN","Today, Evian is owned by Danone, a French multinational corporation. In addition to the mineral water, Danone Group uses the Evian name for a line of organic skin care products as well as a luxury resort in France.",R.drawable.evian));
        data.add(new minuman("Le Minerale","Ini adalah Air Minum merk LE MINERALE","Le Minerale, pure and preserved mineral water sourced from the mountain and packed directly on site using the latest technology (mineral protection system) to bring you a healthy refreshment for optimum body function.",R.drawable.leminerale));
        data.add(new minuman("Nestle","Ini adalah Air Minum merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new minuman("Pristine","Ini adalah Air Minum merk PRISTINE","PRISTINE is not an ordinary mineral water, not only for thirst , but beneficial for healthy.\n" +
                "With an Ionization process, separates water and mineral to become ionic atomic molecules. The Ionization process produces PRISTINE as alkaline water.",R.drawable.pristine));
        data.add(new minuman("Vit","Ini adalah Air Minum merk VIT","VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.",R.drawable.vit));
        return data;
    }
}
