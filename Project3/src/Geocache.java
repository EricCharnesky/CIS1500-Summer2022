public class Geocache {

    private String latitude;
    private String longitude;
    private String item;
    private String hint;
    private int likeCount;

    public Geocache(String latitude, String longitude, String item, String hint) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.item = item;
        this.hint = hint;
        likeCount = 0;
    }

    public void like(){
        likeCount++;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getItem() {
        return item;
    }

    public String getHint() {
        return hint;
    }

    public int getLikeCount() {
        return likeCount;
    }
}
