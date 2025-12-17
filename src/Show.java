import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        System.out.println("Список актеров постановки " + title + ":");
        for (int i = 0; i < listOfActors.size(); i++) {
            System.out.println(listOfActors.get(i));
        }
    }

    public void printDirector() {
        System.out.println("Режиссер постановки " + title + " " + director);
    }

    public void addActor(Actor newActor) {
        boolean isInList = false;
        for (Actor actor : listOfActors) {
            if (newActor.equals(actor)) {
                isInList = true;
                break;
            }
        }
        if (!isInList) {
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor.name + " " + newActor.surname + " добавлен в список " + title);
        } else {
            System.out.println("Актёр " + newActor.name + " " + newActor.surname + " уже есть в списке " + title);
        }
    }

    public void changeActor(Actor newActor, String oldSurname) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(oldSurname)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            listOfActors.remove(index);
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor.name + " " + newActor.surname + " добавлен в список взамен " + oldSurname);
        } else {
            System.out.println("Актёр " + oldSurname + " не найден в списке");
        }
    }
}
