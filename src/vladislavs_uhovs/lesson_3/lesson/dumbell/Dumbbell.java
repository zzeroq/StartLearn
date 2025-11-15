package vladislavs_uhovs.lesson_3.lesson.dumbell;

class Dumbbell {

    String color;
    int weight;

    Dumbbell(String newColor, int newWeight) {

        color = newColor;
        weight = newWeight;

    }

    String newDumbbellColor(){

        return color;
    }

    int newDumbbellWeight(){

        return weight;

    }
    Dumbbell(String newColor) {

        color = newColor;
        weight = 0;


    }
}


