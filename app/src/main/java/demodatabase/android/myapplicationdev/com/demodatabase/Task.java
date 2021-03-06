package demodatabase.android.myapplicationdev.com.demodatabase;

/**
 * Created by 15031795 on 16/5/2017.
 */

public class Task {
    private int id;
    private String description;
    private String date;

    public Task(int id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "" + id + '\n' +
                description + '\n'+
                date + '\n';
    }
}
