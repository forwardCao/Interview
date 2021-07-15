import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest {

    /**
     * 将User对象作为文本写入磁盘
     */
    public static void writeObj() {
        User user = new User("1001", "Joe");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./user.txt"));
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        writeObj();
    }
}

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userId;
    private String userName;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}