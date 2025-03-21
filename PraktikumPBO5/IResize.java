public interface IResize {
    public void zoomIn();
    public void zoomOut();
    public void zoom(int percent);
}

// Perhatikan bahwa sebuah interface tidak hanya dapat diimplementasi oleh class-class yang sejenis, berbeda
// dengan hubungan pewarisan class yang umumnya superclass memiliki sejumlah subclass yang sejenis.
// Interface IResize ini dapat direalisasi oleh kelas lain memiliki behaviour serupa, seperti class Garis,
// Bangun3D, dan seterusnya.
// Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize
// dibanding dijadikan sebagai abstract method dalam class BangunDatar?

    //Fleksibel
    //Interface bisa diimplementasikan oleh banyak class yang tidak berhubungan dalam hierarki pewarisan. 
    //jika method zoom disimpan dalam BangunDatar (abstract class), hanya subclass dari BangunDatar yang dapat menggunakannya.
    //Mendukung Multiple Inheritance (Pewarisan Ganda)
    //Java tidak mendukung multiple inheritance untuk class, tetapi mendukung multiple inheritance untuk interface.
    //Jika method zoom disimpan di BangunDatar, class Bangun3D atau Garis tidak bisa menggunakannya tanpa menjadi bagian dari BangunDatar.