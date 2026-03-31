class FileDownload implements Runnable {
    String fileName;

    FileDownload(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName + "...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Download interrupted");
        }
        System.out.println(fileName + " download complete");
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        Thread t1 = new Thread(new FileDownload("File1"));
        Thread t2 = new Thread(new FileDownload("File2"));
        Thread t3 = new Thread(new FileDownload("File3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
