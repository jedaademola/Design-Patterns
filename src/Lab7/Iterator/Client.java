package Lab7.Iterator;

public class Client {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator nameRepositoryIterator = nameRepository.getIterator();

        while (nameRepositoryIterator.hasNext()) {
            System.out.println(nameRepositoryIterator.next());
        }

    }

}
