package vladislavs.uhovs.lesson7.homework.level7.task14;


import vladislavs.uhovs.lesson7.lesson.demo3.BookRecord;

public class UserEntityRepository {

    private final UserEntity[] user;
    private int size = 0;

    UserEntityRepository(int size){
        this.user = new UserEntity[size];
    }

    void save(UserEntity record){
        user[size++] = record;
    }

    UserEntity[] index(){
        UserEntity[] buffer = new UserEntity[length()];
        int cursor = 0;

        for (UserEntity record : user) {
            if (record != null){
                buffer[cursor++] = record;
            }
        }
        return buffer;
    }

    private int length(){
        int size = 0;

        for (UserEntity record : user){
            if(record != null) {
                size++;
            }
        }
        return size;
    }


}
