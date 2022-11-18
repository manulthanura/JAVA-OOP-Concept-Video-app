
import java.util.ArrayList;
import java.util.LinkedList;

public class Category {
    private String name;
    private String actor;
    private ArrayList<Video> Videos;

    public Category(String name, String actor) {
        this.name = name;
        this.actor = actor;
        this.Videos = new ArrayList<Video>();
    }
    public Category(){
    }

    public Video findVideo(String title){

        for(Video checkedVideo : Videos){
            if(checkedVideo.getTitle().equals(title)) return checkedVideo;
        }
        return null;
    }

    public boolean addVideo(String title, double duration){
        if(findVideo(title) == null){
            Videos.add(new Video(title,duration));
//            System.out.println(title + "successfully added to the list");
            return true;
        }
        else {
//            System.out.println("Video with name "+ title+ " already exist in the list");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Video> PlayList){
        int index = trackNumber - 1;
        if(index > 0 && index <= this.Videos.size()){
            PlayList.add(this.Videos.get(index));
            return true;
        }
//        System.out.println("this Category does not have Video with trackNumber "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Video> PlayList){
        for(Video checkedVideo : this.Videos){
            if (checkedVideo.getTitle().equals(title)){
                PlayList.add(checkedVideo);
                return true;
            }
        }
//        System.out.println(title + "there is no such Video in Category");
        return false;
    }
}