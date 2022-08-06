import java.util.Scanner;

public class Main {
    static void ngatcau(){
        System.out.println("------------------------------------");
    }
    //sap xep mang theo chieu tang dang theo ranking
    static void tangdan(Film[] filmlist){
        Film trunggian;
        for( int i = 0; i < filmlist.length - 1; i++){
            for( int j = i + 1; j < filmlist.length; j++){
                if(filmlist[i].getRaking() > filmlist[j].getRaking() ){
                    trunggian = filmlist[i];
                    filmlist[i] = filmlist[j];
                    filmlist[j] = trunggian;
                }
            }
        }
    }

    public static void main(String[] args) {
        Movie[] movielist= new Movie[5];
        Series[] serieslist= new Series[5];
        //movielist
        movielist[0]= new Movie("001", "chia khoa tram ty", Category.COMEDY, 8.3, 117);
        movielist[1]= new Movie("002", "bay ngot ngao", Category.Psychological, 7.9, 120);
        movielist[2]= new Movie("003", "rung the mang", Category.HORROR, 5.8, 94);
        movielist[3]= new Movie("004", "loi hua cua cha", Category.Psychological, 6.7, 90);
        movielist[4]= new Movie("005", "yeu em tu khi nao", Category.Psychological, 9.5, 60);
        //serieslist
        serieslist[0]= new Series("006", "hem cut       ", Category.COMEDY, 8.6, 60, 5);
        serieslist[1]= new Series("007", "gai ngan do", Category.Psychological, 7.0, 30, 8);
        serieslist[2]= new Series("008", "binh bao      ", Category.Action, 9.8, 25, 4);
        serieslist[3]= new Series("009", "hung long phong ba", Category.Action, 7.9, 35, 5);
        serieslist[4]= new Series("010", "tinh la day oan", Category.Psychological, 7.0, 45, 39);
        //tao mot mang Film voi cac thuoc tinh cua Movie va Series
        Film[] filmlist= new Film[movielist.length + serieslist.length];//tong cua hai mang Movie va Series
        //tao vao gan gia tri cho Film
        for(int index = 0; index < filmlist.length; index++){
            filmlist[index]= new Film();
            if(index < movielist.length){
                filmlist[index].setId(movielist[index].getId());
                filmlist[index].setTitle(movielist[index].getTitle());
                filmlist[index].setCategory(movielist[index].getCategory());
                filmlist[index].setRaking(movielist[index].getRaking());
            } else{
                int i= index- movielist.length;
                filmlist[index].setId(serieslist[i].getId());
                filmlist[index].setTitle(serieslist[i].getTitle());
                filmlist[index].setCategory(serieslist[i].getCategory());
                filmlist[index].setRaking(serieslist[i].getRaking());
            }
        }
        //in thong tin film ra man hinh
        for(Movie movie: movielist){
            movie.printMovie();
        }
        for(Series series: serieslist){
            series.printSeries();
        }
        ngatcau();
        //tim theo tu khoa tieu de phim
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap tu khoa title can tim: ");
        String keyword= scanner.nextLine();
        for(Film film: filmlist){
            if(film.hasKeyword(keyword)){
                film.printFilm();
                System.out.println();
            }
        }
        ngatcau();

        //in ra thong tin film co raking thap nhat
        tangdan(filmlist);//sap xep mang  tang dan theo ranking
        System.out.println("Film co ranking thap nhap la: ");
        filmlist[0].printFilm();
        System.out.println();
        ngatcau();

        //in ta title cua the loai COMEDY co ranking thap nhat
        System.out.print("in ta title cua the loai COMEDY co ranking thap nhat: ");
        for(Film flim: filmlist){
            if(flim.checkCategory(Category.COMEDY)){
                System.out.println(flim.getTitle());
                break;
            }
        }
        scanner.close();
    }
}
