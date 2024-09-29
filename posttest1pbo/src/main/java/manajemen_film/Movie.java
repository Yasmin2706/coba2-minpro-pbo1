package manajemen_film;

public class Movie {
    private String judul;
    private int tahunRilis;
    private String sutradara;
    
    public Movie(String judul, int tahunRilis, String sutradara, String jenisGenre) {
        this.judul = judul;
        this.tahunRilis = tahunRilis;
        this.sutradara = sutradara;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public int getTahunRilis() {
        return tahunRilis;
    }
    
    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }
    
    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }
    
    public void displayInfo() {
        System.out.println("Judul: " + judul + ", Tahun: " + tahunRilis + ", Sutradara: " + sutradara);
    }
}
