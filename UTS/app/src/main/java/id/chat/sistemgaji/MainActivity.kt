package id.chat.sistemgaji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

object MainActivity {

    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {

        val s1 = Staf()
        s1.setNama("Pak Solikhun")
        s1.setKehadiran(29)

        val d1 = Dosen()
        d1.setNama("Bu Naim")
        d1.setSKS(26)

        val p1 = Pegawai()
        p1.setNama("Pak Kadek")

        val daftar_gaji = DaftarGaji(3)
        daftar_gaji.addPegawai(s1)
        daftar_gaji.addPegawai(d1)
        daftar_gaji.addPegawai(p1)
        daftar_gaji.printSemuaGaji()
    }
}
