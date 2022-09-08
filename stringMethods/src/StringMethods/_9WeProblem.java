package StringMethods;

public class _9WeProblem {
    //create a class movie(number of songs,duration)
    public static void main(String[] args) {
//        Movie movie = new Movie();
        Movie movie1 = new Movie("numb",3,(double) 3.4);
        System.out.println("song number is "+movie1.song);
        System.out.println("song name is "+movie1.name);
        System.out.println("duration of the song is "+movie1.duration+" minutes");
    }
}
class Movie{
     String name;
     int song;
     double duration;
     Movie(){//default constructor
         System.out.println("");
     }
     Movie(String vari1,int vari2,double vari3){//perameterized constructor
         name = vari1;
         song = vari2;
         duration = vari3;
     }
}
