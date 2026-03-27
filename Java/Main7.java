interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// ImageProcessor class
class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying image filter: " + filter_type);
    }

    public void reset_filter() {
        System.out.println("Resetting image filters");
    }
}

// DataAnalyzer class
class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying data filter: " + filter_type);
    }

    public void reset_filter() {
        System.out.println("Resetting data filters");
    }
}

public class Main7 {
    public static void main(String[] args) {

        // ImageProcessor object
        ImageProcessor img = new ImageProcessor();
        img.apply_filter("Blur");
        img.reset_filter();

        // DataAnalyzer object
        DataAnalyzer data = new DataAnalyzer();
        data.apply_filter("Remove Nulls");
        data.reset_filter();
    }
}