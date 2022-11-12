public class Main {

    private static ArrayList<Category> Categorys = new ArrayList<>();

    public static void main(String[] args) {

        Category Category = new Category("Category1","AC/DC");

        Category.addVideo("TNT",4.5);
        Category.addVideo("Highway to hell",3.5);
        Category.addVideo("ThunderStruck",5.0);
        Categorys.add(Category);

        Category = new Category("Category2","Eminem");

        Category.addVideo("Rap god",4.5);
        Category.addVideo("Not Afraid",3.5);
        Category.addVideo("Lose yourself",4.5);

        Categorys.add(Category);

        LinkedList<Video> playList_1 = new LinkedList<>();

        Categorys.get(0).addToPlayList("TNT",playList_1);
        Categorys.get(0).addToPlayList("Highway to hell",playList_1);
        Categorys.get(1).addToPlayList("Rap god",playList_1);
        Categorys.get(1).addToPlayList("Lose yourself",playList_1);

        play(playList_1);

    }

    private static void play(LinkedList<Video> playList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Video> listIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("This playlist have no Video");
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){

                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }else {
                        System.out.println("no Video availble, reached to the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else {
                        System.out.println("we are the first Video");
                        forward = false;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("we are at the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("now playing "+listIterator.next().toString());
                            forward = true;
                        }else {
                            System.out.println("we have reached to the end of list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() >0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing "+listIterator.next().toString());
                        }
                        else {
                            if(listIterator.hasPrevious())
                            System.out.println("now playing "+listIterator.previous().toString());
                        }
                    }

            }
        }
    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next Video\n"+
                "2 - to play previous Video\n"+
                "3 - to replay the current Video\n"+
                "4 - list of all Videos \n"+
                "5 - print all available options\n"+
                "6 - delete current Video");
    }

    private static void printList(LinkedList<Video> playList){
        Iterator<Video> iterator = playList.iterator();
        System.out.println("-----------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
    }

}