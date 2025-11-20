package vladislavs.uhovs.lesson3.homework.task_14;

class Task14App {

    public static void main(String[] args) {
        Task14 myPhone = new Task14("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}