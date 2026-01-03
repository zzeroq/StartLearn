package vladislavs.uhovs.lesson7.homework.level7.task14;

public class UserEntity {

    private final int id;
    private final String name;
    private final String surname;
    private final String personalCode;

    public UserEntity(int id, String name, String surname, String personalCode) {
        if (id <= 0){
            throw new IllegalArgumentException("id must be positive");
        }
        this.id = id;
        this.name = value(name, "name");
        this.surname = value(surname, "surname");
        this.personalCode = value(personalCode, "personalCode");
    }

    private String value(String value, String fieldName){
        if (value  == null || value.isBlank()){
            throw new IllegalArgumentException(fieldName + " is blank");
        }
        return value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalCode() {
        return personalCode;
    }


    public String toString(){
        return "User entity(ID = " + id + " , name = " + name + ", surname = " + surname + ", personal code = " + personalCode + ")";
    }

}
