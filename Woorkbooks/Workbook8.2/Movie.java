public class Movie {

    private String name;
    private double ratings;
    private String format;

    // public String getName() {
    //     return this.name;
    // }

    public void setName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name can't be null or blank");
        }
        this.name = name;
    }

    public void SetFormat(String format){
        if (format == null || name.isBlank()) {
            throw new IllegalArgumentException("format can't be null or blank");
        }
        this.format = format;
    }

    public void setRatings(double  ratings){
        if (ratings < 0.0 ||  ratings > 10.0 ) {
            throw new IllegalArgumentException("Ratings can't be below 0 or above 10");
        }
        this.ratings = ratings;
    }





}
