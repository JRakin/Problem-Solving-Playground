public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+" : "
                                +movie.getName()+ "\n" +
                               " Plot: "+movie.plot()+ "\n");
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 3) + 1;

        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new Forgettable();

        }
        return null;
    }
}
