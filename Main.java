public class Main {
    public static void main(String[] args) {

        Books b1 = new Books("Book","Fantasy","Little prince",19);
        b1.info();
        Books b2 = new Books("Novel","Action","Game of thrine",12);
        b2.info();

        ArrayList<Books> books_list = new ArrayList<>();
        books_list.add(b1);
        books_list.add(b2);

        Orders orders_list = new Orders(books_list);

        ArrayList<Orders> o1 = new ArrayList<Orders>();
        o1.add(orders_list);


        User u1 = new User("Dhendup",98213198,o1);


    }
}