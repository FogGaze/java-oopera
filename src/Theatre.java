import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor firstActor = new Actor("Василий", "Ливанов", Person.Gender.MALE, 177);
        Actor secondActor = new Actor("Сергей", "Безруков", Person.Gender.MALE, 173);
        Actor thirdActor = new Actor("Константин", "Хабенский", Person.Gender.MALE, 176);
        Director firstDirector = new Director("Константин", "Станиславский",
                Person.Gender.MALE, 100);
        Director secondDirector = new Director("Георгий", "Товстоногов",
                Person.Gender.MALE, 80);
        Person musicAuthor = new Person("Илья", "Сац", Person.Gender.MALE);
        Person choreographer = new Person("Юрий", "Григорович", Person.Gender.MALE);

        Opera opera = new Opera("Отелло", 185, firstDirector, new ArrayList<>(),
                musicAuthor, "либретто Отелло", 20);
        MusicalShow musicalShow = new MusicalShow("Чайка", 280, firstDirector, new ArrayList<>(),
                musicAuthor, "либретто чайка");
        Ballet ballet = new Ballet("Щелкунчик", 110, secondDirector, new ArrayList<>(), musicAuthor,
                "либретто Щелкунчик", choreographer);

        opera.addActor(firstActor);
        opera.addActor(secondActor);
        musicalShow.addActor(secondActor);
        musicalShow.addActor(thirdActor);
        ballet.addActor(thirdActor);
        ballet.addActor(firstActor);
        opera.printListOfActors();
        musicalShow.printListOfActors();
        ballet.printListOfActors();
        opera.changeActor(thirdActor, "Ливанов");
        opera.printListOfActors();
        musicalShow.changeActor(thirdActor, "Машков");
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
